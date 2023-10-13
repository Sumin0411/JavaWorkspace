package chap4;

public class _04_switchCase {
    public static void main(String[] args) {
        //switch case

        //if else문 : 여러조건
        int ranking = 1;
        if(ranking == 1){
            System.out.println("전액장학금");
        }
        else if (ranking ==2 || ranking == 3){
            System.out.println("반액장학금");
        }
        else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");



        //switch case문 : 명확한 케이스
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }


        //중고상품의 등급에 따른 가격 책정
        int grade = 1;
        int price = 7000;
        switch ( grade ){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
    }
}
