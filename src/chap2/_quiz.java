package chap2;

public class _quiz {
    public static void main(String[] args) {
        //어린이 키가 120 cm 인 경우에만 탑승가능
        //삼항 연산자
        //결과 = (조건) ? (참의 경우 결과값) :  (거짓의 경우 결과값)

        int height = 132;
        String result = ( height >= 120 ) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 " + height + " cm 이므로 " + result );
    }
}
