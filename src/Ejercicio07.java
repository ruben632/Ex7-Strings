import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner ruben = new Scanner(System.in);

        String[][] preguntas = Preguntas.preguntas;

        System.out.println("TEST DE JAVA");
        System.out.println("Responde con a, b, c o d.");

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println();
            System.out.println("Pregunta " + (i + 1));
            System.out.println(preguntas[i][0]);
            System.out.println("a. " + preguntas[i][1]);
            System.out.println("b. " + preguntas[i][2]);
            System.out.println("c. " + preguntas[i][3]);
            System.out.println("d. " + preguntas[i][4]);
            System.out.print("Respuesta: ");

            String respuesta = ruben.nextLine();

            if (respuesta.equals(preguntas[i][5])) {
                System.out.println("Respuesta correcta!");
            } else if (respuesta.equals("a") || respuesta.equals("b")
                    || respuesta.equals("c") || respuesta.equals("d")) {
                System.out.println("Respuesta incorrecta, la respuesta correcta es: "
                        + preguntas[i][5]);
            } else {
                System.out.println("Respuesta no válida: a, b, c, d");
                break;
            }
        }

        ruben.close();
    }
}