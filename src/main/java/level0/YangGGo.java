package main.java.level0;

public class YangGGo {
    public int solution(int n, int k) {
        int answer = 0;
        int ten = n / 10;
        k -= ten;
        answer = 12000 * n + 2000 * k;

        return answer;
    }
}
