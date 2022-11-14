package exe2;
import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o primeiro número");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceira número");
        int n3 = sc.nextInt();

        if(n1 > n3 && n2 > n3) {
            System.out.println("A soma entre os dois maiores é = " + (n1 + n2));
            n1 = sc.nextInt();
        }
        else if(n2 > n1 && n3 > n1) {
            System.out.println("A soma entre os dois maiores é = " + (n2 + n3));
            n2 = sc.nextInt();
        }
        else if(n3 > n2 && n1 > n2) {
            System.out.println("A soma entre os dois maiores é = " + (n3 + n1));
            n3 = sc.nextInt();
        }
    }
}
