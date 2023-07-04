//execution of the moves along the grid...

public class grid_robo {
    static int[] exec(int n,int []startpos,String s){
        int [] ans=new int[s.length()];

        for (int i=0;i<s.length();i++){
            int moves=0;
            int yindex=startpos[0];
            int xindex=startpos[1];

            for (int j=i;j<s.length();j++){
                if (s.charAt(j)=='R'){
                    xindex++;
                }
                if (s.charAt(j)=='L'){
                    xindex--;
                }
                if (s.charAt(j)=='U'){
                    yindex--;
                }
                if (s.charAt(j)=='D'){
                    yindex++;
                }

                if (xindex<0 || xindex>=n || yindex<0 || yindex>=n){
                    break;
                }else {
                    moves++;
                }
            }
            ans[i]=moves;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}