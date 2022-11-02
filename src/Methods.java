import java.util.*;

public class Methods {

    static void printSignInfo(int number){
        String signInfo="";
        if(number>0){
            signInfo="positive";
        }else if(number<0){
            signInfo="negative";
        }else signInfo="zero";
        System.out.printf("The number %d is %s\n",number,signInfo);
    }
    static void printdollars(char symbol,int length) {
        for(int i=0;i<length;i++){
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        printdollars('*',19);
//        System.out.println("\nThis is the result\n");
//        printdollars('&',15);
        Scanner scanner=new Scanner(System.in);
        printSignInfo(scanner.nextInt());
    }
}
