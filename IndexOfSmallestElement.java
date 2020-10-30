import java.util.Scanner;

public class IndexOfSmallestElement{
    public static int indexOfSmallestElement(double[] array){
        double min=array[0];
        int min_i=-1;
        for(int i=0;i<10;i++){
            if(array[i]<min){
                min_i=i;
                min=array[i];
            }
        }
        return min_i;
    }
    public static void main(String[] args) {
        double[] array;
        array=new double[10];
        int number=-1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入10个数:");
        for(int i=0;i<10;i++){
            array[i]=scanner.nextDouble();
        }
        number=indexOfSmallestElement(array);
        System.out.printf("第%d个数最小，为%f",number,array[number]);

    }
}