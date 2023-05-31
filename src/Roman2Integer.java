import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {
    public int romanToInt(String s) {
        //HashMap
        Map<Character, Integer> RomanIntegerReflectMap = new HashMap<>();
        RomanIntegerReflectMap.put('I', 1);
        RomanIntegerReflectMap.put('V', 5);
        RomanIntegerReflectMap.put('X', 10);
        RomanIntegerReflectMap.put('L', 50);
        RomanIntegerReflectMap.put('C', 100);
        RomanIntegerReflectMap.put('D', 500);
        RomanIntegerReflectMap.put('M',1000);
        int total = 0;
        for(int i=0; i<s.length(); i++){
            int preValue = RomanIntegerReflectMap.get(s.charAt(i));
            if(i<s.length()-1){
                int nextValue = RomanIntegerReflectMap.get(s.charAt(i+1));
                if(nextValue > preValue){
                    //left sub
                    total = total - preValue;
                }else{
                    //right add
                    total = total + preValue;
                }
                System.out.println(total);
            }else{
                total = total + preValue;
            }

        }
        return total;
    }

    public int romanToInt1(String s) {
        int total = 0;
        int number = 0;
        for(int i=s.length()-1; i>=0; i--){
            switch(s.charAt(i)){
                case 'I': number=1; break;
                case 'V': number=5; break;
                case 'X': number=10; break;
                case 'L': number=50; break;
                case 'C': number=100; break;
                case 'D': number=500; break;
                case 'M': number=1000; break;
            }
            if(4 * number < total){
                total = total - number;
            }else {
                total = total + number;
            }
        }
        return total;
    }

    public int romanToInt2(String s) {
        int total = 0;
        int number = 0;
        int prev = 0;
        for(int i=s.length()-1; i>=0; i--){
            switch(s.charAt(i)){
                case 'I': number=1; break;
                case 'V': number=5; break;
                case 'X': number=10; break;
                case 'L': number=50; break;
                case 'C': number=100; break;
                case 'D': number=500; break;
                case 'M': number=1000; break;
            }
            if(number < prev){
                total -= number;
            }else {
                total += number;
            }
            prev = number;
        }
        return total;
    }

    public static void main(String[] args) {
        Roman2Integer roman2Integer = new Roman2Integer();
        System.out.println(roman2Integer.romanToInt1("MCMXCIV"));
    }
}


