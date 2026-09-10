package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tg0 implements zq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qa0 f20376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dy f20377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20379d;

    public tg0(qa0 qa0Var, du0 du0Var) {
        this.f20376a = qa0Var;
        this.f20377b = du0Var.l;
        this.f20378c = du0Var.f13692j;
        this.f20379d = du0Var.f13694k;
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final void n0(dy dyVar) {
        int i10;
        String str;
        dy dyVar2 = this.f20377b;
        if (dyVar2 != null) {
            dyVar = dyVar2;
        }
        if (dyVar != null) {
            str = dyVar.f13754a;
            i10 = dyVar.f13755b;
        } else {
            i10 = 1;
            str = "";
        }
        sx sxVar = new sx(str, i10);
        qa0 qa0Var = this.f20376a;
        qa0Var.getClass();
        qa0Var.S0(new vu0(sxVar, this.f20378c, this.f20379d, 15));
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final void zza() {
        this.f20376a.S0(jq.f16142m);
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final void zzc() {
        this.f20376a.S0(jq.f16143n);
    }
}
