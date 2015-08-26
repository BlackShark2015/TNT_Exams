package Model;

public class TipoComplejidad {

    private int idTipoComplegidad;
    private static TipoComplejidad insTipComplejidad= null;
    
    private String Nombre;

    private String Descripcion;

    protected TipoComplejidad() {
    }
    public static TipoComplejidad getIntance()
    {
        if(insTipComplejidad == null)
        {
            insTipComplejidad = new TipoComplejidad();
        }
        return insTipComplejidad;
    }
    
    
    public int getIdTipoComplegidad() {
        return idTipoComplegidad;
    }

    public void setIdTipoComplegidad(int idTipoComplegidad) {
        this.idTipoComplegidad = idTipoComplegidad;
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
    
    
    
    
}
