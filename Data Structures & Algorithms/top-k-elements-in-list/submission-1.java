class Pair{
    int num;
    int freq;
    Pair(int num,int freq){
        this.num=num;
        this.freq=freq;
    }
}
    
    
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a, b) -> b.freq - a.freq);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }
        int[] ans=new int[k];
        int i = 0;
        while(k>0){
            Pair p=pq.poll();
            ans[i++]=p.num;
            k--;
        }
        return ans;
    }
}
