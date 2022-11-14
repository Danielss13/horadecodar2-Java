package exe4;

import java.util.Scanner;

public class exe4 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[4];
        double total = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe a " + (i + 1) + "º nota:");
            double valor = sc.nextDouble();
            numeros[i] = valor;
            total += valor /4;
        }

        if(total >= 6){
            System.out.println("PARABÉNS! Você foi aprovado! -- " + total);
            
        }else{
            System.out.println("VOCÊ FOI REPROVADO -- " + total);  
        }
    }

}
