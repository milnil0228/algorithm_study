class Solution {
    public long solution(int price, int money, int count) {
        long cost = 0;
        for (int i = 1; i <= count; i++) {
            cost += price * i;
        }
        long answer = 0;
        if (cost - money > 0) {
            answer = cost - money;
        }
        return answer;
    }
}