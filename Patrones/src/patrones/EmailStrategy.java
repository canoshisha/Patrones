
package patrones;


public class EmailStrategy  implements Estrategy{
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
    
    public String getTipoStrategy(){
        return "E-Mail";
    }

    @Override
    public void enviar(Update actualizacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
