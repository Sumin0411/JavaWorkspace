package chap6;

public class _07_MainMethod {
    public static void main(String[] args) {
        for (String s :
                args) {
            System.out.println(s);
        }
        //1.도서 조회
        //2.도서 대출
        //3.도서 반납
        if(args.length == 1){
            switch (args[0]){
                case "1":
                    System.out.println("도서 조회");
                    break;
                case "2":
                    System.out.println("도서 대출");
                    break;
                case "3":
                    System.out.println("도서 반납");
                    break;
                default:
                    System.out.println("ERROR");
            }
        }else{
            System.out.println("사용법 ) 하나 입력 하셈");
        }
    }
}
