class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuffer check= new StringBuffer();
        for(char c : s.toCharArray())
        {
            if(c>='a' && c<='z' ){
                check.append(c);
            }
            else if(c>='0' && c<='9')
                check.append(c);
        }
        return check.toString().equals(check.reverse().toString());
    }
}
