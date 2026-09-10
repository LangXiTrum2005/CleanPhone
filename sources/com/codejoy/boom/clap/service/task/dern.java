package com.codejoy.boom.clap.service.task;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: compiled from: NotTouchDetectTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class dern implements SensorEventListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Sensor f18636arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public Runnable f18637dovishness;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public SensorManager f18640kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public float[] f18642monoploid = new float[3];

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public float[] f18643polloi = new float[3];

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f18641molybdenite = false;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public long f18639graveside = 0;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f18635adultoid = false;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f18638gintrap = false;

    public dern(Context context, Runnable runnable) {
        this.f18637dovishness = runnable;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f18640kowloon = sensorManager;
        this.f18636arytenoidectomy = sensorManager.getDefaultSensor(1);
    }

    public final void attabal() {
        Runnable runnable = this.f18637dovishness;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void dern() {
        try {
            if (this.f18638gintrap) {
                this.f18640kowloon.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
        this.f18638gintrap = false;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = this.f18642monoploid;
        float f = fArr[0] * 0.8f;
        float[] fArr2 = sensorEvent.values;
        float f2 = f + (fArr2[0] * 0.19999999f);
        fArr[0] = f2;
        float f3 = (fArr[1] * 0.8f) + (fArr2[1] * 0.19999999f);
        fArr[1] = f3;
        float f4 = (fArr[2] * 0.8f) + (fArr2[2] * 0.19999999f);
        fArr[2] = f4;
        float[] fArr3 = this.f18643polloi;
        float f5 = fArr2[0] - f2;
        fArr3[0] = f5;
        float f6 = fArr2[1] - f3;
        fArr3[1] = f6;
        float f7 = fArr2[2] - f4;
        fArr3[2] = f7;
        if (((float) Math.sqrt((f5 * f5) + (f6 * f6) + (f7 * f7))) >= 2.0f) {
            if (this.f18641molybdenite && System.currentTimeMillis() - this.f18639graveside > 1000) {
                attabal();
            }
            this.f18641molybdenite = false;
            return;
        }
        if (this.f18641molybdenite) {
            return;
        }
        this.f18641molybdenite = true;
        this.f18639graveside = System.currentTimeMillis();
        this.f18635adultoid = false;
    }

    public void saneness() {
        if (this.f18638gintrap) {
            return;
        }
        try {
            Sensor sensor = this.f18636arytenoidectomy;
            if (sensor != null) {
                this.f18638gintrap = true;
                this.f18640kowloon.registerListener(this, sensor, 3);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
