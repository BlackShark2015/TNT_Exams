/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Pregunta;
import Model.Tema;
import View.frm_NewTema;
import View.frm_NewUsuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
     * @param Nombre
     * @param idMateria
     * @return  valor entero con el cual validar si la creacion se realizo 
     *          correctamente
     */
    public int CrearPregunta(Pregunta item){
        int insert =0;
        String x = item.getPregunta();
        int y = item.getIdTema();
        int z = item.getIdComplegidad();
         int w = item.getIdTipoPregunta();
        
        String Query =  "INSERT INTO tnt_exam.preguntas" +
                "(Pregunta" +
                ",Temas_idTema" +
                ",Complejidads_idComplejidad" +
                ",TipoPreguntas_idTipoPreguntas)" +
                " VALUES ("+
                "'"+item.getPregunta()+"'"+
                ","+item.getIdTema()+
                ","+item.getIdComplegidad()+
                ","+item.getIdTipoPregunta()+")";
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
    
}
