package chap5;

public class _01_array {
    public static void main(String[] args) {
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

//        System.out.println(coffeeRoss + "하나");
//        System.out.println(coffeeRachel + "하나");
//        System.out.println(coffeeChandler + "하나");
//        System.out.println(coffeeMonica + "하나");
//        System.out.println("주세요");

        // 배열 선언 첫 번째
//        String[] coffees = new String[4];

        // 배열 선언 두 번째
//        String coffees[] = new String[4];
//        coffees[0] = "아메리카노"; //0부터 시작
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        //배열 선언 세 번째
//        String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        //배열 선언 네 번째
        String [] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노" };
        System.out.println("----------------");

        //커피 주문
        System.out.println(coffees[0] + "하나");
        System.out.println(coffees[1] + "하나");
        coffees[2] = "에스프레소";
        System.out.println(coffees[2] + "하나");
        System.out.println(coffees[3] + "하나");
        System.out.println("주세요");
    }
}
