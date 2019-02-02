package lab3_eliasydaniel;

public class Personas {
    private int identidad;
    private String correo;

    public Personas(int identidad, String correo) {
        this.identidad = identidad;
        this.correo = correo;
    }

    public Personas() {
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Personas{" + "identidad=" + identidad + ", correo=" + correo + '}';
    }
    
    
}
