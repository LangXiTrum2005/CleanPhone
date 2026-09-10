package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r5 implements x5, a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f19386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f19389k;

    public r5(long j10, long j11, int i10, int i11, boolean z10) {
        long jMax;
        this.f19379a = j10;
        this.f19380b = j11;
        this.f19381c = i11 == -1 ? 1 : i11;
        this.f19383e = i10;
        this.f19385g = z10;
        if (j10 == -1) {
            this.f19382d = -1L;
            jMax = C.TIME_UNSET;
        } else {
            long j12 = j10 - j11;
            this.f19382d = j12;
            jMax = (Math.max(0L, j12) * 8000000) / ((long) i10);
        }
        this.f19384f = jMax;
        this.f19386h = j11;
        this.f19387i = i10;
        this.f19388j = i11;
        this.f19389k = j10 == -1 ? -1L : j10;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final long a(long j10) {
        return (Math.max(0L, j10 - this.f19380b) * 8000000) / ((long) this.f19383e);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        long j11 = this.f19382d;
        long j12 = this.f19380b;
        if (j11 == -1) {
            b3 b3Var = new b3(0L, j12);
            return new z2(b3Var, b3Var);
        }
        int i10 = this.f19383e;
        long j13 = this.f19381c;
        long jMin = (((((long) i10) * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L) + j12;
        long jMax2 = (Math.max(0L, jMax - j12) * 8000000) / ((long) i10);
        b3 b3Var2 = new b3(jMax2, jMax);
        if (j11 != -1 && jMax2 < j10) {
            long j14 = jMax + j13;
            if (j14 < this.f19379a) {
                return new z2(b3Var2, new b3((Math.max(0L, j14 - j12) * 8000000) / ((long) i10), j14));
            }
        }
        return new z2(b3Var2, b3Var2);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f19384f;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return this.f19382d != -1;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final long zzg() {
        return this.f19389k;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final int zzh() {
        return this.f19387i;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzj() {
        return this.f19385g;
    }
}
