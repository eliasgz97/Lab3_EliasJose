package lab3_eliasydaniel;

public class Administrador extends Personas{
    private String nombre;
    private String contraseña;

    public Administrador(String nombre, String contraseña, int identidad, String correo) {
        super(identidad, correo);
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Administrador{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
