package array;

/**
 * 有序数组的平方
 * 双指针 + 新数组，从最大索引开始填充新数组
 *
 * @author Haixiang
 * @since 2022-02-14
 */
public class SortedSquares977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        //新数组索引
        int index = result.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] < nums[right] * nums[right]) {
                result[index--] = nums[right] * nums[right];
                right--;
            } else {
                result[index--] = nums[left] * nums[left];
                left++;
            }
        }
        return result;
    }
}
