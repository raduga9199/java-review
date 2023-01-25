package W_02.P01_Collections;

import java.util.HashMap;
import java.util.Map;

public class P03_Map {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Sergiu");
        map.put(2,"Moses");
        System.out.println(map.get(2));
        System.out.println("===========================");
        System.out.println(findFirstNonRepeating("cydeo Java Developer"));

    }
    public static Character findFirstNonRepeating(String str){
        Map<Character,Integer> map = new HashMap<>();
        int count;
        for (Character each : str.toCharArray())
            if (map.containsKey(each)){
                count = map.get(each);
                map.put(each,count+1);
            } else map.put(each,1);

        for (Character each : str.toCharArray()) if(map.get(each) == 1) return each;
        return Character.MAX_VALUE;
    }
}
