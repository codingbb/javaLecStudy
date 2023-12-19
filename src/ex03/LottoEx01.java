package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
       int arr[] = new int[6];
       Random r = new Random();

       int num;

        for (int i = 0; i < arr.length; i++) {
            if(i == 0) {    // i==0이란 말은 '첫번째 바퀴'. 그래서 if로 (패턴)예외처리를 해줌(패턴 외의 상황이라)
                num = r.nextInt(45)+1;   //즉, 첫번째 바퀴때는 걍 넣어줌 (비교 이런거 안하고)
                arr[i] = num;
            } else {

                while (true) {
                    num = r.nextInt(45)+1;

                    if(arr[i-1] != num) {   //비교대상이 arr[0]번지니까 i-1.
                        arr[i] = num;
                        break;
                    }
                }
            }
        }

       System.out.println(Arrays.toString(arr));

    }

}
