package aula07;

public class Operators {
        public static void main(String[] args) {
   int num1 = 10; // = usado para atribuição de valor

   num1 += 3;// += é um operador de atribuição que equivale a soma do valor da variavel num1 com o numero 3, fazendo com que num1 agora seja igual a 13
   System.out.println(num1); 
   num1 -= 2; // -= funciona da mesma forma que o +=, mas subtraindo, o valor agora é 11
   System.out.println(num1); 
   num1 *= 4; //mesma coisa so que multipicando KKKKKKKK, o output é 44
   System.out.println(num1); //output é 44
   num1 /= 2; //agora vamos dividir o valor da variavel, tornando o output 22
   System.out.println(num1); 
   num1 %= 5; //com o operador de modulo, ele vai retornar somente o resto da divisão, entao 22 dividido por 5 tem o resultado de 4, entao o output é 2;
   System.out.println(num1);
   num1 &= 3; //esse faz comparação bit a bit, utilizando binário
   System.out.println(num1); 
   num1 |= 2; //também é um operador bit a bit, mas ele faz uma comparação usando o ou, se um dos bits for 1, o resultado é true.
   System.out.println(num1);
    num1 ^= 1; //esse operador é o XOR, ele retorna true se um dos bits for 1, mas não ambos, entao o resultado é 3
    System.out.println(num1);
    num1 <<= 1; //esse operador é p shift left, ele desloca os bits para a esquerda.
    System.out.println(num1);
    num1 >>= 2; //esse operador é semelhante ao anterior, mas ele desloca os bits para a direita.
    System.out.println(num1);  
    
}
}