class Solution {
    public Boolean check(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:str1.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char j:str2.toCharArray()){
            if(!map.containsKey(j)) return false;
            map.put(j,map.get(j)-1);
            if(map.get(j)<0)
               return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<Integer,Boolean> used=new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
          if(used.getOrDefault(i, false))
             continue;
          ArrayList<String> temp=new ArrayList<>();
          for(int j = i; j < strs.length; j++){
             if(check(strs[i],strs[j])){
                temp.add(strs[j]);
                used.put(j,true);
             }
          }
          ans.add(temp);
        }
        return ans;
    }
}