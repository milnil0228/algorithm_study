import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!al.contains(numbers[i] + numbers[j])) {
                    al.add(numbers[i] + numbers[j]);
                }
            }
        }
        int[] answer = new int[al.size()];
        int size = 0;
        for (int num : al) {
        answer[size++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}