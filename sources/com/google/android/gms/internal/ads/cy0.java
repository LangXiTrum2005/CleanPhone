package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.ironsource.Xa;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p9.a f13307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f13309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13310f;

    public cy0(Object obj, p9.a aVar, double d10, int i10) {
        if (aVar == null) {
            throw new IllegalArgumentException("Clock cannot be null.");
        }
        this.f13305a = obj;
        this.f13307c = aVar;
        this.f13306b = System.currentTimeMillis();
        this.f13308d = Math.min(Math.max(((Long) zzba.zzc().a(am.f12142f0)).longValue() * 1000, Xa.f27908s), 21600000L);
        this.f13309e = d10;
        this.f13310f = i10;
    }

    public final long a() {
        ((p9.b) this.f13307c).getClass();
        return this.f13308d - (System.currentTimeMillis() - this.f13306b);
    }
}
