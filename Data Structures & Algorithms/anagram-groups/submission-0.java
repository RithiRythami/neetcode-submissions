class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] chararray = s.toCharArray();
            Arrays.sort(chararray);
            String sorts= new String(chararray);
            map.putIfAbsent(sorts,new ArrayList<>());
            map.get(sorts).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
