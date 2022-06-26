  // Crear clase Persona.
  // Crear las variables privadas edad, nombre y telefono de la clase Persona.
  // Crear gets y sets de cada propiedad.
  // Crear un objeto persona en el main.
  // Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, 
  // por último muéstralas por consola.
public class Ejercicio8 {
  public static void main(String[] args) {
    Persona persona = new Persona();

    persona.setEdad(32);
    persona.setNombre("Jane Doe");
    persona.setTelefono("555-3268-197327");

    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Edad: " + persona.getEdad());
    System.out.println("Teléfono: " + persona.getTelefono());    
  }
}
  
  class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
      this.edad = edad;
    }

    public int getEdad() {
      return this.edad;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getNombre() {
      return this.nombre;
    }

    public void setTelefono(String telefono) {
      this.telefono = telefono;
    }

    public String getTelefono() {
      return this.telefono;
    }
    
  }
