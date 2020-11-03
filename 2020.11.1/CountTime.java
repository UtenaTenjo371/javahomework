import java.util.Date;
import java.lang.Math;
public class CountTime{
    public static void main(String[] args) {
        Date[] date=new Date[8];
        for(int i=0;i<8;i++){
            date[i]=new Date((long) Math.pow(10,i+4));
            System.out.println(date[i].toString());
        }
    }
}