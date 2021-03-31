
package patrones;


public class EmailStrategy  {
     private String mEmail;

    public EmailStrategy(String email) {
        this.mEmail = email;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public void enviar(Noticia noticia) {
        System.out.println("Enviando al email: "+mEmail+ " la noticia:\n "+noticia);
    }
    
    public String getTipoStrategy(){
        return "E-Mail";
    }
    
}
