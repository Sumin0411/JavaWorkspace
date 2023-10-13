package chap5;

public class _quiz {
    public static void main(String[] args) {
        //배열 이용하여 쇼핑몰에서 구매가능한 신발사이즈 옵션 출력

        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size :
                sizeArray) {
            System.out.println("사이즈 " + size +"(재고있음)");
        }
    }
}
