package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f11798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11803f;

    public a2(c2 c2Var, long j10, long j11, long j12, long j13, long j14) {
        this.f11798a = c2Var;
        this.f11799b = j10;
        this.f11800c = j11;
        this.f11801d = j12;
        this.f11802e = j13;
        this.f11803f = j14;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        b3 b3Var = new b3(j10, b2.b(this.f11798a.c(j10), 0L, this.f11800c, this.f11801d, this.f11802e, this.f11803f));
        return new z2(b3Var, b3Var);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f11799b;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
