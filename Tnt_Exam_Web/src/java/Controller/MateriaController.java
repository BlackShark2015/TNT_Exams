/**
 * Clase encargada de gestionar conexion con base de datos con respecto a
 * las materias
 */
package Controller;

import Model.Materia;
import View.frm_NewMateria;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julio morales,Johan Garcia
 */

public final class MateriaController {
    private Conectadb Con;
    private Materia mat;
    /**
     * 
     * @throws IOException 
     * funcion para realizar conexion con base de datos
     */
    public void inicializar() throws IOException{
        this.Con = new Conectadb();
        this.mat = new Materia();
    }
    /**
     * 
     * @throws IOException 
     * constructor que invoca inicializar para formalizar la conexion con 
     * la base de datos
     */
    public MateriaController() throws IOException {
        inicializar();
    }
            
    /**
     * 
     * @param Nombre
     * @return valor que indica si la creacion en base de datos fue exitosa
     */
    public int CrearMaterial(String Nombre){
        mat.setNombre(Nombre);
        int insert =0;
        String Query = "Insert Into blackshark.Materias(Nombre)" +
                       "values ('"+ mat.getNombre() +"')";
        try {
            if (this.Con.conectar()) {
                insert = Con.insertar(Query);
                if(insert > 0)
                    return insert;
                Con.cierraConexion();
            } else {
                insert = -1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(frm_NewMateria.class.getName()).log(Level.SEVERE, null, ex);
            insert = 0;
        }
        return insert;
    }
    /**
     * 
     * @return  consulta a base de datos que retonar todas las materias 
     * existentes en base de datos
     */
    public ResultSet ObtenerMateria(){
        ResultSet rsMateria = null;
        try {
            if (this.Con.conectar()) {
                rsMateria = Con.consulta("select * from Materias");
                rsMateria.next();
                
                if(rsMateria.getRow() > 0)
                    return rsMateria;
                Con.cierraConexion();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(frm_NewMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsMateria;
    }
    
        public int ObtenerMateria(String Materia) throws SQLException{
        ResultSet rsMateria = null;
        try {
            if (this.Con.conectar()) {
                rsMateria = Con.consulta("select * from materias where Nombre = '" + Materia + "'");
                rsMateria.next();
                
                if(rsMateria.getRow() > 0)
                    return (int) rsMateria.getObject("IdMateria");
                Con.cierraConexion();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(frm_NewMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (int) rsMateria.getObject("IdMateria");
    }
        
        public List<String> ObtenerMaterias(){
        ResultSet rsMateria = null;
        List<String> materi = null;
        try {
            if (this.Con.conectar()) {
                rsMateria = Con.consulta("select * from Materias");
                rsMateria.next();
                materi.addAll((Collection<? extends String>) rsMateria);
                if(rsMateria.getRow() > 0)
                    
                    return materi;
                Con.cierraConexion();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(frm_NewMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materi;
    }
        
        public void ObtenerMateriass(){
        ResultSet rsMateria = null;
        List<String> materi = null;
        try {
            if (this.Con.conectar()) {
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
        //return materi;
    }
}
