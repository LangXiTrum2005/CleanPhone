package cn;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hn.u f6688a = new hn.u("RESUME_TOKEN", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hn.u f6689b = new hn.u("REMOVED_TASK", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hn.u f6690c = new hn.u("CLOSED_EMPTY", 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hn.u f6691d = new hn.u("COMPLETING_ALREADY", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hn.u f6692e = new hn.u("COMPLETING_WAITING_CHILDREN", 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hn.u f6693f = new hn.u("COMPLETING_RETRY", 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final hn.u f6694g = new hn.u("TOO_LATE_TO_CANCEL", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hn.u f6695h = new hn.u("SEALED", 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r0 f6696i = new r0(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r0 f6697j = new r0(true);

    public static final void A(l lVar, ak.f fVar, boolean z10) {
        Object obj = l.f6731g.get(lVar);
        Throwable thD = lVar.d(obj);
        Object objC = thD != null ? t9.e.c(thD) : lVar.h(obj);
        if (!z10) {
            fVar.resumeWith(objC);
            return;
        }
        kotlin.jvm.internal.n.d(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        hn.g gVar = (hn.g) fVar;
        ck.c cVar = gVar.f42429e;
        Object obj2 = gVar.f42431g;
        ak.k context = cVar.getContext();
        Object objN = hn.b.n(context, obj2);
        h2 h2VarI = objN != hn.b.f42418d ? I(cVar, context, objN) : null;
        try {
            cVar.resumeWith(objC);
        } finally {
            if (h2VarI == null || h2VarI.f0()) {
                hn.b.g(context, objN);
            }
        }
    }

    public static Object B(jk.c cVar) {
        return C(ak.l.f3620a, cVar);
    }

    public static final Object C(ak.k kVar, jk.c cVar) throws Throwable {
        x0 x0VarA;
        ak.k kVarN;
        long jX;
        ak.j jVar = ak.g.f3619a;
        ak.h hVar = (ak.h) kVar.get(jVar);
        ak.l lVar = ak.l.f3620a;
        if (hVar == null) {
            x0VarA = b2.a();
            kVarN = n(lVar, kVar.plus(x0VarA), true);
            jn.e eVar = n0.f6748a;
            if (kVarN != eVar && kVarN.get(jVar) == null) {
                kVarN = kVarN.plus(eVar);
            }
        } else {
            x0VarA = (x0) b2.f6678a.get();
            kVarN = n(lVar, kVar, true);
            jn.e eVar2 = n0.f6748a;
            if (kVarN != eVar2 && kVarN.get(jVar) == null) {
                kVarN = kVarN.plus(eVar2);
            }
        }
        f fVar = new f(kVarN, Thread.currentThread(), x0VarA);
        fVar.d0(b0.f6673a, fVar, cVar);
        x0 x0Var = fVar.f6708e;
        if (x0Var != null) {
            int i10 = x0.f6784e;
            x0Var.w(false);
        }
        while (true) {
            if (x0Var != null) {
                try {
                    jX = x0Var.x();
                } catch (Throwable th2) {
                    if (x0Var != null) {
                        int i11 = x0.f6784e;
                        x0Var.t(false);
                    }
                    throw th2;
                }
            } else {
                jX = Long.MAX_VALUE;
            }
            if (fVar.L()) {
                break;
            }
            LockSupport.parkNanos(fVar, jX);
            if (Thread.interrupted()) {
                fVar.t(new InterruptedException());
            }
        }
        if (x0Var != null) {
            int i12 = x0.f6784e;
            x0Var.t(false);
        }
        Object objH = H(q1.f6757a.get(fVar));
        u uVar = objH instanceof u ? (u) objH : null;
        if (uVar == null) {
            return objH;
        }
        throw uVar.f6771a;
    }

    public static final Object E(e2 e2Var, jk.c cVar) {
        u(e2Var, true, new q0(p(e2Var.f42453d.getContext()).b(e2Var.f6706e, e2Var, e2Var.f6670c), 0));
        return cc.a2.N(e2Var, false, e2Var, cVar);
    }

    public static final String F(ak.f fVar) {
        Object objC;
        if (fVar instanceof hn.g) {
            return ((hn.g) fVar).toString();
        }
        try {
            objC = fVar + '@' + q(fVar);
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        if (wj.h.a(objC) != null) {
            objC = fVar.getClass().getName() + '@' + q(fVar);
        }
        return (String) objC;
    }

    public static final long G(long j10) {
        int i10 = bn.a.f5743d;
        boolean z10 = j10 > 0;
        if (z10) {
            return bn.a.d(bn.a.f(j10, d0.c.P(999999L, bn.c.NANOSECONDS)));
        }
        if (z10) {
            throw new aa.b((byte) 0, 20);
        }
        return 0L;
    }

    public static final Object H(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.f6683a) == null) ? obj : b1Var;
    }

    public static final h2 I(ak.f fVar, ak.k kVar, Object obj) {
        h2 h2Var = null;
        if ((fVar instanceof ck.d) && kVar.get(i2.f6721a) != null) {
            ck.d callerFrame = (ck.d) fVar;
            while (!(callerFrame instanceof k0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof h2) {
                    h2Var = (h2) callerFrame;
                    break;
                }
            }
            if (h2Var != null) {
                h2Var.h0(kVar, obj);
            }
        }
        return h2Var;
    }

    public static final Object J(ak.k kVar, jk.c cVar, ak.f fVar) throws Throwable {
        ak.k context = fVar.getContext();
        ak.k kVarPlus = !((Boolean) kVar.fold(Boolean.FALSE, new ak.c(2))).booleanValue() ? context.plus(kVar) : n(context, kVar, false);
        m(kVarPlus);
        if (kVarPlus == context) {
            hn.r rVar = new hn.r(fVar, kVarPlus);
            return cc.a2.N(rVar, true, rVar, cVar);
        }
        ak.g gVar = ak.g.f3619a;
        if (kotlin.jvm.internal.n.a(kVarPlus.get(gVar), context.get(gVar))) {
            h2 h2Var = new h2(fVar, kVarPlus);
            ak.k kVar2 = h2Var.f6670c;
            Object objN = hn.b.n(kVar2, null);
            try {
                return cc.a2.N(h2Var, true, h2Var, cVar);
            } finally {
                hn.b.g(kVar2, objN);
            }
        }
        k0 k0Var = new k0(fVar, kVarPlus);
        try {
            hn.b.h(com.google.android.gms.internal.play_billing.q1.t(com.google.android.gms.internal.play_billing.q1.j(k0Var, k0Var, cVar)), wj.r.f53297a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k0.f6726e;
            do {
                int i10 = atomicIntegerFieldUpdater.get(k0Var);
                if (i10 != 0) {
                    if (i10 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objH = H(q1.f6757a.get(k0Var));
                    if (objH instanceof u) {
                        throw ((u) objH).f6771a;
                    }
                    return objH;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(k0Var, 0, 1));
            return bk.a.f5708a;
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof j0) {
                th = ((j0) th).f6722a;
            }
            k0Var.resumeWith(t9.e.c(th));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object K(long j10, jk.c cVar, ak.f fVar) {
        f2 f2Var;
        kotlin.jvm.internal.c0 c0Var;
        if (fVar instanceof f2) {
            f2Var = (f2) fVar;
            int i10 = f2Var.f6712h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f2Var.f6712h = i10 - Integer.MIN_VALUE;
            } else {
                f2Var = new f2(fVar);
            }
        } else {
            f2Var = new f2(fVar);
        }
        Object obj = f2Var.f6711g;
        int i11 = f2Var.f6712h;
        if (i11 == 0) {
            t9.e.z(obj);
            if (j10 <= 0) {
                return null;
            }
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            try {
                f2Var.f6710f = c0Var2;
                f2Var.f6712h = 1;
                e2 e2Var = new e2(j10, f2Var);
                c0Var2.f44760a = e2Var;
                Object objE = E(e2Var, cVar);
                bk.a aVar = bk.a.f5708a;
                return objE == aVar ? aVar : objE;
            } catch (d2 e10) {
                e = e10;
                c0Var = c0Var2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = f2Var.f6710f;
            try {
                t9.e.z(obj);
                return obj;
            } catch (d2 e11) {
                e = e11;
            }
        }
        if (e.f6700a == c0Var.f44760a) {
            return null;
        }
        throw e;
    }

    public static r a() {
        r rVar = new r(true);
        rVar.J(null);
        return rVar;
    }

    public static final hn.d b(ak.k kVar) {
        if (kVar.get(e1.f6705a) == null) {
            kVar = kVar.plus(c());
        }
        return new hn.d(kVar);
    }

    public static h1 c() {
        return new h1(null);
    }

    public static final hn.d d() {
        z1 z1VarE = e();
        jn.e eVar = n0.f6748a;
        return new hn.d(com.google.android.gms.internal.auth.i.D(z1VarE, hn.o.f42451a));
    }

    public static z1 e() {
        return new z1(null);
    }

    public static final Executor f(w wVar) {
        Executor executorT;
        y0 y0Var = wVar instanceof y0 ? (y0) wVar : null;
        return (y0Var == null || (executorT = y0Var.t()) == null) ? new m0(wVar) : executorT;
    }

    public static h0 g(a0 a0Var, jk.c cVar, int i10) {
        b0 b0Var = (i10 & 2) != 0 ? b0.f6673a : b0.f6676d;
        ak.k kVarX = x(a0Var, ak.l.f3620a);
        h0 r1Var = b0Var == b0.f6674b ? new r1(kVarX, cVar) : new h0(kVarX, true);
        r1Var.d0(b0Var, r1Var, cVar);
        return r1Var;
    }

    public static final Object h(ArrayList arrayList, ck.c cVar) {
        return arrayList.isEmpty() ? xj.v.f53866a : new e((g0[]) arrayList.toArray(new g0[0])).a(cVar);
    }

    public static final void i(ak.k kVar, CancellationException cancellationException) {
        f1 f1Var = (f1) kVar.get(e1.f6705a);
        if (f1Var != null) {
            f1Var.a(cancellationException);
        }
    }

    public static void j(a0 a0Var) {
        f1 f1Var = (f1) a0Var.getCoroutineContext().get(e1.f6705a);
        if (f1Var != null) {
            f1Var.a(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + a0Var).toString());
        }
    }

    public static final Object k(jk.c cVar, ak.f fVar) {
        hn.r rVar = new hn.r(fVar, fVar.getContext());
        return cc.a2.N(rVar, true, rVar, cVar);
    }

    public static final Object l(long j10, ck.c cVar) {
        if (j10 > 0) {
            l lVar = new l(1, com.google.android.gms.internal.play_billing.q1.t(cVar));
            lVar.t();
            if (j10 < Long.MAX_VALUE) {
                p(lVar.f6734e).c(j10, lVar);
            }
            Object objS = lVar.s();
            if (objS == bk.a.f5708a) {
                return objS;
            }
        }
        return wj.r.f53297a;
    }

    public static final void m(ak.k kVar) {
        f1 f1Var = (f1) kVar.get(e1.f6705a);
        if (f1Var != null && !f1Var.isActive()) {
            throw f1Var.h();
        }
    }

    public static final ak.k n(ak.k kVar, ak.k kVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) kVar.fold(bool, new ak.c(2))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) kVar2.fold(bool, new ak.c(2))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return kVar.plus(kVar2);
        }
        ak.c cVar = new ak.c(3);
        ak.l lVar = ak.l.f3620a;
        ak.k kVar3 = (ak.k) kVar.fold(lVar, cVar);
        Object objFold = kVar2;
        if (zBooleanValue2) {
            objFold = kVar2.fold(lVar, new ak.c(4));
        }
        return kVar3.plus((ak.k) objFold);
    }

    public static final w o(Executor executor) {
        w wVar;
        m0 m0Var = executor instanceof m0 ? (m0) executor : null;
        return (m0Var == null || (wVar = m0Var.f6741a) == null) ? new z0(executor) : wVar;
    }

    public static final i0 p(ak.k kVar) {
        ak.i iVar = kVar.get(ak.g.f3619a);
        i0 i0Var = iVar instanceof i0 ? (i0) iVar : null;
        return i0Var == null ? f0.f6709a : i0Var;
    }

    public static final String q(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final f1 r(ak.k kVar) {
        f1 f1Var = (f1) kVar.get(e1.f6705a);
        if (f1Var != null) {
            return f1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + kVar).toString());
    }

    public static final l s(ak.f fVar) {
        l lVar;
        l lVar2;
        if (!(fVar instanceof hn.g)) {
            return new l(1, fVar);
        }
        hn.g gVar = (hn.g) fVar;
        hn.u uVar = hn.b.f42417c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hn.g.f42427h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            lVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, uVar);
                lVar2 = null;
                break;
            }
            if (obj instanceof l) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, uVar)) {
                        lVar2 = (l) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(gVar) == obj);
            } else if (obj != uVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (lVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l.f6731g;
            Object obj2 = atomicReferenceFieldUpdater2.get(lVar2);
            if (!(obj2 instanceof t) || ((t) obj2).f6767d == null) {
                l.f6730f.set(lVar2, 536870911);
                atomicReferenceFieldUpdater2.set(lVar2, b.f6672a);
                lVar = lVar2;
            } else {
                lVar2.o();
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return new l(2, fVar);
    }

    public static final void t(ak.k kVar, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th2 instanceof j0) {
            th2 = ((j0) th2).f6722a;
        }
        try {
            y yVar = (y) kVar.get(x.f6783a);
            if (yVar != null) {
                yVar.handleException(kVar, th2);
            } else {
                hn.b.d(kVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                qk.i0.c(runtimeException, th2);
                th2 = runtimeException;
            }
            hn.b.d(kVar, th2);
        }
    }

    public static final p0 u(f1 f1Var, boolean z10, j1 j1Var) {
        if (f1Var instanceof q1) {
            return ((q1) f1Var).K(z10, j1Var);
        }
        return f1Var.j(j1Var.i(), z10, new i1(1, j1Var, j1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final boolean v(a0 a0Var) {
        f1 f1Var = (f1) a0Var.getCoroutineContext().get(e1.f6705a);
        if (f1Var != null) {
            return f1Var.isActive();
        }
        return true;
    }

    public static y1 w(a0 a0Var, ak.k kVar, jk.c cVar, int i10) {
        if ((i10 & 1) != 0) {
            kVar = ak.l.f3620a;
        }
        b0 b0Var = (i10 & 2) != 0 ? b0.f6673a : b0.f6676d;
        ak.k kVarX = x(a0Var, kVar);
        y1 s1Var = b0Var == b0.f6674b ? new s1(kVarX, cVar) : new y1(kVarX, true);
        s1Var.d0(b0Var, s1Var, cVar);
        return s1Var;
    }

    public static final ak.k x(a0 a0Var, ak.k kVar) {
        ak.k kVarN = n(a0Var.getCoroutineContext(), kVar, true);
        jn.e eVar = n0.f6748a;
        return (kVarN == eVar || kVarN.get(ak.g.f3619a) != null) ? kVarN : kVarN.plus(eVar);
    }

    public static final hn.d y(a0 a0Var, ak.k kVar) {
        return new hn.d(a0Var.getCoroutineContext().plus(kVar));
    }

    public static final Object z(Object obj) {
        return obj instanceof u ? t9.e.c(((u) obj).f6771a) : obj;
    }
}
