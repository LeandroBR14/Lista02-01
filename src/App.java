import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um primeiro número: ");
        double n1 = teclado.nextDouble();
        System.out.print("Informe um segundo número: ");
        double n2 = teclado.nextDouble();
        if (n1 > n2) {
            System.out.println(+n1+ " é maior.");
        } else if (n2 > n1){
            System.out.println(+n2+ " é maior.");
        } else {
            System.out.println("Os números são iguais.");
        }
        teclado.close();
    }
}