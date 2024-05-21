package SistemaGestionHospital;

public class Doctor extends Persona implements GestionCitas{
    public Doctor(String nombre, String apellido, String dni, String direccion) {
        super(nombre, apellido, dni, direccion);
    }
    //Relaciones
    private Paciente paciente;

}
