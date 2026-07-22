class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minpri = prices[0];
        for(int num:prices){
            maxp=Math.max(maxp,num-minpri);
            minpri=Math.min(num,minpri);
        }
        return maxp;
        
    }
}
