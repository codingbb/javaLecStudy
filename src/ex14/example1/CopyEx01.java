package ex14.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyEx01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // 컬렉션 복사
        List<Integer> newList = new ArrayList<>(list);
        newList.add(5);

        System.out.println(list.size());
        System.out.println(newList.size());

        System.out.println(list.hashCode());
        System.out.println(newList.hashCode());

//        list.add(5);
//
//        System.out.println(list.hashCode());
//        System.out.println(newList.hashCode());

        //자바에서의 값 복사 (레퍼런스 타입의 값 복사)
//        var newList = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            newList.add(list.get(i));
//        }


    }
}
