class Solution {
    public int solution(int n) {
        int countAll = 0;
        for (int i = 2; i <= n; i++) {
            int j = 2;
            boolean count = true;
            while (j <= (int)Math.sqrt(i)) {
                if (i % j == 0) {
                    count = false;
                    break;
                }
                j++;
            }
            if (count) {
                countAll++;
            }
        }
        return countAll;
    }
}