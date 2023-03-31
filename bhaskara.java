import java.util.Scanner;

public class Bhaskara {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Digite o valor de a: ");
      double a = input.nextDouble();

      System.out.print("Digite o valor de b: ");
      double b = input.nextDouble();

      System.out.print("Digite o valor de c: ");
      double c = input.nextDouble();

      double delta = b * b - 4 * a * c;
      double x1, x2;

      if (delta >= 0) {
         x1 = (-b + Math.sqrt(delta)) / (2 * a);
         x2 = (-b - Math.sqrt(delta)) / (2 * a);

         System.out.println("As raízes são " + x1 + " e " + x2);
      } else {
         System.out.println("Não existem raízes reais.");
      }

      input.close();
   }
}