
//import java.io.Console;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Starting Program!");
        // Day 1 - Part 1
        try {
            File file = new File("/Users/dpucci/Java/HelloWorld/day1input.txt");
            int counter = 0;
            if (file.exists() && !file.isDirectory()) {
                FileReader fr = new FileReader(file); // reads the file
                BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
                String line;
                int number1 = 0;
                int number2 = 0;
                // set first line
                if ((line = br.readLine()) != null) {
                    number1 = Integer.parseInt(line);
                }
                while ((line = br.readLine()) != null) {
                    number2 = Integer.parseInt(line);
                    if (number2 > number1) {
                        counter++;
                    }
                    number1 = number2;
                }
                fr.close(); // closes the stream and release the resources
            }
            System.out.println("Part 1: Counter Total:" + counter + "\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Day 1 - Part 2
        try {
            File file = new File("/Users/dpucci/Java/HelloWorld/day1input.txt");
            int counter = 0;
            if (file.exists() && !file.isDirectory()) {
                FileReader fr = new FileReader(file); // reads the file
                BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
                String line;
                int number1 = 0;
                int number2 = 0;
                int number3 = 0;
                int total1 = 0;
                int total2 = 0;

                // set first line
                if ((line = br.readLine()) != null) {
                    number1 = Integer.parseInt(line);
                    // set second line
                    if ((line = br.readLine()) != null) {
                        number2 = Integer.parseInt(line);
                        // set third line
                    }
                    if ((line = br.readLine()) != null) {
                        number3 = Integer.parseInt(line);
                    }
                }

                total1 = number1 + number2 + number3;

                while ((line = br.readLine()) != null) {
                    int tempNumber1 = Integer.parseInt(line);
                    total2 = tempNumber1 + number2 + number3;
                    if (total2 > total1) {
                        counter++;
                    }
                    // move next set
                    total1 = total2;
                    number1 = number2;
                    number2 = number3;
                    number3 = tempNumber1;
                }
                fr.close(); // closes the stream and release the resources
                
            }
            System.out.println("Part 2: Counter Total:" + counter + "\n\n");
        } catch (

        IOException e) {
            e.printStackTrace();
        }
    }
}
