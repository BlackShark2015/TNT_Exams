
package Model_JEE;

import Controller.Conectadb;
import Model.Materia;
import View.frm_NewMateria;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MateriaControl 
{
    String Materia;
    String Respuesta;
    
    public String getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }
    
    
    public void CrearMateria() throws IOException
    {
        //Materia mat = new Materia();
        Conectadb Con = new Conectadb();
        //setMateria(Materia);
        int insert =0;
        String Query = "Insert Into tnt_exam.Materias(Nombre)" +
                       "values ('"+ getMateria()+"')";
        try {
            if (Con.conectar()) {
                insert = Con.insertar(Query);
                if(insert > 0)
                    //return insert;
                    setRespuesta(String.valueOf(insert));
                Con.cierraConexion();
            } else {
                //insert = -1;
                setRespuesta("ERROR");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaControl.class.getName()).log(Level.SEVERE, null, ex);
            //insert = 0;
            setRespuesta("Catch");
        }
        //return insert;
    }
    
    public void ObtenerMateriass() throws IOException
    {
        
        Conectadb Con = new Conectadb();
        
        ResultSet rsMateria = null;
        List<String> materi = null;
        try {
            if (Con.conectar()) {
                rsMateria = Con.consulta("select * from Materias");
                rsMateria.next();
                materi.addAll((Collection<? extends String>) rsMateria);
                if(rsMateria.getRow() > 0)
                    
                    //return materi;
                Con.cierraConexion();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(frm_NewMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
