package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.p004ironsource.d9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {
    public static final /* synthetic */ int k0 = 0;
    public ListenableFuture i0;
    public Function j0;

    public static final class AsyncTransformFuture<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final Object r(Function function, Object obj) {
            ((AsyncFunction) function).apply(obj);
            throw null;
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final void s(Object obj) {
            q((ListenableFuture) obj);
        }
    }

    public static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final Object r(Function function, Object obj) {
            return function.apply(obj);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final void s(Object obj) {
            o(obj);
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void d() {
        l(this.i0);
        this.i0 = null;
        this.j0 = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String m() {
        String str;
        ListenableFuture listenableFuture = this.i0;
        Function function = this.j0;
        String strM = super.m();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (function == null) {
            if (strM != null) {
                return android.support.v4.media.a.m(str, strM);
            }
            return null;
        }
        return str + "function=[" + function + d9.i.f24752e;
    }

    public abstract Object r(Function function, Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.i0;
        Function function = this.j0;
        if (((this.X instanceof AbstractFuture.Cancellation) | (listenableFuture == null)) || (function == null)) {
            return;
        }
        this.i0 = null;
        if (listenableFuture.isCancelled()) {
            q(listenableFuture);
            return;
        }
        try {
            Preconditions.q(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
            try {
                Object objR = r(function, Uninterruptibles.a(listenableFuture));
                this.j0 = null;
                s(objR);
            } catch (Throwable th) {
                try {
                    Platform.a(th);
                    p(th);
                } finally {
                    this.j0 = null;
                }
            }
        } catch (Error e2) {
            p(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e3) {
            p(e3.getCause());
        } catch (Exception e4) {
            p(e4);
        }
    }

    public abstract void s(Object obj);
}
