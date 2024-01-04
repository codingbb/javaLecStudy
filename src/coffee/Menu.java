package coffee;

import java.util.List;

public class Menu {
    private List<String> item;  //컴포지션해서 들고있으면 된다.
                                //메뉴 아이템을 굳이 객체로 만들 필요 x
                                //만약 (아메리카노,1000)이면 오브젝트로 (커스텀 자료형으로) 만들어야함.

    //아메리카노, 카푸치노, 마끼야토, 에스프레소
    public Menu(List<String> item) {
        this.item = item;
    }

}
