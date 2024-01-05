import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class List1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		list.add("bombas");
		list.add("tomas");
		list.add("pumba");
		list.add("tumba");
		list.add("contas");
		String name = sc.next();
		list.add(2, name);
		
		
		
		System.out.println(list.size());
		for( String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		list.removeIf(x -> x.charAt(0)=='b');
		System.out.println(list.size());
		for( String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		System.out.println("Index of tumba: " + list.indexOf("tumba"));
		System.out.println(list.size());
		for( String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0)=='t').collect(Collectors.toList());
		for( String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		String nome = list.stream().filter(x -> x.charAt(0)=='t').findFirst().orElse(null);
		System.out.println(nome);
		
	}

}
