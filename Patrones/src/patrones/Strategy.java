package patrones;

/**
 *
 * @author matero
 */
public interface Strategy {

    void enviar(IUpdate actualizacion);

    String getTipoStrategy();
}
