public class Solution {

    public static int solution(int number) {

        int sum = 0;

        for(int i = number-1; i > 0; i--) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        } return sum;

    }
}