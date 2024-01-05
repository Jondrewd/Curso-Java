import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ListEmployee2;

public class List2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<ListEmployee2> list = new ArrayList<>();
		System.out.print("Quantos funcionarios serão registrados? ");
		int f = sc.nextInt();
		
		for(int i = 0; i<f; i++) {
			System.out.println();
			System.out.println("Funcionario #"+ (i+1) + ":");
			System.out.print("Id: ");
			Integer id= sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			ListEmployee2 func = new ListEmployee2(id, nome , salario);
			list.add(func);
		}
		
		System.out.println("Entre com o id do funcionario que receberá o aumento: ");
		int idA = sc.nextInt();
		Integer pos = hasId(list, idA);
		if(pos != null) {
			System.out.println("Entre com a porcentagem: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		
		}else {
			System.out.println("Esse id não existe!");
		}
		
		

		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for(ListEmployee2 emp : list) {
			System.out.println(emp);
			
		}
		
		
	}
	public static Integer hasId(List<ListEmployee2> list, int id) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
