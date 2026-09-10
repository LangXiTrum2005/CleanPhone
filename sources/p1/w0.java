package p1;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.k1;
import java.util.List;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f2.c0 f48178u = new f2.c0(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1.p0 f48179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2.c0 f48180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f48184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f48185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k1 f48186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i2.v f48187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f48188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f2.c0 f48189k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f48190m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f48191n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i1.g0 f48192o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f48193p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f48194q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f48195r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f48196s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f48197t;

    public w0(i1.p0 p0Var, f2.c0 c0Var, long j10, long j11, int i10, h hVar, boolean z10, k1 k1Var, i2.v vVar, List list, f2.c0 c0Var2, boolean z11, int i11, int i12, i1.g0 g0Var, long j12, long j13, long j14, long j15, boolean z12) {
        this.f48179a = p0Var;
        this.f48180b = c0Var;
        this.f48181c = j10;
        this.f48182d = j11;
        this.f48183e = i10;
        this.f48184f = hVar;
        this.f48185g = z10;
        this.f48186h = k1Var;
        this.f48187i = vVar;
        this.f48188j = list;
        this.f48189k = c0Var2;
        this.l = z11;
        this.f48190m = i11;
        this.f48191n = i12;
        this.f48192o = g0Var;
        this.f48194q = j12;
        this.f48195r = j13;
        this.f48196s = j14;
        this.f48197t = j15;
        this.f48193p = z12;
    }

    public static w0 k(i2.v vVar) {
        i1.m0 m0Var = i1.p0.f42656a;
        k1 k1Var = k1.f40385d;
        n1 n1Var = n1.f47281e;
        i1.g0 g0Var = i1.g0.f42543d;
        f2.c0 c0Var = f48178u;
        return new w0(m0Var, c0Var, C.TIME_UNSET, 0L, 1, null, false, k1Var, vVar, n1Var, c0Var, false, 1, 0, g0Var, 0L, 0L, 0L, 0L, false);
    }

    public final w0 a() {
        return new w0(this.f48179a, this.f48180b, this.f48181c, this.f48182d, this.f48183e, this.f48184f, this.f48185g, this.f48186h, this.f48187i, this.f48188j, this.f48189k, this.l, this.f48190m, this.f48191n, this.f48192o, this.f48194q, this.f48195r, l(), SystemClock.elapsedRealtime(), this.f48193p);
    }

    public final w0 b(boolean z10) {
        return new w0(this.f48179a, this.f48180b, this.f48181c, this.f48182d, this.f48183e, this.f48184f, z10, this.f48186h, this.f48187i, this.f48188j, this.f48189k, this.l, this.f48190m, this.f48191n, this.f48192o, this.f48194q, this.f48195r, this.f48196s, this.f48197t, this.f48193p);
    }

    public final w0 c(f2.c0 c0Var) {
        return new w0(this.f48179a, this.f48180b, this.f48181c, this.f48182d, this.f48183e, this.f48184f, this.f48185g, this.f48186h, this.f48187i, this.f48188j, c0Var, this.l, this.f48190m, this.f48191n, this.f48192o, this.f48194q, this.f48195r, this.f48196s, this.f48197t, this.f48193p);
    }

    public final w0 d(f2.c0 c0Var, long j10, long j11, long j12, long j13, k1 k1Var, i2.v vVar, List list) {
        return new w0(this.f48179a, c0Var, j11, j12, this.f48183e, this.f48184f, this.f48185g, k1Var, vVar, list, this.f48189k, this.l, this.f48190m, this.f48191n, this.f48192o, this.f48194q, j13, j10, SystemClock.elapsedRealtime(), this.f48193p);
    }

    public final w0 e(int i10, int i11, boolean z10) {
        return new w0(this.f48179a, this.f48180b, this.f48181c, this.f48182d, this.f48183e, this.f48184f, this.f48185g, this.f48186h, this.f48187i, this.f48188j, this.f48189k, z10, i10, i11, this.f48192o, this.f48194q, this.f48195r, this.f48196s, this.f48197t, this.f48193p);
    }

    public final w0 f(h hVar) {
        return new w0(this.f48179a, this.f48180b, this.f48181c, this.f48182d, this.f48183e, hVar, this.f48185g, this.f48186h, this.f48187i, this.f48188j, this.f48189k, this.l, this.f48190m, this.f48191n, this.f48192o, this.f48194q, this.f48195r, this.f48196s, this.f48197t, this.f48193p);
    }

    public final w0 g(i1.g0 g0Var) {
        return new w0(this.f48179a, this.f48180b, this.f48181c, this.f48182d, this.f48183e, this.f48184f, this.f48185g, this.f48186h, this.f48187i, this.f48188j, this.f48189k, this.l, this.f48190m, this.f48191n, g0Var, this.f48194q, this.f48195r, this.f48196s, this.f48197t, this.f48193p);
    }

    public final w0 h(int i10) {
        return new w0(this.f48179a, this.f48180b, this.f48181c, this.f48182d, i10, this.f48184f, this.f48185g, this.f48186h, this.f48187i, this.f48188j, this.f48189k, this.l, this.f48190m, this.f48191n, this.f48192o, this.f48194q, this.f48195r, this.f48196s, this.f48197t, this.f48193p);
    }

    public final w0 i(boolean z10) {
        return new w0(this.f48179a, this.f48180b, this.f48181c, this.f48182d, this.f48183e, this.f48184f, this.f48185g, this.f48186h, this.f48187i, this.f48188j, this.f48189k, this.l, this.f48190m, this.f48191n, this.f48192o, this.f48194q, this.f48195r, this.f48196s, this.f48197t, z10);
    }

    public final w0 j(i1.p0 p0Var) {
        return new w0(p0Var, this.f48180b, this.f48181c, this.f48182d, this.f48183e, this.f48184f, this.f48185g, this.f48186h, this.f48187i, this.f48188j, this.f48189k, this.l, this.f48190m, this.f48191n, this.f48192o, this.f48194q, this.f48195r, this.f48196s, this.f48197t, this.f48193p);
    }

    public final long l() {
        long j10;
        long j11;
        if (!m()) {
            return this.f48196s;
        }
        do {
            j10 = this.f48197t;
            j11 = this.f48196s;
        } while (j10 != this.f48197t);
        return l1.y.M(l1.y.Z(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f48192o.f42544a)));
    }

    public final boolean m() {
        return this.f48183e == 3 && this.l && this.f48191n == 0;
    }
}
