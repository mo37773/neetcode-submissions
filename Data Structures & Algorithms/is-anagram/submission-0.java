class Solution {
    public boolean isAnagram(String s, String t) {
        boolean bAnagram = false;
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        int lenS = s.length();
        int lenT = t.length();

        if(lenS!=lenT){
            return bAnagram;
        }
        else{
            
            for(int i=0; i < lenS;i++){
                countS.put(s.charAt(i),countS.getOrDefault(s.charAt(i),0)+1);
                countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i),0)+1);
            }
        }
        bAnagram = countS.equals(countT);

        return bAnagram ;
    }
}
