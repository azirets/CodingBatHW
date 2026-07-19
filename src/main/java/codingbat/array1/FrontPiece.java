package codingbat.array1;

public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[] {nums[0], nums[1]};
        }
        if (nums.length == 1) {
            return new int[] {nums[0]};
        }
        return new int[] {};
    }
}
