
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        
        Collections.sort(nums,Collections.reverseOrder(null));
        
        return nums.get(0) + nums.get(1);
    }
}