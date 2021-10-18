class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1){return 1;}
        int[] arr=new int[128];
        int max_len=0;
        int len=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(arr[ch]==0||arr[ch]<start){
                len++;
            }else{
                len=i-arr[ch]+1;
                start=arr[ch];
            }
            arr[ch]=i+1;
            if(max_len<len){
                max_len=len;
            }
        }
        return max_len;
    }
}
