import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num= 0;
        int i =0;
        while( i < s.length() && i != s.length()-1){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            if(map.get(c1) < map.get(c2)){
                int diff = map.get(c2) - map.get(c1);
                num += diff;
                i += 2;
            }
            else{
                num += map.get(c1);
                i++;
            }
        }
        if(i ==  s.length() -1){
            num += map.get(s.charAt(i));
        }
        return num;
    }
}