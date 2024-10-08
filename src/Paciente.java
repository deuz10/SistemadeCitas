import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private String historialMedico;
    private List<Cita> citas;

    public Paciente(String nombre, String apellido, String id, String telefono, String historialMedico) {
        super(nombre, apellido, id, telefono);
        this.historialMedico = historialMedico;
        this.citas = new ArrayList<>();
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public List<Cita> getCitas() {
        return new ArrayList<>(citas);
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", id='" + getId() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", historialMedico='" + historialMedico + '\'' +
                '}';
    }
}