package Exercicios;

import java.util.Scanner;

public class Exercicio02{
        public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escreva seu Código de Funcionário: ");
        int codigoFuncionario = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Qual seu sexo? (M/F): ");
        String genero = scanner.nextLine();

        System.out.print("Quanto tempo de serviço em anos você tem?: ");
        int tempoServico = scanner.nextInt();

        System.out.print("Qual seu salário?: ");
        double salarioSemAdicional = scanner.nextDouble();
        
        double salarioTotal;

        if ((genero.equals("F") || genero.equals("f")) && tempoServico > 10) {
            double bonus = salarioSemAdicional * (25.0/100);
            salarioTotal = salarioSemAdicional + bonus;
            System.out.println("Funcionária, que corresponde ao código: " + codigoFuncionario + ", o seu salário com bônus é de: " + salarioTotal);
             System.out.println("Funcionária, o seu bônus é de R$: " + bonus);
        }
        else if ((genero.equals("M") || genero.equals("m")) && tempoServico > 15) {
            double bonus = salarioSemAdicional * (20.0/100);
            salarioTotal = salarioSemAdicional + bonus;
            System.out.println("Funcionário, que corresponde ao código: " + codigoFuncionario + ", o seu salário com bônus é de: " + salarioTotal);
            System.out.println("Funcionário, o seu bônus é de R$: " + bonus);
        }
        else {
            salarioTotal = salarioSemAdicional + 100;
            System.out.println("Funcionário(a), que corresponde ao código: " + codigoFuncionario + ", o seu salário com o bônus de 100 reais é de: " + salarioTotal);
            System.out.println("Seu bônus é de R$: " + 100);
        }
    }
}