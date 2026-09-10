package com.charging.screenshow.battery.animations.themes.opengl.image;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v4.media.a;
import com.charging.screenshow.battery.animations.themes.activity.BaseAct;

/* JADX INFO: loaded from: classes3.dex */
public class RotationMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SensorManager f13307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sensor f13308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LowPassSensorEventListener f13309c;
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13310e;

    public static class LowPassSensorEventListener implements SensorEventListener {
        public float[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public float[] f13311Y;
        public final RotationChangedListener Z;

        public LowPassSensorEventListener(RotationChangedListener rotationChangedListener) {
            this.Z = rotationChangedListener;
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i2) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            if (this.f13311Y == null) {
                this.f13311Y = new float[sensorEvent.values.length];
            }
            float[] fArr = (float[]) sensorEvent.values.clone();
            float[] fArr2 = this.f13311Y;
            if (fArr2 != null) {
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    float f = fArr2[i2];
                    fArr2[i2] = a.a(fArr[i2], f, 0.25f, f);
                }
                fArr = fArr2;
            }
            this.f13311Y = fArr;
            float[] fArr3 = new float[9];
            SensorManager.getRotationMatrixFromVector(fArr3, fArr);
            float[] fArr4 = this.X;
            if (fArr4 == null) {
                this.X = fArr3;
                return;
            }
            float[] fArr5 = new float[3];
            SensorManager.getAngleChange(fArr5, fArr3, fArr4);
            this.Z.a(fArr5);
        }
    }

    public interface RotationChangedListener {
        void a(float[] fArr);
    }

    public RotationMonitor(BaseAct baseAct, RotationChangedListener rotationChangedListener) {
        SensorManager sensorManager = (SensorManager) baseAct.getSystemService("sensor");
        this.f13307a = sensorManager;
        this.f13308b = sensorManager.getDefaultSensor(11);
        this.f13310e = 60;
        this.f13309c = new LowPassSensorEventListener(rotationChangedListener);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        int i2 = 1000000 / this.f13310e;
        this.f13307a.registerListener(this.f13309c, this.f13308b, i2);
        this.d = true;
    }

    public final void b() {
        if (this.d) {
            SensorManager sensorManager = this.f13307a;
            LowPassSensorEventListener lowPassSensorEventListener = this.f13309c;
            sensorManager.unregisterListener(lowPassSensorEventListener);
            this.d = false;
            lowPassSensorEventListener.X = null;
            lowPassSensorEventListener.f13311Y = null;
        }
    }
}
