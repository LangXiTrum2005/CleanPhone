package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes6.dex */
public class VehiclePassengerRecognizer implements SignalProcessor, Valuable {
    private static final double alphaLa = 0.0d;
    private static final double alphaVa = 0.0d;
    private static final double alphaVf = 0.0d;
    private static final double weightLa = 100.0d;
    private static final double weightSum = 270.0d;
    private static final double weightVa = 70.0d;
    private static final double weightVf = 100.0d;
    private double la;
    private double probability;
    private double va;
    private double vf;

    public static double laFunciton(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d < 0.5d) {
            return Math.pow(d * 2.0d, 4.0d);
        }
        if (d > 5.0d) {
            return Math.exp((5.0d - d) * 4.0d);
        }
        return 1.0d;
    }

    public static double vaFunciton(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d < 0.5d) {
            return Math.pow(d * 2.0d, 4.0d);
        }
        if (d > 2.0d) {
            return Math.exp((2.0d - d) * 6.0d);
        }
        return 1.0d;
    }

    public static double vfFunction(double d) {
        return Math.min(Utils.gaussian(d, 2.0d, 7.0d, 1.0d), 1.0d);
    }

    public void add(double d, double d2, double d3) {
        this.vf = (vfFunction(d) * 1.0d) + (this.vf * 0.0d);
        this.va = (vaFunciton(d2) * 1.0d) + (this.va * 0.0d);
        double dLaFunciton = (laFunciton(d3) * 1.0d) + (this.la * 0.0d);
        this.la = dLaFunciton;
        this.probability = ((dLaFunciton * 100.0d) / weightSum) + ((this.va * weightVa) / weightSum) + ((this.vf * 100.0d) / weightSum);
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.probability;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.vf = 0.0d;
        this.va = 0.0d;
        this.la = 0.0d;
        this.probability = 0.0d;
    }
}
