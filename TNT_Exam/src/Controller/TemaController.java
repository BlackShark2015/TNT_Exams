/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Tema;
import View.frm_NewTema;
import View.frm_NewUsuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jcmorales
 */
public class TemaController {
    private Conectadb Con;
    private Tema tem;
    
    public void inicializar() throws IOException{
        this.Con = new Conectadb();
        this.tem = new Tema();
    }
    public TemaController() throws IOException {
        inicializar();
    }
    
    public int CrearMaterial(String Nombre, int idMateria){
        tem.setNombre(Nombre);
        tem.setIdMateria(idMateria);
        
        int insert =0;
        String Query = "Insert Into tnt_exam.Tema(Nombre, idMateria)" +
                       "values ('"+ tem.getNombre() + "'" + tem.getIdMateria() + ")";
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
