package g2;

import b2.w;
import com.google.android.gms.internal.ads.a0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ea.b0;
import eb.d0;
import f2.b1;
import f2.c1;
import f2.d1;
import f2.e1;
import f2.i0;
import f2.u;
import i1.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m0.s1;
import n1.y;
import p1.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c1, e1, j2.h, j2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f41381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p[] f41382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f41383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f41384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f41385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f41386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f41387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j2.m f41388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bc.i f41389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f41390k;
    public final List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b1 f41391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b1[] f41392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d0 f41393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f41394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p f41395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f41396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f41397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f41398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f41399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f41400v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f41401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f41402x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f41403y;

    public i(int i10, int[] iArr, p[] pVarArr, j jVar, d1 d1Var, v9.e eVar, long j10, u1.h hVar, i0 i0Var, b0 b0Var, i0 i0Var2, boolean z10, k2.a aVar) {
        this.f41380a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f41381b = iArr;
        this.f41382c = pVarArr == null ? new p[0] : pVarArr;
        this.f41384e = jVar;
        this.f41385f = d1Var;
        this.f41386g = i0Var2;
        this.f41387h = b0Var;
        this.f41401w = z10;
        this.f41388i = aVar != null ? new j2.m(aVar) : new j2.m("ChunkSampleStream");
        this.f41389j = new bc.i(7, false);
        ArrayList arrayList = new ArrayList();
        this.f41390k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f41392n = new b1[length];
        this.f41383d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        b1[] b1VarArr = new b1[i12];
        hVar.getClass();
        b1 b1Var = new b1(eVar, hVar, i0Var);
        this.f41391m = b1Var;
        iArr2[0] = i10;
        b1VarArr[0] = b1Var;
        while (i11 < length) {
            b1 b1Var2 = new b1(eVar, null, null);
            this.f41392n[i11] = b1Var2;
            int i13 = i11 + 1;
            b1VarArr[i13] = b1Var2;
            iArr2[i13] = this.f41381b[i11];
            i11 = i13;
        }
        this.f41393o = new d0((Object) iArr2, false, (Object) b1VarArr, 15);
        this.f41397s = j10;
        this.f41398t = j10;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [f2.d1, java.lang.Object] */
    @Override // j2.h
    public final void b(j2.j jVar, long j10, long j11, boolean z10) {
        f fVar = (f) jVar;
        this.f41394p = null;
        this.f41400v = null;
        long j12 = fVar.f41366a;
        n1.k kVar = fVar.f41367b;
        y yVar = fVar.f41374i;
        u uVar = new u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        this.f41387h.getClass();
        this.f41386g.c(uVar, fVar.f41368c, this.f41380a, fVar.f41369d, fVar.f41370e, fVar.f41371f, fVar.f41372g, fVar.f41373h);
        if (z10) {
            return;
        }
        if (m()) {
            this.f41391m.E(false);
            for (b1 b1Var : this.f41392n) {
                b1Var.E(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.f41390k;
            i(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f41397s = this.f41398t;
            }
        }
        this.f41385f.h(this);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [f2.d1, java.lang.Object] */
    @Override // j2.h
    public final a0 d(j2.j jVar, long j10, long j11, IOException iOException, int i10) {
        a0 a0Var;
        f fVar = (f) jVar;
        long j12 = fVar.f41374i.f46417b;
        boolean z10 = fVar instanceof a;
        ArrayList arrayList = this.f41390k;
        int size = arrayList.size() - 1;
        boolean z11 = (j12 != 0 && z10 && l(size)) ? false : true;
        n1.k kVar = fVar.f41367b;
        y yVar = fVar.f41374i;
        boolean z12 = z11;
        u uVar = new u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, j12);
        l1.y.Z(fVar.f41372g);
        l1.y.Z(fVar.f41373h);
        w wVar = new w(i10, 14, iOException);
        j jVar2 = this.f41384e;
        b0 b0Var = this.f41387h;
        if (!jVar2.d(fVar, z12, wVar, b0Var)) {
            a0Var = null;
        } else if (z12) {
            if (z10) {
                go.k.t(i(size) == fVar);
                if (arrayList.isEmpty()) {
                    this.f41397s = this.f41398t;
                }
            }
            a0Var = j2.m.f43672e;
        } else {
            l1.a.s("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            a0Var = null;
        }
        if (a0Var == null) {
            b0Var.getClass();
            long jK = b0.k(wVar);
            a0Var = jK != C.TIME_UNSET ? new a0(jK, 0, false) : j2.m.f43673f;
        }
        boolean zA = a0Var.a();
        this.f41386g.f(uVar, fVar.f41368c, this.f41380a, fVar.f41369d, fVar.f41370e, fVar.f41371f, fVar.f41372g, fVar.f41373h, iOException, !zA);
        if (!zA) {
            this.f41394p = null;
            b0Var.getClass();
            this.f41385f.h(this);
        }
        return a0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // f2.e1
    public final boolean f(k0 k0Var) {
        long j10;
        List list;
        if (!this.f41403y) {
            j2.m mVar = this.f41388i;
            if (!mVar.c() && !mVar.b()) {
                boolean zM = m();
                if (zM) {
                    list = Collections.EMPTY_LIST;
                    j10 = this.f41397s;
                } else {
                    j10 = k().f41373h;
                    list = this.l;
                }
                this.f41384e.c(k0Var, j10, list, this.f41389j);
                bc.i iVar = this.f41389j;
                boolean z10 = iVar.f5552b;
                f fVar = (f) iVar.f5553c;
                iVar.f5553c = null;
                iVar.f5552b = false;
                if (z10) {
                    this.f41397s = C.TIME_UNSET;
                    this.f41403y = true;
                    return true;
                }
                if (fVar != null) {
                    this.f41394p = fVar;
                    boolean z11 = fVar instanceof a;
                    d0 d0Var = this.f41393o;
                    if (z11) {
                        a aVar = (a) fVar;
                        if (zM) {
                            long j11 = aVar.f41372g;
                            long j12 = this.f41397s;
                            if (j11 < j12) {
                                this.f41391m.f40297t = j12;
                                for (b1 b1Var : this.f41392n) {
                                    b1Var.f40297t = this.f41397s;
                                }
                                if (this.f41401w) {
                                    p pVar = aVar.f41369d;
                                    this.f41402x = !i1.d0.a(pVar.f42643n, pVar.f42641k);
                                }
                            }
                            this.f41401w = false;
                            this.f41397s = C.TIME_UNSET;
                        }
                        aVar.f41342m = d0Var;
                        b1[] b1VarArr = (b1[]) d0Var.f39977c;
                        int[] iArr = new int[b1VarArr.length];
                        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
                            b1 b1Var2 = b1VarArr[i10];
                            iArr[i10] = b1Var2.f40294q + b1Var2.f40293p;
                        }
                        aVar.f41343n = iArr;
                        this.f41390k.add(aVar);
                    } else if (fVar instanceof l) {
                        ((l) fVar).f41411k = d0Var;
                    }
                    mVar.e(fVar, this, this.f41387h.j(fVar.f41368c));
                    return true;
                }
            }
        }
        return false;
    }

    public final void g(long j10) throws Throwable {
        long j11;
        if (m()) {
            return;
        }
        b1 b1Var = this.f41391m;
        int i10 = b1Var.f40294q;
        b1Var.j(j10, true);
        b1 b1Var2 = this.f41391m;
        int i11 = b1Var2.f40294q;
        if (i11 > i10) {
            synchronized (b1Var2) {
                j11 = b1Var2.f40293p == 0 ? Long.MIN_VALUE : b1Var2.f40291n[b1Var2.f40295r];
            }
            int i12 = 0;
            while (true) {
                b1[] b1VarArr = this.f41392n;
                if (i12 >= b1VarArr.length) {
                    break;
                }
                b1VarArr[i12].j(j11, this.f41383d[i12]);
                i12++;
            }
        }
        int iMin = Math.min(p(i11, 0), this.f41399u);
        if (iMin > 0) {
            l1.y.R(this.f41390k, 0, iMin);
            this.f41399u -= iMin;
        }
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        if (this.f41403y) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.f41397s;
        }
        long jMax = this.f41398t;
        a aVarK = k();
        if (!aVarK.b()) {
            ArrayList arrayList = this.f41390k;
            aVarK = arrayList.size() > 1 ? (a) l1.d.d(arrayList, 2) : null;
        }
        if (aVarK != null) {
            jMax = Math.max(jMax, aVarK.f41373h);
        }
        return Math.max(jMax, this.f41391m.q());
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        if (m()) {
            return this.f41397s;
        }
        if (this.f41403y) {
            return Long.MIN_VALUE;
        }
        return k().f41373h;
    }

    @Override // f2.c1
    public final int h(s1 s1Var, o1.d dVar, int i10) {
        if (m()) {
            return -3;
        }
        a aVar = this.f41400v;
        b1 b1Var = this.f41391m;
        if (aVar != null && aVar.c(0) <= b1Var.t()) {
            return -3;
        }
        o();
        return b1Var.C(s1Var, dVar, i10, this.f41403y);
    }

    public final a i(int i10) {
        ArrayList arrayList = this.f41390k;
        a aVar = (a) arrayList.get(i10);
        l1.y.R(arrayList, i10, arrayList.size());
        this.f41399u = Math.max(this.f41399u, arrayList.size());
        int i11 = 0;
        this.f41391m.n(aVar.c(0));
        while (true) {
            b1[] b1VarArr = this.f41392n;
            if (i11 >= b1VarArr.length) {
                return aVar;
            }
            b1 b1Var = b1VarArr[i11];
            i11++;
            b1Var.n(aVar.c(i11));
        }
    }

    @Override // f2.e1
    public final boolean isLoading() {
        return this.f41388i.c();
    }

    @Override // f2.c1
    public final boolean isReady() {
        return !m() && this.f41391m.x(this.f41403y);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [f2.d1, java.lang.Object] */
    @Override // j2.h
    public final void j(j2.j jVar, long j10, long j11) {
        f fVar = (f) jVar;
        this.f41394p = null;
        this.f41384e.b(fVar);
        long j12 = fVar.f41366a;
        n1.k kVar = fVar.f41367b;
        y yVar = fVar.f41374i;
        u uVar = new u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        this.f41387h.getClass();
        this.f41386g.e(uVar, fVar.f41368c, this.f41380a, fVar.f41369d, fVar.f41370e, fVar.f41371f, fVar.f41372g, fVar.f41373h);
        this.f41385f.h(this);
    }

    public final a k() {
        return (a) l1.d.d(this.f41390k, 1);
    }

    public final boolean l(int i10) {
        int iT;
        a aVar = (a) this.f41390k.get(i10);
        if (this.f41391m.t() > aVar.c(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b1[] b1VarArr = this.f41392n;
            if (i11 >= b1VarArr.length) {
                return false;
            }
            iT = b1VarArr[i11].t();
            i11++;
        } while (iT <= aVar.c(i11));
        return true;
    }

    public final boolean m() {
        return this.f41397s != C.TIME_UNSET;
    }

    @Override // f2.c1
    public final void maybeThrowError() throws u1.c {
        j2.m mVar = this.f41388i;
        mVar.maybeThrowError();
        this.f41391m.z();
        if (mVar.c()) {
            return;
        }
        this.f41384e.maybeThrowError();
    }

    @Override // j2.h
    public final void n(j2.j jVar, long j10, long j11, int i10) {
        u uVar;
        f fVar = (f) jVar;
        if (i10 == 0) {
            long j12 = fVar.f41366a;
            uVar = new u(fVar.f41367b, j10);
        } else {
            long j13 = fVar.f41366a;
            n1.k kVar = fVar.f41367b;
            y yVar = fVar.f41374i;
            uVar = new u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        }
        this.f41386g.h(uVar, fVar.f41368c, this.f41380a, fVar.f41369d, fVar.f41370e, fVar.f41371f, fVar.f41372g, fVar.f41373h, i10);
    }

    public final void o() {
        int iP = p(this.f41391m.t(), this.f41399u - 1);
        while (true) {
            int i10 = this.f41399u;
            if (i10 > iP) {
                return;
            }
            this.f41399u = i10 + 1;
            a aVar = (a) this.f41390k.get(i10);
            p pVar = aVar.f41369d;
            if (!pVar.equals(this.f41395q)) {
                this.f41386g.b(this.f41380a, pVar, aVar.f41370e, aVar.f41371f, aVar.f41372g);
            }
            this.f41395q = pVar;
        }
    }

    @Override // j2.k
    public final void onLoaderReleased() {
        this.f41391m.D();
        for (b1 b1Var : this.f41392n) {
            b1Var.D();
        }
        this.f41384e.release();
        h hVar = this.f41396r;
        if (hVar != null) {
            s1.b bVar = (s1.b) hVar;
            synchronized (bVar) {
                s1.l lVar = (s1.l) bVar.f49988n.remove(this);
                if (lVar != null) {
                    lVar.f50060a.D();
                }
            }
        }
    }

    public final int p(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.f41390k;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).c(0) <= i10);
        return i11 - 1;
    }

    public final void q(s1.b bVar) {
        this.f41396r = bVar;
        b1 b1Var = this.f41391m;
        b1Var.k();
        na.g gVar = b1Var.f40286h;
        if (gVar != null) {
            gVar.D(b1Var.f40283e);
            b1Var.f40286h = null;
            b1Var.f40285g = null;
        }
        for (b1 b1Var2 : this.f41392n) {
            b1Var2.k();
            na.g gVar2 = b1Var2.f40286h;
            if (gVar2 != null) {
                gVar2.D(b1Var2.f40283e);
                b1Var2.f40286h = null;
                b1Var2.f40285g = null;
            }
        }
        this.f41388i.d(this);
    }

    public final void r(long j10) throws Throwable {
        ArrayList arrayList;
        a aVar;
        boolean zG;
        this.f41398t = j10;
        int i10 = 0;
        this.f41401w = false;
        if (m()) {
            this.f41397s = j10;
            return;
        }
        int i11 = 0;
        while (true) {
            arrayList = this.f41390k;
            if (i11 < arrayList.size()) {
                aVar = (a) arrayList.get(i11);
                long j11 = aVar.f41372g;
                if (j11 == j10 && aVar.f41341k == C.TIME_UNSET) {
                    break;
                } else if (j11 <= j10) {
                    i11++;
                }
            }
            aVar = null;
            break;
        }
        b1 b1Var = this.f41391m;
        if (aVar != null) {
            zG = b1Var.F(aVar.c(0));
        } else {
            long nextLoadPositionUs = getNextLoadPositionUs();
            zG = b1Var.G(j10, nextLoadPositionUs == Long.MIN_VALUE || j10 < nextLoadPositionUs);
        }
        b1[] b1VarArr = this.f41392n;
        if (zG) {
            this.f41399u = p(b1Var.t(), 0);
            int length = b1VarArr.length;
            while (i10 < length) {
                b1VarArr[i10].G(j10, true);
                i10++;
            }
            return;
        }
        this.f41397s = j10;
        this.f41403y = false;
        arrayList.clear();
        this.f41399u = 0;
        j2.m mVar = this.f41388i;
        if (mVar.c()) {
            b1Var.k();
            int length2 = b1VarArr.length;
            while (i10 < length2) {
                b1VarArr[i10].k();
                i10++;
            }
            mVar.a();
            return;
        }
        mVar.f43676c = null;
        b1Var.E(false);
        for (b1 b1Var2 : b1VarArr) {
            b1Var2.E(false);
        }
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
        j2.m mVar = this.f41388i;
        if (mVar.b() || m()) {
            return;
        }
        boolean zC = mVar.c();
        List list = this.l;
        j jVar = this.f41384e;
        ArrayList arrayList = this.f41390k;
        if (zC) {
            f fVar = this.f41394p;
            fVar.getClass();
            boolean z10 = fVar instanceof a;
            if (!(z10 && l(arrayList.size() - 1)) && jVar.e(j10, fVar, list)) {
                mVar.a();
                if (z10) {
                    this.f41400v = (a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int preferredQueueSize = jVar.getPreferredQueueSize(j10, list);
        if (preferredQueueSize < arrayList.size()) {
            go.k.t(!mVar.c());
            int size = arrayList.size();
            while (true) {
                if (preferredQueueSize >= size) {
                    preferredQueueSize = -1;
                    break;
                } else if (!l(preferredQueueSize)) {
                    break;
                } else {
                    preferredQueueSize++;
                }
            }
            if (preferredQueueSize == -1) {
                return;
            }
            long j11 = k().f41373h;
            a aVarI = i(preferredQueueSize);
            if (arrayList.isEmpty()) {
                this.f41397s = this.f41398t;
            }
            this.f41403y = false;
            this.f41386g.i(this.f41380a, aVarI.f41372g, j11);
        }
    }

    @Override // f2.c1
    public final int skipData(long j10) {
        if (m()) {
            return 0;
        }
        boolean z10 = this.f41403y;
        b1 b1Var = this.f41391m;
        int iV = b1Var.v(j10, z10);
        a aVar = this.f41400v;
        if (aVar != null) {
            iV = Math.min(iV, aVar.c(0) - b1Var.t());
        }
        b1Var.H(iV);
        o();
        return iV;
    }
}
