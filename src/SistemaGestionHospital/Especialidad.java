package SistemaGestionHospital;

public enum Especialidad {
    CARDIOLOGIA, PEDIATRIA, PSIQUIATRIA, GINECOLOGIA, OTORRINOLARINGOLOGIA, HEMATOLOGIA, DERMATOLOGIA;

    public static Especialidad getEspecialidad(String especialidad) {
        switch (especialidad) {
            case "CARDIOLOGIA":
                return CARDIOLOGIA;
            case "PEDIATRIA":
                return PEDIATRIA;
            case "PSIQUIATRIA":
                return PSIQUIATRIA;
            case "GINECOLOGIA":
                return GINECOLOGIA;
            case "OTORRINOLARINGOLOGIA":
                return OTORRINOLARINGOLOGIA;
            case "HEMATOLOGIA":
                return HEMATOLOGIA;
            case "DERMATOLOGIA":
                return DERMATOLOGIA;
            default:
                return null;
        }
    }

}
