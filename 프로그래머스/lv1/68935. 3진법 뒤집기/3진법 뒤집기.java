import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> toTernary = new ArrayList<Integer>();
        while (n > 0) {
            toTernary.add(n % 3);
            n /= 3;
        }
        int digit = 1;
        for (int i = toTernary.size() - 1; i >= 0; i--) {
            answer += toTernary.get(i) * digit;
            digit *= 3;
        }
        return answer;
    }
}