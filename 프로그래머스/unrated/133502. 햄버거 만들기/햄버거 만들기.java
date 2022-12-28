import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];  //stack 만들기
        int sp = 0;
        int count = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4
                && stack[sp - 1] == 1
                && stack[sp - 2] == 3
                && stack[sp - 3] == 2
                && stack[sp - 4] == 1) {
                    count++;
                    sp -= 4;
            }
        }
        return count;
    }
}