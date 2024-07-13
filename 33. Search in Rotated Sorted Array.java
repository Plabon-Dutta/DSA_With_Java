class Solution {
    public int search(int[] nums, int target) {
        int peak = find_peak(nums);

        int ans = search(nums, 0, peak, target);
        if (ans == -1) ans = search(nums, peak + 1, nums.length - 1, target);

        return ans;
    }

    static int find_peak(int[] nums) {
        if (nums.length == 1) return 0;

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (m + 1 <= r && nums[m] > nums[m + 1]) {
                return m;
            }
            else if (m - 1 >= l && nums[m - 1] > nums[m]) {
                return m - 1;
            }
            else if (nums[m] <= nums[l]) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return -1;
    }

    static int search(int[] nums, int l, int r, int target) {
        if (l > r) return -1;

        int ans = -1;
        while (l <= r) {

            int m = l + (r - l) / 2;

            if (nums[m] >= target) {
                if (nums[m] == target) ans = m;
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return ans;
    }
}
