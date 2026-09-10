package i1;

import android.net.Uri;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f42614q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y f42615r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f42617b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f42619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f42621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f42622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u f42625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42626k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f42627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f42629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f42630p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f42616a = f42614q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f42618c = f42615r;

    static {
        q2 q2Var = new q2();
        oa.f0 f0Var = oa.j0.f47265b;
        n1 n1Var = n1.f47281e;
        List list = Collections.EMPTY_LIST;
        n1 n1Var2 = n1.f47281e;
        t tVar = new t();
        w wVar = w.f42711a;
        Uri uri = Uri.EMPTY;
        f42615r = new y("androidx.media3.common.Timeline", new s(q2Var), uri != null ? new v(uri, null, null, list, n1Var2, C.TIME_UNSET) : null, new u(tVar), a0.B, wVar);
        d5.u.m(1, 2, 3, 4, 5);
        d5.u.m(6, 7, 8, 9, 10);
        l1.y.G(11);
        l1.y.G(12);
        l1.y.G(13);
    }

    public final boolean a() {
        return this.f42625j != null;
    }

    public final void b(y yVar, Object obj, long j10, long j11, long j12, boolean z10, boolean z11, u uVar, long j13, long j14, int i10, long j15) {
        this.f42616a = f42614q;
        this.f42618c = yVar != null ? yVar : f42615r;
        if (yVar != null) {
            v vVar = yVar.f42714b;
        }
        this.f42617b = null;
        this.f42619d = obj;
        this.f42620e = j10;
        this.f42621f = j11;
        this.f42622g = j12;
        this.f42623h = z10;
        this.f42624i = z11;
        this.f42625j = uVar;
        this.l = j13;
        this.f42627m = j14;
        this.f42628n = 0;
        this.f42629o = i10;
        this.f42630p = j15;
        this.f42626k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o0.class.equals(obj.getClass())) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Objects.equals(this.f42616a, o0Var.f42616a) && Objects.equals(this.f42618c, o0Var.f42618c) && Objects.equals(this.f42619d, o0Var.f42619d) && Objects.equals(this.f42625j, o0Var.f42625j) && this.f42620e == o0Var.f42620e && this.f42621f == o0Var.f42621f && this.f42622g == o0Var.f42622g && this.f42623h == o0Var.f42623h && this.f42624i == o0Var.f42624i && this.f42626k == o0Var.f42626k && this.l == o0Var.l && this.f42627m == o0Var.f42627m && this.f42628n == o0Var.f42628n && this.f42629o == o0Var.f42629o && this.f42630p == o0Var.f42630p;
    }

    public final int hashCode() {
        int iHashCode = (this.f42618c.hashCode() + ((this.f42616a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f42619d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        u uVar = this.f42625j;
        int iHashCode3 = (iHashCode2 + (uVar != null ? uVar.hashCode() : 0)) * 31;
        long j10 = this.f42620e;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f42621f;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f42622g;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f42623h ? 1 : 0)) * 31) + (this.f42624i ? 1 : 0)) * 31) + (this.f42626k ? 1 : 0)) * 31;
        long j13 = this.l;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f42627m;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f42628n) * 31) + this.f42629o) * 31;
        long j15 = this.f42630p;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }
}
