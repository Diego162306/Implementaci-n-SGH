package SistemaGestionHospital;

public class Enfermero extends Persona {

    public Enfermero(String nombre, String apellido, String dni, String direccion) {
        super(nombre, apellido, dni, direccion);
    }
    //Relaciones
    private Paciente paciente;
    private Doctor[] doctorList;

    //Getters y Setters
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Doctor[] getDoctorList() {
        return doctorList;
    }
    public void setDoctorList(Doctor[] doctorList) {
        this.doctorList = doctorList;
    }


}
