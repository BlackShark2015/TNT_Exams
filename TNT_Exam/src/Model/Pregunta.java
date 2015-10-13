package Model;


import Controller.PreguntaController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * 
 * @author Johan Garcia, Julio Morales
 * 
 * clase que describe pregunta
 */
public class Pregunta {

    private int IdPregunta;

    private int idTema;

    private int idTipoPregunta;

    private int idComplegidad;

    public String Pregunta;

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
    
    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }

   public ArrayList crear() {
        try {
            PreguntaController pc = new PreguntaController();
            Pregunta p = null;
            p.Pregunta=getPregunta();
            p.idTema=getIdTema();
            p.idComplegidad = getIdComplegidad();
            p.idTipoPregunta = getIdTipoPregunta();
            
            pc.CrearPregunta(p);
    
        } catch (IOException ex) {
            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   public void crear(Vector item) {
        try {
            PreguntaController pc = new PreguntaController();
            Pregunta p = null;
            p.Pregunta=item.get(4).toString();
            p.idTema=(int) item.get(1);
            p.idComplegidad = (int) item.get(2);
            p.idTipoPregunta = (int) item.get(3);
            
            pc.CrearPregunta(p);
    
        } catch (IOException ex) {
            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList actualizar(ArrayList item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int consultar(int idItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
