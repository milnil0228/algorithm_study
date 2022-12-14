class Solution {
    public int solution(int[][] dots) {     //dots이 정수형이므로 나누기하였을 때 정상적으로 계산되지 않음
        for (int i = 0; i < 3; i++) {       //기울기의 분모를 양쪽에 곱해주어 정수로 나타냄
            if ((dots[3][0] - dots[i][0]) * (dots[(i + 1) % 3][1] - dots[(i + 2) % 3][1])
               == (dots[(i + 1) % 3][0] - dots[(i + 2) % 3][0]) * (dots[3][1] - dots[i][1])) {
                return 1;
            }
        }
        return 0;
    }
}