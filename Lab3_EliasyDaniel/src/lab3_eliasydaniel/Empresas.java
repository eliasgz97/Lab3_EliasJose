package lab3_eliasydaniel;

import java.util.ArrayList;

public class Empresas {

    private String nombre;
    private int telefono;
    private String correo;
    private String contraseña;
    private String descripcion;
    private Ingresos ingreso;
    private ArrayList <Proyecto> proyectos = new ArrayList();

    public Empresas(String nombre, int telefono, String correo, String contraseña, String descripcion, Ingresos ingreso) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
        this.descripcion = descripcion;
        this.ingreso = ingreso; 
    }

    public Empresas(String nombre, int telefono, String correo, String contraseña, String descripcion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
        this.descripcion = descripcion;
    }
    
    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public Ingresos getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingresos ingreso) {
        this.ingreso = ingreso;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Empresas{" + "nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", descripcion=" + descripcion + '}';
    }
    
}
