package ta;

import com.google.android.gms.internal.ads.ee1;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends ua.a implements ListenableFuture {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f50642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ee1 f50643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qk.i0 f50644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f50645g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f50646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile f f50647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile q f50648c;

    static {
        boolean z10;
        Throwable th2;
        qk.i0 iVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f50642d = z10;
        f50643e = new ee1(r.class, 2);
        Throwable th3 = null;
        try {
            iVar = new p();
            th2 = null;
        } catch (Error | Exception e10) {
            th2 = e10;
            try {
                iVar = new g(AtomicReferenceFieldUpdater.newUpdater(q.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(q.class, q.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(r.class, q.class, "c"), AtomicReferenceFieldUpdater.newUpdater(r.class, f.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "a"));
            } catch (Error | Exception e11) {
                th3 = e11;
                iVar = new i();
            }
        }
        f50644f = iVar;
        if (th3 != null) {
            ee1 ee1Var = f50643e;
            Logger loggerA = ee1Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            ee1Var.a().log(level, "SafeAtomicHelper is broken!", th3);
        }
        f50645g = new Object();
    }

    public static void e(r rVar, boolean z10) {
        f fVar = null;
        while (true) {
            for (q qVarG = f50644f.G(rVar); qVarG != null; qVarG = qVarG.f50641b) {
                Thread thread = qVarG.f50640a;
                if (thread != null) {
                    qVarG.f50640a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                rVar.i();
                z10 = false;
            }
            rVar.c();
            f fVar2 = fVar;
            f fVarF = f50644f.F(rVar);
            f fVar3 = fVar2;
            while (fVarF != null) {
                f fVar4 = fVarF.f50612c;
                fVarF.f50612c = fVar3;
                fVar3 = fVarF;
                fVarF = fVar4;
            }
            while (fVar3 != null) {
                fVar = fVar3.f50612c;
                Runnable runnable = fVar3.f50610a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof h) {
                    h hVar = (h) runnable2;
                    rVar = hVar.f50619a;
                    if (rVar.f50646a == hVar) {
                        if (f50644f.g(rVar, hVar, h(hVar.f50620b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = fVar3.f50611b;
                    Objects.requireNonNull(executor);
                    f(runnable2, executor);
                }
                fVar3 = fVar;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f50643e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof d) {
            Throwable th2 = ((d) obj).f50597b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof e) {
            throw new ExecutionException(((e) obj).f50603a);
        }
        if (obj == f50645g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thA;
        if (listenableFuture instanceof j) {
            Object dVar = ((r) listenableFuture).f50646a;
            if (dVar instanceof d) {
                d dVar2 = (d) dVar;
                if (dVar2.f50596a) {
                    dVar = dVar2.f50597b != null ? new d(dVar2.f50597b, false) : d.f50595d;
                }
            }
            Objects.requireNonNull(dVar);
            return dVar;
        }
        if ((listenableFuture instanceof ua.a) && (thA = ((ua.a) listenableFuture).a()) != null) {
            return new e(thA);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z10 = true;
        if ((!f50642d) && zIsCancelled) {
            d dVar3 = d.f50595d;
            Objects.requireNonNull(dVar3);
            return dVar3;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = z10;
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e10) {
                return new e(e10);
            } catch (CancellationException e11) {
                if (zIsCancelled) {
                    return new d(e11, false);
                }
                return new e(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e11));
            } catch (ExecutionException e12) {
                if (!zIsCancelled) {
                    return new e(e12.getCause());
                }
                return new d(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e12), false);
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? f50645g : obj;
        }
        return new d(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    @Override // ua.a
    public final Throwable a() {
        if (!(this instanceof j)) {
            return null;
        }
        Object obj = this.f50646a;
        if (obj instanceof e) {
            return ((e) obj).f50603a;
        }
        return null;
    }

    public void addListener(Runnable runnable, Executor executor) {
        f fVar;
        f fVar2 = f.f50609d;
        go.k.o(executor, "Executor was null.");
        if (!isDone() && (fVar = this.f50647b) != fVar2) {
            f fVar3 = new f(runnable, executor);
            do {
                fVar3.f50612c = fVar;
                if (f50644f.f(this, fVar, fVar3)) {
                    return;
                } else {
                    fVar = this.f50647b;
                }
            } while (fVar != fVar2);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (ExecutionException e10) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e10.getCause());
                    sb2.append(X3.j.f27836e);
                    return;
                } catch (Exception e11) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e11.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb2.append("SUCCESS, result=[");
        d(sb2, obj);
        sb2.append(X3.j.f27836e);
    }

    public boolean cancel(boolean z10) {
        d dVar;
        Object obj = this.f50646a;
        if (!(obj == null) && !(obj instanceof h)) {
            return false;
        }
        if (f50642d) {
            dVar = new d(new CancellationException("Future.cancel() was called."), z10);
        } else {
            dVar = z10 ? d.f50594c : d.f50595d;
            Objects.requireNonNull(dVar);
        }
        boolean z11 = false;
        while (true) {
            if (f50644f.g(this, obj, dVar)) {
                e(this, z10);
                if (obj instanceof h) {
                    ListenableFuture listenableFuture = ((h) obj).f50620b;
                    if (listenableFuture instanceof j) {
                        this = (r) listenableFuture;
                        obj = this.f50646a;
                        if ((obj == null) | (obj instanceof h)) {
                            z11 = true;
                        }
                    } else {
                        listenableFuture.cancel(z10);
                    }
                }
                return true;
            }
            obj = this.f50646a;
            if (!(obj instanceof h)) {
                return z11;
            }
        }
    }

    public final void d(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z10;
        long j11;
        q qVar = q.f50639c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f50646a;
        if ((obj != null) && (!(obj instanceof h))) {
            return g(obj);
        }
        long j12 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            q qVar2 = this.f50648c;
            if (qVar2 != qVar) {
                q qVar3 = new q();
                z10 = true;
                while (true) {
                    qk.i0 i0Var = f50644f;
                    i0Var.X(qVar3, qVar2);
                    if (i0Var.h(this, qVar2, qVar3)) {
                        j11 = j12;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(qVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f50646a;
                            if ((obj2 != null) && (!(obj2 instanceof h))) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(qVar3);
                        break;
                    }
                    long j13 = j12;
                    qVar2 = this.f50648c;
                    if (qVar2 != qVar) {
                        j12 = j13;
                    }
                }
            }
            Object obj3 = this.f50646a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        z10 = true;
        j11 = 0;
        while (nanos > j11) {
            Object obj4 = this.f50646a;
            if ((obj4 != null ? z10 : false) && (!(obj4 instanceof h))) {
                return g(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbL = wi.d.l(j10, "Waited ", " ");
        sbL.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbL.toString();
        if (nanos + 1000 < j11) {
            String strH = wi.d.h(string3, " (plus ");
            long j14 = -nanos;
            long jConvert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
            long nanos2 = j14 - timeUnit.toNanos(jConvert);
            boolean z11 = (jConvert == j11 || nanos2 > 1000) ? z10 : false;
            if (jConvert > j11) {
                String strH2 = strH + jConvert + " " + lowerCase;
                if (z11) {
                    strH2 = wi.d.h(strH2, ",");
                }
                strH = wi.d.h(strH2, " ");
            }
            if (z11) {
                strH = strH + nanos2 + " nanoseconds ";
            }
            string3 = wi.d.h(strH, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(wi.d.h(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(wi.d.i(string3, " for ", string));
    }

    public boolean isCancelled() {
        return this.f50646a instanceof d;
    }

    public boolean isDone() {
        Object obj = this.f50646a;
        return (!(obj instanceof h)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(q qVar) {
        qVar.f50640a = null;
        while (true) {
            q qVar2 = this.f50648c;
            if (qVar2 == q.f50639c) {
                return;
            }
            q qVar3 = null;
            while (qVar2 != null) {
                q qVar4 = qVar2.f50641b;
                if (qVar2.f50640a != null) {
                    qVar3 = qVar2;
                } else if (qVar3 != null) {
                    qVar3.f50641b = qVar4;
                    if (qVar3.f50640a == null) {
                    }
                } else if (!f50644f.h(this, qVar2, qVar4)) {
                }
                qVar2 = qVar4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = f50645g;
        }
        if (!f50644f.g(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean n(Throwable th2) {
        th2.getClass();
        if (!f50644f.g(this, null, new e(th2))) {
            return false;
        }
        e(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean o(ListenableFuture listenableFuture) {
        e eVar;
        listenableFuture.getClass();
        Object obj = this.f50646a;
        if (obj != null) {
            if (obj instanceof d) {
                listenableFuture.cancel(((d) obj).f50596a);
            }
        } else if (listenableFuture.isDone()) {
            if (f50644f.g(this, null, h(listenableFuture))) {
                e(this, false);
                return true;
            }
        } else {
            h hVar = new h(this, listenableFuture);
            if (f50644f.g(this, null, hVar)) {
                try {
                    listenableFuture.addListener(hVar, c0.f50592a);
                    return true;
                } catch (Throwable th2) {
                    try {
                        eVar = new e(th2);
                    } catch (Error | Exception unused) {
                        eVar = e.f50602b;
                    }
                    f50644f.g(this, hVar, eVar);
                    return true;
                }
            }
            obj = this.f50646a;
            if (obj instanceof d) {
                listenableFuture.cancel(((d) obj).f50596a);
            }
        }
        return false;
    }

    public final boolean p() {
        Object obj = this.f50646a;
        return (obj instanceof d) && ((d) obj).f50596a;
    }

    public String toString() {
        String strJ;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f50646a;
            if (obj instanceof h) {
                sb2.append(", setFuture=[");
                ListenableFuture listenableFuture = ((h) obj).f50620b;
                try {
                    if (listenableFuture == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(listenableFuture);
                    }
                } catch (Exception | StackOverflowError e10) {
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e10.getClass());
                }
                sb2.append(X3.j.f27836e);
            } else {
                try {
                    strJ = j();
                    if (go.c.I(strJ)) {
                        strJ = null;
                    }
                } catch (Exception | StackOverflowError e11) {
                    strJ = "Exception thrown from implementation: " + e11.getClass();
                }
                if (strJ != null) {
                    wi.d.m(sb2, ", info=[", strJ, X3.j.f27836e);
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                b(sb2);
            }
        }
        sb2.append(X3.j.f27836e);
        return sb2.toString();
    }

    public void c() {
    }

    public void i() {
    }

    public Object get() throws InterruptedException {
        Object obj;
        q qVar = q.f50639c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f50646a;
            if ((obj2 != null) & (!(obj2 instanceof h))) {
                return g(obj2);
            }
            q qVar2 = this.f50648c;
            if (qVar2 != qVar) {
                q qVar3 = new q();
                do {
                    qk.i0 i0Var = f50644f;
                    i0Var.X(qVar3, qVar2);
                    if (i0Var.h(this, qVar2, qVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f50646a;
                            } else {
                                k(qVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof h))));
                        return g(obj);
                    }
                    qVar2 = this.f50648c;
                } while (qVar2 != qVar);
            }
            Object obj3 = this.f50646a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
