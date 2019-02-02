package lab3_eliasydaniel;

import java.util.Date;

public class Web extends Proyecto{
    private Desarollador dweb;

    public Web(Desarollador dweb, String nombre, Empresas empresa, double precio, String estado, String descripcion, String inicio, String entrega) {
        super(nombre, empresa, precio, estado, descripcion, inicio, entrega);
        this.dweb = dweb;
    }

    public Desarollador getDweb() {
        return dweb;
    }

    public void setDweb(Desarollador dweb) {
        this.dweb = dweb;
    }

    @Override
    public String toString() {
        return super.toString()+"Web{" + "dweb=" + dweb + '}';
    }
    
}
