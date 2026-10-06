class Solution {
    public String reverseWords(String s) {
        // ye question stringbuilder se hoga kyuki hame baar baar add karna hai string immutable hota esliye stringbuilder.
        String[] words = s.split(" ");
       StringBuilder res = new StringBuilder();
       for(String word : words){
        // temp esliye liya ki esi me store karke reverse karenge word ko.
          StringBuilder temp = new StringBuilder(word);
          res.append(temp.reverse().append(" "));
       } 
       return res.toString().trim();   // hamne har word append karne ke baad space bhi append kiya esliye last me trim kiya.
    }
}