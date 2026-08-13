class Solution {

    int rows, cols;

    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        rows = board.length;
        cols = board[0].length;

        // First and last column
        for (int i = 0; i < rows; i++) {
            dfs(board, i, 0);
            dfs(board, i, cols - 1);
        }

        // First and last row
        for (int j = 0; j < cols; j++) {
            dfs(board, 0, j);
            dfs(board, rows - 1, j);
        }

        // Convert surrounded O -> X
        // Convert safe # -> O
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } 
                else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {

        // Boundary check
        if (row < 0 || row >= rows || 
            col < 0 || col >= cols || 
            board[row][col] != 'O') {
            return;
        }

        // Mark as safe
        board[row][col] = '#';

        // Up
        dfs(board, row - 1, col);

        // Down
        dfs(board, row + 1, col);

        // Left
        dfs(board, row, col - 1);

        // Right
        dfs(board, row, col + 1);
    }
}