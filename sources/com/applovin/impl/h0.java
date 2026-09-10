package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f8056a = (SensorManager) com.applovin.impl.sdk.l.p().getSystemService("sensor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f8057b;

    public h0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.f8057b = new Handler(handlerThread.getLooper());
    }

    public Sensor a(int i10) {
        return this.f8056a.getDefaultSensor(i10);
    }

    public void b(SensorEventListener sensorEventListener, Sensor sensor, int i10, com.applovin.impl.sdk.p pVar) {
        this.f8057b.post(new h9(this, sensorEventListener, sensor, i10, pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i10, com.applovin.impl.sdk.p pVar) {
        try {
            this.f8056a.registerListener(sensorEventListener, sensor, i10, this.f8057b);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                pVar.a("BackgroundSensorManager", "Unable to register sensor listener", th2);
            }
        }
    }

    public void b(SensorEventListener sensorEventListener) {
        this.f8057b.post(new x8(3, this, sensorEventListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.f8056a.unregisterListener(sensorEventListener);
    }
}
