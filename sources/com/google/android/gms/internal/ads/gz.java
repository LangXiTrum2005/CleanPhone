package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gz implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f15002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hx1 f15003c;

    public /* synthetic */ gz(fx1 fx1Var, hx1 hx1Var, int i10) {
        this.f15001a = i10;
        this.f15002b = fx1Var;
        this.f15003c = hx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f15001a) {
            case 0:
                return new lj1(this.f15003c.f15424a, false, this.f15002b.zzb(), 11);
            case 1:
                return new qh0((pj) this.f15002b.zzb(), (nt0) this.f15003c.f15424a);
            case 2:
                Context context = (Context) this.f15002b.zzb();
                k70 k70Var = (k70) this.f15003c.f15424a;
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new zm0(context, k70Var, k00Var, 0);
            case 3:
                return new bn0((Context) this.f15002b.zzb(), 0, (k70) this.f15003c.f15424a);
            case 4:
                return new gn0((Context) this.f15002b.zzb(), (y70) this.f15003c.f15424a);
            case 5:
                return new bn0((Context) this.f15002b.zzb(), 1, (ed0) this.f15003c.f15424a);
            default:
                return new bn0((Context) this.f15002b.zzb(), 2, (xg0) this.f15003c.f15424a);
        }
    }

    public gz(hx1 hx1Var, fx1 fx1Var) {
        this.f15001a = 0;
        this.f15003c = hx1Var;
        this.f15002b = fx1Var;
    }
}
