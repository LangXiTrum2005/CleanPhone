package com.google.android.gms.internal.play_billing;

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
public class i4 implements s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f24290d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f24291e = Logger.getLogger(i4.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final cc.a2 f24292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f24293g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f24294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile u2 f24295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile h4 f24296c;

    static {
        cc.a2 g4Var;
        try {
            g4Var = new t3(AtomicReferenceFieldUpdater.newUpdater(h4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h4.class, h4.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(i4.class, h4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i4.class, u2.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(i4.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            g4Var = new g4();
        }
        Throwable th3 = th;
        f24292f = g4Var;
        if (th3 != null) {
            f24291e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f24293g = new Object();
    }

    public static void b(i4 i4Var) {
        h4 h4Var;
        cc.a2 a2Var;
        u2 u2Var;
        u2 u2Var2;
        u2 u2Var3;
        do {
            h4Var = i4Var.f24296c;
            a2Var = f24292f;
        } while (!a2Var.U(i4Var, h4Var, h4.f24281c));
        while (true) {
            u2Var = null;
            if (h4Var == null) {
                break;
            }
            Thread thread = h4Var.f24282a;
            if (thread != null) {
                h4Var.f24282a = null;
                LockSupport.unpark(thread);
            }
            h4Var = h4Var.f24283b;
        }
        do {
            u2Var2 = i4Var.f24295b;
        } while (!a2Var.S(i4Var, u2Var2, u2.f24485d));
        while (true) {
            u2Var3 = u2Var;
            u2Var = u2Var2;
            if (u2Var == null) {
                break;
            }
            u2Var2 = u2Var.f24488c;
            u2Var.f24488c = u2Var3;
        }
        while (u2Var3 != null) {
            Runnable runnable = u2Var3.f24486a;
            u2 u2Var4 = u2Var3.f24488c;
            if (runnable instanceof f4) {
                throw new ClassCastException();
            }
            d(runnable, u2Var3.f24487b);
            u2Var3 = u2Var4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f24291e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", l1.d.g("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    public static final Object f(Object obj) throws ExecutionException {
        if (obj instanceof g1) {
            Throwable th2 = ((g1) obj).f24272a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof f2) {
            throw new ExecutionException(((f2) obj).f24268a);
        }
        if (obj == f24293g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this instanceof ScheduledFuture) {
            return defpackage.e.j(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    public final void c(StringBuilder sb2) {
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        g1 g1Var;
        Object obj = this.f24294a;
        if (obj != null) {
            return false;
        }
        if (f24290d) {
            g1Var = new g1(new CancellationException("Future.cancel() was called."));
        } else {
            g1Var = z10 ? g1.f24270b : g1.f24271c;
        }
        if (!f24292f.T(this, obj, g1Var)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(h4 h4Var) {
        h4Var.f24282a = null;
        while (true) {
            h4 h4Var2 = this.f24296c;
            if (h4Var2 != h4.f24281c) {
                h4 h4Var3 = null;
                while (h4Var2 != null) {
                    h4 h4Var4 = h4Var2.f24283b;
                    if (h4Var2.f24282a != null) {
                        h4Var3 = h4Var2;
                    } else if (h4Var3 != null) {
                        h4Var3.f24283b = h4Var4;
                        if (h4Var3.f24282a == null) {
                        }
                    } else if (!f24292f.U(this, h4Var2, h4Var4)) {
                    }
                    h4Var2 = h4Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f24294a;
        if (obj2 != null) {
            return f(obj2);
        }
        h4 h4Var = this.f24296c;
        h4 h4Var2 = h4.f24281c;
        if (h4Var != h4Var2) {
            h4 h4Var3 = new h4();
            do {
                cc.a2 a2Var = f24292f;
                a2Var.Q(h4Var3, h4Var);
                if (a2Var.U(this, h4Var, h4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            e(h4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f24294a;
                    } while (obj == null);
                    return f(obj);
                }
                h4Var = this.f24296c;
            } while (h4Var != h4Var2);
        }
        return f(this.f24294a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24294a instanceof g1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24294a != null;
    }

    @Override // com.google.android.gms.internal.play_billing.s0
    public final void m(Runnable runnable, Executor executor) {
        executor.getClass();
        u2 u2Var = this.f24295b;
        u2 u2Var2 = u2.f24485d;
        if (u2Var != u2Var2) {
            u2 u2Var3 = new u2(runnable, executor);
            do {
                u2Var3.f24488c = u2Var;
                if (f24292f.S(this, u2Var, u2Var3)) {
                    return;
                } else {
                    u2Var = this.f24295b;
                }
            } while (u2Var != u2Var2);
        }
        d(runnable, executor);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f24294a instanceof g1) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                strConcat = a();
            } catch (RuntimeException e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                wi.d.m(sb2, "PENDING, info=[", strConcat, X3.j.f27836e);
            } else if (isDone()) {
                c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append(X3.j.f27836e);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f24294a;
            if (obj != null) {
                return f(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                h4 h4Var = this.f24296c;
                h4 h4Var2 = h4.f24281c;
                if (h4Var != h4Var2) {
                    h4 h4Var3 = new h4();
                    while (true) {
                        cc.a2 a2Var = f24292f;
                        a2Var.Q(h4Var3, h4Var);
                        if (a2Var.U(this, h4Var, h4Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f24294a;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    e(h4Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(h4Var3);
                            break;
                        }
                        h4Var = this.f24296c;
                        if (h4Var == h4Var2) {
                        }
                    }
                }
                return f(this.f24294a);
            }
            while (nanos > 0) {
                Object obj3 = this.f24294a;
                if (obj3 != null) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j11 = -nanos;
                long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(jConvert);
                boolean z10 = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z10) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z10) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(wi.d.i(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
