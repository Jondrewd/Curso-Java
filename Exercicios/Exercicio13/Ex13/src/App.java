import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma String para ser invertida:");
        String original = sc.nextLine();
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        sc.close();
    }
    public static String reverse(String str) {
        
        char[] chars = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);
    }
    
}
