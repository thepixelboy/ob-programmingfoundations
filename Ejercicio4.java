class Ejercicio4 {
  public static void main(String[] args) {
    // Estructura If
    numeroIf(0);

    // Bucle While
    numeroWhile(0);

    // Bucle Do While
    numeroDoWhile(3);

    // Bucle For
    numeroFor(0);

    // Switch
    String estacion = "verano";
    sentenciaSwitch(estacion);
    
  }

  // Estructura If
  // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
  // Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
  public static void numeroIf(int numero) {
    if (numero < 0) {
      System.out.println("El número es negativo");
    } else if (numero > 0) {
      System.out.println("El número es positivo");
    } else {
      System.out.println("El número es 0");
    }
  }

  // Bucle While
  // Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, 
  // el bloque de código que tendrá el bucle deberá:
  // - Incrementar el valor de la variable en uno cada vez que se ejecute.
  // - Mostrarlo por pantalla cada vez que se ejecute.
  public static void numeroWhile(int numero) {
    while (numero < 3) {
      System.out.println("El número actual en el Bucle While es " + numero);
      numero++;
    }
  }

  // Bucle Do While
  // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
  public static void numeroDoWhile(int numero) {
    do {
      System.out.println("El número actual en el Bucle DoWhile es " + numero);
      numero++;
    } while (numero < 3);
  }

  // Bucle For
  // Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la 
  // variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse 
  // por pantalla.
  public static void numeroFor(int numero) {
    for (; numero <= 3; numero++) {
      System.out.println("El número actual en el Bucle For es " + numero);
    }
  }

  // Switch
  // Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones 
  // del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de 
  // la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea 
  // una estación.
  public static void sentenciaSwitch(String estacion) {
    switch (estacion) {
      case "primavera":
        System.out.println("Es primavera!");
        break;
      case "verano":
        System.out.println("Es verano!");
        break;
      case "otoño":
        System.out.println("Es otoño!");
        break;
      case "invierno":
        System.out.println("Es invierno!");
        break;
      default:
        System.out.println("No estamos en ninguna estación del año conocida.");
        break;
    }
  }
}
