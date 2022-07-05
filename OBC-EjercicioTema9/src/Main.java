public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Hector";
        cliente.edad = 41;
        cliente.telefono = "507-888-8888";
        cliente.credito = 1000.50;
        System.out.println("Cliente nombre: " + cliente.nombre +", edad: " + cliente.edad + ", telefono: "
                + cliente.telefono + ", credito: "+ cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Hector";
        trabajador.edad = 41;
        trabajador.telefono = "507-888-8888";
        trabajador.salario = 4000.00;
        System.out.println("Trabajador nombre: " + trabajador.nombre + ", edad: " + trabajador.edad + ", telefono: "
                + trabajador.telefono + ", salario: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona{
    double salario;
}