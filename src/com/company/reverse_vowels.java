class Solution {
    public String reverseVowels(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'||
                    s.charAt(i)=='i' || s.charAt(i)=='o' ||
                    s.charAt(i)=='u'||s.charAt(i)=='A' || s.charAt(i)=='E'||
                    s.charAt(i)=='I' || s.charAt(i)=='O' ||
                    s.charAt(i)=='U'){
                st.push(s.charAt(i));
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'||
                    s.charAt(i)=='i' || s.charAt(i)=='o' ||
                    s.charAt(i)=='u' ||s.charAt(i)=='A' || s.charAt(i)=='E'||
                    s.charAt(i)=='I' || s.charAt(i)=='O' ||
                    s.charAt(i)=='U'){
                // s.replace(s.charAt(i),st.peek());
                // st.pop();

                sb.append(st.peek());
                st.pop();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}