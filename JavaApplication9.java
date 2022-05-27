package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {

    public static double convs1(double graus) {
        double cel;
        cel = (graus-32)/1.8;
        return cel;
    }
   public static double convs2(double graus) {
        double fa;
        fa = graus * 1.8 + 32;
        return fa;
    }
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        double graus, cel,fa;
        char sim;
       int resp;
        do {
            System.out.println("Você deseja converter: "
                    + "1. Fahrenheit para graus Celsius"
                    + "2. Celsius para graus Fahrenheit"
                    + "Escolha 1 ou 2.");
            resp=in.nextInt();
            while(resp!=1&&resp!=2){
                System.out.println("Opção inválida. Digite novamente.");
                resp=in.nextInt();
            }
            if(resp==1){
            System.out.println("Fahrenheit para graus Celsius. Digite o valor que quer converter.");
            graus = in.nextDouble();
            cel = convs1(graus);
            System.out.println("O valor em Celsius é: " + cel);}
            if(resp==2){
                System.out.println("Celsius para graus Fahrenheit. Digite o valor que quer converter.");
            graus = in.nextDouble();
            fa = convs2(graus);
            System.out.println("O valor em Fahrenheit é: " + fa);}
            
        
            System.out.println("Deseja converter outro valor? Digite 's' para sim e 'n' para não");
            sim = in.next().charAt(0);
            sim = Character.toLowerCase(sim);
            while (sim != 's' && sim != 'n') {
                System.out.println("Não é uma resposta válida. Tente novamente.");
                sim = in.next().charAt(0);
                sim = Character.toLowerCase(sim);
            }

        } while (sim == 's');
        System.out.println("Obrigada por testar!");
    }

    }
    
