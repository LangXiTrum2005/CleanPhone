package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k32 implements q32, p32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r32 f16297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f16299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a32 f16300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q32 f16301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p32 f16302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16303g = C.TIME_UNSET;

    public k32(r32 r32Var, u uVar, long j10) {
        this.f16297a = r32Var;
        this.f16299c = uVar;
        this.f16298b = j10;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void a(long j10) {
        q32 q32Var = this.f16301e;
        String str = uu0.f20901a;
        q32Var.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final boolean b(bz1 bz1Var) {
        q32 q32Var = this.f16301e;
        return q32Var != null && q32Var.b(bz1Var);
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long c(long j10) {
        q32 q32Var = this.f16301e;
        String str = uu0.f20901a;
        return q32Var.c(j10);
    }

    @Override // com.google.android.gms.internal.ads.p32
    public final void d(q32 q32Var) {
        p32 p32Var = this.f16302f;
        String str = uu0.f20901a;
        p32Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.p32
    public final /* bridge */ /* synthetic */ void e(p42 p42Var) {
        p32 p32Var = this.f16302f;
        String str = uu0.f20901a;
        p32Var.e(this);
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long f(long j10, wz1 wz1Var) {
        q32 q32Var = this.f16301e;
        String str = uu0.f20901a;
        return q32Var.f(j10, wz1Var);
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final void g(p32 p32Var, long j10) {
        this.f16302f = p32Var;
        q32 q32Var = this.f16301e;
        if (q32Var != null) {
            long j11 = this.f16303g;
            if (j11 == C.TIME_UNSET) {
                j11 = this.f16298b;
            }
            q32Var.g(this, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long h(p[] pVarArr, boolean[] zArr, o42[] o42VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f16303g;
        if (j11 != C.TIME_UNSET && j10 == this.f16298b) {
            j10 = j11;
        }
        this.f16303g = C.TIME_UNSET;
        q32 q32Var = this.f16301e;
        String str = uu0.f20901a;
        return q32Var.h(pVarArr, zArr, o42VarArr, zArr2, j10);
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final void i(long j10) {
        q32 q32Var = this.f16301e;
        String str = uu0.f20901a;
        q32Var.i(j10);
    }

    public final void j(r32 r32Var) {
        long j10 = this.f16303g;
        if (j10 == C.TIME_UNSET) {
            j10 = this.f16298b;
        }
        a32 a32Var = this.f16300d;
        a32Var.getClass();
        q32 q32VarC = a32Var.c(r32Var, this.f16299c, j10);
        this.f16301e = q32VarC;
        if (this.f16302f != null) {
            q32VarC.g(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final long zzb() {
        q32 q32Var = this.f16301e;
        String str = uu0.f20901a;
        return q32Var.zzb();
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final long zzc() {
        q32 q32Var = this.f16301e;
        String str = uu0.f20901a;
        return q32Var.zzc();
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final boolean zze() {
        q32 q32Var = this.f16301e;
        return q32Var != null && q32Var.zze();
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final void zzm() {
        q32 q32Var = this.f16301e;
        if (q32Var != null) {
            q32Var.zzm();
            return;
        }
        a32 a32Var = this.f16300d;
        if (a32Var != null) {
            a32Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final v42 zzn() {
        q32 q32Var = this.f16301e;
        String str = uu0.f20901a;
        return q32Var.zzn();
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long zzr() {
        q32 q32Var = this.f16301e;
        String str = uu0.f20901a;
        return q32Var.zzr();
    }
}
