import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int cnt1 = 0;
        int cnt2 = 0;
         List<String> list = new ArrayList<>(Arrays.asList(goal));
        for (String g : goal) {
            if (cards1[cnt1].equals(g)) {
                list.remove(cards1[cnt1]);
                if (cnt1 != cards1.length - 1) {cnt1++;}
            }
            else if (cards2[cnt2].equals(g)) {
                list.remove(cards2[cnt2]);
                if (cnt2 != cards2.length - 1) {cnt2++;}
            }
        }
        goal = list.toArray(String[]::new);
        if (goal.length == 0) {
            answer = "Yes";
        } else {
            answer = "No";
        }
        return answer;
    }
}