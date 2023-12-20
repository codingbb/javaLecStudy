package ex04;

public class DeskLamp {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String toString() {
        return "현재 상태는 " + (isOn == false ? "꺼짐" : "켜짐");
    }

    public String toString2() {
        return "두번째 상태는 " + (isOn == false ? "꺼짐" : "켜짐");
    }

}
