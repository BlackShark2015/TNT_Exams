package Model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author root Johan Garcia, Julio Morales
 */
@ManagedBean
@RequestScoped
public class Login_Validar 
{
    private String usuario;
    private String contraseña;
    /**
     * Creates a new instance of Login_Validar
     */
    public Login_Validar() 
    {
    }

    public String getUsuario() 
    {
        System.out.println(usuario);
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() 
    {
        System.out.println(contraseña);
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
