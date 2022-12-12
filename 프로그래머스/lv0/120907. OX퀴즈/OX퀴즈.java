class Solution {
    public String[] solution(String[] quiz) {
        for (int i = 0; i < quiz.length; i++) {
            String[] strQuiz = quiz[i].split(" ");
            if (strQuiz[1].equals("+")) {
                if (Integer.parseInt(strQuiz[0]) + Integer.parseInt(strQuiz[2]) == Integer.parseInt(strQuiz[4])) {
                   quiz[i] = "O"; 
                }
                else {quiz[i] = "X";}
            }
            else {
                if (Integer.parseInt(strQuiz[0]) - Integer.parseInt(strQuiz[2]) == Integer.parseInt(strQuiz[4])){
                    quiz[i] = "O"; 
                }
                else {quiz[i] = "X";}
            }
            
        }
        return quiz;
    }
}