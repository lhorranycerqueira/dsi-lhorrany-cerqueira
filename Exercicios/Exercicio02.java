package Exercicios;

import java.util.Scanner;

public class Exercicio02{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual seu sexo? (M/F): ");
            String genero = scanner.nextLine();
            System.out.println("Quanto tempo de serviço em anos você tem?: ");
            int tempoServico = scanner.nextInt();
            System.out.println("Qual seu sálario?: ");
            int salarioSemAdicional = scanner.nextInt();

            int salarioBonus = 2/100;

            if (genero == "F" && tempoServico > 10) {
                salarioBonus = 25/100;
                System.out.println("O seu bônus é de: " + salarioBonus);
            }


        }
    }
