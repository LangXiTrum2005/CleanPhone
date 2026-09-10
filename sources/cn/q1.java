package cn;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class q1 implements f1, x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6757a = AtomicReferenceFieldUpdater.newUpdater(q1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6758b = AtomicReferenceFieldUpdater.newUpdater(q1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public q1(boolean z10) {
        this._state$volatile = z10 ? d0.f6697j : d0.f6696i;
    }

    public static p R(hn.k kVar) {
        while (kVar.g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hn.k.f42440b;
            hn.k kVarD = kVar.d();
            if (kVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (hn.k) obj;
                    if (!kVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = kVarD;
            }
        }
        while (true) {
            kVar = kVar.f();
            if (!kVar.g()) {
                if (kVar instanceof p) {
                    return (p) kVar;
                }
                if (kVar instanceof t1) {
                    return null;
                }
            }
        }
    }

    public static String Y(Object obj) {
        if (!(obj instanceof m1)) {
            if (obj instanceof b1) {
                return ((b1) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof u ? "Cancelled" : "Completed";
        }
        m1 m1Var = (m1) obj;
        if (m1Var.d()) {
            return "Cancelling";
        }
        return m1.f6742b.get(m1Var) == 1 ? "Completing" : "Active";
    }

    public final Object A(m1 m1Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thC;
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th2 = uVar != null ? uVar.f6771a : null;
        synchronized (m1Var) {
            m1Var.d();
            ArrayList<Throwable> arrayListE = m1Var.e(th2);
            thC = C(m1Var, arrayListE);
            if (thC != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th3 : arrayListE) {
                    if (th3 != thC && th3 != thC && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        qk.i0.c(thC, th3);
                    }
                }
            }
        }
        if (thC != null && thC != th2) {
            obj = new u(thC, false);
        }
        if (thC != null && (v(thC) || H(thC))) {
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            u.f6770b.compareAndSet((u) obj, 0, 1);
        }
        T(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6757a;
        Object c1Var = obj instanceof b1 ? new c1((b1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, m1Var, c1Var) && atomicReferenceFieldUpdater.get(this) == m1Var) {
        }
        y(m1Var, obj);
        return obj;
    }

    public final Object B() throws Throwable {
        Object obj = f6757a.get(this);
        if (obj instanceof b1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof u) {
            throw ((u) obj).f6771a;
        }
        return d0.H(obj);
    }

    public final Throwable C(m1 m1Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (m1Var.d()) {
                return new g1(w(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof d2) {
            for (Object obj2 : arrayList) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof d2)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean D() {
        return true;
    }

    public final am.e E() {
        kotlin.jvm.internal.h0.d(3, o1.f6752b);
        kotlin.jvm.internal.h0.d(3, p1.f6754b);
        return new am.e(this);
    }

    public boolean F() {
        return this instanceof r;
    }

    public final t1 G(b1 b1Var) {
        t1 t1VarB = b1Var.b();
        if (t1VarB != null) {
            return t1VarB;
        }
        if (b1Var instanceof r0) {
            return new t1();
        }
        if (b1Var instanceof j1) {
            W((j1) b1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + b1Var).toString());
    }

    public boolean H(Throwable th2) {
        return false;
    }

    public final void J(f1 f1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6758b;
        v1 v1Var = v1.f6778a;
        if (f1Var == null) {
            atomicReferenceFieldUpdater.set(this, v1Var);
            return;
        }
        f1Var.start();
        o oVarK = f1Var.k(this);
        atomicReferenceFieldUpdater.set(this, oVarK);
        if (L()) {
            oVarK.dispose();
            atomicReferenceFieldUpdater.set(this, v1Var);
        }
    }

    public final p0 K(boolean z10, j1 j1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z11;
        boolean zC;
        j1Var.f6723d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f6757a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z12 = obj instanceof r0;
            v1 v1Var = v1.f6778a;
            z11 = true;
            if (!z12) {
                if (!(obj instanceof b1)) {
                    z11 = false;
                    break;
                }
                b1 b1Var = (b1) obj;
                t1 t1VarB = b1Var.b();
                if (t1VarB == null) {
                    W((j1) obj);
                } else {
                    if (j1Var.i()) {
                        m1 m1Var = b1Var instanceof m1 ? (m1) b1Var : null;
                        Throwable thC = m1Var != null ? m1Var.c() : null;
                        if (thC == null) {
                            zC = t1VarB.c(j1Var, 5);
                        } else if (z10) {
                            j1Var.j(thC);
                            return v1Var;
                        }
                    } else {
                        zC = t1VarB.c(j1Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                r0 r0Var = (r0) obj;
                if (r0Var.f6759a) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, j1Var)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    V(r0Var);
                }
            }
            return v1Var;
        }
        if (z11) {
            return j1Var;
        }
        if (z10) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            u uVar = obj2 instanceof u ? (u) obj2 : null;
            j1Var.j(uVar != null ? uVar.f6771a : null);
        }
        return v1Var;
    }

    public final boolean L() {
        return !(f6757a.get(this) instanceof b1);
    }

    public boolean M() {
        return this instanceof f;
    }

    public final Object N(ak.f fVar) {
        Object obj;
        wj.r rVar;
        do {
            obj = f6757a.get(this);
            boolean z10 = obj instanceof b1;
            rVar = wj.r.f53297a;
            if (!z10) {
                d0.m(fVar.getContext());
                return rVar;
            }
        } while (X(obj) < 0);
        l lVar = new l(1, com.google.android.gms.internal.play_billing.q1.t(fVar));
        lVar.t();
        lVar.w(new h(d0.u(this, true, new n(lVar, 1)), 2));
        Object objS = lVar.s();
        bk.a aVar = bk.a.f5708a;
        if (objS != aVar) {
            objS = rVar;
        }
        return objS == aVar ? objS : rVar;
    }

    public final boolean O(Object obj) {
        Object objZ;
        do {
            objZ = Z(f6757a.get(this), obj);
            if (objZ == d0.f6691d) {
                return false;
            }
            if (objZ == d0.f6692e) {
                return true;
            }
        } while (objZ == d0.f6693f);
        q(objZ);
        return true;
    }

    public final Object P(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objZ;
        do {
            objZ = Z(f6757a.get(this), obj);
            if (objZ == d0.f6691d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                u uVar = obj instanceof u ? (u) obj : null;
                throw new IllegalStateException(str, uVar != null ? uVar.f6771a : null);
            }
        } while (objZ == d0.f6693f);
        return objZ;
    }

    public String Q() {
        return getClass().getSimpleName();
    }

    public final void S(t1 t1Var, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        t1Var.c(new hn.i(4), 4);
        Object obj = hn.k.f42439a.get(t1Var);
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        aa.b bVar = null;
        for (hn.k kVarF = (hn.k) obj; !kVarF.equals(t1Var); kVarF = kVarF.f()) {
            if ((kVarF instanceof j1) && ((j1) kVarF).i()) {
                try {
                    ((j1) kVarF).j(th2);
                } catch (Throwable th3) {
                    if (bVar != null) {
                        qk.i0.c(bVar, th3);
                    } else {
                        bVar = new aa.b(2, "Exception in completion handler " + kVarF + " for " + this, th3);
                    }
                }
            }
        }
        if (bVar != null) {
            I(bVar);
        }
        v(th2);
    }

    public final void V(r0 r0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t1 t1Var = new t1();
        Object a1Var = t1Var;
        if (!r0Var.f6759a) {
            a1Var = new a1(t1Var);
        }
        do {
            atomicReferenceFieldUpdater = f6757a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, r0Var, a1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == r0Var);
    }

    public final void W(j1 j1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t1 t1Var = new t1();
        j1Var.getClass();
        hn.k.f42440b.set(t1Var, j1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = hn.k.f42439a;
        atomicReferenceFieldUpdater2.set(t1Var, j1Var);
        loop0: while (atomicReferenceFieldUpdater2.get(j1Var) == j1Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(j1Var, j1Var, t1Var)) {
                    t1Var.e(j1Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(j1Var) == j1Var);
        }
        hn.k kVarF = j1Var.f();
        do {
            atomicReferenceFieldUpdater = f6757a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, j1Var, kVarF)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == j1Var);
    }

    public final int X(Object obj) {
        boolean z10 = obj instanceof r0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6757a;
        if (z10) {
            if (((r0) obj).f6759a) {
                return 0;
            }
            r0 r0Var = d0.f6697j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            U();
            return 1;
        }
        if (!(obj instanceof a1)) {
            return 0;
        }
        t1 t1Var = ((a1) obj).f6671a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, t1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        U();
        return 1;
    }

    public final Object Z(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if (!(obj instanceof b1)) {
            return d0.f6691d;
        }
        if (((obj instanceof r0) || (obj instanceof j1)) && !(obj instanceof p) && !(obj2 instanceof u)) {
            b1 b1Var = (b1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6757a;
            Object c1Var = obj2 instanceof b1 ? new c1((b1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b1Var, c1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                    return d0.f6693f;
                }
            }
            T(obj2);
            y(b1Var, obj2);
            return obj2;
        }
        b1 b1Var2 = (b1) obj;
        t1 t1VarG = G(b1Var2);
        if (t1VarG == null) {
            return d0.f6693f;
        }
        m1 m1Var = b1Var2 instanceof m1 ? (m1) b1Var2 : null;
        if (m1Var == null) {
            m1Var = new m1(t1VarG, null);
        }
        synchronized (m1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m1.f6742b;
            if (atomicIntegerFieldUpdater.get(m1Var) == 1) {
                return d0.f6691d;
            }
            atomicIntegerFieldUpdater.set(m1Var, 1);
            if (m1Var != b1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6757a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, b1Var2, m1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != b1Var2) {
                        return d0.f6693f;
                    }
                }
            }
            boolean zD = m1Var.d();
            u uVar = obj2 instanceof u ? (u) obj2 : null;
            if (uVar != null) {
                m1Var.a(uVar.f6771a);
            }
            Throwable thC = zD ? null : m1Var.c();
            if (thC != null) {
                S(t1VarG, thC);
            }
            p pVarR = R(t1VarG);
            if (pVarR != null && a0(m1Var, pVarR, obj2)) {
                return d0.f6692e;
            }
            t1VarG.c(new hn.i(2), 2);
            p pVarR2 = R(t1VarG);
            return (pVarR2 == null || !a0(m1Var, pVarR2, obj2)) ? A(m1Var, obj2) : d0.f6692e;
        }
    }

    @Override // cn.f1
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new g1(w(), null, this);
        }
        u(cancellationException);
    }

    public final boolean a0(m1 m1Var, p pVar, Object obj) {
        while (d0.u(pVar.f6753e, false, new l1(this, m1Var, pVar, obj)) == v1.f6778a) {
            pVar = R(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    public Object d() {
        return B();
    }

    @Override // ak.k
    public final Object fold(Object obj, jk.c cVar) {
        return cVar.invoke(obj, this);
    }

    @Override // ak.k
    public final ak.i get(ak.j jVar) {
        return com.google.android.gms.internal.auth.i.r(this, jVar);
    }

    @Override // ak.i
    public final ak.j getKey() {
        return e1.f6705a;
    }

    @Override // cn.f1
    public final CancellationException h() {
        CancellationException cancellationException;
        Object obj = f6757a.get(this);
        if (!(obj instanceof m1)) {
            if (obj instanceof b1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof u)) {
                return new g1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((u) obj).f6771a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new g1(w(), th2, this) : cancellationException;
        }
        Throwable thC = ((m1) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = w();
        }
        return new g1(strConcat, thC, this);
    }

    @Override // cn.f1
    public boolean isActive() {
        Object obj = f6757a.get(this);
        return (obj instanceof b1) && ((b1) obj).isActive();
    }

    @Override // cn.f1
    public final boolean isCancelled() {
        Object obj = f6757a.get(this);
        if (obj instanceof u) {
            return true;
        }
        return (obj instanceof m1) && ((m1) obj).d();
    }

    @Override // cn.f1
    public final p0 j(boolean z10, boolean z11, i1 i1Var) {
        return K(z11, z10 ? new d1(i1Var) : new q0(i1Var, 1));
    }

    @Override // cn.f1
    public final o k(q1 q1Var) throws IllegalAccessException, InvocationTargetException {
        p pVar = new p(q1Var);
        pVar.f6723d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6757a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                if (r0Var.f6759a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                V(r0Var);
            } else {
                boolean z10 = obj instanceof b1;
                v1 v1Var = v1.f6778a;
                Throwable thC = null;
                if (!z10) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    u uVar = obj2 instanceof u ? (u) obj2 : null;
                    pVar.j(uVar != null ? uVar.f6771a : null);
                    return v1Var;
                }
                t1 t1VarB = ((b1) obj).b();
                if (t1VarB != null) {
                    if (t1VarB.c(pVar, 7)) {
                        break;
                    }
                    boolean zC = t1VarB.c(pVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof m1) {
                        thC = ((m1) obj3).c();
                    } else {
                        u uVar2 = obj3 instanceof u ? (u) obj3 : null;
                        if (uVar2 != null) {
                            thC = uVar2.f6771a;
                        }
                    }
                    pVar.j(thC);
                    if (zC) {
                        break;
                    }
                    return v1Var;
                }
                W((j1) obj);
            }
        }
        return pVar;
    }

    @Override // ak.k
    public final ak.k minusKey(ak.j jVar) {
        return com.google.android.gms.internal.auth.i.z(this, jVar);
    }

    @Override // cn.f1
    public final p0 n(jk.b bVar) {
        return K(true, new q0(bVar, 1));
    }

    public Object o(ck.c cVar) {
        return s(cVar);
    }

    @Override // ak.k
    public final ak.k plus(ak.k kVar) {
        return com.google.android.gms.internal.auth.i.D(this, kVar);
    }

    public void r(Object obj) {
        q(obj);
    }

    public final Object s(ck.c cVar) throws Throwable {
        Object obj;
        do {
            obj = f6757a.get(this);
            if (!(obj instanceof b1)) {
                if (obj instanceof u) {
                    throw ((u) obj).f6771a;
                }
                return d0.H(obj);
            }
        } while (X(obj) < 0);
        k1 k1Var = new k1(com.google.android.gms.internal.play_billing.q1.t(cVar), this);
        k1Var.t();
        k1Var.w(new h(d0.u(this, true, new q0(k1Var, 2)), 2));
        return k1Var.s();
    }

    @Override // cn.f1
    public final boolean start() {
        int iX;
        do {
            iX = X(f6757a.get(this));
            if (iX == 0) {
                return false;
            }
        } while (iX != 1);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v11 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00b4->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0042, please report this as an issue */
    public final boolean t(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thZ;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        boolean z10;
        Throwable thC;
        hn.u uVar;
        b1 b1Var;
        t1 t1VarG;
        m1 m1Var;
        Object objZ;
        Object objZ2 = d0.f6691d;
        if (F()) {
            do {
                Object obj3 = f6757a.get(this);
                if (obj3 instanceof b1) {
                    if (obj3 instanceof m1) {
                        if (m1.f6742b.get((m1) obj3) == 1) {
                        }
                    }
                    objZ2 = Z(obj3, new u(z(obj), false));
                }
                objZ2 = d0.f6691d;
                break;
            } while (objZ2 == d0.f6693f);
            if (objZ2 != d0.f6692e) {
                if (objZ2 == d0.f6691d) {
                    thZ = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f6757a;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof m1) {
                            synchronized (obj2) {
                                if (m1.f6744d.get((m1) obj2) == d0.f6695h) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    uVar = d0.f6694g;
                                } else {
                                    boolean zD = ((m1) obj2).d();
                                    if (thZ == null) {
                                        thZ = z(obj);
                                    }
                                    ((m1) obj2).a(thZ);
                                    thC = zD ? null : ((m1) obj2).c();
                                    if (thC != null) {
                                        S(((m1) obj2).f6745a, thC);
                                    }
                                    uVar = d0.f6691d;
                                }
                            }
                        } else if (obj2 instanceof b1) {
                            if (thZ == null) {
                                thZ = z(obj);
                            }
                            b1Var = (b1) obj2;
                            if (b1Var.isActive()) {
                                t1VarG = G(b1Var);
                                if (t1VarG == null) {
                                    continue;
                                } else {
                                    m1Var = new m1(t1VarG, thZ);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, m1Var)) {
                                            S(t1VarG, thZ);
                                            uVar = d0.f6691d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                                        }
                                    }
                                }
                            } else {
                                objZ = Z(obj2, new u(thZ, false));
                                if (objZ != d0.f6691d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objZ != d0.f6693f) {
                                    objZ2 = objZ;
                                    break;
                                }
                            }
                        } else {
                            uVar = d0.f6694g;
                        }
                        objZ2 = uVar;
                        break;
                    }
                }
                if (objZ2 != d0.f6691d && objZ2 != d0.f6692e) {
                    if (objZ2 == d0.f6694g) {
                        return false;
                    }
                    q(objZ2);
                    return true;
                }
            }
        } else {
            if (objZ2 == d0.f6691d) {
                thZ = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f6757a;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof m1) {
                        synchronized (obj2) {
                            if (m1.f6744d.get((m1) obj2) == d0.f6695h) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                uVar = d0.f6694g;
                            } else {
                                boolean zD2 = ((m1) obj2).d();
                                if (thZ == null) {
                                    thZ = z(obj);
                                }
                                ((m1) obj2).a(thZ);
                                if (zD2) {
                                }
                                if (thC != null) {
                                    S(((m1) obj2).f6745a, thC);
                                }
                                uVar = d0.f6691d;
                            }
                        }
                    } else if (obj2 instanceof b1) {
                        if (thZ == null) {
                            thZ = z(obj);
                        }
                        b1Var = (b1) obj2;
                        if (b1Var.isActive()) {
                            t1VarG = G(b1Var);
                            if (t1VarG == null) {
                                continue;
                            } else {
                                m1Var = new m1(t1VarG, thZ);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, m1Var)) {
                                        S(t1VarG, thZ);
                                        uVar = d0.f6691d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                                    }
                                }
                            }
                        } else {
                            objZ = Z(obj2, new u(thZ, false));
                            if (objZ != d0.f6691d) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objZ != d0.f6693f) {
                                objZ2 = objZ;
                                break;
                            }
                        }
                    } else {
                        uVar = d0.f6694g;
                    }
                    objZ2 = uVar;
                    break;
                }
            }
            if (objZ2 != d0.f6691d) {
                if (objZ2 == d0.f6694g) {
                    return false;
                }
                q(objZ2);
                return true;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Q() + '{' + Y(f6757a.get(this)) + '}');
        sb2.append('@');
        sb2.append(d0.q(this));
        return sb2.toString();
    }

    public void u(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        t(cancellationException);
    }

    public final boolean v(Throwable th2) {
        if (M()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        o oVar = (o) f6758b.get(this);
        if (oVar == null || oVar == v1.f6778a) {
            return z10;
        }
        return oVar.a(th2) || z10;
    }

    public String w() {
        return "Job was cancelled";
    }

    public boolean x(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return t(th2) && D();
    }

    public final void y(b1 b1Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6758b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.dispose();
            atomicReferenceFieldUpdater.set(this, v1.f6778a);
        }
        aa.b bVar = null;
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th2 = uVar != null ? uVar.f6771a : null;
        if (b1Var instanceof j1) {
            try {
                ((j1) b1Var).j(th2);
                return;
            } catch (Throwable th3) {
                I(new aa.b(2, "Exception in completion handler " + b1Var + " for " + this, th3));
                return;
            }
        }
        t1 t1VarB = b1Var.b();
        if (t1VarB != null) {
            t1VarB.c(new hn.i(1), 1);
            Object obj2 = hn.k.f42439a.get(t1VarB);
            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (hn.k kVarF = (hn.k) obj2; !kVarF.equals(t1VarB); kVarF = kVarF.f()) {
                if (kVarF instanceof j1) {
                    try {
                        ((j1) kVarF).j(th2);
                    } catch (Throwable th4) {
                        if (bVar != null) {
                            qk.i0.c(bVar, th4);
                        } else {
                            bVar = new aa.b(2, "Exception in completion handler " + kVarF + " for " + this, th4);
                        }
                    }
                }
            }
            if (bVar != null) {
                I(bVar);
            }
        }
    }

    public final Throwable z(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        q1 q1Var = (q1) ((x1) obj);
        Object obj2 = f6757a.get(q1Var);
        if (obj2 instanceof m1) {
            thC = ((m1) obj2).c();
        } else if (obj2 instanceof u) {
            thC = ((u) obj2).f6771a;
        } else {
            if (obj2 instanceof b1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new g1("Parent job is ".concat(Y(obj2)), thC, q1Var) : cancellationException;
    }

    public void U() {
    }

    public void I(aa.b bVar) {
        throw bVar;
    }

    public void T(Object obj) {
    }

    public void q(Object obj) {
    }
}
