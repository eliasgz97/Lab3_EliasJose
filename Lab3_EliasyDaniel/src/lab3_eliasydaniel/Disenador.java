package lab3_eliasydaniel;

import java.util.ArrayList;

public class Disenador extends Freelance{
    ArrayList<Publicitario> listapu = new ArrayList();
    private String universidad;
    private String hobbie;

    public Disenador(String universidad, String hobbie, String nombre, String contraseña, char genero, int edad, float dinero, String telefono, int identidad, String correo, ArrayList<Publicitario> listapu) {
        super(nombre, contraseña, genero, edad, dinero, telefono, identidad, correo);
        this.universidad = universidad;
        this.hobbie = hobbie;
        this.listapu = listapu;
    }

    public ArrayList<Publicitario> getListapu() {
        return listapu;
    }

    public void setListapu(ArrayList<Publicitario> listapu) {
        this.listapu = listapu;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    @Override
    public String toString() {
        return super.toString()+"Dise\u00f1ador{" + "listapu=" + listapu + ", universidad=" + universidad + ", hobbie=" + hobbie + '}';
    }
    
}
