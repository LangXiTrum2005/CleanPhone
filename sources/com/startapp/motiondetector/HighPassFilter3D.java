package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes6.dex */
public class HighPassFilter3D implements SignalProcessor, Valuable {
    private double magnitude;
    private final HighPassFilter x;
    private final HighPassFilter y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final HighPassFilter f40418z;

    public HighPassFilter3D(HighPassFilter highPassFilter, HighPassFilter highPassFilter2, HighPassFilter highPassFilter3) {
        this.x = highPassFilter;
        this.y = highPassFilter2;
        this.f40418z = highPassFilter3;
    }

    public void add(double d, double d2, double d3) {
        this.x.add(d);
        this.y.add(d2);
        this.f40418z.add(d3);
        this.magnitude = Math.sqrt((this.f40418z.getValue() * this.f40418z.getValue()) + (this.y.getValue() * this.y.getValue()) + (this.x.getValue() * this.x.getValue()));
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.magnitude;
    }

    public HighPassFilter getX() {
        return this.x;
    }

    public HighPassFilter getY() {
        return this.y;
    }

    public HighPassFilter getZ() {
        return this.f40418z;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.x.reset();
        this.y.reset();
        this.f40418z.reset();
        this.magnitude = 0.0d;
    }
}
