/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 *
 * @author matero
 */
public class Update {
    private String Titulo;
    private String Descripcion;
    private String Fecha;

    public Update(String Titulo, String Descripcion, String Fecha) {
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
         String s="Titulo de la Actualizacion: "+getTitulo();
        s+="\nDescripcion de la Actualizacion: "+getDescripcion();
        s+="\nFecha de la Actualizacion: "+getFecha();
        return s;
    }
    
}
