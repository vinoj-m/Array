package TwoPoiniters;
import java.util.*;
public class findDuplicate {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)){
                set.add(num);
            } else if (set.contains(num)) {
                return num;
            }else{
                return 0;
            }
        }
        return 0;
    }
}
