package Model;


import Controller.Conectadb;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 * 
 * @author Julio Morales, Johan Garcia
 * clase que describe un tema al cual pertenece una pregunta
 */
@ManagedBean
@RequestScoped
public class Tema implements Util {

    private int IdTema;

    private String Nombre;

    private int idMateria;

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

    public int getIdTema() {
        return IdTema;
    }

    public void setIdTema(int IdTema) {
        this.IdTema = IdTema;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        //JOptionPane.showMessageDialog(null,"Materia ingresada "+idMateria);
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public boolean CrearTema() throws IOException
    {
        
        boolean retorno = false;
        //Materia mat = new Materia();
        Conectadb Con = new Conectadb();
        //setMateria(Materia);
        
        int insert =0;
        String Query = "INSERT INTO temas(idMateria,Nombre,Materias_idMateria) VALUES("+this.getIdMateria()+",'"+this.getNombre()+"',"+this.getIdMateria()+")";
        
        try {
            if (Con.conectar()) {
                insert = Con.insertar(Query);
                if(insert > 0)
                    //return insert;
                    retorno = true;
                    //setRespuesta(String.valueOf(insert));
                Con.cierraConexion();
            } else {
                //insert = -1;
                retorno = false;
                //setRespuesta("ERROR");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Materia.class.getName()).log(Level.SEVERE, null, ex);
            //insert = 0;
            //setRespuesta("Catch");            
            retorno = false;
        }
        //return insert;
        return retorno;
    } 
    
}
