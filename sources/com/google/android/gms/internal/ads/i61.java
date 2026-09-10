package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i61 implements d61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l51 f15628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f15629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a71 f15630c;

    public i61(l51 l51Var, ExecutorService executorService, a71 a71Var) {
        this.f15628a = l51Var;
        this.f15629b = executorService;
        this.f15630c = a71Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.c61
    public final ListenableFuture a(l31 l31Var, byte[] bArr) {
        pe1 pe1VarO = zw1.o(this.f15629b, new r90(this, l31Var, bArr, 3));
        this.f15630c.e(15305, pe1VarO);
        return pe1VarO;
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final ListenableFuture b(l31 l31Var, byte[] bArr, byte[] bArr2) {
        pe1 pe1VarO = zw1.o(this.f15629b, new of0(this, l31Var, bArr, bArr2, 7));
        this.f15630c.e(15321, pe1VarO);
        return pe1VarO;
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final ListenableFuture zza() {
        return zw1.d(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final pe1 zzb() {
        pe1 pe1VarO = zw1.o(this.f15629b, new h61(this, 1));
        this.f15630c.e(15302, pe1VarO);
        return pe1VarO;
    }

    @Override // com.google.android.gms.internal.ads.d61
    public final ListenableFuture zze() {
        pe1 pe1VarO = zw1.o(this.f15629b, new h61(this, 0));
        this.f15630c.e(15314, pe1VarO);
        return pe1VarO;
    }
}
