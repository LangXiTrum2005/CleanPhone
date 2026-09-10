package com.codejoy.boom.clap.service.task;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: AntiPickPocketDetectTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class saneness implements SensorEventListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Sensor f18645arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final Runnable f18646dovishness;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final SensorManager f18649kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Handler f18651monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f18652polloi = false;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f18650molybdenite = false;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f18648graveside = false;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public long f18644adultoid = 0;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f18647gintrap = false;

    public saneness(Context context, Runnable runnable) {
        this.f18646dovishness = runnable;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f18649kowloon = sensorManager;
        this.f18645arytenoidectomy = sensorManager.getDefaultSensor(5);
        this.f18651monoploid = new Handler(Looper.getMainLooper());
    }

    public final void attabal() {
        Runnable runnable = this.f18646dovishness;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void dern() {
        if (this.f18650molybdenite) {
            attabal();
            this.f18650molybdenite = false;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 5) {
            saneness(sensorEvent);
        }
    }

    public final void saneness(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (f < 5.0f && !this.f18652polloi) {
            this.f18652polloi = true;
            this.f18650molybdenite = false;
        } else {
            if (f < 5.0f || !this.f18652polloi) {
                return;
            }
            this.f18652polloi = false;
            this.f18650molybdenite = true;
            this.f18651monoploid.postDelayed(new Runnable() { // from class: com.codejoy.boom.clap.service.task.attabal
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18634kowloon.dern();
                }
            }, 1000L);
        }
    }

    public void wireman() {
        if (this.f18647gintrap) {
            return;
        }
        try {
            Sensor sensor = this.f18645arytenoidectomy;
            if (sensor != null) {
                this.f18647gintrap = true;
                this.f18649kowloon.registerListener(this, sensor, 3);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
