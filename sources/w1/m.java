package w1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.Map;
import oa.j0;
import oa.o0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f52834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f52835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f52836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f52837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f52838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f52839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f52840k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f52841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f52842n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f52843o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f52844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i1.m f52845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0 f52846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j0 f52847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0 f52848t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f52849u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f52850v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j0 f52851w;

    public m(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, i1.m mVar, List list2, List list3, l lVar, Map map, List list4) {
        super(str, list, z12);
        this.f52833d = i10;
        this.f52837h = j11;
        this.f52836g = z10;
        this.f52838i = z11;
        this.f52839j = i11;
        this.f52840k = j12;
        this.l = i12;
        this.f52841m = j13;
        this.f52842n = j14;
        this.f52843o = z13;
        this.f52844p = z14;
        this.f52845q = mVar;
        this.f52846r = j0.x(list2);
        this.f52847s = j0.x(list3);
        this.f52848t = o0.e(map);
        this.f52851w = j0.x(list4);
        if (!list3.isEmpty()) {
            h hVar = (h) oa.q.k(list3);
            this.f52849u = hVar.f52821e + hVar.f52819c;
        } else if (list2.isEmpty()) {
            this.f52849u = 0L;
        } else {
            j jVar = (j) oa.q.k(list2);
            this.f52849u = jVar.f52821e + jVar.f52819c;
        }
        this.f52834e = j10 != C.TIME_UNSET ? j10 >= 0 ? Math.min(this.f52849u, j10) : Math.max(0L, this.f52849u + j10) : C.TIME_UNSET;
        this.f52835f = j10 >= 0;
        this.f52850v = lVar;
    }

    @Override // a2.a
    public final Object copy(List list) {
        return this;
    }
}
