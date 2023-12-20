package ex04;

public class Television {
    int channel;
    int volume;
    boolean ofOff;

    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7;
        myTv.volume = 10;
        myTv.ofOff = true;

        Television yourTv = new Television();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.ofOff = true;

        System.out.println("나의 텔레비전의 채널은 " + myTv.channel);
        System.out.println("너의 텔레비전의 채널은 " + myTv.channel);
    }
}
