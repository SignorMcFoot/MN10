package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private LineChart<String, Number> v_t_chart;

    @FXML
    private LineChart<String, Number> u_t_chart;

    @FXML
    private Button startBtn;

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private TextField dField;

    @FXML
    void drawCharts(ActionEvent event) {
        ChartSeriesClass csc = new ChartSeriesClass();
        u_t_chart.getData().addAll(csc.uChartSeries(0.5,10,0,0.02,0.2,-65,2));
        v_t_chart.getData().addAll(csc.vChartSeries(0.5,10,0,0.02,0.2,-65,2));

    }

}
