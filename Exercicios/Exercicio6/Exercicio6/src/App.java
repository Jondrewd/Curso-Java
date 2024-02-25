import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exceptions.DomainException;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withDrawLimit = sc.nextDouble();

        System.out.print("Enter amount for withdraw: ");
        double withDraw = sc.nextDouble();
        
    
        Account account  = new Account(number, holder, balance, withDrawLimit);
        
        account.withDraw(withDraw);
        System.out.println("New balance: " + account.getBalance());
    }
    catch(DomainException e){
        System.out.println("Erro no saque: "+ e.getMessage());
    }
        sc.close();
    }
}
