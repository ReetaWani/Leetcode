class FindNoWithEvenDigits {
    public int findNumbers(int[] nums) {
        int num = 0;
        for(int i=0; i<nums.length;i++){
            int no = nums[i];
            int count = 0;
            while(no!=0){
                no = no/10;
                count++;
            }
            if(count%2==0){
                num = num+1;
            }
        }
        return num;
    }
}
//[1,11,111,1111,11111,11110]
