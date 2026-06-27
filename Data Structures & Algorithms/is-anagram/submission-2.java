
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> smap=new HashMap<>();
        HashMap<Character,Integer> tmap=new HashMap<>();
        for(char i:s.toCharArray()){
            smap.put(i,smap.getOrDefault(i,0)+1);
        }
        for(char j:t.toCharArray()){
            tmap.put(j,tmap.getOrDefault(j,0)+1);
        }
        return smap.equals(tmap);
    }
}
