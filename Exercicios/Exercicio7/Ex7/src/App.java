import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.println("Entre com o caminho do arquivo: ");
        String path = sc.nextLine();
        //  src\input.csv

        File file = new File(path);
        String sourceFolder = file.getParent();

        boolean sucess = new File(sourceFolder + "\\out").mkdir();
        
        String targetFile = sourceFolder + "\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String item = br.readLine();
            while(item != null){
                String[] field = item.split(",");
                String name = field[0];
                double price = Double.parseDouble(field[1]);
                int quantity = Integer.parseInt(field[2]);
                
                list.add(new Produto(name, price, quantity));
                
                item = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
                for (Produto produto : list) {
                    bw.write(produto.getName()+ ", "+ String.format("%.2f", 
                    produto.totalValue()));
                    bw.newLine();
                }

                
            } catch (IOException e) {
                System.out.println("Error");
            }

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
