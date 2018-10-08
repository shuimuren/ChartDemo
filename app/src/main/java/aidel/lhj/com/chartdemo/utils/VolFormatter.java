package aidel.lhj.com.chartdemo.utils;


import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;


import java.text.DecimalFormat;

public class VolFormatter implements IAxisValueFormatter {

    private final int unit;
    private DecimalFormat mFormat;
    private String u;

    public VolFormatter(int unit) {
        if (unit == 1) {
            mFormat = new DecimalFormat("#0");
        } else {
            mFormat = new DecimalFormat("#0.00");
        }
        this.unit = unit;
        this.u = MyUtils.getVolUnit(unit);
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {
                value = value / unit;
        if (value == 0) {
            return u;
        }
        return mFormat.format(value);
    }

//    @Override
//    public String getFormattedValue(float value, YAxis yAxis) {
//        value = value / unit;
//        if (value == 0) {
//            return u;
//        }
//        return mFormat.format(value);
//    }
}
