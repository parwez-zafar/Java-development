import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    public static void main(String a[])
    {
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(5);
        nums.add(3);
        nums.add(22);
        nums.add(7);

        for(int n : nums)
        {
            System.out.print(n + " ");
        }
    }
}
