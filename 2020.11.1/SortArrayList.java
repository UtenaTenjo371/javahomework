import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        int n;
        ArrayList<Number> array=new ArrayList<Number>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入ArrayList的个数");
        n=scanner.nextInt();
        System.out.println("请输入ArrayList中的元素");
        for(int i=0;i<n;i++){
            array.add(Double.parseDouble(scanner.next()));
        }
        sort(array);
        for(int i=0;i<n;i++){
            System.out.println(array.get(i));
        }
        scanner.close();
    }
    public static void sort(ArrayList<Number> list){
        Number tmp;
        for(int i=0;i<list.size()-1;i++){
            for(int j=i;j<list.size();j++){
                if(list.get(i).doubleValue()>list.get(j).doubleValue()){
                    tmp=list.get(j);
                    list.set(j,list.get(i));
                    list.set(i, tmp);
                }
            }
        }
    }
}
