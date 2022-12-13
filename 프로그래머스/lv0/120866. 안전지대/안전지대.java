class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[][] newBoard = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int k = i - 1; k <= i + 1; k++) {
                         for (int l = j - 1; l <= j + 1; l++) {
                            if (k > -1 && k < n && l > -1 && l < n) {
                                newBoard[k][l] = 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (newBoard[i][j] == 0) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}