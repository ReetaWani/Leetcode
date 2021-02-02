class CheckAllOnes {
    public boolean kLengthApart(int[] nums, int k) {
        int temp =-1;
        boolean flag = true;
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i]==1){
                if(temp == -1){
                    temp = i;
                }else if((i-temp)-1>=k){
                    flag = true;
                    temp = i;
                }else{
                    return false;
                }
                
            }
        }
        return flag;
    }
}
