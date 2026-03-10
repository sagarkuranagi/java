import java.util.Arrays;

public class ReversedArray{
    public static void main(String[] args) {
        int[] arr ={ 11, 22,33,44};
        int[] revArr =new int[arr.length];
        int idx = 0;
        for(int i= arr.length-1; i>=0; i--){
            revArr[idx]= arr[i];
            idx++;
        }
        System.out.println("reversed : "+ Arrays.toString(revArr));
    }
}