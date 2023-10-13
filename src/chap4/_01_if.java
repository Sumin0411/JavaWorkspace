package chap4;

public class _01_if {
    public static void main(String[] args) {
        //조건문 if
        int hour = 15;

//        if ( hour < 14 ) {
//            System.out.println("아이스 아메리카노 +1");
//            System.out.println("샷 추가");
//        }
//        System.out.println("커피 주문 완료");

        //오후 2시 이전, 모닝커피 마시지 않은 경우
        hour = 10;
        boolean morningCoffee = false;
        if (hour <= 14 && !morningCoffee){
            System.out.println(" 아이스아메리카노 +1 ");
        }
        System.out.println("커피 주문 완료");


        //오후 2시 이후, 디카페인
        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee == true){
            System.out.println("아이스 아메리카노 ( 디카페인 ) +1");
        }
        System.out.println("커피 주문 완료");
    }
}
