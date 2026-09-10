package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oe0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z90 f18240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f18241c;

    public oe0(o40 o40Var, z90 z90Var) {
        this.f18239a = 0;
        this.f18241c = o40Var;
        this.f18240b = z90Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f18239a) {
            case 0:
                return new iz(((o40) this.f18241c).a(), this.f18240b.a().f18366g);
            case 1:
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                ou0 ou0VarA = this.f18240b.a();
                return new xp0(k00Var, ou0VarA, 0);
            default:
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new zp0(k00Var2, this.f18240b.a(), ((v40) this.f18241c).zzb(), 1);
        }
    }

    public /* synthetic */ oe0(z90 z90Var, kx1 kx1Var, int i10) {
        this.f18239a = i10;
        this.f18240b = z90Var;
        this.f18241c = kx1Var;
    }
}
