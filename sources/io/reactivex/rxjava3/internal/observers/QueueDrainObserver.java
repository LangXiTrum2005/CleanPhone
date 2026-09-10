package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.util.ObservableQueueDrain;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;

/* JADX INFO: loaded from: classes7.dex */
public abstract class QueueDrainObserver<T, U, V> extends QueueDrainSubscriberPad2 implements Observer<T>, ObservableQueueDrain<U, V> {
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected final Observer<? super V> downstream;
    protected Throwable error;
    protected final SimplePlainQueue<U> queue;

    public QueueDrainObserver(Observer<? super V> observer, SimplePlainQueue<U> simplePlainQueue) {
        this.downstream = observer;
        this.queue = simplePlainQueue;
    }

    @Override // io.reactivex.rxjava3.internal.util.ObservableQueueDrain
    public void accept(Observer<? super V> observer, U u2) {
    }

    @Override // io.reactivex.rxjava3.internal.util.ObservableQueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.rxjava3.internal.util.ObservableQueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override // io.reactivex.rxjava3.internal.util.ObservableQueueDrain
    public final boolean enter() {
        return this.wip.getAndIncrement() == 0;
    }

    @Override // io.reactivex.rxjava3.internal.util.ObservableQueueDrain
    public final Throwable error() {
        return this.error;
    }

    public final void fastPathEmit(U u2, boolean z2, Disposable disposable) {
        Observer<? super V> observer = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (this.wip.get() == 0 && this.wip.compareAndSet(0, 1)) {
            accept(observer, u2);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            simplePlainQueue.offer(u2);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainLoop(simplePlainQueue, observer, z2, disposable, this);
    }

    public final void fastPathOrderedEmit(U u2, boolean z2, Disposable disposable) {
        Observer<? super V> observer = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (this.wip.get() != 0 || !this.wip.compareAndSet(0, 1)) {
            simplePlainQueue.offer(u2);
            if (!enter()) {
                return;
            }
        } else if (simplePlainQueue.isEmpty()) {
            accept(observer, u2);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            simplePlainQueue.offer(u2);
        }
        QueueDrainHelper.drainLoop(simplePlainQueue, observer, z2, disposable, this);
    }

    @Override // io.reactivex.rxjava3.internal.util.ObservableQueueDrain
    public final int leave(int i2) {
        return this.wip.addAndGet(i2);
    }
}
