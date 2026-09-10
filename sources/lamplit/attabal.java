package lamplit;

import android.graphics.PointF;

/* JADX INFO: compiled from: CubicCurveData.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final PointF f32574attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final PointF f32575dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final PointF f32576saneness;

    public attabal() {
        this.f32574attabal = new PointF();
        this.f32576saneness = new PointF();
        this.f32575dern = new PointF();
    }

    public PointF attabal() {
        return this.f32574attabal;
    }

    public void beachfront(float f, float f2) {
        this.f32575dern.set(f, f2);
    }

    public PointF dern() {
        return this.f32575dern;
    }

    public void marial(float f, float f2) {
        this.f32576saneness.set(f, f2);
    }

    public PointF saneness() {
        return this.f32576saneness;
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f32575dern.x), Float.valueOf(this.f32575dern.y), Float.valueOf(this.f32574attabal.x), Float.valueOf(this.f32574attabal.y), Float.valueOf(this.f32576saneness.x), Float.valueOf(this.f32576saneness.y));
    }

    public void wireman(float f, float f2) {
        this.f32574attabal.set(f, f2);
    }

    public attabal(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f32574attabal = pointF;
        this.f32576saneness = pointF2;
        this.f32575dern = pointF3;
    }
}
