import java.util.Scanner;

public class Exerciciofor
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para revelar sua tabuada: ");
        int num = scanner.nextInt();
        int resultado = num;

        for (int i = 1; i <= 10; i++) { // repete o código 10 vezes
            resultado = num * i;
            System.out.println(num + " * " + i + " = " + resultado);
        }
    }
}