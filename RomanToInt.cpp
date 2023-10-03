class Solution {
public:
    int romanToInt(string s) {
        int res = 0;
        int num = 0;
        for(int i = s.length() - 1 ; i >=0 ; i--)
        {
            char c = s[i];
            
            switch(c){
            case 'M' : res =1000;
            break;
            case 'D' : res=500;
            break;
            case 'C' : res=100;
            break;
            case 'L' : res=50;
            break;
            case 'X' : res=10;
            break;
            case 'V' : res=5;
            break;
            case 'I' : res=1;
            break;
            }
            if(4*res < num)
                num -=res;
            else num+=res;
        }
        return num;
    }
};
