import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                answer.add(num);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
// public int[] solution(int n, int[] numlist) {    //stream 공부하면서 돌려본 
        int[] answer = numlist;
        answer = Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
        return answer;
   }
// return Arrays.stream(numlist).filter(num -> num % n == 0).toArray(); //가장 간단한 답안
