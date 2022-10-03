import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        double lado, quadrado;

        System.out.println("Insira o valor do quadrado");
        lado = console.nextDouble();
        quadrado = lado * lado;
        System.out.println("O valor da area do quadrado é : " + quadrado);
        System.out.println("O dobro da area do quadrado é : " + quadrado * 2);
        console.close();

    }
}
