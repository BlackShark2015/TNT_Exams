/**
 * clase que se encarga de las conexiones a la base de datos
 * 
 */

package Controller;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Julio Morales, Johan Garcia
 * Clase base para crear conexion con base de datos
 */
public class Conectadb
{
    //variables miembro
 
    private String usuario;
    private String clave;
    private String url;
    private String driverClassName;
    private Connection conn = null;
    private Statement estancia;
 
//CONSTRUCTORES
 
    //Constructor que toma los datos de conexion por medio de parametros
    public Conectadb(String usuario, String clave, String url, String driverClassName) {
        this.usuario = usuario;
        this.clave = clave;
        this.url = url;
        this.driverClassName = driverClassName;
    }
 
    //Constructor que crea la conexion sin parametros con unos definidos en la clase
    //(meter los datos correspondientes)
    public Conectadb() throws FileNotFoundException, IOException {
        Properties propiedades = new Properties();
        InputStream entrada = null;
        
        entrada = new FileInputStream("configuracion.properties");

        // cargamos el archivo de propiedades
        propiedades.load(entrada);

        // obtenemos las propiedades y las asignamos a sus respectivas variables
        this.usuario = propiedades.getProperty("Usuario");
        this.clave = propiedades.getProperty("Clave");
        this.url = "jdbc:mysql://localhost:3306/" + propiedades.getProperty("DataBase");
        this.driverClassName = "com.mysql.jdbc.Driver";
    }
 
    //metodos para recuperar los datos de conexion
    public String getClave() {
        return clave;
    }
 
    public String getUrl() {
        return url;
    }
 
    public String getUsuario() {
        return usuario;
    }
 
    public Connection getConn() {
        return conn;
    }
 
    public String getDriverClassName() {
        return driverClassName;
    }
 
    //metodos para establecer los valores de conexion
    public void setClave(String clave) {
        this.clave = clave;
    }
 
    public void setUrl(String url) {
        this.url = url;
    }
 
    public void setUsuario(String usuario) throws SQLException {
        this.usuario = usuario;
    }
 
    public void setConn(Connection conn) {
        this.conn = conn;
    }
 
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
 
//la conexion propiamente dicha
 
    public boolean conectar() throws SQLException {
        try {
            Class.forName(this.driverClassName).newInstance();
            this.conn = DriverManager.getConnection(this.url, this.usuario, this.clave);
            return true;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException err) {
            System.out.println("Error " + err.getMessage());
            return false;
        }
        
    }
    //Cerrar la conexion
 
    public void cierraConexion() throws SQLException {
        this.conn.close();
    }
 
//METODOS PARA TRABAJAR CON LA BASE DE DATOS
 
    public ResultSet consulta(String consulta) throws SQLException {
        this.estancia = (Statement) conn.createStatement();
        return this.estancia.executeQuery(consulta);
    }
 
    public void actualizar(String actualiza) throws SQLException {
        this.estancia = (Statement) conn.createStatement();
        estancia.executeUpdate(actualiza);
    }
 
    public ResultSet borrar(String borra) throws SQLException {
        Statement st = (Statement) this.conn.createStatement();
        return (ResultSet) st.executeQuery(borra);
    }
 
    public int insertar(String inserta) throws SQLException {
        Statement st = (Statement) this.conn.createStatement();
        return st.executeUpdate(inserta);
    }
 
}
