
package patrones;


public class EmailStrategy  implements Strategy{
     private String Email;

    public EmailStrategy(String email) {
        this.Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
    
    public String getTipoStrategy(){
        return "E-Mail";
    }

    @Override
    public void enviar(IUpdate update) {
        System.out.println("Enviando al email: "+Email+ " \nLa actualizacion:\n "+update);
    }
    
}
