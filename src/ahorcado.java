import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) {
        // clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // declaraciones y asignaciones
        String palabraSecreta = "inteligencia".toUpperCase(); // Convertimos la palabra secreta a mayúsculas

        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: de tipo iterativa (bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control: de tipo iterativa (bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
            // Esto se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor: ");

            // Usamos la clase Scanner para pedir una letra
            char letra = Character.toUpperCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control: condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Letra incorrecta! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta: " + palabraSecreta + "!");
            }
        }

        if (!palabraAdivinada) {
            System.out.println("¡Qué pena, te has quedado sin intentos! GAME OVER");
        }

        scanner.close();
    }
}

