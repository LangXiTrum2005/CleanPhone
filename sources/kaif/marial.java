package kaif;

import com.google.common.base.formularize;
import com.google.common.base.polloi;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Closer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class marial implements Closeable {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final dern f29047polloi;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Deque<Closeable> f29048arytenoidectomy = new ArrayDeque(4);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final dern f29049kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    @CheckForNull
    public Throwable f29050monoploid;

    /* JADX INFO: compiled from: Closer.java */
    public static final class attabal implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f29051attabal = new attabal();

        @Override // kaif.marial.dern
        public void attabal(Closeable closeable, Throwable th, Throwable th2) {
            wireman.f29053attabal.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th2);
        }
    }

    /* JADX INFO: compiled from: Closer.java */
    public interface dern {
        void attabal(Closeable closeable, Throwable th, Throwable th2);
    }

    /* JADX INFO: compiled from: Closer.java */
    public static final class saneness implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f29052attabal;

        public saneness(Method method) {
            this.f29052attabal = method;
        }

        @CheckForNull
        public static saneness saneness() {
            try {
                return new saneness(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // kaif.marial.dern
        public void attabal(Closeable closeable, Throwable th, Throwable th2) {
            if (th == th2) {
                return;
            }
            try {
                this.f29052attabal.invoke(th, th2);
            } catch (Throwable unused) {
                attabal.f29051attabal.attabal(closeable, th, th2);
            }
        }
    }

    static {
        dern dernVarSaneness = saneness.saneness();
        if (dernVarSaneness == null) {
            dernVarSaneness = attabal.f29051attabal;
        }
        f29047polloi = dernVarSaneness;
    }

    public marial(dern dernVar) {
        this.f29049kowloon = (dern) formularize.triweekly(dernVar);
    }

    public static marial attabal() {
        return new marial(f29047polloi);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Throwable th = this.f29050monoploid;
        while (!this.f29048arytenoidectomy.isEmpty()) {
            Closeable closeableRemoveFirst = this.f29048arytenoidectomy.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f29049kowloon.attabal(closeableRemoveFirst, th, th2);
                }
            }
        }
        if (this.f29050monoploid != null || th == null) {
            return;
        }
        polloi.competently(th, IOException.class);
        throw new AssertionError(th);
    }

    public RuntimeException dern(Throwable th) throws Throwable {
        formularize.triweekly(th);
        this.f29050monoploid = th;
        polloi.competently(th, IOException.class);
        throw new RuntimeException(th);
    }

    public <C extends Closeable> C saneness(C c) {
        if (c != null) {
            this.f29048arytenoidectomy.addFirst(c);
        }
        return c;
    }
}
