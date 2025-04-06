import java.util.Arrays;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
           int j=nums.length-1;
           int k=0;
           int temp=0;
           for(int i=0;i<nums.length&&i<j;i++){
               if(nums[i]==val){
                  while(nums[j]==val&&j>=i){
                     j--;
                  }
                  temp=nums[i];
                  nums[i]=nums[j];
                  nums[j]=temp;
                 
                  
               }
                k++;
           
           }
           return k;
       }


    public static void main(String[] args) {
        new RemoveElement().removeElement(new int[]{0,1,2,2,3,0,4,2},2);
    }
}
