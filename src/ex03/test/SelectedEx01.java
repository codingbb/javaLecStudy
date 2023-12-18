package ex03.test;

public class SelectedEx01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
        int rep;
        int min;

        //1회전

        for (int j = 0; j < N-1; j++) {
            rep = j;
            min = rep;

            for (int i = rep+1; i < N; i++) {
                if(arr[min] > arr[i]) {   // 5, 8, 2, 4, 3
                    min = i;
                }
            }

            if(rep != min) {
                int temp = arr[rep];
                arr[rep] = arr[min];
                arr[min] = temp;
            }
        }

        for(int v : arr){ //전체를 순회해서 출력 (for each문). arr이 한바퀴 돌때마다 v에 저장됨 그래서 v를 출력하면 됨.
            System.out.print(v + " ");
        }

    }
}
