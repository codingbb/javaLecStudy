package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx02 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;
        boolean isSame;

        // 1. 6바퀴 돌면서 로또 번호를 추첨할 예정
        // 2. 첫번째 바퀴는 공을 꺼내서 추첨한 번호를 그대로 입력
        // 3. 두번째 바퀴는 공을 꺼내서 이전에 추첨한 모든 번호와 비교 (isSame 값 만들기)
        // 4. 모든 번호와 비교했을때 하나라도 같으면 true, 다르면 false
        // 5. isSame == true (3번부터 다시 시작)
        // 6. isSame == false (공 집어넣기 - 3번부터 다시 시작)

        for (int i = 0; i < 6; i++) {
            //공 꺼내서 바로 추가하는 코드 (첫번째 바퀴)
            if(i == 0) {
                num = r.nextInt(45)+1;
                arr[i] = num;
                continue;   //밑에 코드 쌩까고 다시 위의 for문으로 간다. (else 안적음)
            }

            while (true) {
                // 공을 꺼내는 코드
                isSame = false;
                num = r.nextInt(45)+1;  // i == 1일때부터 실행. i == 0인거랑 비교!

                /**
                 * 이전 번호들과 비교하는 코드
                 * i == 1 (0 비교)
                 * i == 2 (1, 0 비교)
                 * i == 3 (2, 1, 0 비교)
                 * i == 4 (3, 2, 1, 0 비교)
                 */
                for (int j = i-1; j >= 0; j--) {    //for문을 반대로 돌려야함
                    if(arr[j] == num) {   //i가 2가되면 1번지랑만 비교함. 그래서 for문이 필요하다
                        isSame = true;
                        break;  //가장 가까운 반복문으로 돌아감
                    }
                }

                if (!isSame) {  //중복값이 없으면 값 넣기
                    arr[i] = num;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
