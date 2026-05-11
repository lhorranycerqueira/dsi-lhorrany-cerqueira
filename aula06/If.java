import java.util.Scanner;

public class If
{
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
        else {
            System.out.println("Insira um código válido");
        }
    }
}