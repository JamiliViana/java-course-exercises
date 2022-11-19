package Set.application;

import Set.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter file full path:");
        String pathStr = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(pathStr))){
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username,moment));
                line = br.readLine();
            }
            System.out.println("Total Users: "+set.size());

        }catch (Exception e){
            e.getStackTrace();
        }

    }
}
