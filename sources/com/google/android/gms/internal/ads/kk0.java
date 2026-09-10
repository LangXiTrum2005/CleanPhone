package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kk0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f16468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v50 f16469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d80 f16470c;

    public kk0(fx1 fx1Var, v50 v50Var, d80 d80Var) {
        this.f16468a = fx1Var;
        this.f16469b = v50Var;
        this.f16470c = d80Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jk0 zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f16468a.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        k00 k00Var2 = l00.f16609b;
        ic1.h(k00Var2);
        Context contextA = ((o40) this.f16469b.f21035b).a();
        ic1.h(k00Var);
        return new jk0(scheduledExecutorService, k00Var, k00Var2, new ok0(contextA, k00Var, 1), fx1.b(this.f16470c));
    }
}
