import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {


    public static void main(String[] args) {
        try {
            int[] arr = readFileNumbers.readIntegersFromFile("numbers.txt");
            int sum = readFileNumbers.sumArray(arr);
            System.out.println("Sum of array is: " + sum);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (InvalidNumberException e) {
            System.err.println("Invalid number in file: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Error calculating sum: " + e.getMessage());
        }
    }
}