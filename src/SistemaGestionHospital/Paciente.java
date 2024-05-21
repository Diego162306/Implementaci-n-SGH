package SistemaGestionHospital;

public class Paciente extends Persona implements GestionCitas{

    public Paciente(String nombre, String apellido, String dni, String direccion) {
        super(nombre, apellido, dni, direccion);
    }
    //Relaciones
    private Doctor doctor;
    private Enfermero enfermero;
    private CitasMedicas[] citasMedicasList;
    private ExpedienteMedico expedienteMedico;

    @Override
    public void programarcita() {
    }

    @Override
    public void cancelarcita() {
    }

    @Override
    public void realizarcita() {
    }

    //Getters y Setters Doctor
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    //Getters y Setters Enfermero
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    //Getters y Setters CitasMedicas
    public CitasMedicas[] getCitasMedicasList() {
        return citasMedicasList;
    }
    public void setCitasMedicasList(CitasMedicas[] citasMedicasList) {
        this.citasMedicasList = citasMedicasList;
    }

    //Getters y Setters ExpedienteMedico
    public ExpedienteMedico getExpedienteMedico() {
        return expedienteMedico;
    }
    public void setExpedienteMedico(ExpedienteMedico expedienteMedico) {
        this.expedienteMedico = expedienteMedico;
    }
}
