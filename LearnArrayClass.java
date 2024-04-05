import java.util.Arrays;
public class LearnArrayClass {
   public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7,8,9,10};
    int index = Arrays.binarySearch(nums,4);
    Arrays.sort(nums);
    System.out.println(index);
    Arrays.fill(nums, 120);



   } 
}
