class Solution {
    public boolean detectCapitalUse(String word) {
        Stack<Character> st = new Stack<Character>();
        for(int i =0; i< word.length(); i++){
            if(word.charAt(i)>= 65 && word.charAt(i) <=90){
                st.push(word.charAt(i));
            }
        }
        if(st.size() == word.length()){
            return true;
        }
        else if((word.charAt(0) >=65 && word.charAt(0) <=90) && st.size() ==1){
            return true;
        }
        else if(st.size() ==0){
            return true;
        }
        return false;
    }
}