class Solution {
    public int solution(int[][] lines) {
        int min = 0;
        int max = 0;
        int count = 0;
        //최댓값, 최솟값 구하기
        for (int i = 0; i < 3; i++) {
            if (min > lines[i][0])
                min = lines[i][0];
        }
        for (int i=0; i < 3; i++) {
            if (max < lines[i][1])
                max = lines[i][1];
        }
        //최댓값과 최솟값 사이에 범위 정하기
        int[] range = new int[max - min];
        
        //정해진 범위 안에 값 넣어주기
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < lines[i][1] - lines[i][0]; j++) {
                range[lines[i][0] + j - min] += 1;
            }
        }
        
        //2이상인 수가 몇 개인지 세기
        for (int i : range) {
            if (i > 1) {
                count++;
            }
        }
        
        // int[] range = new int[200];
        // for (int i=0; i<3; i++) {
        //     for (int j=0; j<lines[i][1]-lines[i][0]; j++) {
        //         range[]
        //     }
        // }
        

        return count;
    }
}