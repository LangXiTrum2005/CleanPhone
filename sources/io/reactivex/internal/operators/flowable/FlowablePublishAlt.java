package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowablePublishAlt<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, ResettableConnectable {
    final int bufferSize;
    final AtomicReference<PublishConnection<T>> current = new AtomicReference<>();
    final Publisher<T> source;

    public static final class InnerSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 2845000326761540265L;
        final Subscriber<? super T> downstream;
        long emitted;
        final PublishConnection<T> parent;

        public InnerSubscription(Subscriber<? super T> subscriber, PublishConnection<T> publishConnection) {
            this.downstream = subscriber;
            this.parent = publishConnection;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.drain();
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            BackpressureHelper.addCancel(this, j);
            this.parent.drain();
        }
    }

    public static final class PublishConnection<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscription[] EMPTY = new InnerSubscription[0];
        static final InnerSubscription[] TERMINATED = new InnerSubscription[0];
        private static final long serialVersionUID = -1672047311619175801L;
        final int bufferSize;
        int consumed;
        final AtomicReference<PublishConnection<T>> current;
        volatile boolean done;
        Throwable error;
        volatile SimpleQueue<T> queue;
        int sourceMode;
        final AtomicReference<Subscription> upstream = new AtomicReference<>();
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<InnerSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);

        public PublishConnection(AtomicReference<PublishConnection<T>> atomicReference, int i2) {
            this.current = atomicReference;
            this.bufferSize = i2;
        }

        public boolean add(InnerSubscription<T> innerSubscription) {
            while (true) {
                InnerSubscription<T>[] innerSubscriptionArr = this.subscribers.get();
                if (innerSubscriptionArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriptionArr.length;
                InnerSubscription<T>[] innerSubscriptionArr2 = new InnerSubscription[length + 1];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
                AtomicReference<InnerSubscription<T>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2)) {
                    if (atomicReference.get() != innerSubscriptionArr) {
                    }
                }
                return true;
            }
        }

        public boolean checkTerminated(boolean z2, boolean z3) {
            if (!z2 || !z3) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                signalError(th);
                return true;
            }
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (!innerSubscription.isCancelled()) {
                    innerSubscription.downstream.onComplete();
                }
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.subscribers.getAndSet(TERMINATED);
            AtomicReference<PublishConnection<T>> atomicReference = this.current;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            SubscriptionHelper.cancel(this.upstream);
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue<T> simpleQueue = this.queue;
            int i2 = this.consumed;
            int i3 = this.bufferSize;
            int i4 = i3 - (i3 >> 2);
            boolean z2 = this.sourceMode != 1;
            SimpleQueue<T> simpleQueue2 = simpleQueue;
            int i5 = i2;
            int iAddAndGet = 1;
            while (true) {
                if (simpleQueue2 != null) {
                    InnerSubscription<T>[] innerSubscriptionArr = this.subscribers.get();
                    long jMin = Long.MAX_VALUE;
                    boolean z3 = false;
                    for (InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                        long j = innerSubscription.get();
                        if (j != Long.MIN_VALUE) {
                            jMin = Math.min(j - innerSubscription.emitted, jMin);
                            z3 = true;
                        }
                    }
                    long j2 = 0;
                    if (!z3) {
                        jMin = 0;
                    }
                    while (true) {
                        if (jMin != j2) {
                            boolean z4 = this.done;
                            try {
                                T tPoll = simpleQueue2.poll();
                                boolean z5 = tPoll == null;
                                if (checkTerminated(z4, z5)) {
                                    return;
                                }
                                if (!z5) {
                                    for (InnerSubscription<T> innerSubscription2 : innerSubscriptionArr) {
                                        if (!innerSubscription2.isCancelled()) {
                                            innerSubscription2.downstream.onNext(tPoll);
                                            innerSubscription2.emitted++;
                                        }
                                    }
                                    if (z2 && (i5 = i5 + 1) == i4) {
                                        this.upstream.get().request(i4);
                                        i5 = 0;
                                    }
                                    jMin--;
                                    if (innerSubscriptionArr == this.subscribers.get()) {
                                        j2 = 0;
                                    }
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.upstream.get().cancel();
                                simpleQueue2.clear();
                                this.done = true;
                                signalError(th);
                                return;
                            }
                        }
                        if (checkTerminated(this.done, simpleQueue2.isEmpty())) {
                            return;
                        }
                    }
                }
                this.consumed = i5;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (simpleQueue2 == null) {
                    simpleQueue2 = this.queue;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.sourceMode != 0 || this.queue.offer(t)) {
                drain();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.upstream, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        subscription.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                subscription.request(this.bufferSize);
            }
        }

        public void remove(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            while (true) {
                InnerSubscription<T>[] innerSubscriptionArr2 = this.subscribers.get();
                int length = innerSubscriptionArr2.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (innerSubscriptionArr2[i2] == innerSubscription) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr = EMPTY;
                } else {
                    InnerSubscription<T>[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                    System.arraycopy(innerSubscriptionArr2, 0, innerSubscriptionArr3, 0, i2);
                    System.arraycopy(innerSubscriptionArr2, i2 + 1, innerSubscriptionArr3, i2, (length - i2) - 1);
                    innerSubscriptionArr = innerSubscriptionArr3;
                }
                AtomicReference<InnerSubscription<T>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(innerSubscriptionArr2, innerSubscriptionArr)) {
                    if (atomicReference.get() != innerSubscriptionArr2) {
                    }
                }
                return;
            }
        }

        public void signalError(Throwable th) {
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (!innerSubscription.isCancelled()) {
                    innerSubscription.downstream.onError(th);
                }
            }
        }
    }

    public FlowablePublishAlt(Publisher<T> publisher, int i2) {
        this.source = publisher;
        this.bufferSize = i2;
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        PublishConnection<T> publishConnection;
        loop0: while (true) {
            publishConnection = this.current.get();
            if (publishConnection != null && !publishConnection.isDisposed()) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.current, this.bufferSize);
            AtomicReference<PublishConnection<T>> atomicReference = this.current;
            do {
                if (atomicReference.compareAndSet(publishConnection, publishConnection2)) {
                    publishConnection = publishConnection2;
                    break loop0;
                }
            } while (atomicReference.get() == publishConnection);
        }
        boolean z2 = false;
        if (!publishConnection.connect.get() && publishConnection.connect.compareAndSet(false, true)) {
            z2 = true;
        }
        try {
            consumer.accept(publishConnection);
            if (z2) {
                this.source.subscribe(publishConnection);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    public int publishBufferSize() {
        return this.bufferSize;
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable) {
        AtomicReference<PublishConnection<T>> atomicReference = this.current;
        PublishConnection<T> publishConnection = (PublishConnection) disposable;
        while (!atomicReference.compareAndSet(publishConnection, null) && atomicReference.get() == publishConnection) {
        }
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        PublishConnection<T> publishConnection;
        loop0: while (true) {
            publishConnection = this.current.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.current, this.bufferSize);
            AtomicReference<PublishConnection<T>> atomicReference = this.current;
            do {
                if (atomicReference.compareAndSet(publishConnection, publishConnection2)) {
                    publishConnection = publishConnection2;
                    break loop0;
                }
            } while (atomicReference.get() == publishConnection);
        }
        InnerSubscription<T> innerSubscription = new InnerSubscription<>(subscriber, publishConnection);
        subscriber.onSubscribe(innerSubscription);
        if (publishConnection.add(innerSubscription)) {
            if (innerSubscription.isCancelled()) {
                publishConnection.remove(innerSubscription);
                return;
            } else {
                publishConnection.drain();
                return;
            }
        }
        Throwable th = publishConnection.error;
        if (th != null) {
            subscriber.onError(th);
        } else {
            subscriber.onComplete();
        }
    }
}
