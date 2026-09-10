package io.reactivex.rxjava3.internal.util;

import android.support.v4.media.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ExceptionHelper {
    public static final Throwable TERMINATED = new Termination();

    public static final class Termination extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    private ExceptionHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean addThrowable(AtomicReference<Throwable> atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = atomicReference.get();
            if (th2 == TERMINATED) {
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            while (!atomicReference.compareAndSet(th2, compositeException)) {
                if (atomicReference.get() != th2) {
                }
            }
            return true;
        }
    }

    public static NullPointerException createNullPointerException(String str) {
        return new NullPointerException(nullWarning(str));
    }

    public static List<Throwable> flatten(Throwable th) {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(th);
        while (!arrayDeque.isEmpty()) {
            Throwable th2 = (Throwable) arrayDeque.removeFirst();
            if (th2 instanceof CompositeException) {
                List<Throwable> exceptions = ((CompositeException) th2).getExceptions();
                for (int size = exceptions.size() - 1; size >= 0; size--) {
                    arrayDeque.offerFirst(exceptions.get(size));
                }
            } else {
                arrayList.add(th2);
            }
        }
        return arrayList;
    }

    public static <T> T nullCheck(T t, String str) {
        if (t != null) {
            return t;
        }
        throw createNullPointerException(str);
    }

    public static String nullWarning(String str) {
        return a.m(str, " Null values are generally not allowed in 3.x operators and sources.");
    }

    public static Throwable terminate(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = TERMINATED;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static <E extends Throwable> Exception throwIfThrowable(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    public static String timeoutMessage(long j, TimeUnit timeUnit) {
        StringBuilder sbV = a.v(j, "The source did not signal an event for ", " ");
        sbV.append(timeUnit.toString().toLowerCase());
        sbV.append(" and has been terminated.");
        return sbV.toString();
    }

    public static RuntimeException wrapOrThrow(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
