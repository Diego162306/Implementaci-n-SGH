package SistemaGestionHospital;

public class ExpedienteMedico {
    private String diagnostico;
    private String tratamiento;
    private String presncripciones;

    public ExpedienteMedico(String diagnostico, String tratamiento, String presncripciones) {
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.presncripciones = presncripciones;
    }

    public String getDiagnostic() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public String getPresncripciones() {
        return presncripciones;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostico = diagnostic;
    }

    public void setPresncripciones(String presncripciones) {
        this.presncripciones = presncripciones;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

}
