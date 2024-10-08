import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        SistemaCitas sistema = new SistemaCitas();

        // Crear doctores
        Doctor doctor1 = new Doctor("Juan", "Pérez", "D001", "555-1234", "Cardiología");
        Doctor doctor2 = new Doctor("María", "González", "D002", "555-5678", "Pediatría");
        sistema.agregarDoctor(doctor1);
        sistema.agregarDoctor(doctor2);

        // Crear pacientes
        Paciente paciente1 = new Paciente("Carlos", "Rodríguez", "P001", "555-9876", "Ninguna alergia conocida");
        Paciente paciente2 = new Paciente("Ana", "Martínez", "P002", "555-4321", "Alergia a penicilina");
        sistema.agregarPaciente(paciente1);
        sistema.agregarPaciente(paciente2);

        // Crear citas
        try {
            sistema.crearCita(doctor1, paciente1, LocalDateTime.now().plusDays(1), "Chequeo anual");
            sistema.crearCita(doctor2, paciente2, LocalDateTime.now().plusDays(2), "Vacunación");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear cita: " + e.getMessage());
        }

        // Mostrar citas
        System.out.println("\nCitas en el sistema:");
        for (Cita cita : sistema.getCitas()) {
            System.out.println(cita);
        }

        // Cancelar una cita
        if (!sistema.getCitas().isEmpty()) {
            try {
                sistema.cancelarCita(sistema.getCitas().get(0));
            } catch (IllegalArgumentException e) {
                System.out.println("Error al cancelar cita: " + e.getMessage());
            }
        }

        // Mostrar citas actualizadas
        System.out.println("\nCitas en el sistema después de cancelación:");
        for (Cita cita : sistema.getCitas()) {
            System.out.println(cita);
        }
    }
}