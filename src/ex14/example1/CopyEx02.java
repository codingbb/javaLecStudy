package ex14.example1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CopyEx02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);    //고정 크기 리스트. 길이 손 안댈것

        //새로운 컬렉션을 만들고싶어. 그럼 가공이지? map 쓰겟지?
        //map
        List<Integer> newList = list.stream().map(i -> i*100).toList();

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }

        //Stream의 forEach
        newList.stream().forEach(i -> System.out.println(i));


    }
}
