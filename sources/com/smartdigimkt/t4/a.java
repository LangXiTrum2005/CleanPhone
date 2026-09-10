package com.smartdigimkt.t4;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f38712e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38713a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SensorManager f38714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Sensor f38715c;
    private float[] d;

    private a() {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (contextK != null) {
            try {
                if (this.f38714b == null) {
                    this.f38714b = (SensorManager) contextK.getSystemService("sensor");
                }
                if (this.f38715c == null) {
                    this.f38715c = this.f38714b.getDefaultSensor(1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static a a() {
        if (f38712e == null) {
            synchronized (a.class) {
                try {
                    if (f38712e == null) {
                        f38712e = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38712e;
    }

    public void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f38714b;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
                sensorEventListener.hashCode();
            } catch (Throwable unused) {
            }
        }
    }

    public boolean c() {
        return this.f38715c != null;
    }

    public synchronized float[] b() {
        return this.d;
    }

    public void a(SensorEventListener sensorEventListener) {
        try {
            this.f38714b.registerListener(sensorEventListener, this.f38715c, 2);
            sensorEventListener.hashCode();
        } catch (Throwable unused) {
        }
    }

    public synchronized void a(float[] fArr) {
        this.d = fArr;
    }
}
