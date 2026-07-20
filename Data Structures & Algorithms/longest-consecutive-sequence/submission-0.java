class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>se=new HashSet<>();
        for(int num:nums){
            se.add(num);
        }
        int longest=0;
        for(int n:se){
            if(!se.contains(n-1)){
                int length = 1;
                while(se.contains(n+length)){
                    length++;
                }
                longest=Math.max(length,longest);
            }
        }
        return longest;
    }
}
