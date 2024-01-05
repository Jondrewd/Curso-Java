import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class atv {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Rent[] vect = new Rent[10];
		System.out.print("Quantos quarto serao alugados? ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Rent#"+i+":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.next();
			
			System.out.println("Room: ");
			int roomNumber = sc.nextInt();
			Rent rent = new Rent(name, email);
			
			vect[roomNumber] = rent;
		}

		
	}
}

