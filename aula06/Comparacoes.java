package aula06; 

import java.util.Scanner;

public class Comparacoes
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int idadePessoaA = 20;
        int idadePessoaB = 16;

        boolean comparacaoIdade = idadePessoaA == idadePessoaB;
        boolean maiorDe18 = idadePessoaA > 18;

        boolean primeiraComparacao = comparacaoIdade && maiorDe18;
        System.out.println(primeiraComparacao);

        
        boolean idadeDiferentes = idadePessoaA != idadePessoaB;
        boolean menorQue12 = idadePessoaB < 12;

        boolean segundaComparacao = idadeDiferentes && menorQue12;
        System.out.println(segundaComparacao);
    }
}
