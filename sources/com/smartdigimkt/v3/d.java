package com.smartdigimkt.v3;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39084a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f39085b = 2000;

    public abstract boolean a(SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f39084a <= this.f39085b || !a(sensorEvent)) {
            return;
        }
        this.f39084a = jCurrentTimeMillis;
    }
}
