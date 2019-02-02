package lab3_eliasydaniel;

public class Extranjeras extends Empresas{
    private String pais;
    private String ciudad;
    private String url;

    public Extranjeras(String pais, String ciudad, String url, String nombre, int telefono, String correo, String contraseña, String descripcion, Ingresos ingreso) {
        super(nombre, telefono, correo, contraseña, descripcion, ingreso);
        this.pais = pais;
        this.ciudad = ciudad;
        this.url = url;
    }

    public Extranjeras(String pais, String ciudad, String url, String nombre, int telefono, String correo, String contraseña, String descripcion) {
        super(nombre, telefono, correo, contraseña, descripcion);
        this.pais = pais;
        this.ciudad = ciudad;
        this.url = url;
    }
    
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Extranjeras{" + "pais=" + pais + ", ciudad=" + ciudad + ", url=" + url + '}';
    }

}
