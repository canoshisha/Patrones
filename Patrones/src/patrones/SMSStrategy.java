
package patrones;


public class SMSStrategy implements Strategy{

    String tlf;

    public SMSStrategy(String tlf) {
        this.tlf = tlf;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
    
    
    @Override
    public void enviar(IUpdate update) {
        System.out.println("Enviando al telefono: "+tlf+ " \nLa actualizacion:\n "+update);
    }

    @Override
    public String getTipoStrategy() {
        return "SMS";
    }
    
}
