class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList();
        findAll("(",1,0,result,n);
        return result;
        
    }
    
    void findAll(String curr,int o, int c,List<String> result,int n)
    {
        if (curr.length() == 2*n)
        {
            result.add(curr);
            return;
        }
        
        if (o<n) findAll(curr+"(",o+1,c,result,n);
        if (c<o) findAll(curr+")",o,c+1,result,n);

    }
}
