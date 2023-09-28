import java.util.Scanner;

public class ExercicioDeFixacao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Construa um laço de repetição para escrever o oitavo valor da
        // sequência de Fibonacci.

        int f1 = 1, f2 = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println(f1);
            f1 = f1 + f2;
            f2 = f1 - f2;
        }

        sc.close();
    }
}
