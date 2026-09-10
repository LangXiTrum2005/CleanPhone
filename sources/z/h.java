package z;

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
    public static final boolean f54583d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f54584e = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a.a f54585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f54586g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f54587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c f54588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f54589c;

    static {
        a.a fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            fVar = new f();
        }
        f54585f = fVar;
        if (th != null) {
            f54584e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f54586g = new Object();
    }

    public static void c(h hVar) {
        g gVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            gVar = hVar.f54589c;
        } while (!f54585f.e(hVar, gVar, g.f54580c));
        while (true) {
            cVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f54581a;
            if (thread != null) {
                gVar.f54581a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f54582b;
        }
        hVar.b();
        do {
            cVar2 = hVar.f54588b;
        } while (!f54585f.c(hVar, cVar2, c.f54571d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f54574c;
            cVar.f54574c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f54574c;
            Runnable runnable = cVar3.f54572a;
            if (runnable instanceof e) {
                throw new ClassCastException();
            }
            d(runnable, cVar3.f54573b);
            cVar3 = cVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f54584e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f54569b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f54570a);
        }
        if (obj == f54586g) {
            return null;
        }
        return obj;
    }

    public static Object f(h hVar) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = hVar.get();
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

    public final void a(StringBuilder sb2) {
        try {
            Object objF = f(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objF == this ? "this future" : String.valueOf(objF));
            sb2.append(X3.j.f27836e);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append(X3.j.f27836e);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f54588b;
        c cVar2 = c.f54571d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f54574c = cVar;
                if (f54585f.c(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f54588b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        a aVar;
        Object obj = this.f54587a;
        if (obj == null) {
            if (f54583d) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z10);
            } else {
                aVar = z10 ? a.f54566c : a.f54567d;
            }
            if (f54585f.d(this, obj, aVar)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        g gVar = g.f54580c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f54587a;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f54589c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                while (true) {
                    a.a aVar = f54585f;
                    aVar.D(gVar3, gVar2);
                    if (aVar.e(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f54587a;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(gVar3);
                        break;
                    }
                    gVar2 = this.f54589c;
                    if (gVar2 == gVar) {
                    }
                }
            }
            return e(this.f54587a);
        }
        while (nanos > 0) {
            Object obj3 = this.f54587a;
            if (obj3 != null) {
                return e(obj3);
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
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strH2 = strH + jConvert + " " + lowerCase;
                if (z10) {
                    strH2 = wi.d.h(strH2, ",");
                }
                strH = wi.d.h(strH2, " ");
            }
            if (z10) {
                strH = strH + nanos2 + " nanoseconds ";
            }
            string3 = wi.d.h(strH, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(wi.d.h(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(wi.d.i(string3, " for ", string));
    }

    public final void h(g gVar) {
        gVar.f54581a = null;
        while (true) {
            g gVar2 = this.f54589c;
            if (gVar2 == g.f54580c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f54582b;
                if (gVar2.f54581a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f54582b = gVar4;
                    if (gVar3.f54581a == null) {
                    }
                } else if (!f54585f.e(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    public boolean i(Object obj) {
        if (obj == null) {
            obj = f54586g;
        }
        if (!f54585f.d(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f54587a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f54587a != null;
    }

    public boolean j(Throwable th2) {
        th2.getClass();
        if (!f54585f.d(this, null, new b(th2))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String strG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f54587a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e10) {
                strG = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                wi.d.m(sb2, "PENDING, info=[", strG, X3.j.f27836e);
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append(X3.j.f27836e);
        return sb2.toString();
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        g gVar = g.f54580c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f54587a;
            if (obj2 != null) {
                return e(obj2);
            }
            g gVar2 = this.f54589c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    a.a aVar = f54585f;
                    aVar.D(gVar3, gVar2);
                    if (aVar.e(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f54587a;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    gVar2 = this.f54589c;
                } while (gVar2 != gVar);
            }
            return e(this.f54587a);
        }
        throw new InterruptedException();
    }
}
