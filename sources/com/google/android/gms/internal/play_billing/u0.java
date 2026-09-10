package com.google.android.gms.internal.play_billing;

import com.ironsource.X3;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends l0 implements g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s0 f24479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture f24480i;

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof c0) {
            Throwable th2 = ((c0) obj).f24242b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (!(obj instanceof e0)) {
            if (obj == l0.f24397d) {
                return null;
            }
            return obj;
        }
        Throwable th3 = ((e0) obj).f24261a;
        if (th3 != null) {
            throw new ExecutionException(th3);
        }
        l0.f24398e.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(e0.f24260c.f24261a);
    }

    public static boolean e(Object obj) {
        return !(obj instanceof d0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object f(s0 s0Var) {
        Object obj;
        Throwable thA;
        if (s0Var instanceof g0) {
            Object c0Var = ((u0) s0Var).f24401a;
            if (c0Var instanceof c0) {
                c0 c0Var2 = (c0) c0Var;
                if (c0Var2.f24241a) {
                    Throwable th2 = c0Var2.f24242b;
                    c0Var = th2 != null ? new c0(th2, false) : c0.f24240d;
                }
            }
            Objects.requireNonNull(c0Var);
            return c0Var;
        }
        if ((s0Var instanceof v0) && (thA = ((v0) s0Var).a()) != null) {
            return new e0(thA);
        }
        boolean zIsCancelled = s0Var.isCancelled();
        boolean z10 = true;
        if ((!l0.f24399f) && zIsCancelled) {
            c0 c0Var3 = c0.f24240d;
            Objects.requireNonNull(c0Var3);
            return c0Var3;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = s0Var.get();
                    break;
                } catch (Error | Exception e10) {
                    return new e0(e10);
                } catch (CancellationException e11) {
                    return !zIsCancelled ? new e0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(s0Var)), e11)) : new c0(e11, false);
                } catch (ExecutionException e12) {
                    return zIsCancelled ? new c0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(s0Var)), e12), false) : new e0(e12.getCause());
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
        if (zIsCancelled) {
            return new c0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(s0Var))), false);
        }
        return obj == null ? l0.f24397d : obj;
    }

    public static void h(u0 u0Var) {
        f0 f0Var = null;
        while (true) {
            u0Var.getClass();
            for (k0 k0VarJ = l0.f24400g.J(u0Var); k0VarJ != null; k0VarJ = k0VarJ.f24394b) {
                Thread thread = k0VarJ.f24393a;
                if (thread != null) {
                    k0VarJ.f24393a = null;
                    LockSupport.unpark(thread);
                }
            }
            s0 s0Var = u0Var.f24479h;
            if ((u0Var.f24401a instanceof c0) & (s0Var != null)) {
                Object obj = u0Var.f24401a;
                s0Var.cancel((obj instanceof c0) && ((c0) obj).f24241a);
            }
            ScheduledFuture scheduledFuture = u0Var.f24480i;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            u0Var.f24479h = null;
            u0Var.f24480i = null;
            f0 f0Var2 = f0Var;
            f0 f0VarI = l0.f24400g.I(u0Var);
            f0 f0Var3 = f0Var2;
            while (f0VarI != null) {
                f0 f0Var4 = f0VarI.f24267c;
                f0VarI.f24267c = f0Var3;
                f0Var3 = f0VarI;
                f0VarI = f0Var4;
            }
            while (f0Var3 != null) {
                Runnable runnable = f0Var3.f24265a;
                f0 f0Var5 = f0Var3.f24267c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof d0) {
                    d0 d0Var = (d0) runnable2;
                    u0Var = d0Var.f24254a;
                    if (u0Var.f24401a != d0Var) {
                        continue;
                    } else if (l0.f24400g.N(u0Var, d0Var, f(d0Var.f24255b))) {
                        f0Var = f0Var5;
                    }
                } else {
                    Executor executor = f0Var3.f24266b;
                    Objects.requireNonNull(executor);
                    i(runnable2, executor);
                }
                f0Var3 = f0Var5;
            }
            return;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            l0.f24398e.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", l1.d.g("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final Throwable a() {
        if (!(this instanceof g0)) {
            return null;
        }
        Object obj = this.f24401a;
        if (obj instanceof e0) {
            return ((e0) obj).f24261a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c0 c0Var;
        Object obj = this.f24401a;
        if (!(obj instanceof d0) && !(obj == null)) {
            return false;
        }
        if (l0.f24399f) {
            c0Var = new c0(new CancellationException("Future.cancel() was called."), z10);
        } else {
            c0Var = z10 ? c0.f24239c : c0.f24240d;
            Objects.requireNonNull(c0Var);
        }
        boolean z11 = false;
        while (true) {
            if (l0.f24400g.N(this, obj, c0Var)) {
                h(this);
                if (obj instanceof d0) {
                    s0 s0Var = ((d0) obj).f24255b;
                    if (s0Var instanceof g0) {
                        this = (u0) s0Var;
                        obj = this.f24401a;
                        if ((obj == null) | (obj instanceof d0)) {
                            z11 = true;
                        }
                    } else {
                        s0Var.cancel(z10);
                    }
                }
                return true;
            }
            obj = this.f24401a;
            if (e(obj)) {
                return z11;
            }
        }
    }

    public final String d() {
        s0 s0Var = this.f24479h;
        ScheduledFuture scheduledFuture = this.f24480i;
        if (s0Var == null) {
            return null;
        }
        String strO = defpackage.e.o("inputFuture=[", s0Var.toString(), X3.j.f27836e);
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strO + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strO;
    }

    public final void g(StringBuilder sb2) {
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
        if (obj == null) {
            sb2.append("null");
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb2.append(X3.j.f27836e);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        k0 k0Var = k0.f24392c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f24401a;
        if ((obj2 != null) && e(obj2)) {
            return c(obj2);
        }
        k0 k0Var2 = this.f24403c;
        if (k0Var2 != k0Var) {
            k0 k0Var3 = new k0();
            do {
                a.a aVar = l0.f24400g;
                aVar.K(k0Var3, k0Var2);
                if (aVar.O(this, k0Var2, k0Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(k0Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f24401a;
                    } while (!((obj != null) & e(obj)));
                    return c(obj);
                }
                k0Var2 = this.f24403c;
            } while (k0Var2 != k0Var);
        }
        Object obj3 = this.f24401a;
        Objects.requireNonNull(obj3);
        return c(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24401a instanceof c0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f24401a;
        return (obj != null) & e(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.s0
    public final void m(Runnable runnable, Executor executor) {
        f0 f0Var;
        f0 f0Var2 = f0.f24264d;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (f0Var = this.f24402b) != f0Var2) {
            f0 f0Var3 = new f0(runnable, executor);
            do {
                f0Var3.f24267c = f0Var;
                if (l0.f24400g.M(this, f0Var, f0Var3)) {
                    return;
                } else {
                    f0Var = this.f24402b;
                }
            } while (f0Var != f0Var2);
        }
        i(runnable, executor);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f24401a instanceof c0) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            g(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f24401a;
            if (obj instanceof d0) {
                sb2.append(", setFuture=[");
                s0 s0Var = ((d0) obj).f24255b;
                try {
                    if (s0Var == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(s0Var);
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append(X3.j.f27836e);
            } else {
                try {
                    strConcat = d();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th3) {
                    if ((th3 instanceof Error) && !(th3 instanceof StackOverflowError)) {
                        throw th3;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
                }
                if (strConcat != null) {
                    wi.d.m(sb2, ", info=[", strConcat, X3.j.f27836e);
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                g(sb2);
            }
        }
        sb2.append(X3.j.f27836e);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j11;
        k0 k0Var = k0.f24392c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f24401a;
            if ((obj != null) & e(obj)) {
                return c(obj);
            }
            long j12 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                k0 k0Var2 = this.f24403c;
                if (k0Var2 != k0Var) {
                    k0 k0Var3 = new k0();
                    while (true) {
                        a.a aVar = l0.f24400g;
                        aVar.K(k0Var3, k0Var2);
                        if (aVar.O(this, k0Var2, k0Var3)) {
                            j11 = j12;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f24401a;
                                    if ((obj2 != null) & e(obj2)) {
                                        return c(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    b(k0Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(k0Var3);
                            break;
                        }
                        long j13 = j12;
                        k0Var2 = this.f24403c;
                        if (k0Var2 != k0Var) {
                            j12 = j13;
                        }
                    }
                }
                Object obj3 = this.f24401a;
                Objects.requireNonNull(obj3);
                return c(obj3);
            }
            j11 = 0;
            while (nanos > j11) {
                Object obj4 = this.f24401a;
                if ((obj4 != null) & e(obj4)) {
                    return c(obj4);
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
            if (nanos + 1000 < j11) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j14 = -nanos;
                long jConvert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
                long nanos2 = j14 - timeUnit.toNanos(jConvert);
                boolean z10 = jConvert == j11 || nanos2 > 1000;
                if (jConvert > j11) {
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
