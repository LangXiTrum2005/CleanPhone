package com.google.common.util.concurrent;

import com.google.common.base.Function;
import java.lang.Throwable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractCatchingFuture<V, X extends Throwable, F, T> extends FluentFuture.TrustedFuture<V> implements Runnable {

    public static final class AsyncCatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, AsyncFunction<? super X, ? extends V>, ListenableFuture<? extends V>> {
    }

    public static final class CatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, Function<? super X, ? extends V>, V> {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void d() {
        l(null);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String m() {
        String strM = super.m();
        if (strM != null) {
            return android.support.v4.media.a.m("", strM);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
