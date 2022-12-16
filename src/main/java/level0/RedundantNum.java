package main.java.level0;

public class RedundantNum {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            if( n == array[i]){
                answer++;
            }
        }
        return answer;
    }
}
