package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dn0 implements nm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70 f13600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f13601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh0 f13602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ou0 f13603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f13604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d81 f13605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wh0 f13606g;

    public dn0(y70 y70Var, Context context, Executor executor, eh0 eh0Var, ou0 ou0Var, d81 d81Var, wh0 wh0Var) {
        this.f13601b = context;
        this.f13600a = y70Var;
        this.f13604e = executor;
        this.f13602c = eh0Var;
        this.f13603d = ou0Var;
        this.f13605f = d81Var;
        this.f13606g = wh0Var;
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final ListenableFuture a(ju0 ju0Var, du0 du0Var) {
        return zw1.x(be1.f12743b, new q80(this, ju0Var, du0Var, 4), this.f13604e);
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final boolean b(ju0 ju0Var, du0 du0Var) {
        hu0 hu0Var = du0Var.f13708s;
        return (hu0Var == null || hu0Var.f15394a == null) ? false : true;
    }
}
