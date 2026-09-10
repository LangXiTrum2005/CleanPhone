package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nz1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r32 f18037t = new r32(new Object(), -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ci f18038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r32 f18039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dy1 f18043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v42 f18045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f18046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f18047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r32 f18048k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final cc f18051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f18052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f18053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f18054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f18055s;

    public nz1(ci ciVar, r32 r32Var, long j10, long j11, int i10, dy1 dy1Var, boolean z10, v42 v42Var, s sVar, List list, r32 r32Var2, boolean z11, int i11, int i12, cc ccVar, long j12, long j13, long j14, long j15) {
        this.f18038a = ciVar;
        this.f18039b = r32Var;
        this.f18040c = j10;
        this.f18041d = j11;
        this.f18042e = i10;
        this.f18043f = dy1Var;
        this.f18044g = z10;
        this.f18045h = v42Var;
        this.f18046i = sVar;
        this.f18047j = list;
        this.f18048k = r32Var2;
        this.l = z11;
        this.f18049m = i11;
        this.f18050n = i12;
        this.f18051o = ccVar;
        this.f18052p = j12;
        this.f18053q = j13;
        this.f18054r = j14;
        this.f18055s = j15;
    }

    public static nz1 a(s sVar) {
        gg ggVar = ci.f13168a;
        v42 v42Var = v42.f21027d;
        ya1 ya1Var = ya1.f22208e;
        cc ccVar = cc.f13129d;
        r32 r32Var = f18037t;
        return new nz1(ggVar, r32Var, C.TIME_UNSET, 0L, 1, null, false, v42Var, sVar, ya1Var, r32Var, false, 1, 0, ccVar, 0L, 0L, 0L, 0L);
    }

    public final nz1 b(r32 r32Var, long j10, long j11, long j12, long j13, v42 v42Var, s sVar, List list) {
        r32 r32Var2 = this.f18048k;
        boolean z10 = this.l;
        int i10 = this.f18049m;
        int i11 = this.f18050n;
        cc ccVar = this.f18051o;
        long j14 = this.f18052p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new nz1(this.f18038a, r32Var, j11, j12, this.f18042e, this.f18043f, this.f18044g, v42Var, sVar, list, r32Var2, z10, i10, i11, ccVar, j14, j13, j10, jElapsedRealtime);
    }

    public final nz1 c(ci ciVar) {
        return new nz1(ciVar, this.f18039b, this.f18040c, this.f18041d, this.f18042e, this.f18043f, this.f18044g, this.f18045h, this.f18046i, this.f18047j, this.f18048k, this.l, this.f18049m, this.f18050n, this.f18051o, this.f18052p, this.f18053q, this.f18054r, this.f18055s);
    }

    public final nz1 d(int i10) {
        return new nz1(this.f18038a, this.f18039b, this.f18040c, this.f18041d, i10, this.f18043f, this.f18044g, this.f18045h, this.f18046i, this.f18047j, this.f18048k, this.l, this.f18049m, this.f18050n, this.f18051o, this.f18052p, this.f18053q, this.f18054r, this.f18055s);
    }

    public final nz1 e(dy1 dy1Var) {
        return new nz1(this.f18038a, this.f18039b, this.f18040c, this.f18041d, this.f18042e, dy1Var, this.f18044g, this.f18045h, this.f18046i, this.f18047j, this.f18048k, this.l, this.f18049m, this.f18050n, this.f18051o, this.f18052p, this.f18053q, this.f18054r, this.f18055s);
    }

    public final nz1 f(boolean z10) {
        return new nz1(this.f18038a, this.f18039b, this.f18040c, this.f18041d, this.f18042e, this.f18043f, z10, this.f18045h, this.f18046i, this.f18047j, this.f18048k, this.l, this.f18049m, this.f18050n, this.f18051o, this.f18052p, this.f18053q, this.f18054r, this.f18055s);
    }

    public final nz1 g(r32 r32Var) {
        return new nz1(this.f18038a, this.f18039b, this.f18040c, this.f18041d, this.f18042e, this.f18043f, this.f18044g, this.f18045h, this.f18046i, this.f18047j, r32Var, this.l, this.f18049m, this.f18050n, this.f18051o, this.f18052p, this.f18053q, this.f18054r, this.f18055s);
    }

    public final nz1 h(int i10, int i11, boolean z10) {
        return new nz1(this.f18038a, this.f18039b, this.f18040c, this.f18041d, this.f18042e, this.f18043f, this.f18044g, this.f18045h, this.f18046i, this.f18047j, this.f18048k, z10, i10, i11, this.f18051o, this.f18052p, this.f18053q, this.f18054r, this.f18055s);
    }

    public final boolean i() {
        return this.f18042e == 3 && this.l && this.f18050n == 0;
    }
}
