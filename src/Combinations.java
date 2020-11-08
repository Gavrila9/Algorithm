import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
    /*
    * Generates all combinations and output them,
    * selecting n elements from data
    * */
    public void combinations(List<Integer> selected,List<Integer> data, int n){
        //initial value for recursion
        //how to select elements
        //how to output
        //select element 0
        if(n == 0){
            for(Integer i: selected){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
            return;
        }
        if(data.isEmpty()){
            return;
        }

        selected.add(data.get(0));
        combinations(selected,data.subList(1,data.size()),n-1);
        //un-select element 0
        selected.remove(selected.size()-1);
        combinations(selected,data.subList(1,data.size()),n);

    }

    public static void main(String[] args) {
        Combinations cb= new Combinations();
        cb.combinations(new ArrayList<>(), Arrays.asList(1,2,3,4,5),2);
    }
}
