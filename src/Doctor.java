import java.util.ArrayList;
import java.util.List;

public class Doctor extends Persona {
    private String especialidad;
    private List<Cita> citas;

    public Doctor(String nombre, String apellido, String id, String telefono, String especialidad) {
        super(nombre, apellido, id, telefono);
        this.especialidad = especialidad;
        this.citas = new ArrayList<>();
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public List<Cita> getCitas() {
        return new ArrayList<>(citas);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", id='" + getId() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}