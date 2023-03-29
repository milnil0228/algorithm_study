import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        Map<String,String> map = new HashMap<String,String>();
        String[] morse = {
            ".-","a","-...","b","-.-.","c","-..","d",".","e","..-.","f",
            "--.","g","....","h","..","i",".---","j","-.-","k",".-..","l",
            "--","m","-.","n","---","o",".--.","p","--.-","q",".-.","r",
            "...","s","-","t","..-","u","...-","v",".--","w","-..-","x",
            "-.--","y","--..","z"};
        
        for (int i = 0; i < 52; i+=2) {
            map.put(morse[i], morse[i + 1]);
        }
        
        String[] array = letter.split(" ");
        for (String s : array) {
            for (String key : map.keySet()) {
                if (key.equals(s)) {
                    answer += map.get(key);
                }
            }
        }
        return answer;
    }
}