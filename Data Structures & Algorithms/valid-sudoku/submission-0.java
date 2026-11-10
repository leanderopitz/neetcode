class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                } else {
                    if (seen.contains(board[i][j])) {
                        return false;
                    } else {
                        seen.add(board[i][j]);
                    }
                }
            }
            seen.clear();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                } else {
                    if (seen.contains(board[j][i])) {
                        return false;
                    } else {
                        seen.add(board[j][i]);
                    }
                }
            }
            seen.clear();
        }
        int col = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = col; k < 3 + col; k++) {
                    if (board[j][k] == '.') {
                        continue;
                    } else {
                        if (seen.contains(board[j][k])) {
                            return false;
                        } else {
                            seen.add(board[j][k]);
                        }
                    }
                }
                if ((j + 1) % 3 == 0) {
                    seen.clear();
                }
            }
            col += 3;
        }
        return true;
    }
}
