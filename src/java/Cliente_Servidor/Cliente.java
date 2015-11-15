/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente_Servidor;


import View.ftm_Principal;
import java.io.DataOutputStream;
import java.io.IOException;

//import sockets.conexion.Conexion;

public class Cliente extends Conexion
{
    ftm_Principal prp =  new ftm_Principal();
    public Cliente() throws IOException
    {
        super("cliente");
    } //Se usa el constructor para cliente de Conexion

    public void startClient() //Método para iniciar el cliente
    {
        try
        {            
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());
           
            //Se enviarán dos mensajes}
            salidaServidor.writeUTF("conexion establecida");
             prp.setVisible(true);
            cs.close();//Fin de la conexión

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
