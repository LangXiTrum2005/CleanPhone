package ln;

import cn.d0;
import cn.j2;
import cn.k;
import cn.l;
import com.google.android.gms.internal.play_billing.q1;
import hn.s;
import hn.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45608c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f45609d = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45610e = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f45611f = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45612g = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f45614b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g(int i10) {
        this.f45613a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "The number of acquired permits should be in 0..").toString());
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = i10;
        this.f45614b = new k(this, 2);
    }

    public final Object a(ck.i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i10;
        do {
            atomicIntegerFieldUpdater = f45612g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i10 = this.f45613a;
        } while (andDecrement > i10);
        r rVar = r.f53297a;
        if (andDecrement <= 0) {
            l lVarS = d0.s(q1.t(iVar));
            try {
                if (!b(lVarS)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i10) {
                            if (andDecrement2 > 0) {
                                lVarS.g(rVar, this.f45614b);
                                break;
                            }
                            if (b(lVarS)) {
                                break;
                            }
                        }
                    }
                }
                Object objS = lVarS.s();
                bk.a aVar = bk.a.f5708a;
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
        }
        return rVar;
    }

    public final boolean b(j2 j2Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45610e;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f45611f.getAndIncrement(this);
        e eVar = e.f45606b;
        long j10 = andIncrement / ((long) i.f45620f);
        loop0: while (true) {
            objB = hn.b.b(jVar, j10, eVar);
            if (!hn.b.e(objB)) {
                s sVarC = hn.b.c(objB);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
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
        j jVar2 = (j) hn.b.c(objB);
        AtomicReferenceArray atomicReferenceArray = jVar2.f45621e;
        int i10 = (int) (andIncrement % ((long) i.f45620f));
        while (!atomicReferenceArray.compareAndSet(i10, null, j2Var)) {
            if (atomicReferenceArray.get(i10) != null) {
                u uVar = i.f45616b;
                u uVar2 = i.f45617c;
                while (!atomicReferenceArray.compareAndSet(i10, uVar, uVar2)) {
                    if (atomicReferenceArray.get(i10) != uVar) {
                        return false;
                    }
                }
                ((cn.j) j2Var).g(r.f53297a, this.f45614b);
                return true;
            }
        }
        j2Var.b(jVar2, i10);
        return true;
    }

    public final void c() {
        int i10;
        Object objB;
        boolean zG;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f45612g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f45613a;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45608c;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f45609d.getAndIncrement(this);
            long j10 = andIncrement2 / ((long) i.f45620f);
            f fVar = f.f45607b;
            while (true) {
                objB = hn.b.b(jVar, j10, fVar);
                if (!hn.b.e(objB)) {
                    s sVarC = hn.b.c(objB);
                    while (true) {
                        s sVar = (s) atomicReferenceFieldUpdater.get(this);
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
            j jVar2 = (j) hn.b.c(objB);
            AtomicReferenceArray atomicReferenceArray = jVar2.f45621e;
            jVar2.b();
            zG = false;
            if (jVar2.f42455c <= j10) {
                int i12 = (int) (andIncrement2 % ((long) i.f45620f));
                Object andSet = atomicReferenceArray.getAndSet(i12, i.f45616b);
                if (andSet == null) {
                    int i13 = i.f45615a;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i13) {
                            u uVar = i.f45616b;
                            u uVar2 = i.f45618d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i12, uVar, uVar2)) {
                                    zG = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i12) == uVar);
                            zG = !zG;
                            break;
                        }
                        if (atomicReferenceArray.get(i12) == i.f45617c) {
                            zG = true;
                            break;
                        }
                        i14++;
                    }
                } else if (andSet != i.f45619e) {
                    boolean z10 = andSet instanceof cn.j;
                    r rVar = r.f53297a;
                    if (z10) {
                        cn.j jVar3 = (cn.j) andSet;
                        u uVarM = jVar3.m(rVar, this.f45614b);
                        if (uVarM != null) {
                            jVar3.p(uVarM);
                            zG = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof kn.e)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zG = ((kn.d) ((kn.e) andSet)).g(this, rVar);
                    }
                }
            }
        } while (!zG);
    }
}
