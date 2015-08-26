package Model;


import java.util.ArrayList;

public class TipoPregunta {

    private int IdTipoPregunta;

    private String Nombre;

    private String Descripcion;

    public ArrayList crear(ArrayList item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getIdTipoPregunta() {
        return IdTipoPregunta;
    }

    public void setIdTipoPregunta(int IdTipoPregunta) {
        this.IdTipoPregunta = IdTipoPregunta;
    }
    
}
