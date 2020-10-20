import java.util.Scanner;

public class SumMajorDigonal{
    public static double sumMajorDiagonal (double[][] m){
        double sum=0;
        for(int i=0;i<4;i++){
            sum+=m[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double m[][]=new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row");
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++){
                m[i][j]=scanner.nextFloat();
            }
        System.out.printf("Sum of the elements in the major digonal is %f",sumMajorDiagonal(m));
    }
}