class Solution {
    public String solution(String rsp) {
        String RSP = "";
        for (int i = 0; i < rsp.length(); i++) {
            switch(rsp.charAt(i)) {
                case '0': 
                    RSP += "5";
                    break;
                case '2':
                    RSP += "0";
                    break;
                case '5':
                    RSP += "2";
            }
        }
        return RSP;
    }
}