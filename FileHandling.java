import java.io.*;

public class FileHandling {
    
    //Most common
    public void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Most common
    public void countWords() {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Word count: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Most common
    public void appendFile() {
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write("This will be appended.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void copyToAnotherFile() {
         try (FileInputStream in = new FileInputStream("input.txt");
             FileOutputStream out = new FileOutputStream("copy.txt")) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listFilesInDirectory() {
        File dir = new File("C:\\Users\\YourName\\Documents");
        
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    public void parseCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                for (String field : fields) {
                    System.out.print(field + " | ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
