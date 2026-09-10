package androidx.concurrent.futures;

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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractResolvableFuture<V> implements ListenableFuture<V> {
    public static final boolean e0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger f0 = Logger.getLogger(AbstractResolvableFuture.class.getName());
    public static final AtomicHelper g0;
    public static final Object h0;
    public volatile Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public volatile Listener f3779Y;
    public volatile Waiter Z;

    public static abstract class AtomicHelper {
        public abstract boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2);

        public abstract void d(Waiter waiter, Waiter waiter2);

        public abstract void e(Waiter waiter, Thread thread);
    }

    public static final class Cancellation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Cancellation f3780c;
        public static final Cancellation d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellationException f3782b;

        static {
            if (AbstractResolvableFuture.e0) {
                d = null;
                f3780c = null;
            } else {
                d = new Cancellation(false, null);
                f3780c = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z2, CancellationException cancellationException) {
            this.f3781a = z2;
            this.f3782b = cancellationException;
        }
    }

    public static final class Failure {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f3783a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$Failure$1, reason: invalid class name */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));
        }

        public Failure(Throwable th) {
            boolean z2 = AbstractResolvableFuture.e0;
            th.getClass();
            this.f3783a = th;
        }
    }

    public static final class Listener {
        public static final Listener d = new Listener(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f3784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f3785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Listener f3786c;

        public Listener(Runnable runnable, Executor executor) {
            this.f3784a = runnable;
            this.f3785b = executor;
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f3787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f3788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f3789c;
        public final AtomicReferenceFieldUpdater d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f3790e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f3787a = atomicReferenceFieldUpdater;
            this.f3788b = atomicReferenceFieldUpdater2;
            this.f3789c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.f3790e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, listener, listener2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == listener);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f3790e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f3789c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == waiter);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            this.f3788b.lazySet(waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            this.f3787a.lazySet(waiter, thread);
        }
    }

    public static final class SetFuture<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class SynchronizedHelper extends AtomicHelper {
        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f3779Y != listener) {
                        return false;
                    }
                    abstractResolvableFuture.f3779Y = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.X != obj) {
                        return false;
                    }
                    abstractResolvableFuture.X = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.Z != waiter) {
                        return false;
                    }
                    abstractResolvableFuture.Z = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            waiter.f3793b = waiter2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            waiter.f3792a = thread;
        }
    }

    public static final class Waiter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Waiter f3791c = new Waiter();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f3792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile Waiter f3793b;

        public Waiter() {
            AbstractResolvableFuture.g0.e(this, Thread.currentThread());
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Waiter.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Listener.class, "Y"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "X"));
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

    public static void d(AbstractResolvableFuture abstractResolvableFuture) {
        Waiter waiter;
        Listener listener;
        do {
            waiter = abstractResolvableFuture.Z;
        } while (!g0.c(abstractResolvableFuture, waiter, Waiter.f3791c));
        while (waiter != null) {
            Thread thread = waiter.f3792a;
            if (thread != null) {
                waiter.f3792a = null;
                LockSupport.unpark(thread);
            }
            waiter = waiter.f3793b;
        }
        abstractResolvableFuture.b();
        do {
            listener = abstractResolvableFuture.f3779Y;
        } while (!g0.a(abstractResolvableFuture, listener, Listener.d));
        Listener listener2 = null;
        while (listener != null) {
            Listener listener3 = listener.f3786c;
            listener.f3786c = listener2;
            listener2 = listener;
            listener = listener3;
        }
        while (listener2 != null) {
            Listener listener4 = listener2.f3786c;
            Runnable runnable = listener2.f3784a;
            if (runnable instanceof SetFuture) {
                ((SetFuture) runnable).getClass();
                throw null;
            }
            f(runnable, listener2.f3785b);
            listener2 = listener4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f0.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            CancellationException cancellationException = ((Cancellation) obj).f3782b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f3783a);
        }
        if (obj == h0) {
            return null;
        }
        return obj;
    }

    public static Object h(AbstractResolvableFuture abstractResolvableFuture) {
        V v;
        boolean z2 = false;
        while (true) {
            try {
                v = abstractResolvableFuture.get();
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
            Object objH = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(objH == this ? "this future" : String.valueOf(objH));
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
        Listener listener = this.f3779Y;
        Listener listener2 = Listener.d;
        if (listener != listener2) {
            Listener listener3 = new Listener(runnable, executor);
            do {
                listener3.f3786c = listener;
                if (g0.a(this, listener, listener3)) {
                    return;
                } else {
                    listener = this.f3779Y;
                }
            } while (listener != listener2);
        }
        f(runnable, executor);
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Cancellation cancellation;
        Object obj = this.X;
        if ((obj == null) | (obj instanceof SetFuture)) {
            if (e0) {
                cancellation = new Cancellation(z2, new CancellationException("Future.cancel() was called."));
            } else {
                cancellation = z2 ? Cancellation.f3780c : Cancellation.d;
            }
            while (!g0.b(this, obj, cancellation)) {
                obj = this.X;
                if (!(obj instanceof SetFuture)) {
                }
            }
            d(this);
            if (!(obj instanceof SetFuture)) {
                return true;
            }
            ((SetFuture) obj).getClass();
            throw null;
        }
        return false;
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
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter = this.Z;
            Waiter waiter2 = Waiter.f3791c;
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
                                j(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.X;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(waiter3);
                        break;
                    }
                    waiter = this.Z;
                    if (waiter == waiter2) {
                    }
                }
            }
            return g(this.X);
        }
        z2 = true;
        while (nanos > 0) {
            Object obj3 = this.X;
            if ((obj3 != null ? z2 : false) && (!(obj3 instanceof SetFuture))) {
                return g(obj3);
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

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        Object obj = this.X;
        if (obj instanceof SetFuture) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ((SetFuture) obj).getClass();
            sb.append(AbstractJsonLexerKt.NULL);
            sb.append(d9.i.f24752e);
            return sb.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
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

    public final void j(Waiter waiter) {
        waiter.f3792a = null;
        while (true) {
            Waiter waiter2 = this.Z;
            if (waiter2 == Waiter.f3791c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.f3793b;
                if (waiter2.f3792a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.f3793b = waiter4;
                    if (waiter3.f3792a == null) {
                    }
                } else if (!g0.c(this, waiter2, waiter4)) {
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = h0;
        }
        if (!g0.b(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!g0.b(this, null, new Failure(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final boolean m() {
        Object obj = this.X;
        return (obj instanceof Cancellation) && ((Cancellation) obj).f3781a;
    }

    public final String toString() {
        String strI;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.X instanceof Cancellation) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strI = i();
            } catch (RuntimeException e2) {
                strI = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strI != null && !strI.isEmpty()) {
                a.A(sb, "PENDING, info=[", strI, d9.i.f24752e);
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
                return g(obj2);
            }
            Waiter waiter = this.Z;
            Waiter waiter2 = Waiter.f3791c;
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
                                j(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return g(obj);
                    }
                    waiter = this.Z;
                } while (waiter != waiter2);
            }
            return g(this.X);
        }
        throw new InterruptedException();
    }
}
