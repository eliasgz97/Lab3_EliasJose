package lab3_eliasydaniel;
import java.util.ArrayList;
public class ConnectiveLine {
    private ArrayList <Empresas> empresas;
    private ArrayList <Personas> personas;
    private ArrayList <Ingresos> ingresos;

    public ConnectiveLine(ArrayList<Empresas> empresas, ArrayList<Personas> personas, ArrayList<Ingresos> ingresos) {
        this.empresas = empresas;
        this.personas = personas;
        this.ingresos = ingresos;
    }

    public ArrayList<Empresas> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresas> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    public ArrayList<Ingresos> getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList<Ingresos> ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "ConnectiveLine{" + "empresas=" + empresas + ", personas=" + personas + ", ingresos=" + ingresos + '}';
    }
    
}
