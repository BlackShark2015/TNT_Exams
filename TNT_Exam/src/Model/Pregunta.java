package Model;


import Controller.ComplejidadController;
import Controller.PreguntaController;
import Controller.TemaController;
import Controller.TipoPreguntaController;
import java.io.IOException;
import java.sql.SQLException;
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
    
    private TemaController temaC;
    private TipoPreguntaController tipoP;
    private ComplejidadController compC;
    
    private int IdPregunta;

    private int idTema;
    
    private int idMateria;

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
    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
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

/*   public ArrayList crear() {
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
   
   public void crear(String item){
        try {
            PreguntaController pc = new PreguntaController();
            Pregunta p = null;
            //p.setPregunta(item.get(4).toString());
            //p.setIdTema(temaC.ObtenerTema(item.get(1).toString()));
            //p.setIdComplegidad(compC.ObtenerComplegidad(item.get(2).toString()));
            //p.setIdTipoPregunta(tipoP.ObtenerTipoPregunta(item.get(3).toString()));
            
            
            //p.setPregunta(item[4].toString());
            //p.setIdTema(temaC.ObtenerTema(item[1].toString()));
            //p.setIdComplegidad(compC.ObtenerComplegidad(item[2].toString()));
            //p.setIdTipoPregunta(tipoP.ObtenerTipoPregunta(item[3].toString()));
            
            pc.CrearPregunta(p);
    
        } catch (IOException ex) {
            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    public ArrayList actualizar(ArrayList item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int consultar(int idItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
