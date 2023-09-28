import java.util.Scanner;

public class ExercicioDeFixacao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Escreva os valores ímpares no intervalo enrte 1 e 753;

        for (int i = 1; i < 753; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
