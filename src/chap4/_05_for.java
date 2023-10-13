package chap4;

public class _05_for {
    public static void main(String[] args) {
        //선언, 조건, 증감
        for (int i = 0; i < 10; i++){
            System.out.println("어서오세요.나코입니다." + i);
            System.out.println("환영합니다.나코입니다." + i);
        }
        //짝수만 출력
        //0,2,4,6,8
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        //홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.println("1부터 10까지의 모든 수의 총 합은 " + sum + " 입니다. ");
        }
    }
}
