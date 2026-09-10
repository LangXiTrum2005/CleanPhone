package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z61 implements yd1, pq1, q81, li0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22523a;

    public void a(int i10, Object obj, bu1 bu1Var) {
        is1 is1Var = (is1) this.f22523a;
        rr1 rr1Var = (rr1) obj;
        is1Var.s(i10, 2);
        is1Var.G(rr1Var.d(bu1Var));
        bu1Var.i(rr1Var, this);
    }

    @Override // com.google.android.gms.internal.ads.q81
    public /* synthetic */ Object zza() {
        int i10 = fy1.f14575z;
        return (b21) this.f22523a;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        ((y61) this.f22523a).c();
    }

    public /* synthetic */ z61(Object obj) {
        this.f22523a = obj;
    }

    @Override // com.google.android.gms.internal.ads.pq1
    public Object zza(String str) {
        return ((rq1) this.f22523a).e(str, null);
    }

    public z61(Matcher matcher) {
        matcher.getClass();
        this.f22523a = matcher;
    }

    @Override // com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo161zza(Object obj) {
        ((a02) obj).e((IOException) this.f22523a);
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        y61 y61Var = (y61) this.f22523a;
        y61Var.b(th2);
        y61Var.c();
    }

    public z61() {
        this.f22523a = ia1.z(2, 1, 5);
    }

    public z61(a71 a71Var, y61 y61Var) {
        this.f22523a = y61Var;
        Objects.requireNonNull(a71Var);
    }

    public z61(is1 is1Var) {
        this.f22523a = is1Var;
        is1Var.f15841a = this;
    }
}
