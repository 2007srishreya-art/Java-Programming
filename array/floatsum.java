package array;

public class floatsum {
    public static void main(String[] args) {
        float[]arr= { 12.6f, 16.8f, 18.20f, 19.11f};
        float sum=0;
        for(int i=0; i<arr.length; i++){
            sum= sum + arr[i];
        }
        System.out.println(sum);
    }
    
}
