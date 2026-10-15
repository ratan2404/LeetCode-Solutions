class Solution {
    public boolean wordPattern(String pattern, String s) {
      String[] arr = s.split("\\s+");
      if(pattern.length() != arr.length){
        return false;
      } 
      //esme ham hashmap ka use karenge ak object aur integer mangenge aur object ko compare karenge. 
      HashMap< Object, Integer> map = new HashMap<>();
      for(int i = 0; i < arr.length; i++){
        Integer a = map.put(arr[i], i);
        Integer b = map.put(pattern.charAt(i), i);
        if(!Objects.equals(a, b)){
             return false;
        }
      }
      return true;
    }
}