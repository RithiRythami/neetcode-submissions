class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> freq= new HashMap<>();
    for(int num:nums){
        freq.put(num,freq.getOrDefault(num,0)+1);
    }
    List<Integer>list = new ArrayList<>(freq.keySet());
    Collections.sort(list,(a,b)->freq.get(b)-freq.get(a));
    int [] arr = new int[k];
    for(int i=0;i<k;i++){
        arr[i]=list.get(i);
    }
    return arr;
    }
}
