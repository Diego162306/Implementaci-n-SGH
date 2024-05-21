package SistemaGestionHospital;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String identificacion;
    private String direccion;

    public Persona(String nombre, String apellido, String dni, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = dni;
        this.direccion = direccion;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getIdentificacion(){
        return identificacion;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    //Relaciones
    private Paciente paciente;
    private Doctor doctor;
    private Enfermero enfermero;

    //Getters y Setters
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

}
