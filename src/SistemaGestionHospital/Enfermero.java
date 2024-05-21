package SistemaGestionHospital;

public class Enfermero extends Persona {

    public Enfermero(String nombre, String apellido, String dni, String direccion) {
        super(nombre, apellido, dni, direccion);
    }
    //Relaciones
    private Paciente paciente;
    private Doctor[] doctorList;


}
