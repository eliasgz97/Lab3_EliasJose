package lab3_eliasydaniel;
import java.util.ArrayList;

public class Desarollador extends Freelance {
    //lenguaje programación, universidad, idioma y una lista de proyectos web.
    private String lenguaje ;
    private String universidad;
    private String idioma;
    ArrayList<Web> pweb = new ArrayList();

    public Desarollador(String lenguaje, String universidad, String idioma, String nombre, String contraseña, char genero, int edad, float dinero, String telefono, int identidad, String correo, ArrayList<Web> pweb) {
        super(nombre, contraseña, genero, edad, dinero, telefono, identidad, correo);
        this.lenguaje = lenguaje;
        this.universidad = universidad;
        this.idioma = idioma;
        this.pweb=pweb;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<Web> getPweb() {
        return pweb;
    }

    public void setPweb(ArrayList<Web> pweb) {
        this.pweb = pweb;
    }

    @Override
    public String toString() {
        return super.toString()+"Desarrollador{" + "lenguaje=" + lenguaje + ", universidad=" + universidad + ", idioma=" + idioma + ", pweb=" + pweb + '}';
    }
    
}
