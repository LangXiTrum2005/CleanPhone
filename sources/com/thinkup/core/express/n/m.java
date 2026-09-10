package com.thinkup.core.express.n;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m implements SensorEventListener {
    public static final int m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f42382n = 2;
    public static final int o = 0;
    private int m0;
    private int mo;
    public float o0 = 0.0f;
    public float oo = 0.0f;
    public float om = 0.0f;
    public long on = 0;

    private m(int i2, int i3) {
        this.m0 = i2;
        this.mo = i3;
    }

    public abstract void o();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long jCurrentTimeMillis;
        float[] fArr = sensorEvent.values;
        float f = -fArr[0];
        float f2 = -fArr[1];
        float f3 = -fArr[2];
        String.format("mtg handleSensorData lastx:%d,lasty:%d,lastz:%d", Integer.valueOf((int) f), Integer.valueOf((int) f2), Integer.valueOf((int) f3));
        float f4 = this.o0;
        if (f4 == 0.0f || Math.abs(f - f4) <= this.m0) {
            float f5 = this.oo;
            if (f5 == 0.0f || Math.abs(f2 - f5) <= this.m0) {
                float f6 = this.om;
                if (f6 != 0.0f && Math.abs(f3 - f6) > this.m0) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.on > this.mo) {
                        this.on = jCurrentTimeMillis;
                    }
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.on > this.mo) {
                    this.on = jCurrentTimeMillis;
                }
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.on > this.mo) {
                this.on = jCurrentTimeMillis;
            }
        }
        this.o0 = f;
        this.oo = f2;
        this.om = f3;
    }
}
