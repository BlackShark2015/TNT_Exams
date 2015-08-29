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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jcmorales
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
        String Query = "Insert Into tnt_exam.Materias(Nombre)" +
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
}
