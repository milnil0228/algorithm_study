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

// for(int i=0; i<quiz.length; i++){
//             String[] text = quiz[i].split(" ");
//             int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
//             quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
//         }
//         return quiz;