class Ejercicio3 {
  public static void main(String[] args) {
    // Primera parte
    int resultado = suma(5, 3, 9);
    System.out.println(resultado);

    // Segunda parte
    Coche miCoche = new Coche();
    miCoche.AgregarPuerta();

    System.out.println(miCoche.puertas);
}

// Primera parte:
// - Crear una función con tres parámetros que sean números que se suman entre sí.
// - Llamar a la función en el main y darle valores.
public static int suma(int num1, int num2, int num3) {
  return num1 + num2 + num3;
}

// Segunda parte:
// - Crear una clase coche.
// - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
// - Una función que incremente el número de puertas que tiene el coche.
// - Crear un objeto miCoche en el main y añadirle una puerta.
// - Mostrar el número de puertas que tiene el objeto.
class Coche {
  public int puertas = 3;

  public void AgregarPuerta() {
    this.puertas++;
  }
}
