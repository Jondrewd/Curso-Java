import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        calcularFibonacci(numero);
        
        if (verificarFibonacci(numero))
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        else
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        
        scanner.close();
    }


    public static void calcularFibonacci(int limite) {
        int anterior = 0, atual = 1, proximo;

        System.out.println("Sequência de Fibonacci até o limite " + limite + ":");
        System.out.print(anterior + " " + atual + " ");

        while (true) {
            proximo = anterior + atual;
            if (proximo > limite)
                break;
            System.out.print(proximo + " ");
            anterior = atual;
            atual = proximo;
        }
        System.out.println();
    }

    
    public static boolean verificarFibonacci(int num) {
        int anterior = 0, atual = 1, proximo;

        while (atual <= num) {
            if (atual == num)
                return true;
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return false;
    }
}
