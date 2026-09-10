package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vb1 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f21146a = new ArrayDeque(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f21147b;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th2 = this.f21147b;
        while (true) {
            ArrayDeque arrayDeque = this.f21146a;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) arrayDeque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else if (th2 != th3) {
                    try {
                        th2.addSuppressed(th3);
                    } catch (Throwable unused) {
                        ub1.f20719a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th3);
                    }
                }
            }
        }
        if (this.f21147b != null || th2 == null) {
            return;
        }
        Object obj = t81.f20241a;
        if (IOException.class.isInstance(th2)) {
            throw ((Throwable) IOException.class.cast(th2));
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (!(th2 instanceof Error)) {
            throw new AssertionError(th2);
        }
        throw ((Error) th2);
    }
}
