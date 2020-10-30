public class CreateArray{
    public static void createArray(int[] counts){
        for(int i=0;i<100;i++){
            counts[(int)(Math.random()*10)]++;
        }
    }
    public static void main(String[] args) {
        int[] counts=new int[10];
        createArray(counts);
        for(int i=0;i<10;i++){
            System.out.printf("%d:%d ",i,counts[i]);
        }
    }
}