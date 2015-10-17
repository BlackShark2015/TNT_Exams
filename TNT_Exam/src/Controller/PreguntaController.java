/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Pregunta;
import View.frm_NewPregunta;
import View.frm_NewTema;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jcmorales
 */
public class PreguntaController {
    private Conectadb Con;        
    /**
    * 
    * inicializacion para conexion con base de datos
    */
    public void inicializar() throws IOException{
        this.Con = new Conectadb();
    }    
    /**
     * 
     * constructor que invoca a inicializar para formalizar la conexion con base
     * de datos
     */
    public PreguntaController() throws IOException {
        inicializar();
    }    
    /**
     * 
     * @param item
     * @return  valor entero con el cual validar si la creacion se realizo 
     *          correctamente
     */
    public int CrearPregunta(Pregunta item){
        int insert =0;
        Pregunta preg = new Pregunta();
        preg = item;
        System.out.println(item.getIdPregunta()+" -- "+item.getPregunta() );
        String Query =  "INSERT INTO tnt_exam.preguntas" +
                "(Pregunta" +
                ",Temas_idTema" +
                ",Temas_Materias_idMateria" +
                ",Complejidads_idComplejidad" +
                ",TipoPreguntas_idTipoPreguntas)" +
                " VALUES ("+
                "'"+preg.getPregunta()+"'"+
                ","+preg.getIdTema()+
                ","+preg.getIdMateria()+
                ","+preg.getIdComplegidad()+
                ","+preg.getIdTipoPregunta()+")";
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
            Logger.getLogger(frm_NewPregunta.class.getName()).log(Level.SEVERE, null, ex);
            insert = 0;
        }
        return insert;
    }

    public void CrearPregunta(String Pregunta) {
        
        System.out.println(Pregunta);

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
