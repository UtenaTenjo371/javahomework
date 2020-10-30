import java.util.Scanner;
public class ReverseDigit{
    public static void reverse(int number){
        int result=0;
        do{
        result=result*10+number%10;
        number/=10;
        }while(number!=0);
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        reverse(scanner.nextInt());
    }
}