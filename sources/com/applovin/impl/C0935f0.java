package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: com.applovin.impl.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0935f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f10824a = (SensorManager) com.applovin.impl.sdk.k.o().getSystemService("sensor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f10825b;

    public C0935f0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.f10825b = new Handler(handlerThread.getLooper());
    }

    public Sensor a(int i2) {
        return this.f10824a.getDefaultSensor(i2);
    }

    public void b(SensorEventListener sensorEventListener, Sensor sensor, int i2, com.applovin.impl.sdk.o oVar) {
        this.f10825b.post(new A.s0(this, sensorEventListener, sensor, i2, oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i2, com.applovin.impl.sdk.o oVar) {
        try {
            this.f10824a.registerListener(sensorEventListener, sensor, i2, this.f10825b);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                oVar.a("BackgroundSensorManager", "Unable to register sensor listener", th);
            }
        }
    }

    public void b(SensorEventListener sensorEventListener) {
        this.f10825b.post(new D(4, this, sensorEventListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.f10824a.unregisterListener(sensorEventListener);
    }
}
