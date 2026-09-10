package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h10 extends a11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SensorManager f15049a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Display f15051c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f15054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y01 f15055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i10 f15056h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f15052d = new float[9];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f15053e = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15050b = new Object();

    public h10(Context context) {
        this.f15049a = (SensorManager) context.getSystemService("sensor");
        this.f15051c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.a11
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[1] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[2] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        synchronized (this.f15050b) {
            try {
                if (this.f15054f == null) {
                    this.f15054f = new float[9];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        float[] fArr2 = this.f15052d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f15051c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, TsExtractor.TS_STREAM_TYPE_AC3, this.f15053e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, this.f15053e);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.f15053e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 1, this.f15053e);
        }
        float[] fArr3 = this.f15053e;
        float f10 = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f10;
        float f11 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f11;
        float f12 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f12;
        synchronized (this.f15050b) {
            System.arraycopy(fArr3, 0, this.f15054f, 0, 9);
        }
        i10 i10Var = this.f15056h;
        if (i10Var != null) {
            Object obj = i10Var.f15488u;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    public final void b() {
        if (this.f15055g == null) {
            return;
        }
        this.f15049a.unregisterListener(this);
        this.f15055g.post(new bf(3));
        this.f15055g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.f15050b) {
            try {
                float[] fArr2 = this.f15054f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
