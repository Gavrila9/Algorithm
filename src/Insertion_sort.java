import java.util.Arrays;

public class Insertion_sort {
    public static int[] insert_sort (int A[]){
        for(int j = 1; j <A.length; j++){
            int key = A[j];
            int i = j -1;
            while (i>=0 && A[i]>key){
                A[i+1] = A[i];
                --i;
            }
            A[i+1] = key;
        }
        return A;
    }

    public static void main(String[] args) {
        int A[] = {2,5,8,9,1,3,6};
        System.out.println(Arrays.toString(insert_sort(A)));

    }
}
