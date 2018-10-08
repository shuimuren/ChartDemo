package aidel.lhj.com.chartdemo.mychart;

import com.github.mikephil.charting.components.YAxis;

public class MyYAxis extends YAxis {

    private float mBaseValue = Float.NaN;

    public MyYAxis() {
        super();
    }

    public MyYAxis(AxisDependency axis) {
        super(axis);
    }

    public float getBaseValue() {
        return mBaseValue;
    }

    public void setBaseValue(float baseValue) {
        this.mBaseValue = baseValue;
    }
}
