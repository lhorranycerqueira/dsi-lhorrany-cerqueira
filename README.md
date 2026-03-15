# Desenvolvimento de Software I
Aulas de Desenvolvimento de Software I com o professor João Siles utilizando Java.

# JAVA
Java é uma linguagem de programação usada para criação de apps, sistemas, jogos e muitos outros. Foi criado pela Oracle !

# Como configurar o Java no PC?
Primeiro, é bom introduzir o que é JDK, JVM e JRE (embora esse ainda não tenha sido mencionado na aula)
O JDK é Java Development Kit, ele (como o nome diz) é o kit de desenvolvimento Java, que compila o código fonte .java em bytecode .class;

(bytecode é um formato de código intermediário.)

 O JVM é o Java Virtual Manchine, a máquina virtual do java que consegue executar o bytecode .class;

O JRE, que ainda não foi mencionado em aula, é o Java Runtime, ele fornece as bibliotecas padrões do java pro development kit compilar o código e permitindo a máquina virtual executar o programa.

Tendo em vista essas funcionalidades, para configurar o java na máquina, baixamos o JDK da Adoptium, marca-se a opção de baixar para todos na máquina, e também todas as opções do JDK com Hotspot (path, .jar...). Então clicar em baixar e prontinho !!
## Explicando um pouco nosso primeiro código

O nosso primeiro código foi bem simples, apenas um 'hello word' (mas que quase nao rodou ...)

" package  aula01;

public  class  Main { //o nome do arquivo deve ser o mesmo nome da classe principal TEM QUE SER COM LETRA MAIUSCULA

// a classe principal vai abracar tudo do projeto

public  static  void  main(String[] args) { //recebendo parametros

System.out.println("Hello World"); // ação, de saida

}

}

  

//todo comando e ação tem que terminar com ; "
- ele está sem indentação e com meus comentários, o que ajuda a entender um pouco melhor o que cada coisa significa, mesmo assim, vou destrinchar mais a fundo abaixo:
- package aula01 é o a forma de localizar a pasta onde meu código está! (obviamente, pra que funcione, o nome precisa ser igual o da pasta);
- Java é sensível a CAPS !;
- public  class  Main { toda linha de código precisa estar dentro de uma classe (class), e por conta da sensibilidade a caps, o nome da classe deve começar com a letra maiúscula (Main);
- O nome do arquivo do java necessariamente precisa ser identico ao nome da classe, então, meu arquivo está salvo como Main.java para que ele seja executável e funcione!
- public  static  void  main(String[] args) o código colocado dentro do main() vai ser executado, e está recebendo parâmetros. 
- System.out.println("Hello World"); aqui é um metodo de imprimir uma linha de texto, é uma ação.


## Link das fontes que usei para complementar a pesquisa !

https://dicasdeprogramacao.com.br/qual-a-diferenca-entre-jdk-jre-e-jvm/ Acesso em: 15 de março de 2026.

https://www.w3schools.com/java/java_syntax.asp Acesso em: 15 de março de 2026.
Menção honrosa à explicação do professor e aos comentários do meu código!