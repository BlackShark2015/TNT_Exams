package Model;


import java.util.ArrayList;

public class Pregunta implements Util {

    private int IdPregunta;

    private int idTema;

    private int idTipoPregunta;

    private int idComplegidad;

    public String Pregunta;

    @Override
    public ArrayList crear(ArrayList item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList actualizar(ArrayList item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int consultar(int idItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdPregunta() {
        return IdPregunta;
    }

    public void setIdPregunta(int IdPregunta) {
        this.IdPregunta = IdPregunta;
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public int getIdTipoPregunta() {
        return idTipoPregunta;
    }

    public void setIdTipoPregunta(int idTipoPregunta) {
        this.idTipoPregunta = idTipoPregunta;
    }

    public int getIdComplegidad() {
        return idComplegidad;
    }

    public void setIdComplegidad(int idComplegidad) {
        this.idComplegidad = idComplegidad;
    }
    
}
