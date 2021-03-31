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
public interface IUpdate {

    public String getTitulo();

    public String getDescripcion();

    public String getFecha();

    public void setDescripcion(String Descripcion);

    public void setTitulo(String Titulo);

    public void setFecha(String Fecha);

    @Override
    public String toString();
}
