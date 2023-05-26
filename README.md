# calcularBhaskaraJava
A Fórmula de Bhaskara é uma expressão matemática usada para encontrar as raízes (soluções) de uma equação do segundo grau a partir de seus coeficientes. O x é a variável, “a” o coeficiente quadrático retratado na fórmula anterior, “b” o coeficiente linear, “c” a constante e √ representa a raiz quadrada.

##

```
public class Bhaskara {
    public static void main(String[] args) {
        double a = 2;
        double b = 5;
        double c = -3;

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não há raízes reais");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A única raiz é " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são " + x1 + " e " + x2);
        }
    }
}
