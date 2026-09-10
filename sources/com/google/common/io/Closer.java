package com.google.common.io;

import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Closer implements Closeable {
    public static final Suppressor X;

    public static final class LoggingSuppressor implements Suppressor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoggingSuppressor f20022a = new LoggingSuppressor();

        @Override // com.google.common.io.Closer.Suppressor
        public final void a(Closeable closeable, Throwable th, Throwable th2) {
            Closeables.f20021a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th2);
        }
    }

    public static final class SuppressingSuppressor implements Suppressor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f20023a;

        public SuppressingSuppressor(Method method) {
            this.f20023a = method;
        }

        @Override // com.google.common.io.Closer.Suppressor
        public final void a(Closeable closeable, Throwable th, Throwable th2) {
            if (th == th2) {
                return;
            }
            try {
                this.f20023a.invoke(th, th2);
            } catch (Throwable unused) {
                LoggingSuppressor.f20022a.a(closeable, th, th2);
            }
        }
    }

    public interface Suppressor {
        void a(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        Suppressor suppressingSuppressor;
        try {
            suppressingSuppressor = new SuppressingSuppressor(Throwable.class.getMethod("addSuppressed", Throwable.class));
        } catch (Throwable unused) {
            suppressingSuppressor = null;
        }
        if (suppressingSuppressor == null) {
            suppressingSuppressor = LoggingSuppressor.f20022a;
        }
        X = suppressingSuppressor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }
}
