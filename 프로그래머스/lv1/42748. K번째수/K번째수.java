import java.util.*;

class Solution {
    public int kthNumber(int[] array, int[] command) {
        int[] result = new int[command[1] - command[0] + 1];
        result = Arrays.copyOfRange(array, command[0] - 1, command[1]);
        Arrays.sort(result);
        return result[command[2] - 1];
    }
    
    public int[] solution(int[] array, int[][] commands) {
        // Object[] answer = Arrays.stream(commands).map(i -> kthNumber(array, i)).toArray();   //스트림 써보기
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = kthNumber(array, commands[i]);
        }
        return answer;
    }
}