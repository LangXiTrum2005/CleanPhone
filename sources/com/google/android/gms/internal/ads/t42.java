package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t42 implements q32, p32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q32 f20163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20165c;

    public t42(q32 q32Var, long j10) {
        this.f20163a = q32Var;
        this.f20164b = j10;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void a(long j10) {
        this.f20163a.a(j10 - this.f20164b);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final boolean b(bz1 bz1Var) {
        long j10 = bz1Var.f12944a;
        az1 az1Var = new az1();
        az1Var.f12555b = bz1Var.f12945b;
        az1Var.f12556c = bz1Var.f12946c;
        az1Var.f12554a = j10 - this.f20164b;
        return this.f20163a.b(new bz1(az1Var));
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long c(long j10) {
        q32 q32Var = this.f20163a;
        long j11 = this.f20164b;
        return q32Var.c(j10 - j11) + j11;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.p32, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.p32
    public final void d(q32 q32Var) {
        ?? r2 = this.f20165c;
        r2.getClass();
        r2.d(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.p32, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.p32
    public final /* bridge */ /* synthetic */ void e(p42 p42Var) {
        ?? r2 = this.f20165c;
        r2.getClass();
        r2.e(this);
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long f(long j10, wz1 wz1Var) {
        q32 q32Var = this.f20163a;
        long j11 = this.f20164b;
        return q32Var.f(j10 - j11, wz1Var) + j11;
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final void g(p32 p32Var, long j10) {
        this.f20165c = p32Var;
        this.f20163a.g(this, j10 - this.f20164b);
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long h(p[] pVarArr, boolean[] zArr, o42[] o42VarArr, boolean[] zArr2, long j10) {
        o42[] o42VarArr2 = new o42[o42VarArr.length];
        int i10 = 0;
        while (true) {
            o42 o42Var = null;
            if (i10 >= o42VarArr.length) {
                break;
            }
            s42 s42Var = (s42) o42VarArr[i10];
            if (s42Var != null) {
                o42Var = s42Var.f19837a;
            }
            o42VarArr2[i10] = o42Var;
            i10++;
        }
        long j11 = this.f20164b;
        long jH = this.f20163a.h(pVarArr, zArr, o42VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < o42VarArr.length; i11++) {
            o42 o42Var2 = o42VarArr2[i11];
            if (o42Var2 == null) {
                o42VarArr[i11] = null;
            } else {
                o42 o42Var3 = o42VarArr[i11];
                if (o42Var3 == null || ((s42) o42Var3).f19837a != o42Var2) {
                    o42VarArr[i11] = new s42(o42Var2, j11);
                }
            }
        }
        return jH + j11;
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final void i(long j10) {
        this.f20163a.i(j10 - this.f20164b);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final long zzb() {
        long jZzb = this.f20163a.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.f20164b;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final long zzc() {
        long jZzc = this.f20163a.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.f20164b;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final boolean zze() {
        return this.f20163a.zze();
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final void zzm() {
        this.f20163a.zzm();
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final v42 zzn() {
        return this.f20163a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long zzr() {
        long jZzr = this.f20163a.zzr();
        return jZzr == C.TIME_UNSET ? C.TIME_UNSET : jZzr + this.f20164b;
    }
}
