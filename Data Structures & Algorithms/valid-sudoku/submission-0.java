public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                char num = board[i][j];
                if(num != '.'){
                    if(!seen.add(num + "r" + i)||
                       !seen.add(num + "c" + j)||
                       !seen.add(num + "r"+i/3+"c"+j/3)) return false;
                }
            }
        }
        return true;
    }
}