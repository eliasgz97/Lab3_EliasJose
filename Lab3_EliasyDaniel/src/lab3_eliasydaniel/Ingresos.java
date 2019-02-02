package lab3_eliasydaniel;

public class Ingresos {
    private Empresas empresa;
    private Freelance freelance;
    private int dinero;

    public Ingresos(Empresas empresa, Freelance freelance, int dinero) {
        this.empresa = empresa;
        this.freelance = freelance;
        this.dinero = dinero;
    }

    public Ingresos(int dinero) {
        this.dinero = dinero;
    }
    
    public Empresas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }

    public Freelance getFreelance() {
        return freelance;
    }

    public void setFreelance(Freelance freelance) {
        this.freelance = freelance;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Ingresos{" + " dinero=" + dinero + '}';
    }
    
}
