class RemoveDup {
    public int removeDuplicates(int[] nums) {
        int index=1;
        int copy=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=copy){
                nums[index]=nums[i];
                copy=nums[i];
                index++;
            }

        }
        return index;
    }
}