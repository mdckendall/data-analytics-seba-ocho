import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class Main
{
    public static void main(String[] args)
    {
        String opt1 = "$98,345 average salary in South Florida!";
        String opt2 = "US News - 100 Best Jobs!";
        String opt3 = "Top 10 Forbes In-Demand Jobs!";
        boolean loopIgnition = true;
        int userInput;

        Scanner input = new Scanner(System.in);

        while (loopIgnition)
        {
            System.out.println("Press 1 to learn about salary.");
            System.out.println("Press 2 to learn about the job.");
            System.out.println("Press 3 to learn about demand.");
            System.out.println("Press 4 to view current students.");
            System.out.println("Press 5 to quit.");
            userInput = input.nextInt();

            if (userInput == 1)
            {
                System.out.println(opt1);
            }
            else if (userInput == 2)
            {
                System.out.println(opt2);
            }
            else if (userInput == 3)
            {
                System.out.println(opt3);
            }
            else if (userInput == 4)
            {
                try
                {
                    BufferedReader readIn = new BufferedReader(new FileReader("names.txt"));
                    String line;

                    System.out.println("Current Students:");

                    while((line = readIn.readLine()) != null)
                    {
                        System.out.println(line);
                    }
                    readIn.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            else if (userInput == 5)
            {
                loopIgnition = false;
            }
            else
            {
                System.out.println("Invalid Input!");
            }
        }
    }
}