package com.smartdigimkt.t4;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements SensorEventListener {
    public static final int g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f38716h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f38717i = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f38718a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f38719b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f38720c = 0.0f;
    public long d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38721e;
    private int f;

    public b(int i2, int i3) {
        this.f38721e = i2;
        this.f = i3;
    }

    public abstract void a();

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
        float f4 = this.f38718a;
        if (f4 == 0.0f || Math.abs(f - f4) <= this.f38721e) {
            float f5 = this.f38719b;
            if (f5 == 0.0f || Math.abs(f2 - f5) <= this.f38721e) {
                float f6 = this.f38720c;
                if (f6 != 0.0f && Math.abs(f3 - f6) > this.f38721e) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.d > this.f) {
                        this.d = jCurrentTimeMillis;
                        a();
                    }
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.d > this.f) {
                    this.d = jCurrentTimeMillis;
                    a();
                }
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.d > this.f) {
                this.d = jCurrentTimeMillis;
                a();
            }
        }
        this.f38718a = f;
        this.f38719b = f2;
        this.f38720c = f3;
    }
}
