package com.widget.barchartsample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.widget.barchart.chart.BarChartModel;
import com.widget.barchartsample.databinding.ChartActivityBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fwazy on 02,April,2019.
 * ma7madfawzy@gmail.com
 */
public class ChartActivity extends AppCompatActivity {
    private ChartActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.chart_activity);
        initDummyData();
    }

    private void initDummyData() {
        List<BarChartModel> columnsModelList = new ArrayList<>();
        List<BarChartModel> rowsModelList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            columnsModelList.add(new BarChartModel(DateFormatUtil.getMonthByNumber(i), i * 50));
            rowsModelList.add(new BarChartModel("" + i * 50, i * 50));
        }
        binding.chartView.drawChart(columnsModelList, 4);
    }

}
