import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] babbles = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (String st : babbles) {
                if (babbling[i].contains(st)) {
                    babbling[i] = babbling[i].replaceAll(st," ");
                }
            }
        }
        for (String str : babbling) {
            if (str.isBlank()) {
                answer += 1;
            }
        }
        return answer;
    }
}