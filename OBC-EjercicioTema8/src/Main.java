public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Hector");
        persona.setEdad(41);
        persona.setTelefono("507-888-8888");
        System.out.println("Nombre: "+ persona.getNombre()+ ", Edad: " + persona.getEdad() + ", Teléfono: " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}