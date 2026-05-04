public class Operadores {
      public Operadores() {
   }

   public static void main(String[] var0) {
    int num1 = 20;
    int num2 = 20;

    //explorando os operadores !

    System.out.println(num1); // isso eh tipo de operador igual, onde num1 = 20
    num2 += 20; // eh um operador de adição, ele soma e atribui o numero ao num2
    System.out.println(num2);
    num2 -= 10; // operador de subtração, ele subtrai e atribui o numero ao num2, entao agora a variavel vai ter o valor de 10, mesmo com a atribuição anterior, mas considerando o valor anterior, ou seja, a atribuição de antes fez cm q a variavel tivesse valor de 40, entao a gente vai subtrair 10 de 40, e nao de 20, que era o valor inicial da variavel
    System.out.println(num2);
    num2 *= 10; // multiplica e atribui o valor da variavel
    System.out.println(num2);
    num2 /= 2; // divide e atribui
    System.out.println(num2);
    num2 %= 2; // operador de modulus, ele vai dividir e vai mostrar no output somente O RESTOOOO da divisao
    System.out.println(num2);

    // agora vamos focar nos bits

    num1 &= 4; // aqui o operador lógico é AND, ou seja, ele vai comparar os bits de num1 e 4, e vai operar com true ou false, ou seja, se ambos forem 1, o resultado é 1, se ambos forem 0, o resultado é 0, se um for 1 e outro for 0, o resultado é 0, e vai atribuir o resultado a num1. é como um inner join no banco de dados, onde ele so retorna dados que satisfaçam AMBAS as condicoes. so lembrar de true e false q vai dar certo ! é usado geralmente pra sistemas e manipulação de permissoes.
    System.out.println(num1);
    num1 |= 2; // esse operador é o OR(ou), entao ele vai comparar os bits de num1 e 2, e se somente um dos bits for 1(true), o resultado vai ser 1 ! so precisa satisfazer uma das condicoes. a unica situação onde vai retornar 0 eh quando ambos os bits forem 0(false). importante lembrar que a atribuição nova acontece com o numero ATRIBUIDO anteriormente.
    System.out.println(num1);
    num1 ^= 2; // operador XOR, ele vai tambem comparar os bits, MAAAAS ele vai dar verdadeiro apenas se os resultados forem DIFERENTES ! se ambos forem 1 ou ambos forem 0, o resultado é 0(false), se um for 1 e outro 0, vai dar 1(true). ele eh um operador de exclusao. usado em criptografias simples.
    System.out.println(num1);
    num1 >>= 1; // operador de deslocamento para a direita, ele vai deslocar os bits de x para a direita. o numero de vezes que ele vai deslocar é o numero depois do operador, ou seja, 1. ele vai deslocar os bits de num1 para a direita, e o bit mais a direita vai ser descartado e o bit mais a esquerda vai ser preenchido com 0. entao se num1 for 20, que em binario é 10100, depois de deslocar para a direita uma vez, ele vai ser 1010, que é 10 em decimal. se fosse deslocar para a direita duas vezes, ele seria 101, que é 5 em decimal. usado pra dividir potencias de 2, deslocando pra direita por 2 vezes divide por 4. eh uma forma de reduzir o numero de bits de uma forma mais rapida.
    System.out.println(num1);
    num1 <<= 1; // faz exatamente o contrario do operador de deslocamento da direita KKKKKKKK, se o outro divide, esse multiplica por 2, se o valor atribuido for 2, entao multipla por 4
    System.out.println(num1);

    // a gente usa essa forma pra mudar o valor da variavel pq se escrevermos o nome da variavel dnv e atribuirmos valor, vai dar erro, usamos os operados pra atribuirmos um novo valor a ela ! 
}
}