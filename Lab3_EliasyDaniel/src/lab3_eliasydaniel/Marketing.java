package lab3_eliasydaniel;
import java.util.ArrayList;

/**
 *
 * @author Daniel RC
 */
public class Marketing extends Freelance{
    private String red;
    ArrayList<Comercial>listaco=new ArrayList();

    public Marketing(String red, String nombre, String contraseña, char genero, int edad, float dinero, String telefono, int identidad, String correo, ArrayList<Comercial>listaco) {
        super(nombre, contraseña, genero, edad, dinero, telefono, identidad, correo);
        this.red = red;
        this.listaco = listaco;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public ArrayList<Comercial> getListaco() {
        return listaco;
    }

    public void setListaco(ArrayList<Comercial> listaco) {
        this.listaco = listaco;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Marketing{" + "red=" + red + ", listaco=" + listaco + '}';
    }


}
