package d2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import ea.b0;
import f2.a0;
import f2.c1;
import f2.d1;
import f2.i0;
import f2.k1;
import f2.n;
import g2.i;
import i1.d0;
import i1.p;
import i1.q0;
import i2.r;
import j2.o;
import java.util.AbstractList;
import java.util.ArrayList;
import n1.g;
import n1.z;
import oa.f0;
import oa.j0;
import oa.n1;
import oa.q;
import p1.e1;
import p1.k0;
import t6.l;
import u1.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a0, d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f38631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f38632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f38633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f38634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f38635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f38636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f38637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v9.e f38638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f38639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f38640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f2.z f38641k;
    public e2.c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i[] f38642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f38643n;

    public d(e2.c cVar, l lVar, z zVar, b0 b0Var, h hVar, i0 i0Var, b0 b0Var2, i0 i0Var2, o oVar, v9.e eVar) {
        this.l = cVar;
        this.f38631a = lVar;
        this.f38632b = zVar;
        this.f38633c = oVar;
        this.f38634d = hVar;
        this.f38635e = i0Var;
        this.f38636f = b0Var2;
        this.f38637g = i0Var2;
        this.f38638h = eVar;
        this.f38640j = b0Var;
        q0[] q0VarArr = new q0[cVar.f39043f.length];
        int i10 = 0;
        while (true) {
            e2.b[] bVarArr = cVar.f39043f;
            if (i10 >= bVarArr.length) {
                this.f38639i = new k1(q0VarArr);
                this.f38642m = new i[0];
                b0Var.getClass();
                f0 f0Var = j0.f47265b;
                n1 n1Var = n1.f47281e;
                this.f38643n = new n(n1Var, n1Var);
                return;
            }
            p[] pVarArr = bVarArr[i10].f39032j;
            p[] pVarArr2 = new p[pVarArr.length];
            for (int i11 = 0; i11 < pVarArr.length; i11++) {
                p pVar = pVarArr[i11];
                i1.o oVarA = pVar.a();
                oVarA.N = hVar.d(pVar);
                p pVar2 = new p(oVarA);
                if (lVar.f50549b && ((j2.n) lVar.f50551d).a(pVar2)) {
                    i1.o oVarA2 = pVar2.a();
                    oVarA2.f42600m = d0.n("application/x-media3-cues");
                    oVarA2.K = ((j2.n) lVar.f50551d).h(pVar2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(pVar2.f42643n);
                    String str = pVar2.f42641k;
                    sb2.append(str != null ? " ".concat(str) : "");
                    oVarA2.f42598j = sb2.toString();
                    oVarA2.f42605r = Long.MAX_VALUE;
                    pVar2 = new p(oVarA2);
                }
                pVarArr2[i11] = pVar2;
            }
            q0VarArr[i10] = new q0(Integer.toString(i10), pVarArr2);
            i10++;
        }
    }

    @Override // f2.a0
    public final long a(long j10, e1 e1Var) {
        for (i iVar : this.f38642m) {
            if (iVar.f41380a == 2) {
                return iVar.f41384e.a(j10, e1Var);
            }
        }
        return j10;
    }

    @Override // f2.a0
    public final long c(r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        ArrayList arrayList;
        int i10;
        r rVar;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (i11 < rVarArr.length) {
            c1 c1Var = c1VarArr[i11];
            if (c1Var != null) {
                i iVar = (i) c1Var;
                r rVar2 = rVarArr[i11];
                if (rVar2 == null || !zArr[i11]) {
                    iVar.q(null);
                    c1VarArr[i11] = null;
                } else {
                    ((b) iVar.f41384e).f38626e = rVar2;
                    arrayList2.add(iVar);
                }
            }
            if (c1VarArr[i11] != null || (rVar = rVarArr[i11]) == null) {
                arrayList = arrayList2;
                i10 = i11;
            } else {
                int iB = this.f38639i.b(rVar.getTrackGroup());
                e2.c cVar = this.l;
                l lVar = this.f38631a;
                n1.h hVarCreateDataSource = ((g) lVar.f50550c).createDataSource();
                z zVar = this.f38632b;
                if (zVar != null) {
                    hVarCreateDataSource.c(zVar);
                }
                i10 = i11;
                arrayList = arrayList2;
                i iVar2 = new i(this.l.f39043f[iB].f39023a, null, null, new b(this.f38633c, cVar, iB, rVar, hVarCreateDataSource, (j2.n) lVar.f50551d, lVar.f50549b), this, this.f38638h, j10, this.f38634d, this.f38635e, this.f38636f, this.f38637g, false, null);
                arrayList.add(iVar2);
                c1VarArr[i10] = iVar2;
                zArr2[i10] = true;
            }
            i11 = i10 + 1;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        i[] iVarArr = new i[arrayList3.size()];
        this.f38642m = iVarArr;
        arrayList3.toArray(iVarArr);
        AbstractList abstractListZ = q.z(arrayList3, new c(0));
        this.f38640j.getClass();
        this.f38643n = new n(arrayList3, abstractListZ);
        return j10;
    }

    @Override // f2.a0
    public final void e(f2.z zVar, long j10) {
        this.f38641k = zVar;
        zVar.j(this);
    }

    @Override // f2.e1
    public final boolean f(k0 k0Var) {
        return this.f38643n.f(k0Var);
    }

    @Override // f2.a0
    public final void g(long j10) throws Throwable {
        for (i iVar : this.f38642m) {
            iVar.g(j10);
        }
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        return this.f38643n.getBufferedPositionUs();
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        return this.f38643n.getNextLoadPositionUs();
    }

    @Override // f2.a0
    public final k1 getTrackGroups() {
        return this.f38639i;
    }

    @Override // f2.d1
    public final void h(f2.e1 e1Var) {
        f2.z zVar = this.f38641k;
        zVar.getClass();
        zVar.h(this);
    }

    @Override // f2.e1
    public final boolean isLoading() {
        return this.f38643n.isLoading();
    }

    @Override // f2.a0
    public final void maybeThrowPrepareError() {
        this.f38633c.maybeThrowError();
    }

    @Override // f2.a0
    public final long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
        this.f38643n.reevaluateBuffer(j10);
    }

    @Override // f2.a0
    public final long seekToUs(long j10) throws Throwable {
        for (i iVar : this.f38642m) {
            iVar.r(j10);
        }
        return j10;
    }
}
