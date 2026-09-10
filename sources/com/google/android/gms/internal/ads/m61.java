package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m61 implements l61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx1 f17312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a71 f17313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17314c;

    public m61(dx1 dx1Var, a71 a71Var, long j10) {
        this.f17312a = dx1Var;
        this.f17313b = a71Var;
        this.f17314c = j10;
    }

    @Override // com.google.android.gms.internal.ads.l61
    public final boolean a(l31 l31Var) {
        a71 a71Var = this.f17313b;
        if (l31Var == null || l31Var.equals(l31.F())) {
            a71Var.b(15102);
            return false;
        }
        if (l31Var.B() == this.f17312a.zzb()) {
            return true;
        }
        a71Var.b(15103);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.l61
    public final boolean b(l31 l31Var) {
        a71 a71Var = this.f17313b;
        if (l31Var == null || l31Var.equals(l31.F())) {
            a71Var.b(15104);
            return true;
        }
        if (l31Var.B() != this.f17312a.zzb()) {
            a71Var.b(15105);
            return true;
        }
        boolean z10 = (l31Var.z().B() * 1000) - System.currentTimeMillis() <= this.f17314c;
        if (z10) {
            a71Var.b(15106);
        }
        return z10;
    }
}
