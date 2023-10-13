package chap3;

import javax.print.DocFlavor;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환 and -> ,
        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(7)); //index 기준 7부터 시작
        System.out.println(s.substring(s.indexOf("Python")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));

        //공백제거
        s = "       I love Java       ";
        System.out.println(s);
        System.out.println(s.trim());

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);

        System.out.println(s1.concat(",").concat(s2));
    }
}
