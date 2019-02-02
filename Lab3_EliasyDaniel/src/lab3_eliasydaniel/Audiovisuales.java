package lab3_eliasydaniel;

import java.util.ArrayList;

/**
 *
 * @author Daniel RC
 */
public class Audiovisuales extends Freelance {
     ArrayList<Publicitario> listapu=new ArrayList();
    private String modelo;
    private String marca;

    public Audiovisuales(String modelo, String marca, String nombre, String contraseña, char genero, int edad, float dinero, String telefono, int identidad, String correo, ArrayList<Publicitario> listapu) {
        super(nombre, contraseña, genero, edad, dinero, telefono, identidad, correo);
        this.modelo = modelo;
        this.marca = marca;
        this.listapu = listapu;
    }

    public ArrayList<Publicitario> getListapu() {
        return listapu;
    }

    public void setListapu(ArrayList<Publicitario> listapu) {
        this.listapu = listapu;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString()+"Audiovisuales{" + "listapu=" + listapu + ", modelo=" + modelo + ", marca=" + marca + '}';
    }

}
