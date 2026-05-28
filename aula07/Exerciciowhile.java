import java.util.Scanner;

public class Exerciciowhile
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhacorreta = "prof, to usando os exercicios q fiz na competec (aura)";

        while (true) {
            System.out.print("Digite sua senha: ");
            String palpite = scanner.nextLine();

            if (palpite.equals(senhacorreta)) {
                System.out.println("Senha correta. Acesso Permitido.");
                break;
            }
            System.out.println("Senha Inválida. Tente Novamente.");
        }

        System.out.print("Bem-vindo ao sistema 💀");
    }
}