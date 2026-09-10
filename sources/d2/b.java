package d2;

import android.net.Uri;
import android.os.SystemClock;
import b2.w;
import bc.i;
import com.google.android.gms.internal.ads.a0;
import com.google.android.gms.internal.ads.bq0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ea.b0;
import g2.f;
import g2.j;
import g2.m;
import go.k;
import h3.g;
import h3.q;
import i1.p;
import i2.r;
import j2.n;
import j2.o;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l1.y;
import n1.h;
import oa.n1;
import p1.e1;
import p1.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f38622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.e[] f38624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f38625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f38626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e2.c f38627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f2.b f38629h;

    public b(o oVar, e2.c cVar, int i10, r rVar, h hVar, n nVar, boolean z10) {
        q[] qVarArr;
        this.f38622a = oVar;
        this.f38627f = cVar;
        this.f38623b = i10;
        this.f38626e = rVar;
        this.f38625d = hVar;
        e2.b bVar = cVar.f39043f[i10];
        this.f38624c = new g2.e[rVar.length()];
        for (int i11 = 0; i11 < this.f38624c.length; i11++) {
            int indexInTrackGroup = rVar.getIndexInTrackGroup(i11);
            p pVar = bVar.f39032j[indexInTrackGroup];
            if (pVar.f42647r != null) {
                e2.a aVar = cVar.f39042e;
                aVar.getClass();
                qVarArr = aVar.f39022c;
            } else {
                qVarArr = null;
            }
            q[] qVarArr2 = qVarArr;
            int i12 = bVar.f39023a;
            int i13 = i12 == 2 ? 4 : 0;
            long j10 = bVar.f39025c;
            long j11 = cVar.f39044g;
            this.f38624c[i11] = new g2.e(new g(nVar, !z10 ? 35 : 3, null, new h3.p(indexInTrackGroup, i12, j10, C.TIME_UNSET, j11, j11, pVar, 0, qVarArr2, i13, null, null), n1.f47281e, null), bVar.f39023a, pVar);
        }
    }

    @Override // g2.j
    public final long a(long j10, e1 e1Var) {
        e2.b bVar = this.f38627f.f39043f[this.f38623b];
        int iF = y.f(bVar.f39036o, j10, true);
        long[] jArr = bVar.f39036o;
        long j11 = jArr[iF];
        return e1Var.a(j10, j11, (j11 >= j10 || iF >= bVar.f39033k - 1) ? j11 : jArr[iF + 1]);
    }

    @Override // g2.j
    public final void c(k0 k0Var, long j10, List list, i iVar) {
        List list2;
        int iA;
        long jB;
        if (this.f38629h != null) {
            return;
        }
        e2.c cVar = this.f38627f;
        e2.b[] bVarArr = cVar.f39043f;
        int i10 = this.f38623b;
        e2.b bVar = bVarArr[i10];
        int i11 = bVar.f39033k;
        long[] jArr = bVar.f39036o;
        if (i11 == 0) {
            iVar.f5552b = !cVar.f39041d;
            return;
        }
        if (list.isEmpty()) {
            iA = y.f(jArr, j10, true);
            list2 = list;
        } else {
            list2 = list;
            iA = (int) (((m) list2.get(list.size() - 1)).a() - ((long) this.f38628g));
            if (iA < 0) {
                this.f38629h = new f2.b();
                return;
            }
        }
        if (iA >= bVar.f39033k) {
            iVar.f5552b = !this.f38627f.f39041d;
            return;
        }
        long j11 = k0Var.f48103a;
        long j12 = j10 - j11;
        e2.c cVar2 = this.f38627f;
        if (cVar2.f39041d) {
            e2.b bVar2 = cVar2.f39043f[i10];
            int i12 = bVar2.f39033k - 1;
            jB = (bVar2.b(i12) + bVar2.f39036o[i12]) - j11;
        } else {
            jB = -9223372036854775807L;
        }
        int length = this.f38626e.length();
        g2.n[] nVarArr = new g2.n[length];
        for (int i13 = 0; i13 < length; i13++) {
            this.f38626e.getIndexInTrackGroup(i13);
            nVarArr[i13] = new a(bVar, iA);
        }
        this.f38626e.b(j11, j12, jB, list2, nVarArr);
        long j13 = jArr[iA];
        long jB2 = bVar.b(iA) + j13;
        long j14 = list.isEmpty() ? j10 : -9223372036854775807L;
        int i14 = this.f38628g + iA;
        int selectedIndex = this.f38626e.getSelectedIndex();
        g2.e eVar = this.f38624c[selectedIndex];
        int indexInTrackGroup = this.f38626e.getIndexInTrackGroup(selectedIndex);
        List list3 = bVar.f39035n;
        p[] pVarArr = bVar.f39032j;
        k.t(pVarArr != null);
        k.t(list3 != null);
        k.t(iA < list3.size());
        String string = Integer.toString(pVarArr[indexInTrackGroup].f42640j);
        String string2 = ((Long) list3.get(iA)).toString();
        Uri uriQ = l1.a.q(bVar.l, bVar.f39034m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        SystemClock.elapsedRealtime();
        p selectedFormat = this.f38626e.getSelectedFormat();
        int selectionReason = this.f38626e.getSelectionReason();
        Object selectionData = this.f38626e.getSelectionData();
        Map map = Collections.EMPTY_MAP;
        k.o(uriQ, "The uri must be set.");
        iVar.f5553c = new g2.k(this.f38625d, new n1.k(uriQ, 1, null, map, 0L, -1L, null, 0), selectedFormat, selectionReason, selectionData, j13, jB2, j14, C.TIME_UNSET, i14, 1, j13, eVar);
    }

    @Override // g2.j
    public final boolean d(f fVar, boolean z10, w wVar, b0 b0Var) {
        bq0 bq0VarG = com.bumptech.glide.c.g(this.f38626e);
        b0Var.getClass();
        a0 a0VarC = b0.c(bq0VarG, wVar);
        if (!z10 || a0VarC == null || a0VarC.f11791a != 2) {
            return false;
        }
        r rVar = this.f38626e;
        return rVar.c(rVar.f(fVar.f41369d), a0VarC.f11792b);
    }

    @Override // g2.j
    public final boolean e(long j10, f fVar, List list) {
        if (this.f38629h != null) {
            return false;
        }
        return this.f38626e.d(j10, fVar, list);
    }

    @Override // g2.j
    public final int getPreferredQueueSize(long j10, List list) {
        return (this.f38629h != null || this.f38626e.length() < 2) ? list.size() : this.f38626e.evaluateQueueSize(j10, list);
    }

    @Override // g2.j
    public final void maybeThrowError() throws f2.b {
        f2.b bVar = this.f38629h;
        if (bVar != null) {
            throw bVar;
        }
        this.f38622a.maybeThrowError();
    }

    @Override // g2.j
    public final void release() {
        for (g2.e eVar : this.f38624c) {
            eVar.f41356a.release();
        }
    }

    @Override // g2.j
    public final void b(f fVar) {
    }
}
