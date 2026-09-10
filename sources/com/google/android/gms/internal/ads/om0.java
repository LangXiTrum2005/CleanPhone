package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class om0 implements nm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm0 f18304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d81 f18305b;

    public om0(nm0 nm0Var, d81 d81Var) {
        this.f18304a = nm0Var;
        this.f18305b = d81Var;
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final ListenableFuture a(ju0 ju0Var, du0 du0Var) {
        return zw1.z(this.f18304a.a(ju0Var, du0Var), this.f18305b, l00.f16608a);
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final boolean b(ju0 ju0Var, du0 du0Var) {
        return this.f18304a.b(ju0Var, du0Var);
    }
}
