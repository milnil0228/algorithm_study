class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (; i <= j; i++) {
            if (Integer.toString(i).contains(Integer.toString(k))) {
                for (int l = 0; l < Integer.toString(i).length(); l++) {
                    if (Integer.toString(i).charAt(l) == (char)(k+'0')) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}