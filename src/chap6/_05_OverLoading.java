package chap6;

public class _05_OverLoading {
    public static int getPower(int number){
        int result = number * number;
        return result;
        //return number*nubmer;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number *  number;
    }
    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러번 선언하는것
        //전달 값의 타입이 다르거나, 전달값의 갯수가 다르면 가능
        getPower(3);
        System.out.println(getPower(3)); //3*3 = 9
        System.out.println(getPower("4")); //4*4 = 16
        System.out.println(getPowerByExp(3, 3));
    }
}
