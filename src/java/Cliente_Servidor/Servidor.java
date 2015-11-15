package Cliente_Servidor;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import java.util.*;
public class Servidor extends Thread {
    private Socket socket;
    private DataOutputStream dos;
    private DataInputStream dis;
    private int idSessio;
    private Date fecTime = new Date();
    public Servidor(Socket socket, int id) {
        this.socket = socket;
        this.idSessio = id;
        try {
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void desconnectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void run() {
        String accion = "";
        try {
            accion = dis.readUTF();
            if(accion.equals("conexion establecida")){
                System.out.println("El cliente con idSesion "+this.idSessio+" se ha conectado"+"-"+fecTime.getDate()+"--"+ fecTime.getHours()+":"+fecTime.getMinutes()+ "------"+fecTime);
                dos.writeUTF("adios");
          //  System.out.println();
            
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconnectar();
    }
}