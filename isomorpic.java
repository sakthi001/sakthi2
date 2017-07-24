public boolean isIsomorphic(String x, String y) {
    if(x==null||y==null)
        return false;
 
    if(x.length()!=y.length())
        return false;
 
    HashMap<Character, Character> map = new HashMap<Character, Character>();
 
 
    for(int i=0; i<s.length(); i++){
        char c1 = x.charAt(i);
        char c2 = y.charAt(i);
 
        if(map.containsKey(c1)){
            if(map.get(c1)!=c2)
                return false;
        }else{
            if(map.containsValue(c2)) 
                return false;
            map.put(c1, c2);
        }
    }
 
    return true;
}
