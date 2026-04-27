public class Conversoesnarrow {
   public Conversoesnarrow() {
   }

   public static void main(String[] var0) {

      //narrowing fechar
      double myDouble1 = 9.78d;
      int myInt1 = (int) myDouble1; // double pra int esse eh manual

      System.out.println(myDouble1); // saida 9.78
      System.out.println(myInt1);    // saida 9

   }
}