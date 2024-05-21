package SistemaGestionHospital;

public class Paciente extends Persona{

    public Paciente(String nombre, String apellido, String dni, String direccion) {
        super(nombre, apellido, dni, direccion);
    }
    //Relaciones
    private Doctor doctor;
    private Enfermero enfermero;
    private CitasMedicas[] citasMedicasList;
    private ExpedienteMedico expedienteMedico;

}
