package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uc1 extends dd1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object g(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thA;
        if (listenableFuture instanceof sc1) {
            Object nc1Var = ((uc1) listenableFuture).f13503a;
            if (nc1Var instanceof nc1) {
                nc1 nc1Var2 = (nc1) nc1Var;
                if (nc1Var2.f17752a) {
                    Throwable th2 = nc1Var2.f17753b;
                    nc1Var = th2 != null ? new nc1(th2, false) : nc1.f17751d;
                }
            }
            Objects.requireNonNull(nc1Var);
            return nc1Var;
        }
        if ((listenableFuture instanceof qe1) && (thA = ((qe1) listenableFuture).a()) != null) {
            return new qc1(thA);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z10 = true;
        if ((!dd1.f13501f) && zIsCancelled) {
            nc1 nc1Var3 = nc1.f17751d;
            Objects.requireNonNull(nc1Var3);
            return nc1Var3;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (Error | Exception e10) {
                    return new qc1(e10);
                } catch (CancellationException e11) {
                    return !zIsCancelled ? new qc1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e11)) : new nc1(e11, false);
                } catch (ExecutionException e12) {
                    return zIsCancelled ? new nc1(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e12), false) : new qc1(e12.getCause());
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
        if (!zIsCancelled) {
            return obj == null ? dd1.f13499d : obj;
        }
        String strValueOf = String.valueOf(listenableFuture);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 84);
        sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb2.append(strValueOf);
        return new nc1(new IllegalArgumentException(sb2.toString()), false);
    }

    public static Object h(Object obj) throws ExecutionException {
        if (obj instanceof nc1) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((nc1) obj).f17753b);
            throw cancellationException;
        }
        if (obj instanceof qc1) {
            throw new ExecutionException(((qc1) obj).f19025a);
        }
        if (obj == dd1.f13499d) {
            return null;
        }
        return obj;
    }

    public static boolean i(Object obj) {
        return !(obj instanceof oc1);
    }

    public static void o(uc1 uc1Var, boolean z10) {
        rc1 rc1Var = null;
        while (true) {
            for (cd1 cd1VarL = dd1.f13502g.l(uc1Var); cd1VarL != null; cd1VarL = cd1VarL.f13140b) {
                Thread thread = cd1VarL.f13139a;
                if (thread != null) {
                    cd1VarL.f13139a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                uc1Var.j();
            }
            uc1Var.e();
            rc1 rc1Var2 = rc1Var;
            rc1 rc1VarN = dd1.f13502g.n(uc1Var);
            rc1 rc1Var3 = rc1Var2;
            while (rc1VarN != null) {
                rc1 rc1Var4 = rc1VarN.f19560c;
                rc1VarN.f19560c = rc1Var3;
                rc1Var3 = rc1VarN;
                rc1VarN = rc1Var4;
            }
            while (rc1Var3 != null) {
                Runnable runnable = rc1Var3.f19558a;
                rc1Var = rc1Var3.f19560c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof oc1) {
                    oc1 oc1Var = (oc1) runnable2;
                    uc1Var = oc1Var.f18236a;
                    if (uc1Var.f13503a == oc1Var) {
                        if (dd1.f13502g.o(uc1Var, oc1Var, g(oc1Var.f18237b))) {
                            z10 = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = rc1Var3.f19559b;
                    Objects.requireNonNull(executor);
                    q(runnable2, executor);
                }
                rc1Var3 = rc1Var;
            }
            return;
        }
    }

    public static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger loggerB = dd1.f13500e.b();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerB.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", d5.u.h(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.qe1
    public final Throwable a() {
        if (!(this instanceof sc1)) {
            return null;
        }
        Object obj = this.f13503a;
        if (obj instanceof qc1) {
            return ((qc1) obj).f19025a;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        rc1 rc1Var;
        rc1 rc1Var2 = rc1.f19557d;
        ps1.e0(runnable, "Runnable was null.");
        ps1.e0(executor, "Executor was null.");
        if (!isDone() && (rc1Var = this.f13504b) != rc1Var2) {
            rc1 rc1Var3 = new rc1(runnable, executor);
            do {
                rc1Var3.f19560c = rc1Var;
                if (dd1.f13502g.k(this, rc1Var, rc1Var3)) {
                    return;
                } else {
                    rc1Var = this.f13504b;
                }
            } while (rc1Var != rc1Var2);
        }
        q(runnable, executor);
    }

    public boolean c(Object obj) {
        if (obj == null) {
            obj = dd1.f13499d;
        }
        if (!dd1.f13502g.o(this, null, obj)) {
            return false;
        }
        o(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        nc1 nc1Var;
        Object obj = this.f13503a;
        if (!(obj instanceof oc1) && !(obj == null)) {
            return false;
        }
        if (dd1.f13501f) {
            nc1Var = new nc1(new CancellationException("Future.cancel() was called."), z10);
        } else {
            nc1Var = z10 ? nc1.f17750c : nc1.f17751d;
            Objects.requireNonNull(nc1Var);
        }
        boolean z11 = false;
        while (true) {
            if (dd1.f13502g.o(this, obj, nc1Var)) {
                o(this, z10);
                if (obj instanceof oc1) {
                    ListenableFuture listenableFuture = ((oc1) obj).f18237b;
                    if (listenableFuture instanceof sc1) {
                        this = (uc1) listenableFuture;
                        obj = this.f13503a;
                        if (!(obj == null) && !(obj instanceof oc1)) {
                            return true;
                        }
                        z11 = true;
                    } else {
                        listenableFuture.cancel(z10);
                    }
                }
                return true;
            }
            obj = this.f13503a;
            if (i(obj)) {
                return z11;
            }
        }
    }

    public boolean d(Throwable th2) {
        if (!dd1.f13502g.o(this, null, new qc1(th2))) {
            return false;
        }
        o(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String f() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + 21);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        cd1 cd1Var = cd1.f13138c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f13503a;
        if ((obj2 != null) && i(obj2)) {
            return h(obj2);
        }
        cd1 cd1Var2 = this.f13505c;
        if (cd1Var2 != cd1Var) {
            cd1 cd1Var3 = new cd1();
            do {
                vc1 vc1Var = dd1.f13502g;
                vc1Var.g(cd1Var3, cd1Var2);
                if (vc1Var.i(this, cd1Var2, cd1Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(cd1Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f13503a;
                    } while (!((obj != null) & i(obj)));
                    return h(obj);
                }
                cd1Var2 = this.f13505c;
            } while (cd1Var2 != cd1Var);
        }
        Object obj3 = this.f13503a;
        Objects.requireNonNull(obj3);
        return h(obj3);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f13503a instanceof nc1;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f13503a;
        return (obj != null) & i(obj);
    }

    public final boolean k() {
        Object obj = this.f13503a;
        return (obj instanceof nc1) && ((nc1) obj).f17752a;
    }

    public final void l(ListenableFuture listenableFuture) {
        qc1 qc1Var;
        listenableFuture.getClass();
        Object obj = this.f13503a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (dd1.f13502g.o(this, null, g(listenableFuture))) {
                    o(this, false);
                    return;
                }
                return;
            }
            oc1 oc1Var = new oc1(this, listenableFuture);
            if (dd1.f13502g.o(this, null, oc1Var)) {
                try {
                    listenableFuture.addListener(oc1Var, td1.f20333a);
                    return;
                } catch (Throwable th2) {
                    try {
                        qc1Var = new qc1(th2);
                    } catch (Error | Exception unused) {
                        qc1Var = qc1.f19024b;
                    }
                    dd1.f13502g.o(this, oc1Var, qc1Var);
                    return;
                }
            }
            obj = this.f13503a;
        }
        if (obj instanceof nc1) {
            listenableFuture.cancel(((nc1) obj).f17752a);
        }
    }

    public final void n(Future future) {
        if ((future != null) && (this.f13503a instanceof nc1)) {
            future.cancel(k());
        }
    }

    public final void p(StringBuilder sb2) {
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

    public String toString() {
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
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            p(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f13503a;
            if (obj instanceof oc1) {
                sb2.append(", setFuture=[");
                ListenableFuture listenableFuture = ((oc1) obj).f18237b;
                try {
                    if (listenableFuture == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(listenableFuture);
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
                    strConcat = f();
                    if (pi1.l(strConcat)) {
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
                p(sb2);
            }
        }
        sb2.append(X3.j.f27836e);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j11;
        boolean z10;
        cd1 cd1Var = cd1.f13138c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f13503a;
            if ((obj != null) & i(obj)) {
                return h(obj);
            }
            long j12 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                cd1 cd1Var2 = this.f13505c;
                if (cd1Var2 != cd1Var) {
                    cd1 cd1Var3 = new cd1();
                    z10 = true;
                    while (true) {
                        vc1 vc1Var = dd1.f13502g;
                        vc1Var.g(cd1Var3, cd1Var2);
                        if (vc1Var.i(this, cd1Var2, cd1Var3)) {
                            j11 = j12;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f13503a;
                                    if ((obj2 != null) & i(obj2)) {
                                        return h(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    b(cd1Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(cd1Var3);
                            break;
                        }
                        long j13 = j12;
                        cd1Var2 = this.f13505c;
                        if (cd1Var2 != cd1Var) {
                            j12 = j13;
                        }
                    }
                }
                Object obj3 = this.f13503a;
                Objects.requireNonNull(obj3);
                return h(obj3);
            }
            j11 = 0;
            z10 = true;
            while (nanos > j11) {
                Object obj4 = this.f13503a;
                if ((obj4 != null ? z10 : false) & i(obj4)) {
                    return h(obj4);
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
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 8 + String.valueOf(lowerCase2).length());
            q4.a.r(sb2, "Waited ", j10, " ");
            sb2.append(lowerCase2);
            String string3 = sb2.toString();
            if (nanos + 1000 < j11) {
                String strConcat = string3.concat(" (plus ");
                long j14 = -nanos;
                long jConvert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
                long nanos2 = j14 - timeUnit.toNanos(jConvert);
                boolean z11 = (jConvert == j11 || nanos2 > 1000) ? z10 : false;
                if (jConvert > j11) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                    q4.a.r(sb3, strConcat, jConvert, " ");
                    sb3.append(lowerCase);
                    String string4 = sb3.toString();
                    if (z11) {
                        string4 = string4.concat(",");
                    }
                    strConcat = string4.concat(" ");
                }
                if (z11) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                    sb4.append(strConcat);
                    sb4.append(nanos2);
                    sb4.append(" nanoseconds ");
                    strConcat = sb4.toString();
                }
                string3 = strConcat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(q4.a.j(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
        }
        throw new InterruptedException();
    }

    public void e() {
    }

    public void j() {
    }
}
