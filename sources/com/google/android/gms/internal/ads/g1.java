package com.google.android.gms.internal.ads;

import android.util.Range;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f14651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Range f14652d;

    public g1(int i10) {
        switch (i10) {
            case 1:
                Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) 1.0f)));
                this.f14652d = range;
                this.f14651c = ((Double) range.getUpper()).doubleValue();
                this.f14649a = C.TIME_UNSET;
                this.f14650b = C.TIME_UNSET;
                break;
            default:
                Range range2 = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
                this.f14652d = range2;
                this.f14651c = ((Double) range2.getUpper()).doubleValue();
                this.f14649a = C.TIME_UNSET;
                this.f14650b = C.TIME_UNSET;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public void a(long j10, long j11) {
        double dDoubleValue;
        go.k.i(j10 != C.TIME_UNSET);
        go.k.i(j11 != C.TIME_UNSET);
        long j12 = this.f14649a;
        if (j12 != C.TIME_UNSET) {
            long j13 = this.f14650b;
            if (j13 == C.TIME_UNSET || j10 == j12) {
                dDoubleValue = ((Double) this.f14652d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j11 - j13) / (j10 - j12);
            }
        } else {
            dDoubleValue = ((Double) this.f14652d.getUpper()).doubleValue();
        }
        this.f14651c = (((Double) this.f14652d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.f14651c * 0.800000011920929d);
        this.f14649a = j10;
        this.f14650b = j11;
    }

    public void b() {
        this.f14651c = ((Double) this.f14652d.getUpper()).doubleValue();
        this.f14649a = C.TIME_UNSET;
        this.f14650b = C.TIME_UNSET;
    }

    public void c(float f10) {
        go.k.i(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f14652d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        b();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public void d(long j10, long j11) {
        double dDoubleValue;
        ps1.v(j10 != C.TIME_UNSET);
        ps1.v(j11 != C.TIME_UNSET);
        long j12 = this.f14649a;
        if (j12 != C.TIME_UNSET) {
            long j13 = this.f14650b;
            if (j13 == C.TIME_UNSET || j10 == j12) {
                dDoubleValue = ((Double) this.f14652d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j11 - j13) / (j10 - j12);
            }
        } else {
            dDoubleValue = ((Double) this.f14652d.getUpper()).doubleValue();
        }
        this.f14651c = (((Double) this.f14652d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.f14651c * 0.800000011920929d);
        this.f14649a = j10;
        this.f14650b = j11;
    }

    public void e(float f10) {
        ps1.v(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f14652d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        f();
    }

    public void f() {
        this.f14651c = ((Double) this.f14652d.getUpper()).doubleValue();
        this.f14649a = C.TIME_UNSET;
        this.f14650b = C.TIME_UNSET;
    }
}
