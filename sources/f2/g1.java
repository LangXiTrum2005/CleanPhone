package f2;

import android.net.Uri;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends i1.p0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f40344n = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f40349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f40350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f40351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f40352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f40353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f40354k;
    public final i1.y l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i1.u f40355m;

    static {
        q2 q2Var = new q2();
        oa.f0 f0Var = oa.j0.f47265b;
        n1 n1Var = n1.f47281e;
        List list = Collections.EMPTY_LIST;
        n1 n1Var2 = n1.f47281e;
        i1.t tVar = new i1.t();
        i1.w wVar = i1.w.f42711a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new i1.v(uri, null, null, list, n1Var2, C.TIME_UNSET);
        }
        q2Var.a();
        tVar.a();
        i1.a0 a0Var = i1.a0.B;
    }

    public g1(long j10, boolean z10, boolean z11, i1.y yVar) {
        this(j10, j10, 0L, 0L, z10, false, z11, null, yVar);
    }

    @Override // i1.p0
    public final int b(Object obj) {
        return f40344n.equals(obj) ? 0 : -1;
    }

    @Override // i1.p0
    public final i1.n0 f(int i10, i1.n0 n0Var, boolean z10) {
        go.k.m(i10, 1);
        Object obj = z10 ? f40344n : null;
        long j10 = -this.f40349f;
        n0Var.getClass();
        n0Var.h(null, obj, 0, this.f40347d, j10, i1.c.f42523c, false);
        return n0Var;
    }

    @Override // i1.p0
    public final int h() {
        return 1;
    }

    @Override // i1.p0
    public final Object l(int i10) {
        go.k.m(i10, 1);
        return f40344n;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // i1.p0
    public final i1.o0 m(int i10, i1.o0 o0Var, long j10) {
        long j11;
        go.k.m(i10, 1);
        long j12 = this.f40350g;
        boolean z10 = this.f40352i;
        if (!z10 || this.f40353j || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f40348e;
            if (j13 != C.TIME_UNSET) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        Object obj = i1.o0.f42614q;
        o0Var.b(this.l, this.f40354k, this.f40345b, this.f40346c, C.TIME_UNSET, this.f40351h, z10, this.f40355m, j11, this.f40348e, 0, this.f40349f);
        return o0Var;
    }

    @Override // i1.p0
    public final int o() {
        return 1;
    }

    public g1(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, i1.y yVar) {
        this(C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, j13, z10, z11, false, obj, yVar, z12 ? yVar.f42715c : null);
    }

    public g1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, Object obj, i1.y yVar, i1.u uVar) {
        this.f40345b = j10;
        this.f40346c = j11;
        this.f40347d = j12;
        this.f40348e = j13;
        this.f40349f = j14;
        this.f40350g = j15;
        this.f40351h = z10;
        this.f40352i = z11;
        this.f40353j = z12;
        this.f40354k = obj;
        yVar.getClass();
        this.l = yVar;
        this.f40355m = uVar;
    }
}
