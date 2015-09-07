package Model;


import java.util.ArrayList;

/**
 * 
 * @author Julio Morales, Johan Garcia
 * clase que describe un tema al cual pertenece una pregunta
 */

public class Tema implements Util {

    private int IdTema;

    private String Nombre;

    private int idMateria;

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

    public int getIdTema() {
        return IdTema;
    }

    public void setIdTema(int IdTema) {
        this.IdTema = IdTema;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
