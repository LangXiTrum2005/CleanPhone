package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yj0 extends a11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SensorManager f22278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Sensor f22279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public lj0 f22282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22283g;

    public yj0(Context context) {
        this.f22277a = context;
    }

    @Override // com.google.android.gms.internal.ads.a11
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) zzba.zzc().a(am.f12456za)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10))) >= ((Float) zzba.zzc().a(am.Aa)).floatValue()) {
                ((p9.b) zzt.zzk()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f22280d + ((long) ((Integer) zzba.zzc().a(am.Ba)).intValue()) <= jCurrentTimeMillis) {
                    if (this.f22280d + ((long) ((Integer) zzba.zzc().a(am.Ca)).intValue()) < jCurrentTimeMillis) {
                        this.f22281e = 0;
                    }
                    zze.zza("Shake detected.");
                    this.f22280d = jCurrentTimeMillis;
                    int i10 = this.f22281e + 1;
                    this.f22281e = i10;
                    lj0 lj0Var = this.f22282f;
                    if (lj0Var != null) {
                        if (i10 == ((Integer) zzba.zzc().a(am.Da)).intValue()) {
                            lj0Var.e(new jj0(0), kj0.f16459c);
                        }
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
                if (((Boolean) zzba.zzc().a(am.f12456za)).booleanValue()) {
                    if (this.f22278b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f22277a.getSystemService("sensor");
                        this.f22278b = sensorManager2;
                        if (sensorManager2 == null) {
                            int i10 = zze.zza;
                            zzo.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f22279c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f22283g && (sensorManager = this.f22278b) != null && (sensor = this.f22279c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        ((p9.b) zzt.zzk()).getClass();
                        this.f22280d = System.currentTimeMillis() - ((long) ((Integer) zzba.zzc().a(am.Ba)).intValue());
                        this.f22283g = true;
                        zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
