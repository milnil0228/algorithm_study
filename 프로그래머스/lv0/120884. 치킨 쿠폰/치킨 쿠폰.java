class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int remainCoupon = 0;
        int serviceChicken = 0;
        while (coupon >= 10) {
            serviceChicken += coupon / 10;
            remainCoupon = coupon % 10;
            coupon = coupon / 10 + remainCoupon;
        }
        answer = serviceChicken;
        return answer;
        // int answer = chicken/9;
        // if(chicken>1&&chicken%9==0){
        //     answer--;
        // }
        // return answer;
    }
}
