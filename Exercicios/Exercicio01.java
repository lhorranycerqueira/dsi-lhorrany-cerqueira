package Exercicios;
import java.util.Scanner;

public class Exercicio01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Escreva seu nome: ");
            String seuNome = scanner.nextLine();

            System.out.print("Quantas horas você trabalhou?: ");
            double horasTrabalhadas = scanner.nextDouble();      
            
            System.out.print("Qual o valor da sua hora de trabalho?: ");
            double valorHora = scanner.nextDouble(); 

            System.out.print("Quantos filhos com idade inferior a 14 anos você tem?: ");
            double qntdFilhos = scanner.nextDouble();     
            
            System.out.print("Quantos anos você tem?: ");
            double idade = scanner.nextDouble();   

            System.out.print("Quanto tempo de serviço em anos você tem?: ");
            double tempoServico = scanner.nextDouble();   

            System.out.print("Qual valor do salário família por filho?: ");
            double salarioFamilia = scanner.nextDouble();   
            
            double salarioBruto = horasTrabalhadas * valorHora;
            System.out.println("O valor do seu salário bruto é de: " + salarioBruto);

            double descontoInps = salarioBruto * (8.5/100);
            double salarioComDesconto = salarioBruto - descontoInps;
            System.out.println("O valor do seu salário com desconto INPS é de: " + salarioComDesconto);

            double salarioFamiliaTotal = qntdFilhos * salarioFamilia; 
            System.out.println("O valor do seu salário família é de: " + salarioFamiliaTotal);
            
            // segunda parte
            
            double impostoAPagar = 0;
          
        
            if (salarioBruto > 1500) {
                impostoAPagar = salarioBruto * (15.0/100);
                System.out.println("O valor do seu imposto de renda é de 15%, resultando em R$:" + impostoAPagar);
            }
            else if (salarioBruto > 500) {
            impostoAPagar = salarioBruto * (10.0/100); 
                System.out.println("O valor do seu imposto de renda é 10%, resultando em R$:" + impostoAPagar);
            }
            else {
                System.out.println("Você não precisa pagar imposto de renda!");
            }
             
          // calcular adicional
            double adicionalTrabalho = 0;
            if (idade > 40) {
               adicionalTrabalho = salarioBruto * (2.0/100);
                System.out.println("O adicional por idade é de 2%, resultando em R$:" + adicionalTrabalho);
            }
            
            else if (tempoServico > 15) {
                adicionalTrabalho = salarioBruto * (3.5/100);
                System.out.println("Seu adicional por tempo de serviço é de 3.5%, resultando em R$:" + adicionalTrabalho);
            }
            
            else if (tempoServico > 5 && idade > 30) {
                adicionalTrabalho = salarioBruto * (15/100);
                System.out.println("Seu adicional é de 15%, resultando em R$:" + adicionalTrabalho);
            }
            else {
                System.out.println("Você não tem direito a adicional por serviço ou idade!");
            }
            
            double salarioTotal = salarioComDesconto + salarioFamiliaTotal - impostoAPagar + adicionalTrabalho;
            System.out.println(seuNome + ", seu salário bruto é de: " + salarioBruto);
            System.out.println("Os seus descontos são:");
            System.out.println("Desconto do INPS: " + descontoInps);
            System.out.println("Desconto do imposto de renda: " + impostoAPagar);
            System.out.println("O total dos seus adicionais são: " + adicionalTrabalho);
            System.out.println("O seu salário líquido é de: " + salarioTotal);
        }
    }

    // nao esquecer de por o float