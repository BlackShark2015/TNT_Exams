package Model;


import java.util.ArrayList;
/**
 * 
 * @author Julio Morales, Johan Garcia
 * esta clase  nos permite crear metodos que comparten diferentes clases 
 * para realizar una creacion, una actualizacion o una consulta a
 * la base de datos
 */
public interface Util {

    public ArrayList crear(ArrayList item);

    public ArrayList actualizar(ArrayList item);

    public int consultar(int idItem);
}
