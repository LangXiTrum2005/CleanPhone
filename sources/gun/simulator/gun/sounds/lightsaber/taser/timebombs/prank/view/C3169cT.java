package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3169cT implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f4223a = new float[16];
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] d = new float[3];
    public final Display e;
    public final InterfaceC3081bT[] f;
    public boolean g;

    public C3169cT(Display display, InterfaceC3081bT... interfaceC3081bTArr) {
        this.e = display;
        this.f = interfaceC3081bTArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f4223a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.e.getRotation();
        float[] fArr3 = this.b;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i2 = 130;
                    i = 1;
                }
            } else {
                i2 = 2;
                i = 129;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(this.f4223a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z = this.g;
        float[] fArr5 = this.f4223a;
        if (!z) {
            C3877kY.f(this.c, fArr5);
            this.g = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.b, 0, this.c, 0);
        for (InterfaceC3081bT interfaceC3081bT : this.f) {
            interfaceC3081bT.a(fArr2, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
