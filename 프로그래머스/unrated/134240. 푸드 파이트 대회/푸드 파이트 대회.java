import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder str = new StringBuilder("0");
        for (int i = food.length - 1; i > 0; i--) {
            int count = food[i] / 2;
            while (count > 0) {
                str.append(i);
                str.insert(0, i);
                count--;
            }
        }
        return str.toString();
    }
}