package com.google.common.util.concurrent;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class TimeoutFuture<V> extends FluentFuture.TrustedFuture<V> {

    public static final class Fire<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class TimeoutFutureException extends TimeoutException {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void d() {
        l(null);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String m() {
        return null;
    }
}
