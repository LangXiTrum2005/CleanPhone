package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c42 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n42 f13036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n42 f13037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2 f13038c = new k2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f13039d = new AtomicReference(b42.f12630a);

    public c42(n42 n42Var) {
        this.f13036a = n42Var;
        this.f13037b = n42Var;
    }

    public final h3 a() {
        return this.f13039d.get() == b42.f12632c ? this.f13038c : this.f13037b;
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final void b(int i10, np0 np0Var) {
        a().b(i10, np0Var);
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final void c(long j10, int i10, int i11, int i12, g3 g3Var) {
        a().c(j10, i10, i11, i12, g3Var);
        AtomicReference atomicReference = this.f13039d;
        if (atomicReference.get() == b42.f12631b) {
            this.f13037b.k(false);
            atomicReference.set(b42.f12632c);
        }
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final int d(vx1 vx1Var, int i10, boolean z10) {
        return a().d(vx1Var, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final int e(vx1 vx1Var, int i10, boolean z10) {
        return a().e(vx1Var, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final void f(g22 g22Var) {
        this.f13036a.f(g22Var);
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final void g(np0 np0Var, int i10, int i11) {
        a().g(np0Var, i10, i11);
    }
}
