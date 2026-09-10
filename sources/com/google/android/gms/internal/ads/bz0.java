package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bz0 implements wy0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static bz0 f12940d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sy0 f12942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vy0 f12943c;

    public static bz0 a() {
        if (f12940d == null) {
            bz0 bz0Var = new bz0();
            bz0Var.f12941a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f12940d = bz0Var;
        }
        return f12940d;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final void zzd(boolean z10) {
        if (z10) {
            kz0.f16576g.getClass();
            kz0.b();
            return;
        }
        kz0.f16576g.getClass();
        Handler handler = kz0.f16578i;
        if (handler != null) {
            handler.removeCallbacks(kz0.f16580k);
            kz0.f16578i = null;
        }
    }
}
