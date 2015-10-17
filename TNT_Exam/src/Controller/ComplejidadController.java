/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jcmorales
 */
public class ComplejidadController {
     private Conectadb Con;
    
    public void inicializar() throws IOException{
        this.Con = new Conectadb();
    }
    
    public ComplejidadController() throws IOException {
        inicializar();
    }
    
    public ResultSet ConsultarComplejidad() {
        ResultSet rsComp = null;
        try {
            if (this.Con.conectar()) {
                rsComp = Con.consulta("select * from complejidads");
                rsComp.next();

                if (rsComp.getRow() > 0) {
                    return rsComp;
                }
                Con.cierraConexion();
            }
        } catch (SQLException ex) {

        }
        return rsComp;
    }
    public int ObtenerComplegidad(String Complejidad) throws SQLException{
        ResultSet rsCmpl = null;
        try {
            if (this.Con.conectar()) {
                rsCmpl = Con.consulta("select * from complejidads where Nombre = '" + Complejidad + "'");
                rsCmpl.next();
                
                if(rsCmpl.getRow() > 0)
                    return (int) rsCmpl.getObject("idComplejidad");
                Con.cierraConexion();
            } 
        } catch (SQLException ex) {
            
        }
        return (int) rsCmpl.getObject("idComplejidad");
      }
    
}
