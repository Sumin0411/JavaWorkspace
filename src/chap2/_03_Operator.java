package chap2;

public class _03_Operator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = true;

        System.out.println(a || b || c); //하나라도 true이면 true
        System.out.println(a && b && c); //모두 true이면 true

        System.out.println((5 > 3) && (3 >1)); //5는 3보다 크고, 3은 1보다 크다.
        System.out.println((5 >3) && (3 < 1));
    }
}
