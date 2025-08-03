package Interface;

public class AustralianTraffic implements CentralTraffic, ContinentInterface {

    @Override
    public void greenGo() {
        System.out.println("Green go implementation");
    }

    @Override
    public void redStop() {
        System.out.println("Red go implementation");
    }

    @Override
    public void flashYellow() {
        System.out.println("Flash Yellow go implementation");
    }

    public void walking() {
        System.out.println("walking implementation");
    }

    @Override
    public void trainSymbol() {
        System.out.println("Train Symbol implementation");
    }

    public static void main(String[] args) {
        CentralTraffic s = new AustralianTraffic();
        s.greenGo();
        s.flashYellow();
        s.redStop();

        AustralianTraffic a = new AustralianTraffic();
        a.walking();

        ContinentInterface c = new AustralianTraffic();
        c.trainSymbol();

        AustralianTraffic as = new AustralianTraffic();
        as.greenGo();
        as.flashYellow();
        as.redStop();
        as.walking();
        as.trainSymbol();
    }

}
