import java.util.Scanner;

public class Exercicioswitch {
    public static void main(String[] args) {
        
        System.out.print("Digite o código do produto: ");
        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();

        double valorAbacaxi = 8.50;
        double valorGoiaba = 2.00;
        double valorLaranja = 1.30;

        if (codigo == 1) {
            System.out.println("O código corresponde ao produto Abacaxi");
            System.out.println("O seu preço é: R$ " + valorAbacaxi);
        }
        else if (codigo == 2) {
            System.out.println("O código corresponde ao produto Goiaba");
            System.out.println("O seu preço é: R$ " + valorGoiaba);
        }
        else if (codigo == 3) {
            System.out.println("O código corresponde ao produto Laranja");
            System.out.println("O seu preço é: R$ " + valorLaranja);
        }

        switch (codigo) {
            case 1:
                System.out.print("Insira a quantidade de abacaxis que deseja comprar: ");
                int qtdFruta = scanner.nextInt();
                System.out.println("O valor da sua compra é de: R$ " + qtdFruta * valorAbacaxi);
                break;

            case 2:
                System.out.print("Insira a quantidade de goiabas que deseja comprar: ");
                int qtdFrutaa = scanner.nextInt();
                System.out.println("O valor da sua compra é de: R$ " + qtdFrutaa * valorGoiaba);
                break;

            case 3:
                System.out.print("Insira a quantidade de laranjas que deseja comprar: ");
                int qtdFrutaaa = scanner.nextInt();
                System.out.println("O valor da sua compra é de: R$ " + qtdFrutaaa * valorLaranja);
                break;

            default:
                System.out.println("Código de produto inválido. Insira um código válido (1, 2 ou 3).");
            break;
        }
    }
}