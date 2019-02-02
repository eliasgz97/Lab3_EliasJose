package lab3_eliasydaniel;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_EliasyDaniel {

    public static void main(String[] args) {
        boolean disponibilidad = true;
        char resp = 'S';
        Scanner input = new Scanner(System.in);
        ArrayList<Personas> personas = new ArrayList();
        ArrayList<Empresas> empresas = new ArrayList();

        while (resp == 'S' || resp == 's') {
            System.out.println("1. Registrar \n"
                    + "2. Login \n y modificar"
                    + "3. Eliminar elemento \n"
                    + "4. Exit");
            int opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese opcion: \n"
                            + "1. Registrar administrador: \n"
                            + "2. Registrar Freelance: \n"
                            + "3. Registrar empresa: ");
                    int opcion2 = input.nextInt();
                    int identidad;
                    String correo;
                    String nombre;
                    String contrasena;
                    switch (opcion2) {
                        case 1:
                            System.out.println("Ingrese numero de identidad: ");
                            identidad = input.nextInt();
                            System.out.println("Ingrese correo electronico: ");
                            correo = input.next();
                            System.out.println("Ingrese nombre: ");
                            nombre = input.next();
                            System.out.println("Ingrese contraseña: ");
                            contrasena = input.next();
                            personas.add(new Personas(identidad, correo));
                            int size = personas.size() - 1;
                            ((Administrador) personas.get(size)).setContraseña(contrasena);
                            ((Administrador) personas.get(size)).setNombre(nombre);

                            break;
                        case 2:

                            ArrayList<Empresas> empresasxf = new ArrayList();
                            System.out.println("Ingrese numero de identidad: ");
                            identidad = input.nextInt();
                            System.out.println("Ingrese correo electronico: ");
                            correo = input.next();
                            System.out.println("Ingrese nombre completo: ");
                            nombre = input.nextLine();
                            System.out.println("Ingrese contraseña: ");
                            contrasena = input.next();
                            System.out.println("Ingrese genero: ");
                            String genero = input.next();
                            System.out.println("Ingrese edad: ");
                            int edad = input.nextInt();
                            char r = 's';
                            while (r == 's' || r == 'S') {
                                System.out.println("Ingrese una empresa");
                                System.out.println("1. Extranjera \n"
                                        + "2. Nacional ");
                                int empresa = input.nextInt();
                                System.out.println("Ingrese nombre de la empresa: ");
                                String nombreempresa = input.next();
                                System.out.println("Ingrese numero de telefono: ");
                                int telefono = input.nextInt();
                                System.out.println("Ingrese correo");
                                String correo2 = input.next();
                                System.out.println("Ingrese descripcion de la empresa: ");
                                String descripcionempresa = input.nextLine();
                                System.out.println("Ingrese contraseña de la empresa: ");
                                char r2 = 's';
                                while (r2 == 'S' || r2 == 's') {
                                    System.out.println("Ingrese nombre del proyecto: ");
                                    String proyecto = input.next();
                                    System.out.println("Ingrese precio del proyecto: ");
                                    double precio = input.nextInt();
                                    System.out.println("Ingrese estado: ");
                                    String estado = input.next();
                                    System.out.println("Ingrese descripcion: ");
                                    String descripcion = input.nextLine();
                                    System.out.println("Ingrese fecha de inicio: ");
                                    String inicio = input.next();
                                    System.out.println("Ingrese fecha final: ");
                                    String fin = input.next();
                                    ArrayList<Proyecto> proyectos = new ArrayList();

                                    proyectos.add(new Proyecto(proyecto, precio, estado, descripcion, inicio, fin));
                                    System.out.println("Desea agregar otra empresa[s/n]: ");
                                    r2 = input.next().charAt(0);
                                }

                                switch (empresa) {

                                    case 1:

                                        System.out.println("Ingrese el pais: ");
                                        String pais = input.next();
                                        System.out.println("Ingrese ciudad: ");
                                        String ciudad = input.next();
                                        System.out.println("Ingrese url de la pagina web: ");
                                        String url = input.next();
                                        empresasxf.add(new Extranjeras(pais, ciudad, url, nombreempresa, telefono, correo2, contrasena, descripcionempresa));
                                        break;
                                    case 2:
                                        System.out.println("Ingrese departamento: ");
                                        String departamento = input.next();
                                        System.out.println("Ingrese Municipio: ");
                                        String municipio = input.next();
                                        System.out.println("Ingrese ciudad: ");
                                        String ciudad2 = input.next();
                                        System.out.println("Ingrese mision: ");
                                        String mision = input.nextLine();
                                        System.out.println("Ingrese vision: ");
                                        String vision = input.nextLine();
                                        empresasxf.add(new Nacionales(departamento, municipio, ciudad2, mision, vision, nombreempresa, telefono, correo, contrasena, descripcionempresa));
                                        break;
                                }
                                System.out.println("Desea agregar otra empresa[s/n]: ");
                                r = input.next().charAt(0);
                            }

                            break;
                        case 3:
                            char r3 = 's';
                            while (r3 == 's' || r3 == 'S') {
                                System.out.println("Ingrese una empresa");
                                System.out.println("1. Extranjera \n"
                                        + "2. Nacional ");
                                int empresa = input.nextInt();
                                System.out.println("Ingrese nombre de la empresa: ");
                                String nombreempresa = input.next();
                                System.out.println("Ingrese numero de telefono: ");
                                int telefono = input.nextInt();
                                System.out.println("Ingrese correo");
                                String correo2 = input.next();
                                System.out.println("Ingrese descripcion de la empresa: ");
                                String descripcionempresa = input.nextLine();
                                System.out.println("Ingrese contraseña de la empresa: ");
                                String contrasena2 = input.next();
                                System.out.println("Ingrese cantidad de dinero de la empresa");
                                int dinero = input.nextInt();
                                Ingresos ingreso = new Ingresos(dinero);
                                char r2 = 's';

                                ArrayList<Proyecto> proyectosempresas = new ArrayList();
                                while (r2 == 'S' || r2 == 's') {
                                    System.out.println("Ingrese nombre del proyecto: ");
                                    String proyecto = input.next();
                                    System.out.println("Ingrese precio del proyecto: ");
                                    double precio = input.nextInt();
                                    System.out.println("Ingrese estado: ");
                                    String estado = input.next();
                                    System.out.println("Ingrese descripcion: ");
                                    String descripcion = input.nextLine();
                                    System.out.println("Ingrese fecha de inicio: ");
                                    String inicio = input.next();
                                    System.out.println("Ingrese fecha final: ");
                                    String fin = input.next();

                                    proyectosempresas.add(new Proyecto(proyecto, precio, estado, descripcion, inicio, fin));
                                    System.out.println("Desea agregar otra empresa[s/n]: ");
                                    r2 = input.next().charAt(0);
                                }

                                switch (empresa) {

                                    case 1:

                                        System.out.println("Ingrese el pais: ");
                                        String pais = input.next();
                                        System.out.println("Ingrese ciudad: ");
                                        String ciudad = input.next();
                                        System.out.println("Ingrese url de la pagina web: ");
                                        String url = input.next();
                                        empresas.add(new Extranjeras(pais, ciudad, url, nombreempresa, telefono, correo2, contrasena2, descripcionempresa, ingreso));
                                        break;
                                    case 2:
                                        System.out.println("Ingrese departamento: ");
                                        String departamento = input.next();
                                        System.out.println("Ingrese Municipio: ");
                                        String municipio = input.next();
                                        System.out.println("Ingrese ciudad: ");
                                        String ciudad2 = input.next();
                                        System.out.println("Ingrese mision: ");
                                        String mision = input.nextLine();
                                        System.out.println("Ingrese vision: ");
                                        String vision = input.nextLine();
                                        empresas.add(new Nacionales(departamento, municipio, ciudad2, mision, vision, nombreempresa, telefono, correo2, contrasena2, descripcionempresa, ingreso));
                                        break;
                                }
                                System.out.println("Desea agregar otra empresa[s/n]: ");
                                r = input.next().charAt(0);
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Login \n"
                            + "1. Empresas: \n"
                            + "2. Administradores \n"
                            + "3. Freelance"
                    );
                    int login = input.nextInt();

                    switch (login) {
                        case 1:
                            System.out.println("Ingrese correo electronico: ");
                            String nombre4 = input.next();
                            System.out.println("Ingrese contraseña: ");
                            String contrasena4 = input.next();
                            for (int i = 0; i < empresas.size(); i++) {
                                if (((Empresas) empresas.get(i)).getCorreo().equals(nombre4) && ((Empresas) empresas.get(i)).getContraseña().equals(contrasena4)) {

                                    System.out.println("1. Crear proyectos: \n"
                                            + "2. Eliminar Proyectos: \n"
                                            + "3. Modificar proyectos: "
                                    );
                                    int loginempresa = input.nextInt();
                                    switch (loginempresa) {
                                        case 1:
                                            System.out.println("Ingrese nombre del proyecto: ");
                                            String proyecto = input.next();
                                            System.out.println("Ingrese precio del proyecto: ");
                                            double precio = input.nextInt();
                                            System.out.println("Ingrese estado: ");
                                            String estado = input.next();
                                            System.out.println("Ingrese descripcion: ");
                                            String descripcion = input.nextLine();
                                            System.out.println("Ingrese fecha de inicio: ");
                                            String inicio = input.next();
                                            System.out.println("Ingrese fecha final: ");
                                            String fin = input.next();
                                            empresas.get(i).getProyectos().add(new Proyecto(proyecto, precio, estado, descripcion, inicio, fin));

                                            break;
                                        case 2:
                                            System.out.println("Ingrese el nombre del proyecto: ");
                                            proyecto = input.next();
                                            for (int j = 0; j < empresas.get(i).getProyectos().size(); j++) {
                                                if (proyecto.equals(empresas.get(i).getProyectos().get(j).getNombre())) {
                                                    empresas.get(i).getProyectos().remove(j);
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Ingrese nombre del proyecto a modificar: ");
                                            String modificar = input.next();
                                            for (int j = 0; j < empresas.get(i).getProyectos().size(); j++) {
                                                if (modificar.equals(empresas.get(i).getProyectos().get(j).getNombre())) {
                                                    System.out.println("Ingrese nuevo nombre del proyecto: ");
                                                    proyecto = input.next();
                                                    empresas.get(i).getProyectos().get(j).setNombre(proyecto);
                                                    System.out.println("Ingrese nuevo precio del proyecto: ");
                                                    precio = input.nextInt();
                                                    empresas.get(i).getProyectos().get(j).setPrecio(precio);
                                                    System.out.println("Ingrese nuevo estado: ");
                                                    estado = input.next();

                                                    empresas.get(i).getProyectos().get(j).setEstado(estado);
                                                    System.out.println("Ingrese nueva descripcion: ");
                                                    descripcion = input.nextLine();
                                                    empresas.get(i).getProyectos().get(j).setDescripcion(descripcion);
                                                    System.out.println("Ingrese nueva fecha de inicio: ");
                                                    inicio = input.next();
                                                    empresas.get(i).getProyectos().get(j).setInicio(inicio);
                                                    System.out.println("Ingrese nueva fecha final: ");
                                                    fin = input.next();
                                                    empresas.get(i).getProyectos().get(j).setEntrega(fin);

                                                }
                                            }

                                            break;

                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese nombre: ");
                            String nombre3 = input.next();
                            System.out.println("Ingrese contraseña: ");
                            String contrasena3 = input.next();
                            for (int i = 0; i < personas.size(); i++) {
                                if (((Administrador) personas.get(i)).getCorreo().equals(nombre3)
                                        && ((Administrador) personas.get(i)).getContraseña().equals(contrasena3)) {
                                    System.out.println("Ingrese nombre de la empresa: ");
                                    String nempresa = input.next();
                                    for (int j = 0; j < empresas.size(); j++) {
                                        if (nempresa.equals(empresas.get(j).getNombre())) {
                                            System.out.println(empresas.get(j).getIngreso());
                                        }
                                    }

                                }
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese correo: ");
                            String correo2 = input.next();
                            System.out.println("Ingrese contraseña: ");
                            String contrasena5 = input.next();
                            for (int i = 0; i < personas.size(); i++) {
                                if (personas.get(i).getCorreo().equals(correo2) && ((Freelance) personas.get(i)).getContraseña().equals(contrasena5)) {
                                    for (int j = 0; j < ((Freelance) personas.get(i)).getListaemm().get(i).getProyectos().size(); j++) {
                                        System.out.println(j + "-" + ((Freelance) personas.get(i)).getListaemm().get(i).getProyectos().get(j));
                                    }
                                    System.out.println("Ingrese posicion del proyecto a comprar: ");
                                    int posicion = input.nextInt();
                                    if (((Freelance) personas.get(i)).getDinero() > ((Freelance) personas.get(i)).getListaemm().get(i).getProyectos().get(posicion).getPrecio()) {

                                        double ganancia = ((Freelance) personas.get(i)).getListaemm().get(i).getProyectos().get(posicion).getPrecio() * 0.90;
                                        ((Freelance) personas.get(i)).setDinero(ganancia);
                                        
                                    }

                                }

                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la identidad de la persona: ");
                    String eliminarpersona = input.next();
                    for (int i = 0; i < personas.size(); i++) {
                        if (eliminarpersona.equals(personas.get(i).getIdentidad())) {
                            personas.remove(i);
                        }
                    }
                    System.out.println("Ingrese el nombre de la empresa: ");
                    String eliminarempresa = input.next();
                    for (int i = 0; i < empresas.size(); i++) {
                        if (eliminarempresa.equals(empresas.get(i).getNombre())) {
                            empresas.remove(i);
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            System.out.println("Desea ingresar otra opcion[s/n]: ");
            resp = input.next().charAt(0);
        }

    }

}
