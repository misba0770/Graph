class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here\
        ArrayList<String> ans=new ArrayList<>();
        if(m[0][0]==0||m[n-1][n-1]==0)return ans;
        String str="";
        
        dfs(0,0,new StringBuilder(""),m,n,ans);
        return ans;
        
    }
    static void dfs(int i,int j,StringBuilder sb,int[][] m,int n,ArrayList<String> ans){
        if(i<0||j<0||i==n||j==n||m[i][j]!=1)return;
        if(i==n-1&&j==n-1){
            ans.add(sb.toString());
            return;
        }
        m[i][j]=2;
        dfs(i+1,j,sb.append("D"),m,n,ans);
        sb.deleteCharAt(sb.length()-1);
        dfs(i-1,j,sb.append("U"),m,n,ans);
        sb.deleteCharAt(sb.length()-1);
        dfs(i,j+1,sb.append("R"),m,n,ans);
        sb.deleteCharAt(sb.length()-1);
        dfs(i,j-1,sb.append("L"),m,n,ans);
        sb.deleteCharAt(sb.length()-1);
        m[i][j]=1;
        
    }
}
