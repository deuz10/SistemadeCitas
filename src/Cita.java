import java.time.LocalDateTime;
import java.time.Duration;

public class Cita {
    private LocalDateTime fecha;
    private String motivo;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(LocalDateTime fecha, String motivo, Doctor doctor, Paciente paciente) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public Duration getDuracion() {
        return Duration.ofMinutes(30); // Asumimos que todas las citas duran 30 minutos
    }

    public void reprogramar(LocalDateTime nuevaFecha) {
        this.fecha = nuevaFecha;
    }

    // Getters y setters
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha=" + fecha +
                ", motivo='" + motivo + '\'' +
                ", doctor=" + doctor.getNombreCompleto() +
                ", paciente=" + paciente.getNombreCompleto() +
                '}';
    }
}