import java.sql.SQLOutput;
import java.util.Scanner;
//Difference between Addition of odd and even numbers
public class Application {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try {
            String[] strings = scan.nextLine().split("");
            int[] numbers = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                numbers[i] = Integer.parseInt(strings[i]);
            }
            int oddSum = 0;
            int evenSum = 0;
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenSum += number;
                } else {
                    oddSum += number;
                }
            }
            System.out.println(evenSum - oddSum);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            scan.close();
        }

    }
}