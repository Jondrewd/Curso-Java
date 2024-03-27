import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo:");
        String path = sc.nextLine();


        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<User> set = new HashSet<>();
            String line = br.readLine();
            while(line!=null){
                String[] fields = line.split(" ");
                String name = fields[0];
                Date instant = Date.from(Instant.parse(fields[1]));
                
                set.add(new User(name, instant));
                line = br.readLine();
            }
        
            System.out.println("Total users: " + set.size());
        }

        catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}

