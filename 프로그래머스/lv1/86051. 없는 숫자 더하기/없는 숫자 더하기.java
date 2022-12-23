import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 1; i <= nums.length; i++) {
            int num = i;
            if (!IntStream.of(numbers).anyMatch(x -> x == num)) {
                answer += i;
            }
        }
        return answer;
    }
}