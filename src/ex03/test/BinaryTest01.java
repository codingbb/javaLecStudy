package ex03.test;

public class BinaryTest01 {
    public static void main(String[] args) {
        //이진 검색 => 반드시 정렬이 되어있어야 한다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};    // 9 / 2 = 4

        // target = 8

        // 0번지 ~ 8번지
        // 나누기 2를해서, mid를 구한다. min = N/2
        // mid = 4 = arr[4] => 값 5
        // if(8 == 5)
        // if(8 > 5) 참 *(8<5해도 상관없음)


        // start=5 (mid+1) ~ end=8 (5번지 ~ 8번지)
        // min = N/2 = 2
        // mid = 7 = arr[7] => 값 8
        // if(8==8) -> mid위치에 타겟이 있다.
        // if(8>8)

        //-----

        // target = 3

        // 0번지 ~ 8번지
        // 나누기 2를해서, mid를 구한다. min = N/2
        // mid = 4 = arr[4] => 값 5
        // if(3 == 5)
        // if(3 > 5) 참 *(8<5해도 상관없음)


        // 0번지 ~ 3번지
        // min = N/2 = 2
        // mid = 7 = arr[7] => 값 8
        // if(8==8) -> mid위치에 타겟이 있다.
        // if(8>8)

    }
}