import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero: ");

        System.out.print("Data (dd/MM/yyyy): ");

        System.out.print("Valor do contrato: ");

        System.out.print("Entre com os numeros de parcelas: ");

        System.out.println("Parcelas:");


        sc.close();
    }
}
