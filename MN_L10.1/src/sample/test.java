package sample;

public class test {
    public static void main(String[] args) {
        ArrayClass ar = new ArrayClass();
        Equations eq = new Equations(0.0001);
        eq.calculate(ar,1,0,0.02,0.2,-65,2);
        System.out.println("v list "+ar.gettValues().toString());
        System.out.println("u list "+ar.getuValues().toString());
    }


}
