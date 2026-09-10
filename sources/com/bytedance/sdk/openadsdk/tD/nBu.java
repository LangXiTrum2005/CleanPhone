package com.bytedance.sdk.openadsdk.tD;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class nBu {
    public static WeakReference<Lxb> Lxb;
    protected static final float[] LD = new float[3];
    protected static final float[] lk = new float[3];
    protected static final float[] ZU = new float[9];
    protected static final float[] JXs = new float[3];

    public static void LD(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<Lxb> weakReference = Lxb;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            ebl.Lxb("SensorHub", "startListenGyroscope error", th);
        }
    }

    public static void Lxb(Context context, SensorEventListener sensorEventListener) {
    }

    public static void ZU(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<Lxb> weakReference = Lxb;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            ebl.Lxb("SensorHub", "startListenRotationVector err", th);
        }
    }

    public static void lk(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<Lxb> weakReference = Lxb;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            ebl.Lxb("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    public static void Lxb(Lxb lxb) {
        Lxb = new WeakReference<>(lxb);
    }

    public static void Lxb(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<Lxb> weakReference = Lxb;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            ebl.Lxb("SensorHub", "startListenAccelerometer error", th);
        }
    }

    public static void Lxb(Context context, long j) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }
}
