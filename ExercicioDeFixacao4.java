import java.util.Scanner;

public class ExercicioDeFixacao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        format("Arielton");

        sc.close();
    }

    public static void format(String s){
        for (int i = 0; i <= s.length(); i++){
            System.out.println(s.substring(0, i));
        }
    }
}
