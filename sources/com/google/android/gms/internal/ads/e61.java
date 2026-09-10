package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e61 implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f61 f13860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l31 f13861c;

    public /* synthetic */ e61(f61 f61Var, l31 l31Var, int i10) {
        this.f13859a = i10;
        this.f13860b = f61Var;
        this.f13861c = l31Var;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) {
        switch (this.f13859a) {
            case 0:
                f61 f61Var = this.f13860b;
                pe1 pe1VarA = f61Var.f14264b.a(this.f13861c);
                f61Var.f14271i.e(15303, pe1VarA);
                return pe1VarA;
            default:
                f61 f61Var2 = this.f13860b;
                pe1 pe1VarA2 = f61Var2.f14264b.a(this.f13861c);
                f61Var2.f14271i.e(15303, pe1VarA2);
                return pe1VarA2;
        }
    }
}
