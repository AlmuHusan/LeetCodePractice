import java.util.Arrays;

class MergedSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Cpy= Arrays.copyOfRange(nums1, 0, m);
        int eIndex=0;
        int num1Index = 0;
        int num2Index = 0;
        if (n != 0) {
            nums2 = Arrays.copyOfRange(nums2, 0, n);
        }
        int arSize=n+m;
        for (int i = 0; i < arSize; i++) {
            if (m != 0 && n != 0) {
                if(nums1Cpy[num1Index]<nums2[num2Index]){
                  nums1[eIndex++]=nums1Cpy[num1Index];
                  m--;
                  num1Index++;
                }
                else{
                  nums1[eIndex++]=nums2[num2Index];
                  n--;
                  num2Index++;
                }
            }
            else if(m==0){
               while(n>0){
                  nums1[eIndex++]=nums2[num2Index];
                  n--;
                  num2Index++;
               }
            }
            else if(n==0){
               while(m>0){
                  nums1[eIndex++]=nums1Cpy[num1Index];
                  m--;
                  num1Index++;
               }
            }
            
        }
        
    }

    public static void main(String[] args) {
        MergedSortArray mergedSortArray = new MergedSortArray();
        mergedSortArray.merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6}, 3);
    }
}
