/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Materia;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jcmorales
 */
public class TipoPreguntaController {
    private Conectadb Con;
    
    public void inicializar() throws IOException{
        this.Con = new Conectadb();
    }
    
    public TipoPreguntaController() throws IOException {
        inicializar();
    }
    
    public ResultSet ObtenerTipoPregunta() {
        ResultSet rsTipPreg = null;
        try {
            if (this.Con.conectar()) {
                rsTipPreg = Con.consulta("select * from tipopreguntas");
                rsTipPreg.next();

                if (rsTipPreg.getRow() > 0) {
                    return rsTipPreg;
                }
                Con.cierraConexion();
            }
        } catch (SQLException ex) {

        }
        return rsTipPreg;
    }
    
        public int ObtenerTipoPregunta(String TipPreg) throws SQLException{
        ResultSet rsTipPreg = null;
        try {
            if (this.Con.conectar()) {
                rsTipPreg = Con.consulta("select * from tipopreguntas where Nombre = '" + TipPreg + "'");
                rsTipPreg.next();
                
                if(rsTipPreg.getRow() > 0)
                    return (int) rsTipPreg.getObject("IdTipoPreguntas");
                Con.cierraConexion();
            } 
        } catch (SQLException ex) {
            
        }
        return (int) rsTipPreg.getObject("IdTipoPreguntas");
      }
}
