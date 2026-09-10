package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
@SchedulerSupport("none")
@BackpressureSupport(BackpressureKind.FULL)
public final class MulticastProcessor<T> extends FlowableProcessor<T> {
    static final MulticastSubscription[] EMPTY = new MulticastSubscription[0];
    static final MulticastSubscription[] TERMINATED = new MulticastSubscription[0];
    final int bufferSize;
    int consumed;
    volatile boolean done;
    volatile Throwable error;
    int fusionMode;
    final int limit;
    final AtomicBoolean once;
    volatile SimpleQueue<T> queue;
    final boolean refcount;
    final AtomicReference<MulticastSubscription<T>[]> subscribers;
    final AtomicReference<Subscription> upstream;
    final AtomicInteger wip;

    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = -363282618957264509L;
        final Subscriber<? super T> downstream;
        long emitted;
        final MulticastProcessor<T> parent;

        public MulticastSubscription(Subscriber<? super T> subscriber, MulticastProcessor<T> multicastProcessor) {
            this.downstream = subscriber;
            this.parent = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            }
        }

        public void onNext(T t) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            long j2;
            long j3;
            if (SubscriptionHelper.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j2 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j3 = j2 + j;
                    }
                } while (!compareAndSet(j2, j3 >= 0 ? j3 : Long.MAX_VALUE));
                this.parent.drain();
            }
        }
    }

    public MulticastProcessor(int i2, boolean z2) {
        ObjectHelper.verifyPositive(i2, "bufferSize");
        this.bufferSize = i2;
        this.limit = i2 - (i2 >> 2);
        this.wip = new AtomicInteger();
        this.subscribers = new AtomicReference<>(EMPTY);
        this.upstream = new AtomicReference<>();
        this.refcount = z2;
        this.once = new AtomicBoolean();
    }

    @CheckReturnValue
    public static <T> MulticastProcessor<T> create() {
        return new MulticastProcessor<>(Flowable.bufferSize(), false);
    }

    public boolean add(MulticastSubscription<T> multicastSubscription) {
        while (true) {
            MulticastSubscription<T>[] multicastSubscriptionArr = this.subscribers.get();
            if (multicastSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = multicastSubscriptionArr.length;
            MulticastSubscription<T>[] multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
            System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
            multicastSubscriptionArr2[length] = multicastSubscription;
            AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2)) {
                if (atomicReference.get() != multicastSubscriptionArr) {
                }
            }
            return true;
        }
    }

    public void drain() {
        T tPoll;
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
        int i2 = this.consumed;
        int i3 = this.limit;
        int i4 = this.fusionMode;
        int iAddAndGet = 1;
        while (true) {
            SimpleQueue<T> simpleQueue = this.queue;
            if (simpleQueue != null) {
                MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference.get();
                if (multicastSubscriptionArr.length != 0) {
                    int i5 = 0;
                    long jMin = -1;
                    for (MulticastSubscription<T> multicastSubscription : multicastSubscriptionArr) {
                        long j = multicastSubscription.get();
                        if (j >= 0) {
                            jMin = jMin == -1 ? j - multicastSubscription.emitted : Math.min(jMin, j - multicastSubscription.emitted);
                        }
                    }
                    int i6 = i2;
                    while (true) {
                        if (jMin > 0) {
                            MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                            if (multicastSubscriptionArr2 == TERMINATED) {
                                simpleQueue.clear();
                                return;
                            }
                            if (multicastSubscriptionArr == multicastSubscriptionArr2) {
                                boolean z2 = this.done;
                                try {
                                    tPoll = simpleQueue.poll();
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    SubscriptionHelper.cancel(this.upstream);
                                    this.error = th;
                                    this.done = true;
                                    tPoll = null;
                                    z2 = true;
                                }
                                boolean z3 = tPoll == null;
                                if (z2 && z3) {
                                    Throwable th2 = this.error;
                                    if (th2 != null) {
                                        MulticastSubscription<T>[] andSet = atomicReference.getAndSet(TERMINATED);
                                        int length = andSet.length;
                                        while (i5 < length) {
                                            andSet[i5].onError(th2);
                                            i5++;
                                        }
                                        return;
                                    }
                                    MulticastSubscription<T>[] andSet2 = atomicReference.getAndSet(TERMINATED);
                                    int length2 = andSet2.length;
                                    while (i5 < length2) {
                                        andSet2[i5].onComplete();
                                        i5++;
                                    }
                                    return;
                                }
                                if (!z3) {
                                    for (MulticastSubscription<T> multicastSubscription2 : multicastSubscriptionArr) {
                                        multicastSubscription2.onNext(tPoll);
                                    }
                                    jMin--;
                                    if (i4 != 1 && (i6 = i6 + 1) == i3) {
                                        this.upstream.get().request(i3);
                                        i6 = 0;
                                    }
                                }
                            }
                            i2 = i6;
                        }
                        if (jMin == 0) {
                            MulticastSubscription<T>[] multicastSubscriptionArr3 = atomicReference.get();
                            MulticastSubscription<T>[] multicastSubscriptionArr4 = TERMINATED;
                            if (multicastSubscriptionArr3 == multicastSubscriptionArr4) {
                                simpleQueue.clear();
                                return;
                            }
                            if (multicastSubscriptionArr != multicastSubscriptionArr3) {
                                i2 = i6;
                            } else if (this.done && simpleQueue.isEmpty()) {
                                Throwable th3 = this.error;
                                if (th3 != null) {
                                    MulticastSubscription<T>[] andSet3 = atomicReference.getAndSet(multicastSubscriptionArr4);
                                    int length3 = andSet3.length;
                                    while (i5 < length3) {
                                        andSet3[i5].onError(th3);
                                        i5++;
                                    }
                                    return;
                                }
                                MulticastSubscription<T>[] andSet4 = atomicReference.getAndSet(multicastSubscriptionArr4);
                                int length4 = andSet4.length;
                                while (i5 < length4) {
                                    andSet4[i5].onComplete();
                                    i5++;
                                }
                                return;
                            }
                        }
                        i2 = i6;
                    }
                }
            }
            this.consumed = i2;
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        if (this.once.get()) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.once.get() && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.once.get() && this.error != null;
    }

    public boolean offer(T t) {
        if (this.once.get()) {
            return false;
        }
        ObjectHelper.requireNonNull(t, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.fusionMode != 0 || !this.queue.offer(t)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor, org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            this.done = true;
            drain();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.once.compareAndSet(false, true)) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.once.get()) {
            return;
        }
        if (this.fusionMode == 0) {
            ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.queue.offer(t)) {
                SubscriptionHelper.cancel(this.upstream);
                onError(new MissingBackpressureException());
                return;
            }
        }
        drain();
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.upstream, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iRequestFusion = queueSubscription.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    subscription.request(this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            subscription.request(this.bufferSize);
        }
    }

    public void remove(MulticastSubscription<T> multicastSubscription) {
        while (true) {
            MulticastSubscription<T>[] multicastSubscriptionArr = this.subscribers.get();
            int length = multicastSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (multicastSubscriptionArr[i2] == multicastSubscription) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length != 1) {
                MulticastSubscription<T>[] multicastSubscriptionArr2 = new MulticastSubscription[length - 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, i2);
                System.arraycopy(multicastSubscriptionArr, i2 + 1, multicastSubscriptionArr2, i2, (length - i2) - 1);
                AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2)) {
                    if (atomicReference.get() != multicastSubscriptionArr) {
                    }
                }
                return;
            }
            if (!this.refcount) {
                AtomicReference<MulticastSubscription<T>[]> atomicReference2 = this.subscribers;
                MulticastSubscription<T>[] multicastSubscriptionArr3 = EMPTY;
                while (!atomicReference2.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr3)) {
                    if (atomicReference2.get() != multicastSubscriptionArr) {
                    }
                }
                return;
            }
            AtomicReference<MulticastSubscription<T>[]> atomicReference3 = this.subscribers;
            MulticastSubscription<T>[] multicastSubscriptionArr4 = TERMINATED;
            do {
                if (atomicReference3.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr4)) {
                    SubscriptionHelper.cancel(this.upstream);
                    this.once.set(true);
                    return;
                }
            } while (atomicReference3.get() == multicastSubscriptionArr);
        }
    }

    public void start() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscArrayQueue(this.bufferSize);
        }
    }

    public void startUnbounded() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscLinkedArrayQueue(this.bufferSize);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Throwable th;
        MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(subscriber, this);
        subscriber.onSubscribe(multicastSubscription);
        if (add(multicastSubscription)) {
            if (multicastSubscription.get() == Long.MIN_VALUE) {
                remove(multicastSubscription);
                return;
            } else {
                drain();
                return;
            }
        }
        if ((this.once.get() || !this.refcount) && (th = this.error) != null) {
            subscriber.onError(th);
        } else {
            subscriber.onComplete();
        }
    }

    @CheckReturnValue
    public static <T> MulticastProcessor<T> create(boolean z2) {
        return new MulticastProcessor<>(Flowable.bufferSize(), z2);
    }

    @CheckReturnValue
    public static <T> MulticastProcessor<T> create(int i2) {
        return new MulticastProcessor<>(i2, false);
    }

    @CheckReturnValue
    public static <T> MulticastProcessor<T> create(int i2, boolean z2) {
        return new MulticastProcessor<>(i2, z2);
    }
}
