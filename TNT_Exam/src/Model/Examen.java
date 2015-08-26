package Model;


import java.util.Date;

public class Examen extends UtilExamen {

    private String nombre;

    public int cantidadPreguntas;

    private Date fechaRegistro;

    private int idUsuario;

    private int idExamen;

    public String CrearExamen(String Nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String crearExamen(String Nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }
    
}
