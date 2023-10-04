class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string result = "" ;
        sort(strs.begin(),strs.end());
        string temp = strs.at(0);
        for(int i = 0 ; i < strs.size() ; i++)
        {
            for(int j = 0 ; j < strs.at(i).length() ; j++)
            {
                if(temp[j] != strs.at(i)[j] ){
                    temp = temp.substr(0,j);
                    break;
                }
                
            
            }
            
        }
        return temp;
    }
};
