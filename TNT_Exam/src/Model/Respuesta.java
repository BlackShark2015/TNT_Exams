package Model;

public class Respuesta {

    private int idRespuesta;

    private int idPregunta;

    public String respuesta;

    public boolean correcta;

    public Respuesta crearRespuesta(Respuesta item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }
    
    
}
