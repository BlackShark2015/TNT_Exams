package Model;

import Controller.Conectadb;
import View.frm_LogIn;
import View.ftm_Principal;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.swing.JOptionPane;

/**
 *
 * @author root Johan Garcia, Julio Morales
 */
@ManagedBean
@RequestScoped
public class Login_Validar 
{
    private String usuario;
    private String contrasena;
    private String mensaje;
    /**
     * Creates a new instance of Login_Validar
     */
        private Conectadb Con;


    public Login_Validar() 
    {
    }
    public void inicializar() throws IOException
    {
        this.Con = new Conectadb();
    }
    public String getUsuario() 
    {
        System.out.println(usuario);
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

 
    public  String validar() throws IOException {                                         
        try {
            Con = new Conectadb();

            char[] vac = {};
            String user = getUsuario();
            String pass = getContrasena();
            if (user.equals("")) {
                //JOptionPane.showMessageDialog(null, "Usuario invalido.", "Campos nulos", 0);
                mensaje="Usuario invalido.";
            } else if (pass.equals("")) {
                //JOptionPane.showMessageDialog(null, "Contraseña invalida.", "Campos nulos", 0);
                mensaje="Contraseña Invalida.";
            } else if (this.Con.conectar()) {
                ResultSet rsIdentificar = Con.consulta("select * from usuarios");
                rsIdentificar.next();
                String name = rsIdentificar.getString("UserName");
                String passw = rsIdentificar.getString("Password");
                /*char[] convertpast = new char[passw.length()];
                for (int i = 0; i < passw.length(); i++) {
                    convertpast[i] = passw.charAt(i);
                }*/
                if (passw.equals(getContrasena()) && user.toUpperCase().equals(name.toUpperCase())) {
                    //JOptionPane.showMessageDialog(null, "Binvenido " + name);
                    mensaje="Bienvenido";
                    FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
                } else {
                    //JOptionPane.showMessageDialog(null, "verifique los datos proporsionados");
                    mensaje="Verifique los datos proprocionados";
                }
            } else {
                //JOptionPane.showMessageDialog(null, "Valide la conexion a la Base de Datos.");
                mensaje="Validar conexion con base de datos";
            }
            return mensaje;

        } catch (SQLException ex) 
        {
            Logger.getLogger(Login_Validar.class.getName()).log(Level.SEVERE, null, ex);
            mensaje=Login_Validar.class.getName();
            return mensaje;
        }
    }
    
    /*public static void main(String args[]) 
    {
        Login_Validar val = new Login_Validar();
        val.validar();
    }*/
    

    
}
