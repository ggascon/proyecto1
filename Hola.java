import java.util.Scanner;

public class Hola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola mundo");
        System.out.println("Cómo te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
        Adios adiosObjeto = new Adios(nombre);
        System.out.println("Saliendo de la aplicación");
    }
}
