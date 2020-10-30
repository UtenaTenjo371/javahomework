import java.util.Random;
import java.util.Scanner;

public class PrintMatrix{
    public static void printMatrix(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((int)(Math.random()*10%2));//(int)(Math.random()*10%2)  0/1随机数方法
            }
            System.out.print('\n');
        }

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        printMatrix(scanner.nextInt());
    }
}