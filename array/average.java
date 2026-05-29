package array;

public class average {
    public static void main(String[] args) {
        int [] num= { 12, 18, 20, 30, 10};
        int sum=0;
        for(int i=0; i<num.length; i++){
            sum= sum+num[i];
        }
        int average= sum/num.length;
        System.out.println(average);
    }

}
