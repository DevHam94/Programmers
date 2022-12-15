package main.java.level0;

public class Protractor {
    public int solution(int angle) {
        int answer = 0;

        // 예각일 때
        if(angle < 90){
            answer = 1;
            // 직각일 때
        }else if(angle == 90){
            answer = 2;
            // 둔각일 때
        }else if(angle > 90){
            if(angle < 180){
                answer = 3;
            }
            // 평각일 때
        }
        if(angle == 180){
            answer = 4;
        }

        return answer;
    }
}
