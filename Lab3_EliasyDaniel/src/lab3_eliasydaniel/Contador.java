package lab3_eliasydaniel;

import java.util.ArrayList;

/**
 *
 * @author Daniel RC
 */
public class Contador extends Freelance {

    private boolean estado;
    ArrayList<Comercial> listaco = new ArrayList();
    private String universidad;
    private String hoobie;

    public Contador(boolean estado, String universidad, String hoobie, String nombre, String contraseña, char genero, int edad, float dinero, String telefono, int identidad, String correo, ArrayList<Comercial> listaco) {
        super(nombre, contraseña, genero, edad, dinero, telefono, identidad, correo);
        this.estado = estado;
        this.universidad = universidad;
        this.hoobie = hoobie;
        this.listaco = listaco;

    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Comercial> getListaco() {
        return listaco;
    }

    public void setListaco(ArrayList<Comercial> listaco) {
        this.listaco = listaco;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getHoobie() {
        return hoobie;
    }

    public void setHoobie(String hoobie) {
        this.hoobie = hoobie;
    }

    @Override
    public String toString() {
        return "Contador{" + "estado=" + estado + ", listaco=" + listaco + ", universidad=" + universidad + ", hoobie=" + hoobie + '}';
    }
    

}
