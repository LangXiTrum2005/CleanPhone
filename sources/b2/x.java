package b2;

import android.net.Uri;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.b1;
import f2.c1;
import f2.k1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.SocketFactory;
import oa.n1;
import oa.s1;
import p1.e1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements f2.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.e f5412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f5413b = l1.y.q(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f5414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f5415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f5417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final am.e f5418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f5419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f2.z f5420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n1 f5421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IOException f5422k;
    public z l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5432v;

    public x(v9.e eVar, d dVar, Uri uri, am.e eVar2, String str, SocketFactory socketFactory) {
        this.f5412a = eVar;
        this.f5419h = dVar;
        this.f5418g = eVar2;
        t tVar = new t(this, 0);
        this.f5414c = tVar;
        this.f5415d = new q(tVar, tVar, str, uri, socketFactory);
        this.f5416e = new ArrayList();
        this.f5417f = new ArrayList();
        this.f5424n = C.TIME_UNSET;
        this.f5423m = C.TIME_UNSET;
        this.f5425o = C.TIME_UNSET;
    }

    public static void b(x xVar) {
        ArrayList arrayList = xVar.f5416e;
        xVar.f5426p = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            xVar.f5426p &= ((v) arrayList.get(i10)).f5406d;
        }
    }

    public static void d(x xVar) {
        ArrayList arrayList = xVar.f5416e;
        if (xVar.f5428r || xVar.f5429s) {
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((v) arrayList.get(i11)).f5405c.w() == null) {
                return;
            }
        }
        xVar.f5429s = true;
        oa.j0 j0VarX = oa.j0.x(arrayList);
        oa.q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i12 = 0;
        while (i10 < j0VarX.size()) {
            b1 b1Var = ((v) j0VarX.get(i10)).f5405c;
            String string = Integer.toString(i10);
            i1.p pVarW = b1Var.w();
            pVarW.getClass();
            i1.q0 q0Var = new i1.q0(string, pVarW);
            int i13 = i12 + 1;
            int iF = oa.b0.f(objArrCopyOf.length, i13);
            if (iF > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
            }
            objArrCopyOf[i12] = q0Var;
            i10++;
            i12 = i13;
        }
        xVar.f5421j = oa.j0.t(i12, objArrCopyOf);
        f2.z zVar = xVar.f5420i;
        zVar.getClass();
        zVar.j(xVar);
    }

    public static void h(x xVar) {
        ArrayList arrayList = xVar.f5417f;
        ArrayList arrayList2 = xVar.f5416e;
        xVar.f5432v = true;
        q qVar = xVar.f5415d;
        qVar.getClass();
        try {
            qVar.close();
            g0 g0Var = new g0(new eb.d0(qVar));
            qVar.f5378i = g0Var;
            g0Var.a(qVar.h(qVar.f5377h));
            qVar.f5380k = null;
            qVar.f5385q = false;
            qVar.f5382n = null;
        } catch (IOException e10) {
            qVar.f5371b.c(new z(e10));
        }
        d dVarC = xVar.f5419h.c();
        if (dVarC == null) {
            xVar.l = new z("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            v vVar = (v) arrayList2.get(i10);
            boolean z10 = vVar.f5406d;
            u uVar = vVar.f5403a;
            if (z10) {
                arrayList3.add(vVar);
            } else {
                v vVar2 = new v(xVar, uVar.f5399a, i10, dVarC);
                arrayList3.add(vVar2);
                u uVar2 = vVar2.f5403a;
                vVar2.f5404b.e(uVar2.f5400b, xVar.f5414c, 0);
                if (arrayList.contains(uVar)) {
                    arrayList4.add(uVar2);
                }
            }
        }
        oa.j0 j0VarX = oa.j0.x(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList.clear();
        arrayList.addAll(arrayList4);
        for (int i11 = 0; i11 < j0VarX.size(); i11++) {
            ((v) j0VarX.get(i11)).a();
        }
    }

    @Override // f2.a0
    public final long c(i2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        ArrayList arrayList;
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (c1VarArr[i10] != null && (rVarArr[i10] == null || !zArr[i10])) {
                c1VarArr[i10] = null;
            }
        }
        ArrayList arrayList2 = this.f5417f;
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            int length = rVarArr.length;
            arrayList = this.f5416e;
            if (i11 >= length) {
                break;
            }
            i2.r rVar = rVarArr[i11];
            if (rVar != null) {
                i1.q0 trackGroup = rVar.getTrackGroup();
                n1 n1Var = this.f5421j;
                n1Var.getClass();
                int iIndexOf = n1Var.indexOf(trackGroup);
                v vVar = (v) arrayList.get(iIndexOf);
                vVar.getClass();
                arrayList2.add(vVar.f5403a);
                if (this.f5421j.contains(trackGroup) && c1VarArr[i11] == null) {
                    c1VarArr[i11] = new w(iIndexOf, 0, this);
                    zArr2[i11] = true;
                }
            }
            i11++;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            v vVar2 = (v) arrayList.get(i12);
            if (!arrayList2.contains(vVar2.f5403a)) {
                vVar2.a();
            }
        }
        this.f5430t = true;
        if (j10 != 0) {
            this.f5423m = j10;
            this.f5424n = j10;
            this.f5425o = j10;
        }
        j();
        return j10;
    }

    @Override // f2.a0
    public final void e(f2.z zVar, long j10) {
        q qVar = this.f5415d;
        this.f5420i = zVar;
        try {
            qVar.getClass();
            try {
                qVar.f5378i.a(qVar.h(qVar.f5377h));
                p pVar = qVar.f5376g;
                pVar.o(pVar.k(4, qVar.f5380k, s1.f47307g, qVar.f5377h));
            } catch (IOException e10) {
                l1.y.h(qVar.f5378i);
                throw e10;
            }
        } catch (IOException e11) {
            this.f5422k = e11;
            l1.y.h(qVar);
        }
    }

    @Override // f2.e1
    public final boolean f(p1.k0 k0Var) {
        return isLoading();
    }

    @Override // f2.a0
    public final void g(long j10) throws Throwable {
        if (i()) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5416e;
            if (i10 >= arrayList.size()) {
                return;
            }
            v vVar = (v) arrayList.get(i10);
            if (!vVar.f5406d) {
                vVar.f5405c.j(j10, true);
            }
            i10++;
        }
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        if (!this.f5426p) {
            ArrayList arrayList = this.f5416e;
            if (!arrayList.isEmpty()) {
                long j10 = this.f5423m;
                if (j10 != C.TIME_UNSET) {
                    return j10;
                }
                boolean z10 = true;
                long jMin = Long.MAX_VALUE;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    v vVar = (v) arrayList.get(i10);
                    if (!vVar.f5406d) {
                        jMin = Math.min(jMin, vVar.f5405c.q());
                        z10 = false;
                    }
                }
                if (z10 || jMin == Long.MIN_VALUE) {
                    return 0L;
                }
                return jMin;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // f2.a0
    public final k1 getTrackGroups() {
        go.k.t(this.f5429s);
        n1 n1Var = this.f5421j;
        n1Var.getClass();
        return new k1((i1.q0[]) n1Var.toArray(new i1.q0[0]));
    }

    public final boolean i() {
        return this.f5424n != C.TIME_UNSET;
    }

    @Override // f2.e1
    public final boolean isLoading() {
        if (this.f5426p) {
            return false;
        }
        int i10 = this.f5415d.f5383o;
        return i10 == 2 || i10 == 1;
    }

    public final void j() {
        ArrayList arrayList;
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            arrayList = this.f5417f;
            if (i10 >= arrayList.size()) {
                break;
            }
            z10 &= ((u) arrayList.get(i10)).f5401c != null;
            i10++;
        }
        if (z10 && this.f5430t) {
            q qVar = this.f5415d;
            qVar.f5374e.addAll(arrayList);
            qVar.d();
        }
    }

    @Override // f2.a0
    public final void maybeThrowPrepareError() throws IOException {
        IOException iOException = this.f5422k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // f2.a0
    public final long readDiscontinuity() {
        if (!this.f5427q) {
            return C.TIME_UNSET;
        }
        this.f5427q = false;
        return 0L;
    }

    @Override // f2.a0
    public final long seekToUs(long j10) throws Throwable {
        if (getBufferedPositionUs() == 0 && !this.f5432v) {
            this.f5425o = j10;
            return j10;
        }
        g(j10);
        this.f5423m = j10;
        if (i()) {
            q qVar = this.f5415d;
            int i10 = qVar.f5383o;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                this.f5424n = j10;
                qVar.j(j10);
                return j10;
            }
        } else {
            ArrayList arrayList = this.f5416e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (!((v) arrayList.get(i11)).f5405c.G(j10, this.f5426p)) {
                    this.f5424n = j10;
                    if (this.f5426p) {
                        for (int i12 = 0; i12 < this.f5416e.size(); i12++) {
                            v vVar = (v) this.f5416e.get(i12);
                            go.k.t(vVar.f5406d);
                            vVar.f5406d = false;
                            b(vVar.f5408f);
                            vVar.f5404b.e(vVar.f5403a.f5400b, vVar.f5408f.f5414c, 0);
                        }
                        if (this.f5432v) {
                            this.f5415d.k(l1.y.Z(j10));
                        } else {
                            this.f5415d.j(j10);
                        }
                    } else {
                        this.f5415d.j(j10);
                    }
                    for (int i13 = 0; i13 < this.f5416e.size(); i13++) {
                        v vVar2 = (v) this.f5416e.get(i13);
                        if (!vVar2.f5406d) {
                            g gVar = vVar2.f5403a.f5400b.f5259h;
                            gVar.getClass();
                            synchronized (gVar.f5270e) {
                                gVar.f5276k = true;
                            }
                            vVar2.f5405c.E(false);
                            vVar2.f5405c.f40297t = j10;
                        }
                    }
                    break;
                }
            }
        }
        return j10;
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
    }

    @Override // f2.a0
    public final long a(long j10, e1 e1Var) {
        return j10;
    }
}
