package patrones;

/**
 *
 * @author matero
 */
public interface Strategy {

    void enviar(Update actualizacion);

    String getTipoStrategy();
}
