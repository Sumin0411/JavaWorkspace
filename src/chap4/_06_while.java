package chap4;

public class _06_while {
    public static void main(String[] args) {
        //반복문 while
        //수영장에서 수영
        int distance = 25;
        int move = 0;
        while (move < distance){ //현재 이동거리가 전체 거리보다 작다는 조건이 참인 동안 반복
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착하였습니다.");

        //무한루프
        move = 0;
        while (move < distance){ //현재 이동거리가 전체 거리보다 작다는 조건이 참인 동안 반복
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 : " + move);
//            move += 3;
        }
        System.out.println("도착하였습니다.");
    }
}
