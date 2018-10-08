package aidel.lhj.com.chartdemo.combine;import android.content.Context;import android.util.AttributeSet;import com.github.mikephil.charting.charts.CombinedChart;import com.github.mikephil.charting.components.YAxis;import aidel.lhj.com.chartdemo.mychart.MyXAxis;import aidel.lhj.com.chartdemo.mychart.MyYAxis;import aidel.lhj.com.chartdemo.myrenderer.XAxisRendererCurrentDay;import aidel.lhj.com.chartdemo.myrenderer.YAxisRendererCurrentDay;/** * Created by lhj on 18/10/8 */public class MyCombinedChartX extends CombinedChart{    public MyCombinedChartX(Context context) {        super(context);    }    public MyCombinedChartX(Context context, AttributeSet attrs) {        super(context, attrs);    }    public MyCombinedChartX(Context context, AttributeSet attrs, int defStyle) {        super(context, attrs, defStyle);    }    @Override    protected void init() {        super.init();        mXAxis = new MyXAxis();        mAxisLeft = new MyYAxis(YAxis.AxisDependency.LEFT);        mXAxisRenderer = new XAxisRendererCurrentDay(mViewPortHandler, (MyXAxis) mXAxis, mLeftAxisTransformer, this);        mAxisRendererLeft = new YAxisRendererCurrentDay(mViewPortHandler, (MyYAxis) mAxisLeft, mLeftAxisTransformer);        mAxisRight = new MyYAxis(YAxis.AxisDependency.RIGHT);        mAxisRendererRight = new YAxisRendererCurrentDay(mViewPortHandler, (MyYAxis) mAxisRight, mRightAxisTransformer);    }    /*返回转型后的左右轴*/    @Override    public MyYAxis getAxisLeft() {        return (MyYAxis) super.getAxisLeft();    }    @Override    public MyXAxis getXAxis() {        return (MyXAxis) super.getXAxis();    }    @Override    public MyYAxis getAxisRight() {        return (MyYAxis) super.getAxisRight();    }}