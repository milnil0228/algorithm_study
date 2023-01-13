class Solution {
    public int solution(int n) {
        String Ternary = "";
        while (n > 0) {
            Ternary += n % 3;
            n /= 3;
        }
        return Integer.parseInt(Ternary,3);
    }
}