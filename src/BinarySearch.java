public class BinarySearch {
    /*
    * Search element k in a sorted array
    * @param arr a sorted array
    * @param k the element to search
    * @return index in arr where k is. -1 if not found.
    * */
    public int binarySearch(int[] arr, int k){
        int a = 0;
        int b = arr.length-1;
        //loop invariant: [a, b), is a valid range. (a <= b)
        //k may only be within range [a, b). WHY 【a, b], 1 [a ,b) + [b, c) = [a, c). 2 b-a =len(ab)
        while (a < b){
            int m = a +( b - a ) / 2; //(a+b) maybe overflow, but a/2 + b/2 maybe wrong result, a=1 b=3 m=1.
            //a ==b: m=a
            //b == a +1: m=a
            //b=a+2: m=a+1
            if(k< arr[m]){ //a ...(m-1)
                b = m;
            }else if (k > arr[m]){
                a = m +1;
            }else{
                return m;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(new int[]{1,2,10,15,100},15));
        System.out.println(bs.binarySearch(new int[]{1,2,10,15,100},-2));
        System.out.println(bs.binarySearch(new int[]{},13));
        System.out.println(bs.binarySearch(new int[]{12},13));


    }
}
