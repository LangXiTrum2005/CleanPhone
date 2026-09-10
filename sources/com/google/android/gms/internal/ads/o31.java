package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o31 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p31 f18110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18111b;

    public /* synthetic */ o31(p31 p31Var, int i10) {
        this.f18110a = p31Var;
        this.f18111b = i10;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i10 = this.f18111b - 1;
        p31 p31Var = this.f18110a;
        if (i10 == 1) {
            return (m31) p31Var.f18469a.zzb();
        }
        if (i10 == 2) {
            return (m31) p31Var.f18470b.zzb();
        }
        if (i10 == 3) {
            return (m31) p31Var.f18471c.zzb();
        }
        p31Var.getClass();
        throw new IllegalArgumentException();
    }
}
