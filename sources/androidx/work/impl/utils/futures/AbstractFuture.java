package androidx.work.impl.utils.futures;

import android.support.v4.media.a;
import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.d9;
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

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFuture<V> implements ListenableFuture<V> {
    public static final boolean e0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger f0 = Logger.getLogger(AbstractFuture.class.getName());
    public static final AtomicHelper g0;
    public static final Object h0;
    public volatile Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public volatile Listener f8832Y;
    public volatile Waiter Z;

    public static abstract class AtomicHelper {
        public abstract boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2);

        public abstract void d(Waiter waiter, Waiter waiter2);

        public abstract void e(Waiter waiter, Thread thread);
    }

    public static final class Cancellation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Cancellation f8833c;
        public static final Cancellation d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellationException f8835b;

        static {
            if (AbstractFuture.e0) {
                d = null;
                f8833c = null;
            } else {
                d = new Cancellation(false, null);
                f8833c = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z2, CancellationException cancellationException) {
            this.f8834a = z2;
            this.f8835b = cancellationException;
        }
    }

    public static final class Failure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Failure f8836b = new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f8837a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.AbstractFuture$Failure$1, reason: invalid class name */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public Failure(Throwable th) {
            boolean z2 = AbstractFuture.e0;
            th.getClass();
            this.f8837a = th;
        }
    }

    public static final class Listener {
        public static final Listener d = new Listener(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f8838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f8839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Listener f8840c;

        public Listener(Runnable runnable, Executor executor) {
            this.f8838a = runnable;
            this.f8839b = executor;
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f8841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f8842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f8843c;
        public final AtomicReferenceFieldUpdater d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f8844e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f8841a = atomicReferenceFieldUpdater;
            this.f8842b = atomicReferenceFieldUpdater2;
            this.f8843c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.f8844e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, listener, listener2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == listener);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f8844e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f8843c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == waiter);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            this.f8842b.lazySet(waiter, waiter2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            this.f8841a.lazySet(waiter, thread);
        }
    }

    public static final class SetFuture<V> implements Runnable {
        public final SettableFuture X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ListenableFuture f8845Y;

        public SetFuture(SettableFuture settableFuture, ListenableFuture listenableFuture) {
            this.X = settableFuture;
            this.f8845Y = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.X.X != this) {
                return;
            }
            if (AbstractFuture.g0.b(this.X, this, AbstractFuture.e(this.f8845Y))) {
                AbstractFuture.b(this.X);
            }
        }
    }

    public static final class SynchronizedHelper extends AtomicHelper {
        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f8832Y != listener) {
                        return false;
                    }
                    abstractFuture.f8832Y = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.X != obj) {
                        return false;
                    }
                    abstractFuture.X = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.Z != waiter) {
                        return false;
                    }
                    abstractFuture.Z = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            waiter.f8848b = waiter2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            waiter.f8847a = thread;
        }
    }

    public static final class Waiter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Waiter f8846c = new Waiter();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f8847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile Waiter f8848b;

        public Waiter() {
            AbstractFuture.g0.e(this, Thread.currentThread());
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "Y"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "X"));
            th = null;
        } catch (Throwable th) {
            th = th;
            synchronizedHelper = new SynchronizedHelper();
        }
        g0 = synchronizedHelper;
        if (th != null) {
            f0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h0 = new Object();
    }

    public static void b(AbstractFuture abstractFuture) {
        Listener listener;
        Listener listener2;
        Listener listener3 = null;
        while (true) {
            Waiter waiter = abstractFuture.Z;
            if (g0.c(abstractFuture, waiter, Waiter.f8846c)) {
                while (waiter != null) {
                    Thread thread = waiter.f8847a;
                    if (thread != null) {
                        waiter.f8847a = null;
                        LockSupport.unpark(thread);
                    }
                    waiter = waiter.f8848b;
                }
                do {
                    listener = abstractFuture.f8832Y;
                } while (!g0.a(abstractFuture, listener, Listener.d));
                while (true) {
                    listener2 = listener3;
                    listener3 = listener;
                    if (listener3 == null) {
                        break;
                    }
                    listener = listener3.f8840c;
                    listener3.f8840c = listener2;
                }
                while (listener2 != null) {
                    listener3 = listener2.f8840c;
                    Runnable runnable = listener2.f8838a;
                    if (runnable instanceof SetFuture) {
                        SetFuture setFuture = (SetFuture) runnable;
                        abstractFuture = setFuture.X;
                        if (abstractFuture.X == setFuture) {
                            if (g0.b(abstractFuture, setFuture, e(setFuture.f8845Y))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, listener2.f8839b);
                    }
                    listener2 = listener3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f0.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            CancellationException cancellationException = ((Cancellation) obj).f8835b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f8837a);
        }
        if (obj == h0) {
            return null;
        }
        return obj;
    }

    public static Object e(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) listenableFuture).X;
            if (!(obj instanceof Cancellation)) {
                return obj;
            }
            Cancellation cancellation = (Cancellation) obj;
            if (cancellation.f8834a) {
                return cancellation.f8835b != null ? new Cancellation(false, cancellation.f8835b) : Cancellation.d;
            }
            return obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!e0) && zIsCancelled) {
            return Cancellation.d;
        }
        try {
            Object objF = f(listenableFuture);
            return objF == null ? h0 : objF;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new Cancellation(false, e2);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
        } catch (ExecutionException e3) {
            return new Failure(e3.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    public static Object f(ListenableFuture listenableFuture) {
        V v;
        boolean z2 = false;
        while (true) {
            try {
                v = listenableFuture.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append(d9.i.f24752e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(d9.i.f24752e);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        Listener listener = this.f8832Y;
        Listener listener2 = Listener.d;
        if (listener != listener2) {
            Listener listener3 = new Listener(runnable, executor);
            do {
                listener3.f8840c = listener;
                if (g0.a(this, listener, listener3)) {
                    return;
                } else {
                    listener = this.f8832Y;
                }
            } while (listener != listener2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Cancellation cancellation;
        Object obj = this.X;
        if (!(obj == null) && !(obj instanceof SetFuture)) {
            return false;
        }
        if (e0) {
            cancellation = new Cancellation(z2, new CancellationException("Future.cancel() was called."));
        } else {
            cancellation = z2 ? Cancellation.f8833c : Cancellation.d;
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z3 = false;
        while (true) {
            if (g0.b(abstractFuture, obj, cancellation)) {
                b(abstractFuture);
                if (!(obj instanceof SetFuture)) {
                    break;
                }
                ListenableFuture listenableFuture = ((SetFuture) obj).f8845Y;
                if (!(listenableFuture instanceof AbstractFuture)) {
                    listenableFuture.cancel(z2);
                    break;
                }
                abstractFuture = (AbstractFuture) listenableFuture;
                obj = abstractFuture.X;
                if (!(obj == null) && !(obj instanceof SetFuture)) {
                    break;
                }
                z3 = true;
            } else {
                obj = abstractFuture.X;
                if (!(obj instanceof SetFuture)) {
                    return z3;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.X;
        if (obj instanceof SetFuture) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ListenableFuture listenableFuture = ((SetFuture) obj).f8845Y;
            return a.r(sb, listenableFuture == this ? "this future" : String.valueOf(listenableFuture), d9.i.f24752e);
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z2;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.X;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter = this.Z;
            Waiter waiter2 = Waiter.f8846c;
            if (waiter != waiter2) {
                Waiter waiter3 = new Waiter();
                z2 = true;
                while (true) {
                    AtomicHelper atomicHelper = g0;
                    atomicHelper.d(waiter3, waiter);
                    if (atomicHelper.c(this, waiter, waiter3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.X;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(waiter3);
                        break;
                    }
                    waiter = this.Z;
                    if (waiter == waiter2) {
                    }
                }
            }
            return d(this.X);
        }
        z2 = true;
        while (nanos > 0) {
            Object obj3 = this.X;
            if ((obj3 != null ? z2 : false) && (!(obj3 instanceof SetFuture))) {
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
        StringBuilder sbV = a.v(j, "Waited ", " ");
        sbV.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbV.toString();
        if (nanos + 1000 < 0) {
            String strM = a.m(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z3 = (jConvert == 0 || nanos2 > 1000) ? z2 : false;
            if (jConvert > 0) {
                String strM2 = strM + jConvert + " " + lowerCase;
                if (z3) {
                    strM2 = a.m(strM2, ",");
                }
                strM = a.m(strM2, " ");
            }
            if (z3) {
                strM = strM + nanos2 + " nanoseconds ";
            }
            string3 = a.m(strM, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(a.m(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(a.D(string3, " for ", string));
    }

    public final void h(Waiter waiter) {
        waiter.f8847a = null;
        while (true) {
            Waiter waiter2 = this.Z;
            if (waiter2 == Waiter.f8846c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.f8848b;
                if (waiter2.f8847a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.f8848b = waiter4;
                    if (waiter3.f8847a == null) {
                    }
                } else if (!g0.c(this, waiter2, waiter4)) {
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.X instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.X;
        return (!(obj instanceof SetFuture)) & (obj != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.X instanceof Cancellation) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e2) {
                strG = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                a.A(sb, "PENDING, info=[", strG, d9.i.f24752e);
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(d9.i.f24752e);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.X;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return d(obj2);
            }
            Waiter waiter = this.Z;
            Waiter waiter2 = Waiter.f8846c;
            if (waiter != waiter2) {
                Waiter waiter3 = new Waiter();
                do {
                    AtomicHelper atomicHelper = g0;
                    atomicHelper.d(waiter3, waiter);
                    if (atomicHelper.c(this, waiter, waiter3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.X;
                            } else {
                                h(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return d(obj);
                    }
                    waiter = this.Z;
                } while (waiter != waiter2);
            }
            return d(this.X);
        }
        throw new InterruptedException();
    }
}
