/**
 * clase que describe Materia
 */
package Model;


import Controller.Conectadb;
import Model.Materia;
import View.frm_NewMateria;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class Materia implements Util {

    private int IdMateria;
    private String Nombre;
    
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

    public int getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(int IdMateria) {
        this.IdMateria = IdMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public boolean CrearMateria() throws IOException
    {
        boolean retorno = false;
        //Materia mat = new Materia();
        Conectadb Con = new Conectadb();
        //setMateria(Materia);
        int insert =0;
        String Query = "Insert Into Materias(Nombre)" +
                       "values ('"+ getNombre()+"')";
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
