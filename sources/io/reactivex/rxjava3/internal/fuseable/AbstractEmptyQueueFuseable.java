package io.reactivex.rxjava3.internal.fuseable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractEmptyQueueFuseable<T> implements QueueSubscription<T>, QueueDisposable<T> {
    @Override // io.reactivex.rxjava3.internal.fuseable.QueueSubscription, org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return false;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final T poll() throws Throwable {
        return null;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.QueueSubscription, org.reactivestreams.Subscription
    public final void request(long j) {
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
    public final int requestFusion(int i2) {
        return i2 & 2;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
