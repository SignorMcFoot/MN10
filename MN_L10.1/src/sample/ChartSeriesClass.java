package sample;

import javafx.scene.chart.XYChart;

import java.util.ArrayList;

public class ChartSeriesClass {

    private ArrayClass ar = new ArrayClass();


    public XYChart.Series<String, Number> uChartSeries(double tStep, double tEnd, double tStart, double a, double b, double c, double d){
        Equations eq = new Equations(tStep);
        eq.calculate(ar,tEnd,tStart,a,b,c,d);
        XYChart.Series xD = new XYChart.Series();
        ArrayList OXList = ar.gettValues();
        ArrayList OYList = ar.getuValues();

        for(int i =0; i< OXList.size();i++){
            xD.getData().add(new XYChart.Data<>(String.valueOf(OXList.get(i)),OYList.get(i)));
        }


        return xD;
    }

    public XYChart.Series<String, Number> vChartSeries(double tStep, double tEnd, double tStart, double a, double b, double c, double d){
        Equations eq = new Equations(tStep);
        eq.calculate(ar,tEnd,tStart,a,b,c,d);
        XYChart.Series xDD = new XYChart.Series();
        ArrayList OXListV = ar.gettValues();
        ArrayList OYList = ar.getvValues();

        for(int i =0; i< OXListV.size();i++){
            xDD.getData().add(new XYChart.Data<>(String.valueOf(OXListV.get(i)),OYList.get(i)));
        }


        return xDD;
    }
}
