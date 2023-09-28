import java.util.Scanner;

public class ExercicioDeFixacao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crie uma lista contendo os caracteres do seu nome completo aonde vocês
        // irão percorrer os valores e escrever o décimo caractere.

        char[] nome = new char[] {'A', 'R', 'I', 'E', 'L', 'T', 'O', 'N', ' ','G', 'O', 'M', 'E', 'S'};

        for (int i = 0; i < nome.length; i++) {
            if(i == 9){
                System.out.println(nome[i]);
            }
        }
        sc.close();
    }
}
