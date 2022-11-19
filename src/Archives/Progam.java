package Archives;

import Archives.Entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFoulderStr = (sourceFile.getParent());

        boolean sucess = new File (sourceFoulderStr + "\\out").mkdir();
        System.out.println("Folder Create: "+ sucess);

        String targetFieldStr = sourceFoulderStr + "\\out\\summary.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
            String lines = br.readLine();
            while (lines != null){
                String[] fields = lines.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name,price,quantity));
                lines = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFieldStr))){
                for (Product item : list){
                    bw.write(item.toString());
                    bw.newLine();
                }
                System.out.println(targetFieldStr+" CREATED");

            }catch (IOException e){
                System.out.println(e.getMessage());
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
