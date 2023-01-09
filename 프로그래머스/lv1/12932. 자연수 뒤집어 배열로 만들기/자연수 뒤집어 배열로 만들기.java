class Solution {
    public long[] solution(long n) {
        String Str = n + "";
        long[] answer = new long[Str.length()];
        for (int i = 0; i < Str.length(); i++) {
            answer[i] =  n % 10;
            n /= 10;
        }
        return answer;
    }
}