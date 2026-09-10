package en;

import cn.d0;
import cn.j2;
import com.google.android.gms.internal.ads.u22;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class e implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f40135b = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f40136c = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f40137d = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f40138e = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40139f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40140g = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40141h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40142i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40143j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40144a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public e(int i10) {
        this.f40144a = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        m mVar = g.f40146a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f40137d.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (y()) {
            mVar2 = g.f40146a;
            kotlin.jvm.internal.n.d(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f40163s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object B(e eVar, ck.c cVar) {
        c cVar2;
        m mVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f40131h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f40131h = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(eVar, cVar);
            }
        } else {
            cVar2 = new c(eVar, cVar);
        }
        c cVar3 = cVar2;
        Object obj = cVar3.f40129f;
        int i11 = cVar3.f40131h;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return ((l) obj).f40169a;
        }
        t9.e.z(obj);
        m mVar2 = (m) f40140g.get(eVar);
        while (!eVar.v()) {
            long andIncrement = f40136c.getAndIncrement(eVar);
            long j10 = g.f40147b;
            long j11 = andIncrement / j10;
            int i12 = (int) (andIncrement % j10);
            if (mVar2.f42455c != j11) {
                m mVarO = eVar.o(j11, mVar2);
                if (mVarO == null) {
                    continue;
                } else {
                    mVar = mVarO;
                }
            } else {
                mVar = mVar2;
            }
            e eVar2 = eVar;
            Object objG = eVar2.G(mVar, i12, andIncrement, null);
            if (objG == g.f40157m) {
                throw new IllegalStateException("unexpected");
            }
            if (objG != g.f40159o) {
                if (objG != g.f40158n) {
                    mVar.b();
                    return objG;
                }
                cVar3.f40131h = 1;
                Object objC = eVar2.C(mVar, i12, andIncrement, cVar3);
                bk.a aVar = bk.a.f5708a;
                return objC == aVar ? aVar : objC;
            }
            if (andIncrement < eVar2.s()) {
                mVar.b();
            }
            mVar2 = mVar;
            eVar = eVar2;
        }
        return new j(eVar.p());
    }

    public static final m d(e eVar, long j10, m mVar) {
        Object objB;
        e eVar2;
        m mVar2 = g.f40146a;
        f fVar = f.f40145b;
        loop0: while (true) {
            objB = hn.b.b(mVar, j10, fVar);
            if (!hn.b.e(objB)) {
                hn.s sVarC = hn.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40139f;
                    hn.s sVar = (hn.s) atomicReferenceFieldUpdater.get(eVar);
                    if (sVar.f42455c >= sVarC.f42455c) {
                        break loop0;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(eVar, sVar, sVarC)) {
                            if (!sVar.f()) {
                                break loop0;
                            }
                            sVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(eVar) == sVar);
                    if (sVarC.f()) {
                        sVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = hn.b.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40136c;
        if (zE) {
            eVar.w();
            if (mVar.f42455c * ((long) g.f40147b) < atomicLongFieldUpdater.get(eVar)) {
                mVar.b();
                return null;
            }
        } else {
            m mVar3 = (m) hn.b.c(objB);
            long j11 = mVar3.f42455c;
            if (j11 <= j10) {
                return mVar3;
            }
            long j12 = ((long) g.f40147b) * j11;
            while (true) {
                long j13 = f40135b.get(eVar);
                long j14 = 1152921504606846975L & j13;
                if (j14 >= j12) {
                    eVar2 = eVar;
                    break;
                }
                eVar2 = eVar;
                if (f40135b.compareAndSet(eVar2, j13, (((long) ((int) (j13 >> 60))) << 60) + j14)) {
                    break;
                }
                eVar = eVar2;
            }
            if (j11 * ((long) g.f40147b) < atomicLongFieldUpdater.get(eVar2)) {
                mVar3.b();
            }
        }
        return null;
    }

    public static final void e(e eVar, Object obj, cn.l lVar) {
        lVar.resumeWith(t9.e.c(eVar.r()));
    }

    public static final int f(e eVar, m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        mVar.n(i10, obj);
        if (z10) {
            return eVar.H(mVar, i10, obj, j10, obj2, z10);
        }
        Object objL = mVar.l(i10);
        if (objL == null) {
            if (eVar.g(j10)) {
                if (mVar.k(i10, null, g.f40149d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.k(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof j2) {
            mVar.n(i10, null);
            if (eVar.E(objL, obj)) {
                mVar.o(i10, g.f40154i);
                return 0;
            }
            hn.u uVar = g.f40156k;
            if (mVar.f40171f.getAndSet((i10 * 2) + 1, uVar) == uVar) {
                return 5;
            }
            mVar.m(i10, true);
            return 5;
        }
        return eVar.H(mVar, i10, obj, j10, obj2, z10);
    }

    public static void t(e eVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40138e;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object A(ak.f fVar, Object obj) {
        cn.l lVar = new cn.l(1, q1.t(fVar));
        lVar.t();
        lVar.resumeWith(t9.e.c(r()));
        Object objS = lVar.s();
        return objS == bk.a.f5708a ? objS : wj.r.f53297a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(m mVar, int i10, long j10, ck.c cVar) {
        d dVar;
        l lVar;
        m mVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f40134h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f40134h = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objS = dVar.f40132f;
        int i12 = dVar.f40134h;
        if (i12 == 0) {
            t9.e.z(objS);
            dVar.f40134h = 1;
            cn.l lVarS = d0.s(q1.t(dVar));
            try {
                s sVar = new s(lVarS);
                Object objG = G(mVar, i10, j10, sVar);
                if (objG != g.f40157m) {
                    if (objG == g.f40159o) {
                        if (j10 < s()) {
                            mVar.b();
                        }
                        m mVar3 = (m) f40140g.get(this);
                        while (true) {
                            if (v()) {
                                lVarS.resumeWith(new l(new j(p())));
                                break;
                            }
                            long andIncrement = f40136c.getAndIncrement(this);
                            long j11 = g.f40147b;
                            long j12 = andIncrement / j11;
                            int i13 = (int) (andIncrement % j11);
                            if (mVar3.f42455c != j12) {
                                m mVarO = o(j12, mVar3);
                                if (mVarO != null) {
                                    mVar2 = mVarO;
                                }
                            } else {
                                mVar2 = mVar3;
                            }
                            Object objG2 = G(mVar2, i13, andIncrement, sVar);
                            m mVar4 = mVar2;
                            if (objG2 == g.f40157m) {
                                sVar.b(mVar4, i13);
                                break;
                            }
                            if (objG2 == g.f40159o) {
                                if (andIncrement < s()) {
                                    mVar4.b();
                                }
                                mVar3 = mVar4;
                            } else {
                                if (objG2 == g.f40158n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                mVar4.b();
                                lVar = new l(objG2);
                            }
                        }
                    } else {
                        mVar.b();
                        lVar = new l(objG);
                    }
                    lVarS.g(lVar, null);
                    break;
                }
                sVar.b(mVar, i10);
                objS = lVarS.s();
                bk.a aVar = bk.a.f5708a;
                if (objS == aVar) {
                    return aVar;
                }
            } catch (Throwable th2) {
                lVarS.A();
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(objS);
        }
        return ((l) objS).f40169a;
    }

    public final void D(j2 j2Var, boolean z10) {
        if (j2Var instanceof cn.j) {
            ((ak.f) j2Var).resumeWith(t9.e.c(z10 ? q() : r()));
            return;
        }
        if (j2Var instanceof s) {
            ((s) j2Var).f40177a.resumeWith(new l(new j(p())));
            return;
        }
        if (!(j2Var instanceof b)) {
            if (j2Var instanceof kn.e) {
                ((kn.d) ((kn.e) j2Var)).g(this, g.l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + j2Var).toString());
            }
        }
        b bVar = (b) j2Var;
        cn.l lVar = bVar.f40127b;
        kotlin.jvm.internal.n.c(lVar);
        bVar.f40127b = null;
        bVar.f40126a = g.l;
        Throwable thP = bVar.f40128c.p();
        if (thP == null) {
            lVar.resumeWith(Boolean.FALSE);
        } else {
            lVar.resumeWith(t9.e.c(thP));
        }
    }

    public final boolean E(Object obj, Object obj2) {
        if (obj instanceof kn.e) {
            return ((kn.d) ((kn.e) obj)).g(this, obj2);
        }
        if (obj instanceof s) {
            return g.a(((s) obj).f40177a, new l(obj2), null);
        }
        if (!(obj instanceof b)) {
            if (obj instanceof cn.j) {
                return g.a((cn.j) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        b bVar = (b) obj;
        cn.l lVar = bVar.f40127b;
        kotlin.jvm.internal.n.c(lVar);
        bVar.f40127b = null;
        bVar.f40126a = obj2;
        return g.a(lVar, Boolean.TRUE, null);
    }

    public final boolean F(Object obj, m mVar, int i10) {
        kn.g gVar;
        boolean z10 = obj instanceof cn.j;
        wj.r rVar = wj.r.f53297a;
        if (z10) {
            return g.a((cn.j) obj, rVar, null);
        }
        if (!(obj instanceof kn.e)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iH = ((kn.d) obj).h(this, rVar);
        kn.g gVar2 = kn.g.f44746a;
        kn.g gVar3 = kn.g.f44747b;
        if (iH == 0) {
            gVar = gVar2;
        } else if (iH == 1) {
            gVar = gVar3;
        } else if (iH == 2) {
            gVar = kn.g.f44748c;
        } else {
            if (iH != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iH).toString());
            }
            gVar = kn.g.f44749d;
        }
        if (gVar == gVar3) {
            mVar.n(i10, null);
        }
        return gVar == gVar2;
    }

    public final Object G(m mVar, int i10, long j10, Object obj) {
        Object objL = mVar.l(i10);
        AtomicReferenceArray atomicReferenceArray = mVar.f40171f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40135b;
        if (objL == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f40158n;
                }
                if (mVar.k(i10, objL, obj)) {
                    n();
                    return g.f40157m;
                }
            }
        } else if (objL == g.f40149d && mVar.k(i10, objL, g.f40154i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            mVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object objL2 = mVar.l(i10);
            if (objL2 == null || objL2 == g.f40150e) {
                if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.k(i10, objL2, g.f40153h)) {
                        n();
                        return g.f40159o;
                    }
                } else {
                    if (obj == null) {
                        return g.f40158n;
                    }
                    if (mVar.k(i10, objL2, obj)) {
                        n();
                        return g.f40157m;
                    }
                }
            } else if (objL2 != g.f40149d) {
                hn.u uVar = g.f40155j;
                if (objL2 == uVar) {
                    return g.f40159o;
                }
                if (objL2 == g.f40153h) {
                    return g.f40159o;
                }
                if (objL2 == g.l) {
                    n();
                    return g.f40159o;
                }
                if (objL2 != g.f40152g && mVar.k(i10, objL2, g.f40151f)) {
                    boolean z10 = objL2 instanceof v;
                    if (z10) {
                        objL2 = ((v) objL2).f40178a;
                    }
                    if (F(objL2, mVar, i10)) {
                        mVar.o(i10, g.f40154i);
                        n();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        mVar.n(i10, null);
                        return obj3;
                    }
                    mVar.o(i10, uVar);
                    mVar.i();
                    if (z10) {
                        n();
                    }
                    return g.f40159o;
                }
            } else if (mVar.k(i10, objL2, g.f40154i)) {
                n();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                mVar.n(i10, null);
                return obj4;
            }
        }
    }

    public final int H(m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objL = mVar.l(i10);
            if (objL == null) {
                if (!g(j10) || z10) {
                    if (z10) {
                        if (mVar.k(i10, null, g.f40155j)) {
                            mVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.k(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.k(i10, null, g.f40149d)) {
                    break;
                }
            } else {
                if (objL != g.f40150e) {
                    hn.u uVar = g.f40156k;
                    if (objL == uVar) {
                        mVar.n(i10, null);
                        return 5;
                    }
                    if (objL == g.f40153h) {
                        mVar.n(i10, null);
                        return 5;
                    }
                    if (objL == g.l) {
                        mVar.n(i10, null);
                        w();
                        return 4;
                    }
                    mVar.n(i10, null);
                    if (objL instanceof v) {
                        objL = ((v) objL).f40178a;
                    }
                    if (E(objL, obj)) {
                        mVar.o(i10, g.f40154i);
                        return 0;
                    }
                    if (mVar.f40171f.getAndSet((i10 * 2) + 1, uVar) != uVar) {
                        mVar.m(i10, true);
                    }
                    return 5;
                }
                if (mVar.k(i10, objL, g.f40149d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void I(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        e eVar = this;
        if (eVar.y()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f40137d;
            if (atomicLongFieldUpdater.get(eVar) > j10) {
                break;
            } else {
                eVar = this;
            }
        }
        int i10 = g.f40148c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f40138e;
            if (i11 < i10) {
                long j11 = atomicLongFieldUpdater.get(eVar);
                if (j11 == (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) && j11 == atomicLongFieldUpdater.get(eVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        eVar = this;
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(eVar);
                    long j14 = atomicLongFieldUpdater2.get(eVar);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z10 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(eVar)) {
                        break;
                    }
                    if (z10) {
                        eVar = this;
                    } else {
                        eVar = this;
                        atomicLongFieldUpdater2.compareAndSet(eVar, j14, 4611686018427387904L + j15);
                    }
                }
                while (true) {
                    long j16 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j16, j16 & 4611686018427387903L)) {
                        return;
                    } else {
                        eVar = this;
                    }
                }
            }
        }
    }

    @Override // en.t
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        j(cancellationException, true);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0144 A[RETURN] */
    @Override // en.u
    public Object b(ak.f fVar, Object obj) {
        wj.r rVar;
        Object objS;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40139f;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f40135b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zU = u(andIncrement, false);
            int i10 = g.f40147b;
            long j11 = i10;
            long j12 = j10 / j11;
            int i11 = (int) (j10 % j11);
            long j13 = mVar.f42455c;
            bk.a aVar = bk.a.f5708a;
            rVar = wj.r.f53297a;
            if (j13 != j12) {
                m mVarD = d(this, j12, mVar);
                if (mVarD != null) {
                    mVar = mVarD;
                } else if (zU) {
                    Object objA = A(fVar, obj);
                    if (objA == aVar) {
                        return objA;
                    }
                }
            }
            int iF = f(this, mVar, i11, obj, j10, null, zU);
            if (iF == 0) {
                mVar.b();
                return rVar;
            }
            if (iF != 1) {
                if (iF == 2) {
                    if (!zU) {
                        break;
                    }
                    mVar.i();
                    Object objA2 = A(fVar, obj);
                    if (objA2 == aVar) {
                        return objA2;
                    }
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f40136c;
                    if (iF == 3) {
                        cn.l lVarS = d0.s(q1.t(fVar));
                        try {
                            int iF2 = f(this, mVar, i11, obj, j10, lVarS, false);
                            if (iF2 != 0) {
                                if (iF2 != 1) {
                                    if (iF2 != 2) {
                                        if (iF2 != 4) {
                                            String str = "unexpected";
                                            if (iF2 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            mVar.b();
                                            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                                long j14 = andIncrement2 & 1152921504606846975L;
                                                boolean zU2 = u(andIncrement2, false);
                                                int i12 = g.f40147b;
                                                long j15 = i12;
                                                str = str;
                                                long j16 = j14 / j15;
                                                int i13 = (int) (j14 % j15);
                                                if (mVar2.f42455c != j16) {
                                                    m mVarD2 = d(this, j16, mVar2);
                                                    if (mVarD2 != null) {
                                                        mVar2 = mVarD2;
                                                    } else if (zU2) {
                                                    }
                                                }
                                                int iF3 = f(this, mVar2, i13, obj, j14, lVarS, zU2);
                                                if (iF3 == 0) {
                                                    mVar2.b();
                                                } else if (iF3 != 1) {
                                                    if (iF3 == 2) {
                                                        if (!zU2) {
                                                            lVarS.b(mVar2, i13 + i12);
                                                            break;
                                                        }
                                                        mVar2.i();
                                                    } else {
                                                        if (iF3 == 3) {
                                                            throw new IllegalStateException(str);
                                                        }
                                                        if (iF3 != 4) {
                                                            if (iF3 == 5) {
                                                                mVar2.b();
                                                            }
                                                        } else if (j14 < atomicLongFieldUpdater2.get(this)) {
                                                            mVar2.b();
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (j10 < atomicLongFieldUpdater2.get(this)) {
                                            mVar.b();
                                        }
                                        e(this, obj, lVarS);
                                        break;
                                    } else {
                                        lVarS.b(mVar, i11 + i10);
                                    }
                                }
                                objS = lVarS.s();
                                if (objS != aVar) {
                                    objS = rVar;
                                }
                                if (objS == aVar) {
                                    return objS;
                                }
                            } else {
                                mVar.b();
                            }
                            lVarS.resumeWith(rVar);
                            objS = lVarS.s();
                            if (objS != aVar) {
                                objS = rVar;
                            }
                            if (objS == aVar) {
                                return objS;
                            }
                        } catch (Throwable th2) {
                            lVarS.A();
                            throw th2;
                        }
                    } else if (iF == 4) {
                        if (j10 < atomicLongFieldUpdater2.get(this)) {
                            mVar.b();
                        }
                        Object objA3 = A(fVar, obj);
                        if (objA3 == aVar) {
                            return objA3;
                        }
                    } else if (iF == 5) {
                        mVar.b();
                    }
                }
            } else {
                break;
            }
        }
        return rVar;
    }

    @Override // en.t
    public final Object c(gn.i iVar) {
        return B(this, iVar);
    }

    public final boolean g(long j10) {
        return j10 < f40137d.get(this) || j10 < f40136c.get(this) + ((long) this.f40144a);
    }

    public final boolean h(Throwable th2) {
        return j(th2, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    @Override // en.u
    public Object i(Object obj) {
        int iF;
        wj.r rVar;
        j2 j2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40135b;
        long j10 = atomicLongFieldUpdater.get(this);
        boolean z10 = false;
        long j11 = 1152921504606846975L;
        boolean z11 = u(j10, false) ? false : !g(j10 & 1152921504606846975L);
        k kVar = l.f40168b;
        if (z11) {
            return kVar;
        }
        Object obj2 = g.f40155j;
        m mVar = (m) f40139f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = andIncrement & j11;
            boolean zU = u(andIncrement, z10);
            int i10 = g.f40147b;
            long j13 = i10;
            long j14 = j12 / j13;
            int i11 = (int) (j12 % j13);
            if (mVar.f42455c == j14) {
                iF = f(this, mVar, i11, obj, j12, obj2, zU);
                rVar = wj.r.f53297a;
                if (iF != 0) {
                    mVar.b();
                    return rVar;
                }
                if (iF != 1) {
                    return rVar;
                }
                if (iF != 2) {
                    if (zU) {
                        mVar.i();
                        return new j(r());
                    }
                    if (obj2 instanceof j2) {
                        j2Var = (j2) obj2;
                    } else {
                        j2Var = null;
                    }
                    if (j2Var != null) {
                        j2Var.b(mVar, i11 + i10);
                    }
                    mVar.i();
                    return kVar;
                }
                if (iF != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iF != 4) {
                    if (j12 < f40136c.get(this)) {
                        mVar.b();
                    }
                    return new j(r());
                }
                if (iF == 5) {
                    mVar.b();
                }
                z10 = false;
            } else {
                m mVarD = d(this, j14, mVar);
                if (mVarD != null) {
                    mVar = mVarD;
                    iF = f(this, mVar, i11, obj, j12, obj2, zU);
                    rVar = wj.r.f53297a;
                    if (iF != 0) {
                        mVar.b();
                        return rVar;
                    }
                    if (iF != 1) {
                        return rVar;
                    }
                    if (iF != 2) {
                        if (zU) {
                            mVar.i();
                            return new j(r());
                        }
                        if (obj2 instanceof j2) {
                            j2Var = (j2) obj2;
                        } else {
                            j2Var = null;
                        }
                        if (j2Var != null) {
                            j2Var.b(mVar, i11 + i10);
                        }
                        mVar.i();
                        return kVar;
                    }
                    if (iF != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iF != 4) {
                        if (j12 < f40136c.get(this)) {
                            mVar.b();
                        }
                        return new j(r());
                    }
                    if (iF == 5) {
                        mVar.b();
                    }
                    z10 = false;
                } else {
                    if (zU) {
                        return new j(r());
                    }
                    z10 = false;
                }
            }
            j11 = 1152921504606846975L;
        }
    }

    public final boolean j(Throwable th2, boolean z10) {
        e eVar;
        boolean z11;
        long j10;
        long j11;
        long j12;
        Object obj;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40135b;
        if (!z10) {
            eVar = this;
            break;
        }
        while (true) {
            long j14 = atomicLongFieldUpdater.get(this);
            if (((int) (j14 >> 60)) != 0) {
                eVar = this;
                break;
            }
            m mVar = g.f40146a;
            eVar = this;
            if (atomicLongFieldUpdater.compareAndSet(eVar, j14, (j14 & 1152921504606846975L) + (((long) 1) << 60))) {
                break;
            }
            this = eVar;
        }
        hn.u uVar = g.f40163s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40142i;
            if (atomicReferenceFieldUpdater.compareAndSet(eVar, uVar, th2)) {
                z11 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(eVar) != uVar) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            do {
                j13 = atomicLongFieldUpdater.get(eVar);
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j13, (((long) 3) << 60) + (j13 & 1152921504606846975L)));
        } else {
            do {
                j10 = atomicLongFieldUpdater.get(eVar);
                int i10 = (int) (j10 >> 60);
                if (i10 == 0) {
                    j11 = j10 & 1152921504606846975L;
                    j12 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j11 = j10 & 1152921504606846975L;
                    j12 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j10, (j12 << 60) + j11));
        }
        eVar.w();
        if (z11) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40143j;
                obj = atomicReferenceFieldUpdater2.get(eVar);
                hn.u uVar2 = obj == null ? g.f40161q : g.f40162r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(eVar, obj, uVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(eVar) == obj);
            }
            if (obj != null) {
                h0.d(1, obj);
                ((jk.b) obj).invoke(eVar.p());
                return z11;
            }
        }
        return z11;
    }

    public final m k(long j10) {
        Object objF;
        long j11;
        Object obj = f40141h.get(this);
        m mVar = (m) f40139f.get(this);
        if (mVar.f42455c > ((m) obj).f42455c) {
            obj = mVar;
        }
        m mVar2 = (m) f40140g.get(this);
        if (mVar2.f42455c > ((m) obj).f42455c) {
            obj = mVar2;
        }
        hn.c cVar = (hn.c) obj;
        loop0: while (true) {
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hn.c.f42422a;
            Object obj2 = atomicReferenceFieldUpdater.get(cVar);
            hn.u uVar = hn.b.f42415a;
            objF = null;
            if (obj2 == uVar) {
                break;
            }
            hn.c cVar2 = (hn.c) obj2;
            if (cVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, uVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(cVar) == null);
            } else {
                cVar = cVar2;
            }
        }
        m mVar3 = (m) cVar;
        if (x()) {
            m mVar4 = mVar3;
            loop2: while (true) {
                int i10 = g.f40147b - 1;
                while (true) {
                    if (-1 < i10) {
                        j11 = (mVar4.f42455c * ((long) g.f40147b)) + ((long) i10);
                        if (j11 >= f40136c.get(this)) {
                            while (true) {
                                Object objL = mVar4.l(i10);
                                if (objL != null && objL != g.f40150e) {
                                    if (objL != g.f40149d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (mVar4.k(i10, objL, g.l)) {
                                    mVar4.i();
                                    break;
                                }
                            }
                            i10--;
                        }
                    } else {
                        mVar4 = (m) ((hn.c) hn.c.f42423b.get(mVar4));
                        if (mVar4 == null) {
                        }
                    }
                    j11 = -1;
                    break;
                }
            }
            if (j11 != -1) {
                m(j11);
            }
        }
        loop5: for (m mVar5 = mVar3; mVar5 != null; mVar5 = (m) ((hn.c) hn.c.f42423b.get(mVar5))) {
            for (int i11 = g.f40147b - 1; -1 < i11; i11--) {
                if ((mVar5.f42455c * ((long) g.f40147b)) + ((long) i11) < j10) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = mVar5.l(i11);
                    if (objL2 != null && objL2 != g.f40150e) {
                        if (!(objL2 instanceof v)) {
                            if (!(objL2 instanceof j2)) {
                                break;
                            }
                            if (mVar5.k(i11, objL2, g.l)) {
                                objF = hn.b.f(objF, objL2);
                                mVar5.m(i11, true);
                                break;
                            }
                        } else {
                            if (mVar5.k(i11, objL2, g.l)) {
                                objF = hn.b.f(objF, ((v) objL2).f40178a);
                                mVar5.m(i11, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar5.k(i11, objL2, g.l)) {
                            mVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (!(objF instanceof ArrayList)) {
                D((j2) objF, true);
                return mVar3;
            }
            ArrayList arrayList = (ArrayList) objF;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                D((j2) arrayList.get(size), true);
            }
        }
        return mVar3;
    }

    @Override // en.t
    public final Object l() {
        m mVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40136c;
        long j10 = atomicLongFieldUpdater.get(this);
        long j11 = f40135b.get(this);
        if (u(j11, true)) {
            return new j(p());
        }
        long j12 = j11 & 1152921504606846975L;
        k kVar = l.f40168b;
        if (j10 >= j12) {
            return kVar;
        }
        Object obj = g.f40156k;
        m mVar2 = (m) f40140g.get(this);
        while (!this.v()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = g.f40147b;
            long j14 = andIncrement / j13;
            int i10 = (int) (andIncrement % j13);
            if (mVar2.f42455c != j14) {
                m mVarO = this.o(j14, mVar2);
                if (mVarO == null) {
                    continue;
                } else {
                    mVar = mVarO;
                }
            } else {
                mVar = mVar2;
            }
            e eVar = this;
            Object objG = eVar.G(mVar, i10, andIncrement, obj);
            mVar2 = mVar;
            if (objG == g.f40157m) {
                j2 j2Var = obj instanceof j2 ? (j2) obj : null;
                if (j2Var != null) {
                    j2Var.b(mVar2, i10);
                }
                eVar.I(andIncrement);
                mVar2.i();
                return kVar;
            }
            if (objG != g.f40159o) {
                if (objG == g.f40158n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar2.b();
                return objG;
            }
            if (andIncrement < eVar.s()) {
                mVar2.b();
            }
            this = eVar;
        }
        return new j(this.p());
    }

    public final void m(long j10) {
        m mVar = (m) f40140g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f40136c;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(((long) this.f40144a) + j11, f40137d.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j11, 1 + j11)) {
                long j12 = g.f40147b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (mVar.f42455c != j13) {
                    m mVarO = this.o(j13, mVar);
                    if (mVarO != null) {
                        mVar = mVarO;
                    }
                }
                m mVar2 = mVar;
                if (this.G(mVar2, i10, j11, null) != g.f40159o || j11 < this.s()) {
                    mVar2.b();
                }
                mVar = mVar2;
            }
        }
    }

    public final void n() {
        Object objB;
        if (y()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40141h;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f40137d.getAndIncrement(this);
            long j10 = andIncrement / ((long) g.f40147b);
            if (s() <= andIncrement) {
                if (mVar.f42455c < j10 && mVar.c() != null) {
                    z(j10, mVar);
                }
                t(this);
                return;
            }
            if (mVar.f42455c != j10) {
                f fVar = f.f40145b;
                while (true) {
                    objB = hn.b.b(mVar, j10, fVar);
                    if (!hn.b.e(objB)) {
                        hn.s sVarC = hn.b.c(objB);
                        while (true) {
                            hn.s sVar = (hn.s) atomicReferenceFieldUpdater.get(this);
                            if (sVar.f42455c >= sVarC.f42455c) {
                                break;
                            }
                            if (!sVarC.j()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                                    if (!sVar.f()) {
                                        break;
                                    }
                                    sVar.e();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == sVar);
                            if (sVarC.f()) {
                                sVarC.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                m mVar2 = null;
                if (hn.b.e(objB)) {
                    w();
                    z(j10, mVar);
                    t(this);
                } else {
                    m mVar3 = (m) hn.b.c(objB);
                    long j11 = mVar3.f42455c;
                    if (j11 > j10) {
                        long j12 = j11 * ((long) g.f40147b);
                        if (f40137d.compareAndSet(this, 1 + andIncrement, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f40138e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            t(this);
                        }
                    } else {
                        mVar2 = mVar3;
                    }
                }
                if (mVar2 == null) {
                    continue;
                } else {
                    mVar = mVar2;
                }
            }
            int i10 = (int) (andIncrement % ((long) g.f40147b));
            Object objL = mVar.l(i10);
            boolean z10 = objL instanceof j2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f40136c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !mVar.k(i10, objL, g.f40152g)) {
                while (true) {
                    Object objL2 = mVar.l(i10);
                    if (objL2 instanceof j2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (mVar.k(i10, objL2, new v((j2) objL2))) {
                                t(this);
                                return;
                            }
                        } else if (mVar.k(i10, objL2, g.f40152g)) {
                            if (!F(objL2, mVar, i10)) {
                                mVar.o(i10, g.f40155j);
                                mVar.i();
                                break;
                            } else {
                                mVar.o(i10, g.f40149d);
                                t(this);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == g.f40155j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (mVar.k(i10, objL2, g.f40150e)) {
                                t(this);
                                return;
                            }
                        } else if (objL2 == g.f40149d || objL2 == g.f40153h || objL2 == g.f40154i || objL2 == g.f40156k || objL2 == g.l) {
                            t(this);
                            return;
                        } else if (objL2 != g.f40151f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objL2).toString());
                        }
                    }
                }
                t(this);
            } else if (F(objL, mVar, i10)) {
                mVar.o(i10, g.f40149d);
                t(this);
                return;
            } else {
                mVar.o(i10, g.f40155j);
                mVar.i();
                t(this);
            }
        }
    }

    public final m o(long j10, m mVar) {
        Object objB;
        e eVar;
        m mVar2 = g.f40146a;
        f fVar = f.f40145b;
        loop0: while (true) {
            objB = hn.b.b(mVar, j10, fVar);
            if (!hn.b.e(objB)) {
                hn.s sVarC = hn.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40140g;
                    hn.s sVar = (hn.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f42455c >= sVarC.f42455c) {
                        break loop0;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                            if (!sVar.f()) {
                                break loop0;
                            }
                            sVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == sVar);
                    if (sVarC.f()) {
                        sVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        if (hn.b.e(objB)) {
            w();
            if (mVar.f42455c * ((long) g.f40147b) < s()) {
                mVar.b();
                return null;
            }
        } else {
            m mVar3 = (m) hn.b.c(objB);
            long j11 = mVar3.f42455c;
            if (!y() && j10 <= f40137d.get(this) / ((long) g.f40147b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40141h;
                    hn.s sVar2 = (hn.s) atomicReferenceFieldUpdater2.get(this);
                    if (sVar2.f42455c >= j11 || !mVar3.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, mVar3)) {
                            if (!sVar2.f()) {
                                break loop3;
                            }
                            sVar2.e();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == sVar2);
                    if (mVar3.f()) {
                        mVar3.e();
                    }
                }
            }
            if (j11 <= j10) {
                return mVar3;
            }
            long j12 = j11 * ((long) g.f40147b);
            while (true) {
                long j13 = f40136c.get(this);
                if (j13 >= j12) {
                    eVar = this;
                    break;
                }
                eVar = this;
                if (f40136c.compareAndSet(eVar, j13, j12)) {
                    break;
                }
                this = eVar;
            }
            if (j11 * ((long) g.f40147b) < eVar.s()) {
                mVar3.b();
            }
        }
        return null;
    }

    public final Throwable p() {
        return (Throwable) f40142i.get(this);
    }

    public final Throwable q() {
        Throwable thP = p();
        return thP == null ? new n("Channel was closed") : thP;
    }

    public final Throwable r() {
        Throwable thP = p();
        return thP == null ? new u22("Channel was closed") : thP;
    }

    public final long s() {
        return f40135b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f40135b.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f40144a + ',');
        sb2.append("data=[");
        int i11 = 0;
        List listQ = xj.o.Q(f40140g.get(this), f40139f.get(this), f40141h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (((m) obj) != g.f40146a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((m) next).f42455c;
            do {
                Object next2 = it.next();
                long j11 = ((m) next2).f42455c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        m mVar = (m) next;
        long j12 = f40136c.get(this);
        long jS = s();
        loop2: while (true) {
            int i12 = g.f40147b;
            for (int i13 = i11; i13 < i12; i13++) {
                long j13 = (mVar.f42455c * ((long) g.f40147b)) + ((long) i13);
                if (j13 >= jS && j13 >= j12) {
                    break loop2;
                }
                Object objL = mVar.l(i13);
                Object obj2 = mVar.f40171f.get(i13 * 2);
                if (objL instanceof cn.j) {
                    string = (jS > j13 || j13 >= j12) ? (j12 > j13 || j13 >= jS) ? "cont" : "send" : "receive";
                } else if (objL instanceof kn.e) {
                    string = (jS > j13 || j13 >= j12) ? (j12 > j13 || j13 >= jS) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof s) {
                    string = "receiveCatching";
                } else if (objL instanceof v) {
                    string = "EB(" + objL + ')';
                } else if (kotlin.jvm.internal.n.a(objL, g.f40151f) || kotlin.jvm.internal.n.a(objL, g.f40152g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(g.f40150e) && !objL.equals(g.f40154i) && !objL.equals(g.f40153h) && !objL.equals(g.f40156k) && !objL.equals(g.f40155j) && !objL.equals(g.l)) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb2.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb2.append(string + ',');
                }
            }
            mVar = (m) mVar.c();
            if (mVar == null) {
                break;
            }
            i11 = 0;
        }
        if (an.h.z0(sb2) == ',') {
            kotlin.jvm.internal.n.e(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append(X3.j.f27836e);
        return sb2.toString();
    }

    public final boolean u(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 != 0 && i10 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f40136c;
            if (i10 == 2) {
                k(1152921504606846975L & j10);
                if (z10) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40140g;
                        m mVarO = (m) atomicReferenceFieldUpdater.get(this);
                        long j11 = atomicLongFieldUpdater.get(this);
                        if (s() <= j11) {
                            break;
                        }
                        long j12 = g.f40147b;
                        long j13 = j11 / j12;
                        if (mVarO.f42455c != j13 && (mVarO = o(j13, mVarO)) == null) {
                            if (((m) atomicReferenceFieldUpdater.get(this)).f42455c < j13) {
                                break;
                            }
                        } else {
                            mVarO.b();
                            int i11 = (int) (j11 % j12);
                            while (true) {
                                Object objL = mVarO.l(i11);
                                if (objL != null && objL != g.f40150e) {
                                    if (objL != g.f40149d && (objL == g.f40155j || objL == g.l || objL == g.f40154i || objL == g.f40153h || (objL != g.f40152g && (objL == g.f40151f || j11 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (mVarO.k(i11, objL, g.f40153h)) {
                                    n();
                                    break;
                                }
                            }
                            f40136c.compareAndSet(this, j11, j11 + 1);
                        }
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException(l1.d.e(i10, "unexpected close status: ").toString());
                }
                m mVarK = k(1152921504606846975L & j10);
                Object objF = null;
                loop0: do {
                    for (int i12 = g.f40147b - 1; -1 < i12; i12--) {
                        long j14 = (mVarK.f42455c * ((long) g.f40147b)) + ((long) i12);
                        while (true) {
                            Object objL2 = mVarK.l(i12);
                            if (objL2 == g.f40154i) {
                                break loop0;
                            }
                            if (objL2 != g.f40149d) {
                                if (objL2 != g.f40150e && objL2 != null) {
                                    if (!(objL2 instanceof j2) && !(objL2 instanceof v)) {
                                        hn.u uVar = g.f40152g;
                                        if (objL2 == uVar || objL2 == g.f40151f) {
                                            break loop0;
                                        }
                                        if (objL2 != uVar) {
                                            break;
                                        }
                                    } else {
                                        if (j14 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        j2 j2Var = objL2 instanceof v ? ((v) objL2).f40178a : (j2) objL2;
                                        if (mVarK.k(i12, objL2, g.l)) {
                                            objF = hn.b.f(objF, j2Var);
                                            mVarK.n(i12, null);
                                            mVarK.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (mVarK.k(i12, objL2, g.l)) {
                                        mVarK.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j14 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (mVarK.k(i12, objL2, g.l)) {
                                    mVarK.n(i12, null);
                                    mVarK.i();
                                    break;
                                }
                            }
                        }
                    }
                    mVarK = (m) ((hn.c) hn.c.f42423b.get(mVarK));
                } while (mVarK != null);
                if (objF != null) {
                    if (objF instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objF;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            D((j2) arrayList.get(size), false);
                        }
                    } else {
                        D((j2) objF, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean v() {
        return u(f40135b.get(this), true);
    }

    public final boolean w() {
        return u(f40135b.get(this), false);
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j10 = f40137d.get(this);
        return j10 == 0 || j10 == Long.MAX_VALUE;
    }

    public final void z(long j10, m mVar) {
        m mVar2;
        m mVar3;
        while (mVar.f42455c < j10 && (mVar3 = (m) mVar.c()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.d() || (mVar2 = (m) mVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40141h;
                    hn.s sVar = (hn.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f42455c >= mVar.f42455c) {
                        return;
                    }
                    if (!mVar.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, mVar)) {
                            if (sVar.f()) {
                                sVar.e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == sVar);
                    if (mVar.f()) {
                        mVar.e();
                    }
                }
            } else {
                mVar = mVar2;
            }
        }
    }
}
