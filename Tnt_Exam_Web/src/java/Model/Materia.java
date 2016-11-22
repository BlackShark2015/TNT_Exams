/**
 * clase que describe Materia
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Controller.Conectadb;
import Model.Materia;
import View.frm_NewMateria;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import javax.naming.NamingException;

@ManagedBean
@RequestScoped
public class Materia implements Util {

    private Conectadb Con;
    
    private static final long serialVersionUID = 1L;
    private List<SelectItem> items = new ArrayList <SelectItem>();
    private Long id;

    ArrayList arrayList = new ArrayList();
    private int IdMateria;
    private String Nombre;
    
    public SelectItem[] getValues() throws SQLException, IOException, NamingException
    {
        arrayList = getNames();
        return arrayListToSelectItem(arrayList);
    }
    
    public SelectItem[] getValues2() throws SQLException, IOException, NamingException
    {
        arrayList = getData();
        return arrayListToSelectItem(arrayList);
    }
    
    public SelectItem[] arrayListToSelectItem(ArrayList arrayList)
    {
        SelectItem[] result = new SelectItem[arrayList.size()];
         this.arrayList.toArray(result);
         return result;
    }
    
    public ArrayList getNames() throws SQLException, NamingException, IOException {

        ArrayList arrayList = new ArrayList();
        this.Con = new Conectadb();
        
        ResultSet rsMateria = null;
        try {
            if (this.Con.conectar()) {
                rsMateria = Con.consulta("select * from materias");
                
                //if(rsMateria.getRow() > 0)
                   
                while (rsMateria.next()) {
                    arrayList.add(new SelectItem(rsMateria.getString(2)));
                }
                
                Con.cierraConexion();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(frm_NewMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }
    
        public ArrayList getData() throws SQLException, NamingException, IOException {

        ArrayList arrayList = new ArrayList();
        this.Con = new Conectadb();
        
        ResultSet rsMateria = null;
        try {
            if (this.Con.conectar()) {
                rsMateria = Con.consulta("select concat(idMateria,\" \",Nombre) from materias \n" +
"where Nombre <>\"null\"");
                
                //if(rsMateria.getRow() > 0)
                   
                while (rsMateria.next()) {
                    arrayList.add(new SelectItem(rsMateria.getString(1)));
                }
                
                Con.cierraConexion();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(frm_NewMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }
    
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
