import java.util.Scanner;

public class ExercicioDeFixacao1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Escreva no console 150 vezes o texto: "Essa é a Xª execução do laço for".
        // Aonde X será substituída pelo índice do laço for.

        for (int i = 1; i <= 150; i++) {
            System.out.println("Essa é a " + i +"ª execução do laço for.");
        }

        sc.close();
    }

}