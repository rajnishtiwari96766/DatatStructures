public class tic_tac_toe {
    public boolean validTicTacToe(String[] board) {
        int diag1=0,diag2=0,n= board.length,diff=0;
        char c;
        boolean xwins=false,owins=false;

        for (int i=0;i< board.length;i++){
            if (board==null || board.length==0){
                return false;
            }
        }

        for (int i=0;i<n;i++){
            int row=0,col=0;
            for (int j=0;j<n;j++) {
                //for rows...
                if (board[i].charAt(j) == 'X') {
                    row++;
                    diff++;
                } else if (board[i].charAt(j) == 'O') {
                    row--;
                    diff--;
                }

                //for columns...
                if (board[j].charAt(i) == 'X') {
                    col++;
                } else if (board[j].charAt(i) == 'O') {
                    col--;
                }
            }
            //for diag...
            if (board[i].charAt(i)=='X'){
                diag1++;
            }else if (board[i].charAt(i)=='O'){
                diag1--;
            }

            //for antidiag...
            if (board[i].charAt(n-1-i)=='X'){
                diag2++;
            }else if (board[i].charAt(n-1-i)=='O'){
                diag2--;
            }



            if (row==n || col==n || diag1==n || diag2==n){
                //    if(owins){
                //        return false;
                //    }
                xwins=true;
            }
            if (row==-n || col==-n || diag1==-n ||diag2==-n){
                //   if(xwins){
                //       return false;
                //   }
                owins= true;
            }
        }
        if(diff<0 || diff>1){
            return false;
        }

        if ( (xwins && diff==0) || (owins && diff==1)){
            return false;
        }
        return true;
    }
}