import java.util.*;
public class Triangle {
    static void printTriangle(int width){
        for(int i=1;i<=width;i++){
            printIncreasingSequence(i);
        }
        for(int i=width-1;i>=1;i--){
            printIncreasingSequence(i);
        }
    }

    static void printIncreasingSequence(int last){
        for(int i=1;i<=last;i++){
            System.out.printf(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        int width=new Scanner(System.in).nextInt();
        printTriangle(width);
    }
}
