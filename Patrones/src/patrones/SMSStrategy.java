
package patrones;


public class SMSStrategy implements Estrategy{

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
    public void enviar(Update update) {
        System.out.println("Enviando al telefono: "+tlf+ " la noticia:\n "+update);
    }

    @Override
    public String getTipoStrategy() {
        return "SMS";
    }
    
}
