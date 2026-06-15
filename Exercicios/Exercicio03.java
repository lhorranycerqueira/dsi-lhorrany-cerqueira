package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira o comprimento do lado A da forma: ");
    double ladoA = scanner.nextDouble();

    System.out.print("Insira o comprimento do lado B da forma: ");
    double ladoB = scanner.nextDouble();

    System.out.print("Insira o comprimento do lado C da forma: ");
    double ladoC = scanner.nextDouble();



    if (ladoB > ladoA && ladoB > ladoC) {
        System.out.println("O maior lado é o lado B, com o comprimento de: " + ladoB);
    }
    else if (ladoC > ladoA && ladoC > ladoB) {
        System.out.println("O maior lado é o lado C, com o comprimento de: " + ladoC);
    }
    else {
        System.out.println("O maior lado é o lado A, com o comprimento de: " + ladoA);
    }
    
    if (ladoA > ladoB + ladoC) {
        System.out.println("Não é possível formar um triângulo com esses lados");
    } 
    else if (ladoA * ladoA == ladoB * ladoB + ladoC * ladoC) {
        System.out.println("Formou um triângulo retângulo");
    } 
    else if (ladoA * ladoA > ladoB * ladoB + ladoC * ladoC) {
        System.out.println("Formou um triângulo obtusângulo.");
    } 
    else if (ladoA * ladoA < ladoB * ladoB + ladoC * ladoC) {
        System.out.println("Formou um triângulo acutângulo.");
    }
    else if (ladoB == ladoA && ladoA == ladoC && ladoB == ladoC) {
        System.out.println("Formou um triângulo equilátero.");
    }
    else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
        System.out.println("Formou um triângulo isósceles.");
    } 
    else {
        System.out.println("Não formou nenhuma forma dísponivel no programa");
    }
}
}

// alterar pra float, alterar nos 3 exercicios