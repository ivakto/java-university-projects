package labs.lab6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task9 {
    public static void main(String[] args) {
        String inputFile = "src/data.csv"; 
        
        int totalAge = 0;
        int personCount = 0;
        
        int sofiaCount = 0;
        int plovdivCount = 0;
        
        String line;
        boolean isHeader = true; 

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            
            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false; 
                    continue; 
                }

                String[] values = line.split(",");

                if (values.length == 3) {
                    try {
                        int age = Integer.parseInt(values[1].trim()); 
                        String city = values[2].trim(); 

                        totalAge += age;
                        personCount++;

                        if (city.equalsIgnoreCase("София")) {
                            sofiaCount++;
                        } else if (city.equalsIgnoreCase("Пловдив")) {
                            plovdivCount++;
                        }
                        
                    } catch (NumberFormatException e) {
                        System.err.println("Предупреждение: Грешка при парсване на възраст в ред: " + line);
                    }
                }
            }

            System.out.println("--- Анализ на данни ---");

            if (personCount > 0) {

                double averageAge = (double) totalAge / personCount;
                System.out.println("Средна възраст: " + Math.round(averageAge));
            } else {
                System.out.println("Няма данни за обработка.");
            }


            System.out.println("Брой хора от София: " + sofiaCount);
            System.out.println("Брой хора от Пловдив: " + plovdivCount);

        } catch (IOException e) {
            System.err.println("Грешка при четене на файла " + inputFile + ": " + e.getMessage());
        }
    }
}
