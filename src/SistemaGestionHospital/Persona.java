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

}
