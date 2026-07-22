class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> win = new HashSet<>();
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(r-l>k){
                win.remove(nums[l]);
                l++;
            }
            if(win.contains(nums[r])){
                return true;
            }
            else{
                win.add(nums[r]);
            }
        }
        return false;
    }
}