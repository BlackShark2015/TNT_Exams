/**
 * Clase que controla la creacion de un nuevo tema y lo inserta en base de datos
 * 
 */
package Controller;


import Model.Tema;
import View.frm_NewTema;
import View.frm_NewUsuario;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jcmorales,jgarciac3
 */
public class TemaController {
    private Conectadb Con;
    private Tema tem;
   /**
    * 
    * inicializacion para conexion con base de datos
    */
    public void inicializar() throws IOException{
        this.Con = new Conectadb();
        this.tem = new Tema();
    }
    /**
     * 
     * constructor que invoca a inicializar para formalizar la conexion con base
     * de datos
     */
    public TemaController() throws IOException {
        inicializar();
    }
    /**
     * 
     * @param Nombre
     * @param idMateria
     * @return  valor entero con el cual validar si la creacion se realizo 
     *          correctamente
     */
    
    public int CrearTema(String Nombre, int idMateria){
        tem.setNombre(Nombre);
        tem.setIdMateria(idMateria);
        
        int insert =0;
        String Query = "Insert Into tnt_exam.Temas(Nombre, Materias_idMateria)" +
                       "values ('"+ tem.getNombre() + "'," + tem.getIdMateria() + ")";
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
            Logger.getLogger(frm_NewTema.class.getName()).log(Level.SEVERE, null, ex);
            insert = 0;
        }
        return insert;
    }
    
    public ResultSet ObtenerTema(int idMateria){
        ResultSet rsTema = null;
        try {
            if (this.Con.conectar()) {
                rsTema = Con.consulta("select * from Temas where Materias_idMateria = " + idMateria);
                rsTema.next();
                
                if(rsTema.getRow() > 0)
                    return rsTema;
                Con.cierraConexion();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(frm_NewTema.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsTema;
    }
    public int ObtenerTema(String Tema) throws SQLException{
        ResultSet rsTema = null;
        try {
            if (this.Con.conectar()) {
                rsTema = Con.consulta("select * from Temas where Nombre = '" + Tema + "'");
                rsTema.next();
                
                if(rsTema.getRow() > 0)
                    return (int) rsTema.getObject("IdTema");
                Con.cierraConexion();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(frm_NewTema.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
