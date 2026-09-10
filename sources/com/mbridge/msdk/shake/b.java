package com.mbridge.msdk.shake;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35716a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f35717b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f35718c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f35719d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35721f;

    public b(int i10, int i11) {
        this.f35720e = i10;
        this.f35721f = i11;
    }

    public abstract void a();

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long jCurrentTimeMillis;
        float[] fArr = sensorEvent.values;
        float f10 = -fArr[0];
        float f11 = -fArr[1];
        float f12 = -fArr[2];
        float f13 = this.f35717b;
        if (f13 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f10 - f13) <= this.f35720e) {
            float f14 = this.f35718c;
            if (f14 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f11 - f14) <= this.f35720e) {
                float f15 = this.f35719d;
                if (f15 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Math.abs(f12 - f15) > this.f35720e) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.f35716a > this.f35721f) {
                        this.f35716a = jCurrentTimeMillis;
                        a();
                    }
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f35716a > this.f35721f) {
                    this.f35716a = jCurrentTimeMillis;
                    a();
                }
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f35716a > this.f35721f) {
                this.f35716a = jCurrentTimeMillis;
                a();
            }
        }
        this.f35717b = f10;
        this.f35718c = f11;
        this.f35719d = f12;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
