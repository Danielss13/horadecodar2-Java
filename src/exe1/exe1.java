package exe1;
import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número:");
        int n1 = sc.nextInt();
        String var3;
        if (n1 > 0) {
            System.out.println("POSITIVO");
            var3 = sc.nextLine();
        } else if (n1 < 0) {
            System.out.println("NEGATIVO");
            var3 = sc.nextLine();
        } else {
            System.out.println("NEUTRO");
            var3 = sc.nextLine();
        }
    
    }
}
