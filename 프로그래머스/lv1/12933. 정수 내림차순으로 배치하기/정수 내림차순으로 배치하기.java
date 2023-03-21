class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n + "";
        for (int j = 0; j < str.length(); j++) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) < str.charAt(i + 1)) {
                    // 뒤에 숫자가 클 경우 순서 바꾸기
                    StringBuilder sb = new StringBuilder(str);
                    char pre = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(i + 1));
                    sb.setCharAt(i + 1, pre);
                    str = sb.toString();
                }
            }
        }
        return Long.parseLong(str);
    }
}