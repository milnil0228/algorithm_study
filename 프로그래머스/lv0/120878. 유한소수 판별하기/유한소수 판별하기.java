class Solution {
    public int solution(int a, int b) {
        int maxCommon = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                maxCommon = i;
            }
        }
        int newB = b / maxCommon;
        while (newB % 2 == 0 || newB % 5 == 0) {
            if (newB % 2 == 0) {
                newB /= 2;
            }
            else if (newB % 5 == 0) {
                newB /= 5;
            }
        }
//         for (;b%2 == 0;) {   //for문으로 while문처럼 쓰기
//             b = b/2;
//         }
//         for (;b%5 == 0;) {
//             b = b/5;
//         }
        
        if (newB == 1) {
            return 1;
        }
        return 2;
    }
}
