class Solution {
    public String[] solution(String my_str, int n) {
        int L = (my_str.length() + n - 1) / n;
        String[] answer = new String[L];
        for(int i=0; i < L; i++) {
            int start = i * n;
            int end = start + n >= my_str.length()? my_str.length() : start + n;
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
    
}