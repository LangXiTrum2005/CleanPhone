package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l20 implements zy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.n f16674a = new androidx.datastore.preferences.protobuf.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16675b = 15000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16676c = 30000000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16677d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16678e = 5000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16680g;

    @Override // com.google.android.gms.internal.ads.zy1
    public final void a(xy1 xy1Var, p[] pVarArr) {
        int i10;
        this.f16679f = 0;
        for (p pVar : pVarArr) {
            if (pVar != null) {
                int i11 = this.f16679f;
                int i12 = pVar.zza().f17831c;
                if (i12 == 0) {
                    i10 = 144310272;
                } else if (i12 == 1) {
                    i10 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                } else if (i12 != 2) {
                    i10 = 131072;
                    if (i12 != 3 && i12 != 5 && i12 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i10 = 131072000;
                }
                this.f16679f = i11 + i10;
            }
        }
        this.f16674a.S0(this.f16679f);
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final boolean b(xy1 xy1Var) {
        long j10 = xy1Var.f22044f ? this.f16678e : this.f16677d;
        return j10 <= 0 || xy1Var.f22042d >= j10;
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final boolean c(xy1 xy1Var) {
        char c4;
        int i10;
        long j10 = xy1Var.f22042d;
        boolean z10 = true;
        if (j10 > this.f16676c) {
            c4 = 0;
        } else {
            c4 = j10 < this.f16675b ? (char) 2 : (char) 1;
        }
        androidx.datastore.preferences.protobuf.n nVar = this.f16674a;
        synchronized (nVar) {
            i10 = nVar.f4135c * C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i11 = this.f16679f;
        if (c4 != 2 && (c4 != 1 || !this.f16680g || i10 >= i11)) {
            z10 = false;
        }
        this.f16680g = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final void d(j02 j02Var) {
        this.f16679f = 0;
        this.f16680g = false;
        androidx.datastore.preferences.protobuf.n nVar = this.f16674a;
        synchronized (nVar) {
            nVar.S0(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final void e(j02 j02Var) {
        this.f16679f = 0;
        this.f16680g = false;
        androidx.datastore.preferences.protobuf.n nVar = this.f16674a;
        synchronized (nVar) {
            nVar.S0(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final u f(j02 j02Var) {
        return this.f16674a;
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final void g(j02 j02Var) {
        this.f16679f = 0;
        this.f16680g = false;
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final long zzf() {
        return 0L;
    }
}
