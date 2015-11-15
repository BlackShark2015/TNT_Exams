package Model;


import java.util.ArrayList;
/**
 * 
 * @author Julio Morales, Johan Garcia
 * clase que describe si una pregunta es de tipo abierta, seleccion multiple
 * entre otras
 */
public class TipoPregunta {

    private int IdTipoPregunta;
    private static TipoPregunta insTipPregunta= null;
    private String Nombre;

    private String Descripcion;
    
    protected TipoPregunta() {
    }
    public static TipoPregunta getIntance()
    {
        if(insTipPregunta == null)
        {
            insTipPregunta = new TipoPregunta();
        }
        return insTipPregunta;
    }

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
