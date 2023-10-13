package chap4;

public class _quiz {
    public static void main(String[] args) {
        //주차 요금은 시간당 4천원 (일일 최대 요금 3만원)
        //경차 또는 장애인 차량은 최종 요금에서 50퍼 할인
        //일반 차량 또는 5시간 주차시 2만
        //경차 5시간 주차 시 만원
        //장애인 차량 10시간 주차 시 15000원
        //실행결과 : 주차요금은 ㅇㅇ 원 입니다.



        int hour = 5;
        boolean isSmallCar = true; // 경차 여부
        boolean withDisabledPerson = false;

        int fee = hour * 4000;

        //3만원 초과시 일일최대요금으로 수정
        if(fee > 30000){
            fee = 30000;
        }
        //경차 또는 장애인 차량은 최종 요금에서 50퍼 할인
        if(isSmallCar || withDisabledPerson){
            fee /= 2; //50퍼 할인
        }
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
