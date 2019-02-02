package lab3_eliasydaniel;

import java.util.Date;

public class Publicitario extends Proyecto{
    private Freelance freelance;

    public Publicitario(Freelance freelance, String nombre, Empresas empresa, double precio, String estado, String descripcion, String inicio, String entrega) {
        super(nombre, empresa, precio, estado, descripcion, inicio, entrega);
        this.freelance = freelance;
    }

    public Freelance getFreelance() {
        return freelance;
    }

    public void setFreelance(Freelance freelance) {
        this.freelance = freelance;
    }

    @Override
    public String toString() {
        return super.toString()+"Publicitario{" + "freelance=" + freelance + '}';
    }
    
}
