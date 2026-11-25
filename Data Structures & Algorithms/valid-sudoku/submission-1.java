class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashSet<Character>> rows = new ArrayList<>();
        ArrayList<HashSet<Character>> cols = new ArrayList<>();
        ArrayList<HashSet<Character>> grids = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            grids.add(new HashSet<>());
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Rows
                if (board[i][j] == '.') {
                    continue;
                } else if (rows.get(i).contains(board[i][j])) {
                    return false;
                } else {
                    rows.get(i).add(board[i][j]);
                }
                // Cols
                if (cols.get(j).contains(board[i][j])) {
                    return false;
                } else {
                    cols.get(j).add(board[i][j]);
                }
                // Grids 
                if (grids.get((i/3) * 3 + j/3).contains(board[i][j])) {
                    return false;
                } else {
                    grids.get((i/3) * 3 + j/3).add(board[i][j]);
                }
            }
        }
        return true;
    }
}
