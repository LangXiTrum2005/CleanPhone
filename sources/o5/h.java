package o5;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Locale;
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
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements ListenableFuture {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f47197d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f47198e = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.bumptech.glide.d f47199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f47200g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f47201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c f47202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f47203c;

    static {
        com.bumptech.glide.d fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            fVar = new f();
        }
        f47199f = fVar;
        if (th != null) {
            f47198e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f47200g = new Object();
    }

    public static void b(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f47203c;
            if (f47199f.g(hVar, gVar, g.f47194c)) {
                while (gVar != null) {
                    Thread thread = gVar.f47195a;
                    if (thread != null) {
                        gVar.f47195a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f47196b;
                }
                do {
                    cVar = hVar.f47202b;
                } while (!f47199f.e(hVar, cVar, c.f47183d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f47186c;
                    cVar3.f47186c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f47186c;
                    Runnable runnable = cVar2.f47184a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f47192a;
                        if (hVar.f47201a == eVar) {
                            if (f47199f.f(hVar, eVar, e(eVar.f47193b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, cVar2.f47185b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f47198e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f47180b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f47182a);
        }
        if (obj == f47200g) {
            return null;
        }
        return obj;
    }

    public static Object e(ListenableFuture listenableFuture) {
        Object obj;
        if (listenableFuture instanceof h) {
            Object obj2 = ((h) listenableFuture).f47201a;
            if (!(obj2 instanceof a)) {
                return obj2;
            }
            a aVar = (a) obj2;
            if (aVar.f47179a) {
                return aVar.f47180b != null ? new a(aVar.f47180b, false) : a.f47178d;
            }
            return obj2;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z10 = true;
        if ((!f47197d) && zIsCancelled) {
            return a.f47178d;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (CancellationException e10) {
                    if (zIsCancelled) {
                        return new a(e10, false);
                    }
                    return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e10));
                } catch (ExecutionException e11) {
                    return new b(e11.getCause());
                } catch (Throwable th2) {
                    return new b(th2);
                }
            } catch (InterruptedException unused) {
                z11 = z10;
            } catch (Throwable th3) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f47200g : obj;
    }

    public final void a(StringBuilder sb2) {
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
                } catch (RuntimeException e10) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e10.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e11) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e11.getCause());
                    sb2.append(X3.j.f27836e);
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
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append(X3.j.f27836e);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f47202b;
        c cVar2 = c.f47183d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f47186c = cVar;
                if (f47199f.e(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f47202b;
                }
            } while (cVar != cVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        a aVar;
        Object obj = this.f47201a;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        if (f47197d) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z10);
        } else {
            aVar = z10 ? a.f47177c : a.f47178d;
        }
        boolean z11 = false;
        while (true) {
            if (f47199f.f(this, obj, aVar)) {
                b(this);
                if (!(obj instanceof e)) {
                    break;
                }
                ListenableFuture listenableFuture = ((e) obj).f47193b;
                if (!(listenableFuture instanceof h)) {
                    listenableFuture.cancel(z10);
                    break;
                }
                this = (h) listenableFuture;
                obj = this.f47201a;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z11 = true;
            } else {
                obj = this.f47201a;
                if (!(obj instanceof e)) {
                    return z11;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String f() {
        Object obj = this.f47201a;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ListenableFuture listenableFuture = ((e) obj).f47193b;
            return defpackage.e.q(listenableFuture == this ? "this future" : String.valueOf(listenableFuture), X3.j.f27836e, sb2);
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(g gVar) {
        gVar.f47195a = null;
        while (true) {
            g gVar2 = this.f47203c;
            if (gVar2 == g.f47194c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f47196b;
                if (gVar2.f47195a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f47196b = gVar4;
                    if (gVar3.f47195a == null) {
                    }
                } else if (!f47199f.g(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z10;
        g gVar = g.f47194c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f47201a;
        if ((obj != null) && (!(obj instanceof e))) {
            return d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f47203c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                z10 = true;
                while (true) {
                    com.bumptech.glide.d dVar = f47199f;
                    dVar.H(gVar3, gVar2);
                    if (dVar.g(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f47201a;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(gVar3);
                        break;
                    }
                    gVar2 = this.f47203c;
                    if (gVar2 == gVar) {
                    }
                }
            }
            return d(this.f47201a);
        }
        z10 = true;
        while (nanos > 0) {
            Object obj3 = this.f47201a;
            if ((obj3 != null ? z10 : false) && (!(obj3 instanceof e))) {
                return d(obj3);
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
        if (nanos + 1000 < 0) {
            String strH = wi.d.h(string3, " (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z11 = (jConvert == 0 || nanos2 > 1000) ? z10 : false;
            if (jConvert > 0) {
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f47201a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f47201a;
        return (!(obj instanceof e)) & (obj != null);
    }

    public final String toString() {
        String strF;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f47201a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strF = f();
            } catch (RuntimeException e10) {
                strF = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strF != null && !strF.isEmpty()) {
                wi.d.m(sb2, "PENDING, info=[", strF, X3.j.f27836e);
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append(X3.j.f27836e);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        g gVar = g.f47194c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f47201a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return d(obj2);
            }
            g gVar2 = this.f47203c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    com.bumptech.glide.d dVar = f47199f;
                    dVar.H(gVar3, gVar2);
                    if (dVar.g(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f47201a;
                            } else {
                                g(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return d(obj);
                    }
                    gVar2 = this.f47203c;
                } while (gVar2 != gVar);
            }
            return d(this.f47201a);
        }
        throw new InterruptedException();
    }
}
