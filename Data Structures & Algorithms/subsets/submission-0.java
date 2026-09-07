class Solution {
    public void find(int idx,int nums[],List<List<Integer>> ans,List<Integer> ds){
        if(idx==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        //pick
        ds.add(nums[idx]);
        find(idx+1,nums,ans,ds);
        //not pick
        ds.remove(ds.size()-1);
        find(idx+1,nums,ans,ds);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        find(0,nums,ans,ds);
        return ans;
    }
}
