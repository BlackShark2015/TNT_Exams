package Model;

/**
 * 
 * @author jcmorales
 * Clase encargada de BUILDER para examen
 * el objetivo de esta clase es generar un examen, almacenarlo en base de datos
 * y consultarlo en el momento requerido por el usuario
 */
public abstract class UtilExamen 
{

    public DescripcionExamen generarExamen(DescripcionExamen item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String consultarExamen(String Nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public abstract String crearExamen(String Nombre);
}
