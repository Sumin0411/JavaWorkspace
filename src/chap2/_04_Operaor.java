package chap2;

public class _04_Operaor {
    public static void main(String[] args) {
        //결과 = (조건) ? (참의 경우 결과값) :  (거짓의 경우 결과값)
        int x = 3;
        int y = 5;

        int max =  (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s);
    }
}
