package chap4;

public class _03_elseif {
    public static void main(String[] args) {
        //조건문 elseif
        //한라봉에이드 +1
        //망고주스 +1
        //아아 +1
        boolean hallabogAde = true;
        boolean mangoJuice = true;

        if (hallabogAde) {
            System.out.println("한라봉에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        } else {
            System.out.println("아아 +1");
        }
        System.out.println("커피 주문 완료 #1");

        //else if는 여러번 사용 가능
        hallabogAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (orangeJuice) {
            System.out.println("한라봉에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지주스 +1");
        } else {
            System.out.println("아아 +1");
        }
        System.out.println("커피 주문 완료 #2");


        //else는 없어도 가능
        hallabogAde = false;
        mangoJuice = false;
        orangeJuice = true;

        if (orangeJuice) {
            System.out.println("한라봉에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지주스 +1");
        }
        System.out.println("커피 주문 완료 #3");

    }
}
