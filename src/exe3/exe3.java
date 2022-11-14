package exe3;

import java.util.Scanner;

public class exe3 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double []numeros = new double[10];
        double total = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º valor:");
           double valor = sc.nextDouble();
            numeros[i] = valor;
            total += valor;
        }
         System.out.println("Os números digitados são: ");
         for (double exibirNumeros : numeros) {
             System.out.println(exibirNumeros);
         }
         System.out.println("Média aritmética: " + (total/numeros.length));

    
        


    }
}