import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        List<Integer> ingredientList = Arrays.asList(ingredient);  //ArrayList로 전환
        int count = 0;
        int order = 1;
        for (int i : ingredientList) {
            if (order == i) {order++;}
            else {order = 1;}
            if (order == 4) {
                ingredientList.subList(i-3, i).clear();
                count++;
            }
        }
        return count;
    }
}