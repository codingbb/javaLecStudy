package ex13.example1;

import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector(); //이러면 제네릭
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        //크기
        System.out.println(vec.size());

        //인덱스 접근
        System.out.println(vec.get(1));

        //정렬 (오름차순)
        Collections.sort(vec);

        for (String s : vec) {
            System.out.print(s + " ");
        }

        System.out.println();

        //정렬 (내림차순)
        Collections.sort(vec, Collections.reverseOrder());

        for (String s : vec) {
            System.out.print(s + " ");
        }

        System.out.println();

        // 정렬 다른 방법
        // Arrays.sort();

        // 삭제
        String result = vec.remove(2);
        System.out.println(result);
        System.out.println(vec.size());

        // 값 찾기 (현재 값이 오렌지, 망고만 남아있음)
        boolean search = vec.contains("mango"); //리턴 값이 boolean이니까!
        System.out.println(search);

        String a = "Mango";
        boolean check = a.equalsIgnoreCase("mAngo");
        System.out.println(check);
    }
}
