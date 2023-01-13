class Solution {
    public int solution(int n) {
        String Ternary = "";
        int temp = 0;
        while (n > 0) {
            temp = n % 3;
            n /= 3;
            Ternary += temp;
        }
        return Integer.parseInt(Ternary,3);
    }
}