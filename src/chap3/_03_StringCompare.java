package chap3;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); //문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분 x

        //문자열 비교 심화
        s1 = "1234";
        s2 = "1234";

        System.out.println(s1.equals(s2)); //true (내용)
        System.out.println(s1 == s2); //true (참조)

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
