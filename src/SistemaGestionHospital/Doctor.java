package SistemaGestionHospital;

public class Doctor extends Persona implements GestionCitas {
    public Doctor(String nombre, String apellido, String dni, String direccion) {
        super(nombre, apellido, dni, direccion);
    }

    @Override
    public void programarcita() {
    }

    @Override
    public void cancelarcita() {
    }

    @Override
    public void realizarcita() {
    }

    //Relaciones
    private Paciente[] pacienteList;
    private Enfermero[] enfermeroList;
    private CitasMedicas[] citasMedicasList;
    private Especialidad especialidad;

    //Getters y Setters Especialidad
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    //Getters y Setters Paciente
    public Paciente[] getPacienteList() {
        return pacienteList;
    }
    public void setPacienteList(Paciente[] pacienteList) {
        this.pacienteList = pacienteList;
    }

    //Getters y Setters Enfermero
    public Enfermero[] getEnfermeroList() {
        return enfermeroList;
    }
    public void setEnfermeroList(Enfermero[] enfermeroList) {
        this.enfermeroList = enfermeroList;
    }

    //Getters y Setters CitasMedicas
    public CitasMedicas[] getCitasMedicasList() {
        return citasMedicasList;
    }
    public void setCitasMedicasList(CitasMedicas[] citasMedicasList) {
        this.citasMedicasList = citasMedicasList;
    }
}