import java.util.List;
import java.util.ArrayList;

public class MyArrayList {
    public static void main(String a[])
    {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);

        System.out.println(nums);
        for(int n : nums)
            System.out.print(n+ " ");
    }
}
