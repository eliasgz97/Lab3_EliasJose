package lab3_eliasydaniel;

import java.util.Date;

public class Proyecto {
    private String nombre;
    private Empresas empresa;
    private double precio;
    private String estado;
    private String descripcion;
    private String inicio;
    private String entrega;

    public Proyecto(String nombre, Empresas empresa, double precio, String estado, String descripcion, String inicio, String entrega) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.entrega = entrega;
    }

    public Proyecto(String nombre, double precio, String estado, String descripcion, String inicio, String entrega) {
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.entrega = entrega;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empresas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", empresa=" + empresa + ", precio=" + precio + ", estado=" + estado + ", descripcion=" + descripcion + ", inicio=" + inicio + ", entrega=" + entrega + '}';
    }
    
}
