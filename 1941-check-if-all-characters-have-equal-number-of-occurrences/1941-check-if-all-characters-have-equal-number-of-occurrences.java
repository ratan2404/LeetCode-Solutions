class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> ans = new HashMap<>();
        // 1. हर कैरेक्टर की फ्रीक्वेंसी (गिनती) को मैप में स्टोर करना
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ans.containsKey(ch)){
                ans.put(ch, ans.get(ch) + 1);
            }
            else{
                ans.put(ch, 1);
            }

        }
        // 2. चेक करना कि क्या सभी कैरेक्टर्स की फ्रीक्वेंसी बराबर है
        // इसके लिए हम मैप की सभी वैल्यूज (फ्रीक्वेंसी) को एक HashSet में डाल देंगे
        HashSet<Integer> unique = new HashSet<>(ans.values());
        // चूंकि HashSet सिर्फ यूनिक (अद्वितीय) वैल्यूज रखता है, 
        // अगर सभी कैरेक्टर की फ्रीक्वेंसी समान होगी, तो सेट का साइज 1 होगा।
        return unique.size() == 1;
        
    }
}