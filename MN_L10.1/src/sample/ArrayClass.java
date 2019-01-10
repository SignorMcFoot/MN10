package sample;

import java.util.ArrayList;

public class ArrayClass implements ArrayUpdate {

    ArrayList<Double> tValues = new ArrayList<>();
    ArrayList<Double> vValues = new ArrayList<>();
    ArrayList<Double> uValues = new ArrayList<>();

    public ArrayList<Double> gettValues() {
        return tValues;
    }

    public ArrayList<Double> getvValues() {
        return vValues;
    }

    public ArrayList<Double> getuValues() {
        return uValues;
    }

    @Override
    public void update(double t, double v, double u) {
        tValues.add(t);
        vValues.add(v);
        uValues.add(u);
    }
}
