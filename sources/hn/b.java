package hn;

import cn.a2;
import cn.b2;
import cn.d0;
import cn.e1;
import cn.f1;
import cn.h2;
import cn.j0;
import cn.x0;
import cn.y;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f42415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f42416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f42417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f42418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ak.c f42419e = new ak.c(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ak.c f42420f = new ak.c(11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ak.c f42421g = new ak.c(12);

    static {
        int i10 = 0;
        f42415a = new u("CLOSED", i10);
        f42416b = new u("UNDEFINED", i10);
        f42417c = new u("REUSABLE_CLAIMED", i10);
        f42418d = new u("NO_THREAD_ELEMENTS", i10);
    }

    public static final void a(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(l1.d.e(i10, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(s sVar, long j10, jk.c cVar) {
        while (true) {
            if (sVar.f42455c >= j10 && !sVar.d()) {
                return sVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f42422a;
            Object obj = atomicReferenceFieldUpdater.get(sVar);
            u uVar = f42415a;
            if (obj == uVar) {
                return uVar;
            }
            s sVar2 = (s) ((c) obj);
            if (sVar2 == null) {
                sVar2 = (s) cVar.invoke(Long.valueOf(sVar.f42455c + 1), sVar);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                        if (sVar.d()) {
                            sVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(sVar) == null);
            }
            sVar = sVar2;
        }
    }

    public static final s c(Object obj) {
        if (obj != f42415a) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(ak.k kVar, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Throwable runtimeException;
        Iterator it = e.f42425a.iterator();
        while (it.hasNext()) {
            try {
                ((y) it.next()).handleException(kVar, th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    i0.c(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            i0.c(th2, new f(kVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
        } catch (Throwable unused2) {
        }
    }

    public static final boolean e(Object obj) {
        return obj == f42415a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(ak.k kVar, Object obj) {
        if (obj == f42418d) {
            return;
        }
        if (!(obj instanceof x)) {
            Object objFold = kVar.fold(null, f42420f);
            kotlin.jvm.internal.n.d(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            defpackage.e.z(objFold);
            throw null;
        }
        x xVar = (x) obj;
        a2[] a2VarArr = xVar.f42463b;
        int length = a2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        a2 a2Var = a2VarArr[length];
        kotlin.jvm.internal.n.c(null);
        Object obj2 = xVar.f42462a[length];
        throw null;
    }

    public static final void h(ak.f fVar, Object obj) throws j0 {
        if (!(fVar instanceof g)) {
            fVar.resumeWith(obj);
            return;
        }
        g gVar = (g) fVar;
        cn.w wVar = gVar.f42428d;
        ck.c cVar = gVar.f42429e;
        Throwable thA = wj.h.a(obj);
        Object uVar = thA == null ? obj : new cn.u(thA, false);
        if (j(wVar, cVar.getContext())) {
            gVar.f42430f = uVar;
            gVar.f6735c = 1;
            i(wVar, cVar.getContext(), gVar);
            return;
        }
        x0 x0VarA = b2.a();
        if (x0VarA.f6785b >= 4294967296L) {
            gVar.f42430f = uVar;
            gVar.f6735c = 1;
            x0VarA.u(gVar);
            return;
        }
        x0VarA.w(true);
        try {
            f1 f1Var = (f1) cVar.getContext().get(e1.f6705a);
            if (f1Var == null || f1Var.isActive()) {
                Object obj2 = gVar.f42431g;
                ak.k context = cVar.getContext();
                Object objN = n(context, obj2);
                h2 h2VarI = objN != f42418d ? d0.I(cVar, context, objN) : null;
                try {
                    cVar.resumeWith(obj);
                    if (h2VarI == null || h2VarI.f0()) {
                        g(context, objN);
                    }
                } catch (Throwable th2) {
                    if (h2VarI == null || h2VarI.f0()) {
                        g(context, objN);
                    }
                    throw th2;
                }
            } else {
                gVar.resumeWith(t9.e.c(f1Var.h()));
            }
            while (x0VarA.y()) {
            }
        } catch (Throwable th3) {
            try {
                gVar.i(th3);
            } finally {
                x0VarA.t(true);
            }
        }
    }

    public static final void i(cn.w wVar, ak.k kVar, Runnable runnable) throws j0 {
        try {
            wVar.p(kVar, runnable);
        } catch (Throwable th2) {
            throw new j0(th2, wVar, kVar);
        }
    }

    public static final boolean j(cn.w wVar, ak.k kVar) throws j0 {
        try {
            return wVar.r(kVar);
        } catch (Throwable th2) {
            throw new j0(th2, wVar, kVar);
        }
    }

    public static final long k(String str, long j10, long j11, long j12) {
        String property;
        int i10 = v.f42459a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j10;
        }
        Long lF0 = an.o.f0(property);
        if (lF0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lF0.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j11);
        q4.a.r(sb2, "..", j12, ", but is '");
        sb2.append(jLongValue);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static int l(int i10, int i11, String str) {
        return (int) k(str, i10, 1, (i11 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object m(ak.k kVar) {
        Object objFold = kVar.fold(0, f42419e);
        kotlin.jvm.internal.n.c(objFold);
        return objFold;
    }

    public static final Object n(ak.k kVar, Object obj) {
        if (obj == null) {
            obj = m(kVar);
        }
        if (obj == 0) {
            return f42418d;
        }
        if (obj instanceof Integer) {
            return kVar.fold(new x(((Number) obj).intValue(), kVar), f42421g);
        }
        defpackage.e.z(obj);
        throw null;
    }
}
