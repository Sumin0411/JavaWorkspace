package chap6;

public class _02_Parameter {
    //전달 값이 있는 메소드
    public static void power(int number){
        int result = number * number;
        System.out.println(number + "의 2승은? " + result);
    }
    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        System.out.println(number+"의 몇 승?????? " + exponent + "?" + result);
    }

    public static void main(String[] args) {
        //전달값, 파라미터
        //2 -> 2*2=4
        //3-> 3*3=9

        //Argument = 2
        power(2); //2*2 = 4 출력
        powerByExp(2, 3); //2*2*2 = 8
    }
}
