package ex04;

public class Television2 {
    private int channel;
    private int volume;
    private boolean onOff;

    Television2(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }

}
class Television2Test {
    public static void main(String[] args) {
        Television2 myTv = new Television2(7, 10, true);
        myTv.print();

        Television2 yourTv = new Television2(11, 20, true);
        yourTv.print();
    }
}

