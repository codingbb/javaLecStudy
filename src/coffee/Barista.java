package coffee;

public class Barista {
    public Coffee makeCoffee() {  //바리스타가 가지고 있는 행위
        return new Coffee();    //커피 객체를 받아서 커피를 리턴해줘야 함. 그래서 Coffee
                                //바리스타가 커피를 만드니까, 바리스타가 커피를 new하는 것
    }
}
