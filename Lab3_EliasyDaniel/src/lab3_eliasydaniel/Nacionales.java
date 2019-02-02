package lab3_eliasydaniel;

public class Nacionales extends Empresas {

    private String depto;
    private String muni;
    private String ciudad;
    private String mision;
    private String vision;

    public Nacionales(String depto, String muni, String ciudad, String mision, String vision, String nombre, int telefono, String correo, String contraseña, String descripcion, Ingresos ingresos) {
        super(nombre, telefono, correo, contraseña, descripcion, ingresos);
        this.depto = depto;
        this.muni = muni;
        this.ciudad = ciudad;
        this.mision = mision;
        this.vision = vision;
    }

    public Nacionales(String depto, String muni, String ciudad, String mision, String vision, String nombre, int telefono, String correo, String contraseña, String descripcion) {
        super(nombre, telefono, correo, contraseña, descripcion);
        this.depto = depto;
        this.muni = muni;
        this.ciudad = ciudad;
        this.mision = mision;
        this.vision = vision;
    }

    
    
    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getMuni() {
        return muni;
    }

    public void setMuni(String muni) {
        this.muni = muni;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    @Override
    public String toString() {
        return super.toString() + "Nacionales{" + "depto=" + depto + ", muni=" + muni + ", ciudad=" + ciudad + ", mision=" + mision + ", vision=" + vision + '}';
    }

}
