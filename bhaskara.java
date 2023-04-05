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
