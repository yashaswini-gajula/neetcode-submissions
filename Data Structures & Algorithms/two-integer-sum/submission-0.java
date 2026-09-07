class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        
        int m=-1;
        int k=-1;
        for(int i=0;i<n;i++){
          if(map.containsKey(target-nums[i])){
             
             k=map.get(target-nums[i]);
             m=i;
          }
          else{
            map.put(nums[i],i);
          }
        }
        return new int[]{k,m};
    }
}
