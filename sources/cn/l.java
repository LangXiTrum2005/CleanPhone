package cn;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class l extends l0 implements j, ck.d, j2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6730f = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6731g = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6732h = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ak.f f6733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ak.k f6734e;

    public l(int i10, ak.f fVar) {
        super(i10);
        this.f6733d = fVar;
        this.f6734e = fVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f6672a;
    }

    public static Object D(w1 w1Var, Object obj, int i10, jk.d dVar) {
        if (obj instanceof u) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (dVar != null || (w1Var instanceof i)) {
            return new t(obj, w1Var instanceof i ? (i) w1Var : null, dVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        ak.f fVar = this.f6733d;
        Throwable th2 = null;
        hn.g gVar = fVar instanceof hn.g ? (hn.g) fVar : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hn.g.f42427h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                hn.u uVar = hn.b.f42417c;
                if (obj != uVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(gVar, uVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(gVar) == uVar);
            }
            if (th2 == null) {
                return;
            }
            o();
            f(th2);
        }
    }

    public final void B(Object obj, int i10, jk.d dVar) throws IllegalAccessException, j0, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6731g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof w1)) {
                if (obj2 instanceof m) {
                    m mVar = (m) obj2;
                    if (m.f6740c.compareAndSet(mVar, 0, 1)) {
                        if (dVar != null) {
                            l(dVar, mVar.f6771a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objD = D((w1) obj2, obj, i10, dVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (!x()) {
                        o();
                    }
                    q(i10);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void C(w wVar, Object obj) {
        ak.f fVar = this.f6733d;
        hn.g gVar = fVar instanceof hn.g ? (hn.g) fVar : null;
        B(obj, (gVar != null ? gVar.f42428d : null) == wVar ? 4 : this.f6735c, null);
    }

    public final hn.u E(Object obj, jk.d dVar) {
        hn.u uVar = d0.f6688a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6731g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof w1)) {
                return null;
            }
            Object objD = D((w1) obj2, obj, this.f6735c, dVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (!x()) {
                        o();
                    }
                    return uVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // cn.l0
    public final void a(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6731g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof w1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof u) {
                return;
            }
            if (!(obj instanceof t)) {
                cancellationException2 = cancellationException;
                t tVar = new t(obj, (i) null, (jk.d) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            t tVar2 = (t) obj;
            if (tVar2.f6768e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            t tVarA = t.a(tVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, tVarA)) {
                    i iVar = tVar2.f6765b;
                    if (iVar != null) {
                        k(iVar, cancellationException);
                    }
                    jk.d dVar = tVar2.f6766c;
                    if (dVar != null) {
                        l(dVar, cancellationException, tVar2.f6764a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // cn.j2
    public final void b(hn.s sVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f6730f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        w(sVar);
    }

    @Override // cn.l0
    public final ak.f c() {
        return this.f6733d;
    }

    @Override // cn.l0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // cn.j
    public final void e(Object obj, jk.b bVar) throws IllegalAccessException, j0, InvocationTargetException {
        B(obj, this.f6735c, bVar != null ? new k(bVar, 0) : null);
    }

    @Override // cn.j
    public final boolean f(Throwable th2) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6731g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof w1)) {
                return false;
            }
            boolean z10 = (obj instanceof i) || (obj instanceof hn.s);
            if (th2 == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th2;
            }
            m mVar = new m(cancellationException, z10);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    w1 w1Var = (w1) obj;
                    if (w1Var instanceof i) {
                        k((i) obj, th2);
                    } else if (w1Var instanceof hn.s) {
                        n((hn.s) obj, th2);
                    }
                    if (!x()) {
                        o();
                    }
                    q(this.f6735c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // cn.j
    public final void g(Object obj, jk.d dVar) throws IllegalAccessException, j0, InvocationTargetException {
        B(obj, this.f6735c, dVar);
    }

    @Override // ck.d
    public final ck.d getCallerFrame() {
        ak.f fVar = this.f6733d;
        if (fVar instanceof ck.d) {
            return (ck.d) fVar;
        }
        return null;
    }

    @Override // ak.f
    public final ak.k getContext() {
        return this.f6734e;
    }

    @Override // cn.l0
    public final Object h(Object obj) {
        return obj instanceof t ? ((t) obj).f6764a : obj;
    }

    @Override // cn.j
    public final boolean isActive() {
        return f6731g.get(this) instanceof w1;
    }

    @Override // cn.l0
    public final Object j() {
        return f6731g.get(this);
    }

    public final void k(i iVar, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        try {
            iVar.a(th2);
        } catch (Throwable th3) {
            d0.t(this.f6734e, new aa.b(2, "Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void l(jk.d dVar, Throwable th2, Object obj) throws IllegalAccessException, InvocationTargetException {
        ak.k kVar = this.f6734e;
        try {
            dVar.invoke(th2, obj, kVar);
        } catch (Throwable th3) {
            d0.t(kVar, new aa.b(2, "Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // cn.j
    public final hn.u m(Object obj, jk.d dVar) {
        return E(obj, dVar);
    }

    public final void n(hn.s sVar, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        ak.k kVar = this.f6734e;
        int i10 = f6730f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.h(i10, kVar);
        } catch (Throwable th3) {
            d0.t(kVar, new aa.b(2, "Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6732h;
        p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
        if (p0Var == null) {
            return;
        }
        p0Var.dispose();
        atomicReferenceFieldUpdater.set(this, v1.f6778a);
    }

    @Override // cn.j
    public final void p(Object obj) throws j0 {
        q(this.f6735c);
    }

    public final void q(int i10) throws j0 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f6730f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i10 == 4;
                ak.f fVar = this.f6733d;
                if (!z10 && (fVar instanceof hn.g)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.f6735c;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        hn.g gVar = (hn.g) fVar;
                        w wVar = gVar.f42428d;
                        ak.k context = gVar.f42429e.getContext();
                        if (hn.b.j(wVar, context)) {
                            hn.b.i(wVar, context, this);
                            return;
                        }
                        x0 x0VarA = b2.a();
                        if (x0VarA.f6785b >= 4294967296L) {
                            x0VarA.u(this);
                            return;
                        }
                        x0VarA.w(true);
                        try {
                            d0.A(this, fVar, true);
                            do {
                            } while (x0VarA.y());
                        } catch (Throwable th2) {
                            try {
                                i(th2);
                            } finally {
                                x0VarA.t(true);
                            }
                        }
                        return;
                    }
                }
                d0.A(this, fVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable r(q1 q1Var) {
        return q1Var.h();
    }

    @Override // ak.f
    public final void resumeWith(Object obj) {
        Throwable thA = wj.h.a(obj);
        if (thA != null) {
            obj = new u(thA, false);
        }
        B(obj, this.f6735c, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        f1 f1Var;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = f6730f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = f6731g.get(this);
                if (obj instanceof u) {
                    throw ((u) obj).f6771a;
                }
                int i12 = this.f6735c;
                if ((i12 != 1 && i12 != 2) || (f1Var = (f1) this.f6734e.get(e1.f6705a)) == null || f1Var.isActive()) {
                    return h(obj);
                }
                CancellationException cancellationExceptionH = f1Var.h();
                a(cancellationExceptionH);
                throw cancellationExceptionH;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((p0) f6732h.get(this)) == null) {
            u();
        }
        if (zX) {
            A();
        }
        return bk.a.f5708a;
    }

    public final void t() {
        p0 p0VarU = u();
        if (p0VarU == null || (f6731g.get(this) instanceof w1)) {
            return;
        }
        p0VarU.dispose();
        f6732h.set(this, v1.f6778a);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(d0.F(this.f6733d));
        sb2.append("){");
        Object obj = f6731g.get(this);
        if (obj instanceof w1) {
            str = "Active";
        } else {
            str = obj instanceof m ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(d0.q(this));
        return sb2.toString();
    }

    public final p0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f1 f1Var = (f1) this.f6734e.get(e1.f6705a);
        if (f1Var == null) {
            return null;
        }
        p0 p0VarU = d0.u(f1Var, true, new n(this, 0));
        do {
            atomicReferenceFieldUpdater = f6732h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, p0VarU)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return p0VarU;
    }

    public final void v(jk.b bVar) {
        w(new h(bVar, 1));
    }

    public final void w(w1 w1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6731g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof i) || (obj instanceof hn.s)) {
                y(w1Var, obj);
                throw null;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (!u.f6770b.compareAndSet(uVar, 0, 1)) {
                    y(w1Var, obj);
                    throw null;
                }
                if (obj instanceof m) {
                    Throwable th2 = uVar.f6771a;
                    if (w1Var instanceof i) {
                        k((i) w1Var, th2);
                        return;
                    } else {
                        kotlin.jvm.internal.n.d(w1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        n((hn.s) w1Var, th2);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof t)) {
                if (w1Var instanceof hn.s) {
                    return;
                }
                kotlin.jvm.internal.n.d(w1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                t tVar = new t(obj, (i) w1Var, (jk.d) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            t tVar2 = (t) obj;
            if (tVar2.f6765b != null) {
                y(w1Var, obj);
                throw null;
            }
            if (w1Var instanceof hn.s) {
                return;
            }
            kotlin.jvm.internal.n.d(w1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            i iVar = (i) w1Var;
            Throwable th3 = tVar2.f6768e;
            if (th3 != null) {
                k(iVar, th3);
                return;
            }
            t tVarA = t.a(tVar2, iVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, tVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean x() {
        if (this.f6735c != 2) {
            return false;
        }
        ak.f fVar = this.f6733d;
        kotlin.jvm.internal.n.d(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return hn.g.f42427h.get((hn.g) fVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
