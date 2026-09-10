package ta;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {
    public static a a(ListenableFuture listenableFuture, Class cls, z zVar, Executor executor) {
        int i10 = c.l;
        a aVar = new a(listenableFuture, cls, zVar);
        listenableFuture.addListener(aVar, t9.e.s(executor, aVar));
        return aVar;
    }

    public static Object b(Future future) {
        Object obj;
        if (!future.isDone()) {
            throw new IllegalStateException(j1.f.B("Future was expected to be done: %s", future));
        }
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static m0 c(Exception exc) {
        m0 m0Var = new m0();
        m0Var.n(exc);
        return m0Var;
    }

    public static n0 d(Object obj) {
        return obj == null ? n0.f50627b : new n0(obj);
    }

    public static ListenableFuture e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        j0 j0Var = new j0();
        j0Var.f50625h = listenableFuture;
        listenableFuture.addListener(j0Var, c0.f50592a);
        return j0Var;
    }

    public static t f(ListenableFuture listenableFuture, na.e eVar, Executor executor) {
        int i10 = u.f50654k;
        t tVar = new t(listenableFuture, eVar);
        listenableFuture.addListener(tVar, t9.e.s(executor, tVar));
        return tVar;
    }

    public static s g(ListenableFuture listenableFuture, z zVar, Executor executor) {
        int i10 = u.f50654k;
        executor.getClass();
        s sVar = new s(listenableFuture, zVar);
        listenableFuture.addListener(sVar, t9.e.s(executor, sVar));
        return sVar;
    }
}
