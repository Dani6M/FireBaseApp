package mx.edu.utng.firebaseapp;

public class Clase {
    //Propiedades
    private String claseId, carrera, materia, tema;

    public Clase(String claseId, String carrera, String materia, String tema) {
        this.claseId = claseId;
        this.carrera = carrera;
        this.materia = materia;
        this.tema = tema;
    }

    public String getClaseId() {
        return claseId;
    }

    public void setClaseId(String claseId) {
        this.claseId = claseId;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
