
package Cliente_Servidor;

import java.io.*;
import java.net.*;
import java.util.logging.*;
public class MainServidor {
    public static void main(String args[]) throws IOException {
        ServerSocket ss;
        System.out.print("Inicializando servidor... ");
        try {
            ss = new ServerSocket(1234);
            System.out.println("\t[OK]");
            int idSession = 0;
            while (true) {
                
                Socket socket;
                socket = ss.accept();
                System.out.println("Nueva conexión entrante: "+socket);
                ((Servidor) new Servidor(socket, idSession)).start();
                idSession++;
            }
        } catch (IOException ex) {
            Logger.getLogger(MainServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
