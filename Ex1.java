import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Ex1 {
	
	public static void main (String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento:");
		String departament = sc.nextLine();	
		
		System.out.println("Entre com os dados do funcionário: ");
		System.out.print("Name:");
		String workerName = sc.nextLine();
		
		System.out.print("Level:");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary::");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departament));
		
		System.out.print("Quantos contrados esse trabalhador vai ter?");
		int n = sc.nextInt();
		
		for (int i =1; i<=n; i++) {
			System.out.println("Enter contract #"+i+" data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração do contrato: ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours );
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Entre com (MM/YYYY) para calcular salário: ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " +worker.getName());
		System.out.println("Departament: "+ worker.getDepartament().getName());
		System.out.println("Income for: "+monthAndYear +": " + worker.income(year, month));
		
	sc.close();
}
}
