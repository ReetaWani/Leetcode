class KthLargestElement {
    public static void main (String[]args){
      int[] arr = [3,2,1,5,6,4];
      int k = 2;
      int num = findKthLargest(arr,k);
    }
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
