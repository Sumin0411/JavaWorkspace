package chap1;

public class _03_variables {
    public static void main(String[] args) {

        String name;
        int hour = 1;


        name = "나도 코딩";
        System.out.println(name + " 님, 배송이 시작되었어요");
        System.out.println(name + "님, " +hour+ "시에 배송완료 되었습니다.");


        double score = 90.5;
        char grade = 'A';
        name = "강백호";

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.14234343232342;
        float f = 3.14F;
        System.out.println(d);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

    }
}
