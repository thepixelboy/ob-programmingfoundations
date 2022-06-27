// Crea una clase Persona con las siguientes variables:
// - La edad
// - El nombre
// - El teléfono
//
// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
// esta nueva clase tendrá la variable credito solo para esa clase.
// 
// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, 
// el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
// 
// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una 
// variable salario que solo tenga la clase Trabajador.
class Ejercicio9 {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    Trabajador trabajador = new Trabajador();

    cliente.edad = 32;
    cliente.nombre = "Jane Doe";
    cliente.telefono = "555-1234-9836275";
    cliente.credito = 1173287.86;

    trabajador.edad = 36;
    trabajador.nombre = "John Doe";
    trabajador.telefono = "555-5678-1238654";
    trabajador.salario = 80000.99;

    System.out.println("Cliente: " + cliente.nombre + ". " + cliente.edad + " años.");
    System.out.println("Teléfono: " + cliente.telefono);
    System.out.println("Línea de crédito: $" + cliente.credito);

    System.out.println("\n");

    System.out.println("Trabajador: " + trabajador.nombre + ". " + trabajador.edad + " años.");
    System.out.println("Teléfono: " + trabajador.telefono);
    System.out.println("Salario: $" + trabajador.salario);
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

class Trabajador extends Persona {
  double salario;
}
