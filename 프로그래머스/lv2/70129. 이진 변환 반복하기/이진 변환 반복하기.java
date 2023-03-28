class Solution {
    public int[] solution(String s) {
        int zero = 0;
        int cnt = 0;
        while (!s.equals("1")) {
            int len = s.replace("0", "").length();
            zero += s.length() - len;
            s = Integer.toBinaryString(len);
            cnt++;
        }
        int[] answer = {cnt, zero};
        return answer;
    }
}