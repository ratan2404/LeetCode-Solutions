class Solution {
    public int minAddToMakeValid(String s) {
        // जब तक स्ट्रिंग में "()" का जोड़ा मिल रहा है, उसे हटाते रहें
        while (s.contains("()")) {
            s = s.replace("()", "");
        }
        
        // अंत में बची हुई स्ट्रिंग के हर कैरेक्टर को जोड़े की जरूरत होगी
        return s.length();
    }
}
