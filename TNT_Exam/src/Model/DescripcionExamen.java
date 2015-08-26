package Model;

public class DescripcionExamen extends UtilExamen {

    private int idDescripcionExamen;

    private int idExamen;

    private int idPregunta;

    public int cantidadPreguntaTema;

    public double PorcentagePRegunta;

    public int ObtenerExamen(int idSolicitud) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String crearExamen(String Nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdDescripcionExamen() {
        return idDescripcionExamen;
    }

    public void setIdDescripcionExamen(int idDescripcionExamen) {
        this.idDescripcionExamen = idDescripcionExamen;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }
    
    
}
