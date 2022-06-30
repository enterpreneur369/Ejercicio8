public class Ejercicio8 {
    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.setEdad(20);
        miPersona.setNombre("Pepe");
        miPersona.setTelefono("5555555");
        System.out.println(
            "Edad: " + miPersona.getEdad() +
            " Nombre: " + miPersona.getNombre() +
            " Teléfono: " + miPersona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;
    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}