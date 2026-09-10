package com.thinkup.core.express.n;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.thinkup.core.common.n.o0n;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static volatile o o0;
    private final String m = "o";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SensorManager f42383n;
    Sensor o;
    private float[] oo;

    private o() {
        Context contextOn = o0n.m().on();
        if (contextOn != null) {
            try {
                if (this.f42383n == null) {
                    this.f42383n = (SensorManager) contextOn.getSystemService("sensor");
                }
                if (this.o == null) {
                    this.o = this.f42383n.getDefaultSensor(1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private boolean m() {
        return this.o != null;
    }

    private synchronized float[] n() {
        return this.oo;
    }

    public static o o() {
        if (o0 == null) {
            synchronized (o.class) {
                try {
                    if (o0 == null) {
                        o0 = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0;
    }

    public final void m(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f42383n;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
                sensorEventListener.hashCode();
            } catch (Throwable unused) {
            }
        }
    }

    public final void o(SensorEventListener sensorEventListener) {
        try {
            this.f42383n.registerListener(sensorEventListener, this.o, 2);
            sensorEventListener.hashCode();
        } catch (Throwable unused) {
        }
    }

    public final synchronized void o(float[] fArr) {
        this.oo = fArr;
    }
}
