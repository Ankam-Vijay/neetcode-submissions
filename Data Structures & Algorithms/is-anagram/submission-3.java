
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char j:t.toCharArray()){
            map.put(j,map.getOrDefault(j,0)-1);
            if(map.get(j)<0){
                return false;
            }
        }
        return true;
       // return smap.equals(tmap);
    }
}
