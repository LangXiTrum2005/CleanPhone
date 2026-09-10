package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19636a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19637b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19638c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f19639d = new AtomicBoolean(false);

    public final synchronized boolean a(boolean z10) {
        if (!this.f19639d.get()) {
            return z10;
        }
        return this.f19636a;
    }
}
