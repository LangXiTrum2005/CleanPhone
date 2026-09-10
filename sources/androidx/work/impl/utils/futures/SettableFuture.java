package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class SettableFuture<V> extends AbstractFuture<V> {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = AbstractFuture.h0;
        }
        if (!AbstractFuture.g0.b(this, null, obj)) {
            return false;
        }
        AbstractFuture.b(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!AbstractFuture.g0.b(this, null, new AbstractFuture.Failure(th))) {
            return false;
        }
        AbstractFuture.b(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final boolean k(ListenableFuture listenableFuture) {
        AbstractFuture.Failure failure;
        listenableFuture.getClass();
        Object obj = this.X;
        if (obj != null) {
            if (obj instanceof AbstractFuture.Cancellation) {
                listenableFuture.cancel(((AbstractFuture.Cancellation) obj).f8834a);
            }
        } else if (listenableFuture.isDone()) {
            if (AbstractFuture.g0.b(this, null, AbstractFuture.e(listenableFuture))) {
                AbstractFuture.b(this);
                return true;
            }
        } else {
            AbstractFuture.SetFuture setFuture = new AbstractFuture.SetFuture(this, listenableFuture);
            if (AbstractFuture.g0.b(this, null, setFuture)) {
                try {
                    listenableFuture.addListener(setFuture, DirectExecutor.X);
                    return true;
                } catch (Throwable th) {
                    try {
                        failure = new AbstractFuture.Failure(th);
                    } catch (Throwable unused) {
                        failure = AbstractFuture.Failure.f8836b;
                    }
                    AbstractFuture.g0.b(this, setFuture, failure);
                    return true;
                }
            }
            obj = this.X;
            if (obj instanceof AbstractFuture.Cancellation) {
                listenableFuture.cancel(((AbstractFuture.Cancellation) obj).f8834a);
            }
        }
        return false;
    }
}
