public class Calculadora {

    public static void main(String[] args) {
        if (args.length == 1 && args[0].equals("help")) {
            help();
            System.exit(0);
        }

        if (args.length != 3) {
            System.out.println("Número de parámetros incorrecto");
            System.out.println("USO: java Calculadora <operacion> num1 num2");
            System.exit(-1);
        }

        String operacion = args[0];
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);
        double resultado;

        resultado = switch (operacion) {
            case "add" -> add(num1, num2);
            case "sub" -> sub(num1, num2);
            case "div" -> div(num1, num2);
            case "mul" -> mul(num1, num2);
            default -> throw new RuntimeException("Operación no soportada");
        };

        System.out.printf("%.2f %s %.2f = %.2f\n", num1, operacion, num2, resultado);
    }

    public static void help() {
        System.out.println("USO: java Calculadora <operacion> num1 num2");
        System.out.println("Operaciones soportadas: ");
        System.out.println("add");
        System.out.println("sub");
        System.out.println("div");
        System.out.println("mul");
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }
}
