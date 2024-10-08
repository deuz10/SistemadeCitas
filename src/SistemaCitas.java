import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaCitas {
    private List<Doctor> doctores;
    private List<Paciente> pacientes;
    private List<Cita> citas;

    public SistemaCitas() {
        doctores = new ArrayList<>();
        pacientes = new ArrayList<>();
        citas = new ArrayList<>();
    }

    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void crearCita(Doctor doctor, Paciente paciente, LocalDateTime fecha, String motivo) {
        if (!doctores.contains(doctor)) {
            throw new IllegalArgumentException("Doctor no registrado en el sistema");
        }
        if (!pacientes.contains(paciente)) {
            throw new IllegalArgumentException("Paciente no registrado en el sistema");
        }

        Cita nuevaCita = new Cita(fecha, motivo, doctor, paciente);
        citas.add(nuevaCita);
        doctor.agregarCita(nuevaCita);
        paciente.agregarCita(nuevaCita);
        System.out.println("Cita creada exitosamente: " + nuevaCita);
    }

    public void cancelarCita(Cita cita) {
        if (!citas.contains(cita)) {
            throw new IllegalArgumentException("Cita no encontrada en el sistema");
        }

        citas.remove(cita);
        cita.getDoctor().getCitas().remove(cita);
        cita.getPaciente().getCitas().remove(cita);
        System.out.println("Cita cancelada exitosamente: " + cita);
    }

    public List<Doctor> getDoctores() {
        return new ArrayList<>(doctores);
    }

    public List<Paciente> getPacientes() {
        return new ArrayList<>(pacientes);
    }

    public List<Cita> getCitas() {
        return new ArrayList<>(citas);
    }
}