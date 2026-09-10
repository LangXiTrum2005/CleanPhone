package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j61 implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k61 f16002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l31 f16003c;

    public /* synthetic */ j61(k61 k61Var, l31 l31Var, int i10) {
        this.f16001a = i10;
        this.f16002b = k61Var;
        this.f16003c = l31Var;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) {
        switch (this.f16001a) {
            case 0:
                k61 k61Var = this.f16002b;
                pe1 pe1VarA = k61Var.f16342a.a(this.f16003c);
                k61Var.f16345d.e(20303, pe1VarA);
                return pe1VarA;
            default:
                k61 k61Var2 = this.f16002b;
                pe1 pe1VarA2 = k61Var2.f16342a.a(this.f16003c);
                k61Var2.f16345d.e(20303, pe1VarA2);
                return pe1VarA2;
        }
    }
}
