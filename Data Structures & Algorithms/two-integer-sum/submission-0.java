class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
       
        int[] tar = new int[2];
        while(i<nums.length){
             int k =i+1;
            while(k<nums.length){
                 
                 if(nums[i]+nums[k]==target) {
                 tar[0]=i;
                 tar[1]=k;
                 return tar;
                 }
                k++;
            }
           i++;

        }
        return null;
    }
}
