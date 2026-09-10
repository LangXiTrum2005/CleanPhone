package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f61 implements d61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z21 f14263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z21 f14264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z21 f14265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z21 f14266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dx1 f14267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dx1 f14268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f14269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f14270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a71 f14271i;

    public f61(z21 z21Var, z21 z21Var2, dx1 dx1Var, z21 z21Var3, z21 z21Var4, dx1 dx1Var2, File file, ExecutorService executorService, a71 a71Var) {
        this.f14263a = z21Var;
        this.f14265c = z21Var2;
        this.f14267e = dx1Var;
        this.f14264b = z21Var3;
        this.f14266d = z21Var4;
        this.f14268f = dx1Var2;
        this.f14269g = file;
        this.f14270h = executorService;
        this.f14271i = a71Var;
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final ListenableFuture a(l31 l31Var, byte[] bArr) {
        pe1 pe1VarA = this.f14266d.a(bArr);
        this.f14271i.e(15305, pe1VarA);
        return zw1.x(vd1.r(pe1VarA), new e61(this, l31Var, 0), td1.f20333a);
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final ListenableFuture b(l31 l31Var, byte[] bArr, byte[] bArr2) {
        pe1 pe1VarA = ((z21) this.f14268f.zzb()).a(bArr);
        a71 a71Var = this.f14271i;
        a71Var.e(15307, pe1VarA);
        pe1 pe1VarA2 = this.f14266d.a(bArr2);
        a71Var.e(15305, pe1VarA2);
        return zw1.x(vd1.r(new pd1(ca1.z(new ListenableFuture[]{pe1VarA, pe1VarA2}), true)), new e61(this, l31Var, 1), td1.f20333a);
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final ListenableFuture zza() {
        return zw1.o(this.f14270h, new ns0(this, 7));
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final pe1 zzb() {
        z21 z21Var = this.f14263a;
        z21Var.getClass();
        pe1 pe1VarO = zw1.o(z21Var.f22477b, new ns0(z21Var, 4));
        this.f14271i.e(15302, pe1VarO);
        return pe1VarO;
    }

    @Override // com.google.android.gms.internal.ads.d61
    public final ListenableFuture zze() {
        z21 z21Var = this.f14263a;
        z21Var.getClass();
        gd1 gd1VarZ = zw1.z(vd1.r(zw1.o(z21Var.f22477b, new ns0(z21Var, 4))), new lx(this, 12), td1.f20333a);
        this.f14271i.e(15314, gd1VarZ);
        return gd1VarZ;
    }
}
