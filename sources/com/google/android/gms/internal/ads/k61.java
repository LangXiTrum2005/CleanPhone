package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k61 implements c61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z21 f16342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z21 f16343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx1 f16344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a71 f16345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f16346e;

    public k61(z21 z21Var, z21 z21Var2, dx1 dx1Var, ExecutorService executorService, a71 a71Var) {
        this.f16342a = z21Var;
        this.f16343b = z21Var2;
        this.f16344c = dx1Var;
        this.f16345d = a71Var;
        this.f16346e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final ListenableFuture a(l31 l31Var, byte[] bArr) {
        pe1 pe1VarA = this.f16343b.a(bArr);
        this.f16345d.e(20305, pe1VarA);
        return zw1.x(vd1.r(pe1VarA), new j61(this, l31Var, 0), td1.f20333a);
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final ListenableFuture b(l31 l31Var, byte[] bArr, byte[] bArr2) {
        pe1 pe1VarA = ((z21) this.f16344c.zzb()).a(bArr);
        a71 a71Var = this.f16345d;
        a71Var.e(20307, pe1VarA);
        pe1 pe1VarA2 = this.f16343b.a(bArr2);
        a71Var.e(20305, pe1VarA2);
        return zw1.x(vd1.r(new pd1(ca1.z(new ListenableFuture[]{pe1VarA, pe1VarA2}), true)), new j61(this, l31Var, 1), td1.f20333a);
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final ListenableFuture zza() {
        return zw1.d(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final pe1 zzb() {
        z21 z21Var = this.f16342a;
        z21Var.getClass();
        pe1 pe1VarO = zw1.o(z21Var.f22477b, new ns0(z21Var, 4));
        this.f16345d.e(20302, pe1VarO);
        return pe1VarO;
    }
}
