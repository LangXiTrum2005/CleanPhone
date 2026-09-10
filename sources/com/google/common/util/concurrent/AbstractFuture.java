package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.p004ironsource.d9;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {
    public static final boolean e0;
    public static final LazyLogger f0;
    public static final AtomicHelper g0;
    public static final Object h0;
    public volatile Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public volatile Listener f20096Y;
    public volatile Waiter Z;

    public static abstract class AtomicHelper {
        public abstract boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2);

        public abstract Listener d(AbstractFuture abstractFuture);

        public abstract Waiter e(AbstractFuture abstractFuture);

        public abstract void f(Waiter waiter, Waiter waiter2);

        public abstract void g(Waiter waiter, Thread thread);
    }

    public static final class Cancellation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Cancellation f20097c;
        public static final Cancellation d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RuntimeException f20099b;

        static {
            if (AbstractFuture.e0) {
                d = null;
                f20097c = null;
            } else {
                d = new Cancellation(false, null);
                f20097c = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z2, RuntimeException runtimeException) {
            this.f20098a = z2;
            this.f20099b = runtimeException;
        }
    }

    public static final class Failure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Failure f20100b = new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f20101a;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$Failure$1, reason: invalid class name */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public Failure(Throwable th) {
            th.getClass();
            this.f20101a = th;
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f20105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f20106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f20107c;
        public final AtomicReferenceFieldUpdater d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f20108e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f20105a = atomicReferenceFieldUpdater;
            this.f20106b = atomicReferenceFieldUpdater2;
            this.f20107c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.f20108e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f20108e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f20107c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == waiter);
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Listener d(AbstractFuture abstractFuture) {
            return (Listener) this.d.getAndSet(abstractFuture, Listener.d);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Waiter e(AbstractFuture abstractFuture) {
            return (Waiter) this.f20107c.getAndSet(abstractFuture, Waiter.f20114c);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void f(Waiter waiter, Waiter waiter2) {
            this.f20106b.lazySet(waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void g(Waiter waiter, Thread thread) {
            this.f20105a.lazySet(waiter, thread);
        }
    }

    public static final class SetFuture<V> implements Runnable {
        public final AbstractFuture X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ListenableFuture f20109Y;

        public SetFuture(AbstractFuture abstractFuture, ListenableFuture listenableFuture) {
            this.X = abstractFuture;
            this.f20109Y = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.X.X != this) {
                return;
            }
            if (AbstractFuture.g0.b(this.X, this, AbstractFuture.i(this.f20109Y))) {
                AbstractFuture.f(this.X, false);
            }
        }
    }

    public static final class SynchronizedHelper extends AtomicHelper {
        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f20096Y != listener) {
                        return false;
                    }
                    abstractFuture.f20096Y = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Listener d(AbstractFuture abstractFuture) {
            Listener listener;
            Listener listener2 = Listener.d;
            synchronized (abstractFuture) {
                listener = abstractFuture.f20096Y;
                if (listener != listener2) {
                    abstractFuture.f20096Y = listener2;
                }
            }
            return listener;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Waiter e(AbstractFuture abstractFuture) {
            Waiter waiter;
            Waiter waiter2 = Waiter.f20114c;
            synchronized (abstractFuture) {
                waiter = abstractFuture.Z;
                if (waiter != waiter2) {
                    abstractFuture.Z = waiter2;
                }
            }
            return waiter;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void f(Waiter waiter, Waiter waiter2) {
            waiter.f20116b = waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void g(Waiter waiter, Thread thread) {
            waiter.f20115a = thread;
        }
    }

    public interface Trusted<V> extends ListenableFuture<V> {
    }

    public static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.X instanceof Cancellation;
        }
    }

    public static final class UnsafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f20110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f20111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f20112c;
        public static final long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f20113e;
        public static final long f;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1, reason: invalid class name */
        public class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new AnonymousClass1());
                }
                try {
                    f20112c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("Z"));
                    f20111b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("Y"));
                    d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("X"));
                    f20113e = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("a"));
                    f = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("b"));
                    f20110a = unsafe;
                } catch (NoSuchFieldException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            return a.a(f20110a, abstractFuture, f20111b, listener, listener2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return a.a(f20110a, abstractFuture, d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            return a.a(f20110a, abstractFuture, f20112c, waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Listener d(AbstractFuture abstractFuture) {
            Listener listener;
            Listener listener2 = Listener.d;
            do {
                listener = abstractFuture.f20096Y;
                if (listener2 == listener) {
                    break;
                }
            } while (!a(abstractFuture, listener, listener2));
            return listener;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Waiter e(AbstractFuture abstractFuture) {
            Waiter waiter;
            Waiter waiter2 = Waiter.f20114c;
            do {
                waiter = abstractFuture.Z;
                if (waiter2 == waiter) {
                    break;
                }
            } while (!c(abstractFuture, waiter, waiter2));
            return waiter;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void f(Waiter waiter, Waiter waiter2) {
            f20110a.putObject(waiter, f, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void g(Waiter waiter, Thread thread) {
            f20110a.putObject(waiter, f20113e, thread);
        }
    }

    public static final class Waiter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Waiter f20114c = new Waiter();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f20115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile Waiter f20116b;

        public Waiter() {
            AbstractFuture.g0.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z2;
        Throwable th;
        AtomicHelper synchronizedHelper;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        e0 = z2;
        f0 = new LazyLogger(AbstractFuture.class);
        Throwable th2 = null;
        try {
            synchronizedHelper = new UnsafeAtomicHelper();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "Y"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "X"));
            } catch (Error | Exception e3) {
                th2 = e3;
                synchronizedHelper = new SynchronizedHelper();
            }
        }
        g0 = synchronizedHelper;
        if (th2 != null) {
            LazyLogger lazyLogger = f0;
            Logger loggerA = lazyLogger.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            lazyLogger.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        h0 = new Object();
    }

    public static void f(AbstractFuture abstractFuture, boolean z2) {
        Listener listener = null;
        while (true) {
            abstractFuture.getClass();
            for (Waiter waiterE = g0.e(abstractFuture); waiterE != null; waiterE = waiterE.f20116b) {
                Thread thread = waiterE.f20115a;
                if (thread != null) {
                    waiterE.f20115a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z2) {
                abstractFuture.k();
                z2 = false;
            }
            abstractFuture.d();
            Listener listener2 = listener;
            Listener listenerD = g0.d(abstractFuture);
            Listener listener3 = listener2;
            while (listenerD != null) {
                Listener listener4 = listenerD.f20104c;
                listenerD.f20104c = listener3;
                listener3 = listenerD;
                listenerD = listener4;
            }
            while (listener3 != null) {
                listener = listener3.f20104c;
                Runnable runnable = listener3.f20102a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof SetFuture) {
                    SetFuture setFuture = (SetFuture) runnable2;
                    abstractFuture = setFuture.X;
                    if (abstractFuture.X == setFuture) {
                        if (g0.b(abstractFuture, setFuture, i(setFuture.f20109Y))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = listener3.f20103b;
                    Objects.requireNonNull(executor);
                    g(runnable2, executor);
                }
                listener3 = listener;
            }
            return;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            f0.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object h(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            RuntimeException runtimeException = ((Cancellation) obj).f20099b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f20101a);
        }
        if (obj == h0) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(ListenableFuture listenableFuture) {
        Throwable thB;
        if (listenableFuture instanceof Trusted) {
            Object cancellation = ((AbstractFuture) listenableFuture).X;
            if (cancellation instanceof Cancellation) {
                Cancellation cancellation2 = (Cancellation) cancellation;
                if (cancellation2.f20098a) {
                    cancellation = cancellation2.f20099b != null ? new Cancellation(false, cancellation2.f20099b) : Cancellation.d;
                }
            }
            Objects.requireNonNull(cancellation);
            return cancellation;
        }
        if ((listenableFuture instanceof InternalFutureFailureAccess) && (thB = ((InternalFutureFailureAccess) listenableFuture).b()) != null) {
            return new Failure(thB);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!e0) && zIsCancelled) {
            Cancellation cancellation3 = Cancellation.d;
            Objects.requireNonNull(cancellation3);
            return cancellation3;
        }
        try {
            try {
                try {
                    Object objJ = j(listenableFuture);
                    if (!zIsCancelled) {
                        return objJ == null ? h0 : objJ;
                    }
                    return new Cancellation(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
                } catch (CancellationException e2) {
                    if (zIsCancelled) {
                        return new Cancellation(false, e2);
                    }
                    return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
                } catch (ExecutionException e3) {
                    if (!zIsCancelled) {
                        return new Failure(e3.getCause());
                    }
                    return new Cancellation(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e3));
                }
            } catch (Error e4) {
                e = e4;
                return new Failure(e);
            }
        } catch (Error | Exception e5) {
            e = e5;
            return new Failure(e);
        }
    }

    public static Object j(ListenableFuture listenableFuture) {
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

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Listener listener;
        Listener listener2;
        Preconditions.j(runnable, "Runnable was null.");
        Preconditions.j(executor, "Executor was null.");
        if (!isDone() && (listener = this.f20096Y) != (listener2 = Listener.d)) {
            Listener listener3 = new Listener(runnable, executor);
            do {
                listener3.f20104c = listener;
                if (g0.a(this, listener, listener3)) {
                    return;
                } else {
                    listener = this.f20096Y;
                }
            } while (listener != listener2);
        }
        g(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    public final Throwable b() {
        if (!(this instanceof Trusted)) {
            return null;
        }
        Object obj = this.X;
        if (obj instanceof Failure) {
            return ((Failure) obj).f20101a;
        }
        return null;
    }

    public final void c(StringBuilder sb) {
        try {
            Object objJ = j(this);
            sb.append("SUCCESS, result=[");
            e(objJ, sb);
            sb.append(d9.i.f24752e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(d9.i.f24752e);
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        Cancellation cancellation;
        Object obj = this.X;
        if (!(obj == null) && !(obj instanceof SetFuture)) {
            return false;
        }
        if (e0) {
            cancellation = new Cancellation(z2, new CancellationException("Future.cancel() was called."));
        } else {
            cancellation = z2 ? Cancellation.f20097c : Cancellation.d;
            Objects.requireNonNull(cancellation);
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z3 = false;
        while (true) {
            if (g0.b(abstractFuture, obj, cancellation)) {
                f(abstractFuture, z2);
                if (obj instanceof SetFuture) {
                    ListenableFuture listenableFuture = ((SetFuture) obj).f20109Y;
                    if (listenableFuture instanceof Trusted) {
                        abstractFuture = (AbstractFuture) listenableFuture;
                        obj = abstractFuture.X;
                        if ((obj == null) | (obj instanceof SetFuture)) {
                            z3 = true;
                        }
                    } else {
                        listenableFuture.cancel(z2);
                    }
                }
                return true;
            }
            obj = abstractFuture.X;
            if (!(obj instanceof SetFuture)) {
                return z3;
            }
        }
    }

    public void d() {
    }

    public final void e(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z2;
        long j2;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.X;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return h(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter = this.Z;
            Waiter waiter2 = Waiter.f20114c;
            if (waiter != waiter2) {
                Waiter waiter3 = new Waiter();
                z2 = true;
                while (true) {
                    AtomicHelper atomicHelper = g0;
                    atomicHelper.f(waiter3, waiter);
                    if (atomicHelper.c(this, waiter, waiter3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                n(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.X;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(waiter3);
                        break;
                    }
                    long j4 = j3;
                    waiter = this.Z;
                    if (waiter != waiter2) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.X;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        z2 = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.X;
            if ((obj4 != null ? z2 : false) && (!(obj4 instanceof SetFuture))) {
                return h(obj4);
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
        StringBuilder sbV = android.support.v4.media.a.v(j, "Waited ", " ");
        sbV.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbV.toString();
        if (nanos + 1000 < j2) {
            String strM = android.support.v4.media.a.m(string3, " (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z3 = (jConvert == j2 || nanos2 > 1000) ? z2 : false;
            if (jConvert > j2) {
                String strM2 = strM + jConvert + " " + lowerCase;
                if (z3) {
                    strM2 = android.support.v4.media.a.m(strM2, ",");
                }
                strM = android.support.v4.media.a.m(strM2, " ");
            }
            if (z3) {
                strM = strM + nanos2 + " nanoseconds ";
            }
            string3 = android.support.v4.media.a.m(strM, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(android.support.v4.media.a.m(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(android.support.v4.media.a.D(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.X instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.X;
        return (!(obj instanceof SetFuture)) & (obj != null);
    }

    public void k() {
    }

    public final void l(Future future) {
        boolean z2 = false;
        if ((future != null) && isCancelled()) {
            Object obj = this.X;
            if ((obj instanceof Cancellation) && ((Cancellation) obj).f20098a) {
                z2 = true;
            }
            future.cancel(z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String m() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void n(Waiter waiter) {
        waiter.f20115a = null;
        while (true) {
            Waiter waiter2 = this.Z;
            if (waiter2 == Waiter.f20114c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.f20116b;
                if (waiter2.f20115a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.f20116b = waiter4;
                    if (waiter3.f20115a == null) {
                    }
                } else if (!g0.c(this, waiter2, waiter4)) {
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    public boolean o(Object obj) {
        if (obj == null) {
            obj = h0;
        }
        if (!g0.b(this, null, obj)) {
            return false;
        }
        f(this, false);
        return true;
    }

    public boolean p(Throwable th) {
        th.getClass();
        if (!g0.b(this, null, new Failure(th))) {
            return false;
        }
        f(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final boolean q(ListenableFuture listenableFuture) {
        Failure failure;
        listenableFuture.getClass();
        Object obj = this.X;
        if (obj != null) {
            if (obj instanceof Cancellation) {
                listenableFuture.cancel(((Cancellation) obj).f20098a);
            }
        } else if (listenableFuture.isDone()) {
            if (g0.b(this, null, i(listenableFuture))) {
                f(this, false);
                return true;
            }
        } else {
            SetFuture setFuture = new SetFuture(this, listenableFuture);
            if (g0.b(this, null, setFuture)) {
                try {
                    listenableFuture.addListener(setFuture, DirectExecutor.X);
                    return true;
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Error | Exception unused) {
                        failure = Failure.f20100b;
                    }
                    g0.b(this, setFuture, failure);
                    return true;
                }
            }
            obj = this.X;
            if (obj instanceof Cancellation) {
                listenableFuture.cancel(((Cancellation) obj).f20098a);
            }
        }
        return false;
    }

    public String toString() {
        String strM;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.X;
            if (obj instanceof SetFuture) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((SetFuture) obj).f20109Y;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append(d9.i.f24752e);
            } else {
                try {
                    strM = m();
                    if (strM == null || strM.isEmpty()) {
                        strM = null;
                    }
                } catch (Exception | StackOverflowError e4) {
                    strM = "Exception thrown from implementation: " + e4.getClass();
                }
                if (strM != null) {
                    android.support.v4.media.a.A(sb, ", info=[", strM, d9.i.f24752e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                c(sb);
            }
        }
        sb.append(d9.i.f24752e);
        return sb.toString();
    }

    public static final class Listener {
        public static final Listener d = new Listener();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f20102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f20103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Listener f20104c;

        public Listener(Runnable runnable, Executor executor) {
            this.f20102a = runnable;
            this.f20103b = executor;
        }

        public Listener() {
            this.f20102a = null;
            this.f20103b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.X;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return h(obj2);
            }
            Waiter waiter = this.Z;
            Waiter waiter2 = Waiter.f20114c;
            if (waiter != waiter2) {
                Waiter waiter3 = new Waiter();
                do {
                    AtomicHelper atomicHelper = g0;
                    atomicHelper.f(waiter3, waiter);
                    if (atomicHelper.c(this, waiter, waiter3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.X;
                            } else {
                                n(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return h(obj);
                    }
                    waiter = this.Z;
                } while (waiter != waiter2);
            }
            Object obj3 = this.X;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        throw new InterruptedException();
    }
}
