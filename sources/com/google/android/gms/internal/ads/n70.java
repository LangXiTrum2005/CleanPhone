package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n70 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx1 f17689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f17690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1 f17691c;

    public n70(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3) {
        this.f17689a = fx1Var;
        this.f17690b = fx1Var2;
        this.f17691c = fx1Var3;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jb0 zzb() {
        return new jb0((ScheduledExecutorService) this.f17689a.zzb(), (p9.a) this.f17690b.zzb(), (yh0) this.f17691c.zzb());
    }
}
