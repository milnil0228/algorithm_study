class Solution {
    public String solution(int a, int b) {
        int cnt = 0;
        switch (a) {
            case 1, 4, 7 :
                cnt += 0;
                break;
            case 2, 8 :
                cnt += 3;
                break;
            case 3, 11 :
                cnt += 4;
                break;
            case 5 :
                cnt += 2;
                break;
            case 6 :
                cnt += 5;
                break;
            case 9, 12 :
                cnt += 6;
                break;
            case 10 :
                cnt += 1;
        }
        cnt = cnt + b - 1;
        cnt %= 7;
        
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        String answer = week[cnt];
        return answer;
    }
}