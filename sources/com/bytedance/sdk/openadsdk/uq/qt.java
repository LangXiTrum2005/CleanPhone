package com.bytedance.sdk.openadsdk.uq;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    public static WeakReference<ri> ri;
    protected static final float[] lr = new float[3];
    protected static final float[] ik = new float[3];
    protected static final float[] ka = new float[9];
    protected static final float[] fi = new float[3];

    public static void ik(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ri> weakReference = ri;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xha.ri("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    public static void ka(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ri> weakReference = ri;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xha.ri("SensorHub", "startListenRotationVector err", th);
        }
    }

    public static void lr(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ri> weakReference = ri;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xha.ri("SensorHub", "startListenGyroscope error", th);
        }
    }

    public static void ri(Context context, SensorEventListener sensorEventListener) {
    }

    public static void ri(ri riVar) {
        ri = new WeakReference<>(riVar);
    }

    public static void ri(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ri> weakReference = ri;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xha.ri("SensorHub", "startListenAccelerometer error", th);
        }
    }

    public static void ri(Context context, long j) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }
}
