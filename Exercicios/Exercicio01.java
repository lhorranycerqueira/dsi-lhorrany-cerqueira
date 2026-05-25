package Exercicios;
import java.util.Scanner;

public class Exercicio01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Escreva seu nome: ");
            String seuNome = scanner.nextLine();

            System.out.print("Quantas horas você trabalhou?: ");
            double horasTrabalhadas = scanner.nextInt();      
            
            System.out.print("Qual o valor da sua hora de trabalho?: ");
            double valorHora = scanner.nextInt(); 

            System.out.print("Quantos filhos com idade inferior a 14 anos você tem?: ");
            double qntdFilhos = scanner.nextInt();     
            
            System.out.print("Quantos anos você tem?: ");
            double idade = scanner.nextInt();   

            System.out.print("Quanto tempo de serviço você tem?: ");
            double tempoServico = scanner.nextInt();   

            System.out.print("Qual valor do salário família por filho?: ");
            double salarioFamilia = scanner.nextInt();   
            
            double salarioBruto = horasTrabalhadas * valorHora;
            System.out.println("O valor do seu salário bruto é de: " + salarioBruto);
            double salarioComDesconto = salarioBruto/0.85;
            System.out.println("O valor do seu salário com desconto INPS é de: " + salarioComDesconto);
            double salarioFamiliaTotal = qntdFilhos * salarioFamilia; 
            System.out.println("O valor do seu salário família é de: " + salarioFamiliaTotal);
            
            // segunda parte
            
            double impostoAPagar = salarioBruto/0.15;
          
        
            if (salarioBruto > 1500) {
        
                System.out.println("O valor do seu imposto de renda é de: " + impostoAPagar);
            }
            else if (salarioBruto > 500) {
            impostoAPagar = salarioBruto/0.8; 
                System.out.println("O valor do seu imposto de renda é de: " + impostoAPagar);
            }
            else {
                System.out.println("Você não precisa pagar imposto de renda!");
            }
// calcular adicional
         double adicionalTrabalho = salarioBruto/0.2;
            if (idade > 40) {
               
                System.out.println("O adicional por idade é de: " + adicionalTrabalho);
            }
            
            else if (tempoServico > 15) {
                adicionalTrabalho = salarioBruto/0.35;
                System.out.println("Seu adicional por tempo de serviço é de: " + adicionalTrabalho);
            }
            
            else if (tempoServico <= 15 && tempoServico > 5 && idade > 30) {
                adicionalTrabalho = salarioBruto/0.15;
                System.out.println("Seu adicional é de: " + adicionalTrabalho);
            }
            else {
                System.out.println("Você não tem direito a adicional por serviço ou idade!");
            }
            
            double salarioTotal = salarioComDesconto + salarioFamiliaTotal - impostoAPagar + adicionalTrabalho;
            System.out.println("O seu salário líquido é de: " + salarioTotal);
            System.out.println(seuNome + ", seu salário bruto é de: " + salarioBruto);
            System.out.println("Os seus descontos são: ");
            System.out.println("O total dos seus adicionais são: " + adicionalTrabalho);

        }
    }