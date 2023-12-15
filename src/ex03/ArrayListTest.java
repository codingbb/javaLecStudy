package ex03;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("철수"); //0
        list.add("영희"); //1
        list.add("순신"); //2
        list.add("지영"); //3

        System.out.println(list.get(3));

        list.remove(3);
        System.out.println(list.get(3));
    }
}

