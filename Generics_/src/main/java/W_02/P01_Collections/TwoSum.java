package W_02.P01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] myArray = {2,7,9,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum_1(myArray, target)));
        System.out.println("===================");
        System.out.println(Arrays.toString(twoSum_2(myArray, target)));


    }

    public static int[] twoSum_1(int[] array, int target){
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if ((array[i] + array[j]) == target) return new int[]{i,j};
        return new int[]{};
    }
    
    public static int[] twoSum_2(int[] array, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int potentialMatch = target - array[i];
            if (map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)}; else map.put(array[i],i);
        }
        return new int[]{};
    }

}
