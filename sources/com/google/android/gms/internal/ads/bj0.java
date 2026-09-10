package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bj0 extends a11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SensorManager f12798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sensor f12799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12800c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f12801d = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public lj0 f12806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12807j;

    public bj0(Context context) {
        ((p9.b) zzt.zzk()).getClass();
        this.f12802e = System.currentTimeMillis();
        this.f12803f = 0;
        this.f12804g = false;
        this.f12805h = false;
        this.f12806i = null;
        this.f12807j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f12798a = sensorManager;
        if (sensorManager != null) {
            this.f12799b = sensorManager.getDefaultSensor(4);
        } else {
            this.f12799b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.a11
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) zzba.zzc().a(am.Ea)).booleanValue()) {
            ((p9.b) zzt.zzk()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f12802e + ((long) ((Integer) zzba.zzc().a(am.Ga)).intValue()) < jCurrentTimeMillis) {
                this.f12803f = 0;
                this.f12802e = jCurrentTimeMillis;
                this.f12804g = false;
                this.f12805h = false;
                this.f12800c = this.f12801d.floatValue();
            }
            float fFloatValue = this.f12801d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f12801d = Float.valueOf(fFloatValue);
            float f10 = this.f12800c;
            ul ulVar = am.Fa;
            if (fFloatValue > ((Float) zzba.zzc().a(ulVar)).floatValue() + f10) {
                this.f12800c = this.f12801d.floatValue();
                this.f12805h = true;
            } else if (this.f12801d.floatValue() < this.f12800c - ((Float) zzba.zzc().a(ulVar)).floatValue()) {
                this.f12800c = this.f12801d.floatValue();
                this.f12804g = true;
            }
            if (this.f12801d.isInfinite()) {
                this.f12801d = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.f12800c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (this.f12804g && this.f12805h) {
                zze.zza("Flick detected.");
                this.f12802e = jCurrentTimeMillis;
                int i10 = this.f12803f + 1;
                this.f12803f = i10;
                this.f12804g = false;
                this.f12805h = false;
                lj0 lj0Var = this.f12806i;
                if (lj0Var != null) {
                    if (i10 == ((Integer) zzba.zzc().a(am.Ha)).intValue()) {
                        lj0Var.e(new jj0(1), kj0.f16459c);
                    }
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) zzba.zzc().a(am.Ea)).booleanValue()) {
                    if (!this.f12807j && (sensorManager = this.f12798a) != null && (sensor = this.f12799b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f12807j = true;
                        zze.zza("Listening for flick gestures.");
                    }
                    if (this.f12798a == null || this.f12799b == null) {
                        int i10 = zze.zza;
                        zzo.zzi("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
