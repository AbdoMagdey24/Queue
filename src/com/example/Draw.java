package com.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Draw {

    private ChartFrame frame = null;

    private int[] arrNt;
    private double u;
    private double λ;
    private int k;
    private int M;
    private int length;

    public Draw(double u, double λ, int k) {
        this.u = u;
        this.λ = λ;
        this.k = k;
    }

    public Draw(double u, double λ, int k, int M) {
        this.u = u;
        this.λ = λ;
        this.k = k;
        this.M = M;
    }

    void displayChart() {
        if (this.frame == null) {
            String title = "Queue";
            String x = "Time (t)";
            String y = "Number of Customers n(t)";

            XYDataset data = createStepXYDataset();

            JFreeChart chart
                    = ChartFactory.createXYStepChart(title, x, y, data,
                            PlotOrientation.VERTICAL,
                            false, // legend
                            true, // tooltips
                            false // urls
                    );

            this.frame = new ChartFrame("Deterministic Queue Graph", chart);
            this.frame.pack();
            this.frame.setVisible(true);

        } else {
            this.frame.setVisible(true);
        }
    }

    public XYDataset createStepXYDataset() {

        XYSeries s1 = new XYSeries("", true, true);
        DD1 dq;

        if (M == 0) {
            dq = new DD1(u, λ, k);
            dq.getTi();
            length = (int) (1 / λ) * 45;
            arrNt = dq.drawNt(length);
        } else {
            dq = new DD1(u, λ, k, M);
            dq.getTi2();
            length = (int) (1 / λ) * 45;
            arrNt = dq.drawNt2(length);
        }
        for (int i = 0; i < arrNt.length; i++) {
            s1.add(i, arrNt[i]);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s1);
        return dataset;
    }

}
