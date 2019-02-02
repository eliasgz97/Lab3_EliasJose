package lab3_eliasydaniel;

import java.util.ArrayList;

public class Freelance extends Personas {

    private String nombre;
    private String contraseña;
    private char genero;
    private int edad;
    ArrayList <Empresas> listaemm = new ArrayList();
    private double dinero;
    private String telefono;

    public Freelance(String nombre, String contraseña, char genero, int edad, double dinero, String telefono, int identidad, String correo) {
        super(identidad, correo);
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.genero = genero;
        this.edad = edad;
        this.dinero = dinero;
        this.telefono = telefono;
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Empresas> getListaemm() {
        return listaemm;
    }

    public void setListaemm(ArrayList<Empresas> listaemm) {
        this.listaemm = listaemm;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString() + "Freelance{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", genero=" + genero + ", edad=" + edad + ", listaemm=" + listaemm + ", dinero=" + dinero + ", telefono=" + telefono + '}';
    }
}
