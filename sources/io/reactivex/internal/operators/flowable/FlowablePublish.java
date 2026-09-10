package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, FlowablePublishClassic<T> {
    static final long CANCELLED = Long.MIN_VALUE;
    final int bufferSize;
    final AtomicReference<PublishSubscriber<T>> current;
    final Publisher<T> onSubscribe;
    final Flowable<T> source;

    public static final class FlowablePublisher<T> implements Publisher<T> {
        private final int bufferSize;
        private final AtomicReference<PublishSubscriber<T>> curr;

        public FlowablePublisher(AtomicReference<PublishSubscriber<T>> atomicReference, int i2) {
            this.curr = atomicReference;
            this.bufferSize = i2;
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
            PublishSubscriber<T> publishSubscriber;
            InnerSubscriber<T> innerSubscriber = new InnerSubscriber<>(subscriber);
            subscriber.onSubscribe(innerSubscriber);
            while (true) {
                publishSubscriber = this.curr.get();
                if (publishSubscriber == null || publishSubscriber.isDisposed()) {
                    PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.curr, this.bufferSize);
                    AtomicReference<PublishSubscriber<T>> atomicReference = this.curr;
                    while (true) {
                        if (atomicReference.compareAndSet(publishSubscriber, publishSubscriber2)) {
                            publishSubscriber = publishSubscriber2;
                        } else if (atomicReference.get() != publishSubscriber) {
                        }
                    }
                }
                if (publishSubscriber.add(innerSubscriber)) {
                    break;
                }
            }
            if (innerSubscriber.get() == Long.MIN_VALUE) {
                publishSubscriber.remove(innerSubscriber);
            } else {
                innerSubscriber.parent = publishSubscriber;
            }
            publishSubscriber.dispatch();
        }
    }

    public static final class InnerSubscriber<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        final Subscriber<? super T> child;
        long emitted;
        volatile PublishSubscriber<T> parent;

        public InnerSubscriber(Subscriber<? super T> subscriber) {
            this.child = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            PublishSubscriber<T> publishSubscriber;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (publishSubscriber = this.parent) == null) {
                return;
            }
            publishSubscriber.remove(this);
            publishSubscriber.dispatch();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.addCancel(this, j);
                PublishSubscriber<T> publishSubscriber = this.parent;
                if (publishSubscriber != null) {
                    publishSubscriber.dispatch();
                }
            }
        }
    }

    public static final class PublishSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscriber[] EMPTY = new InnerSubscriber[0];
        static final InnerSubscriber[] TERMINATED = new InnerSubscriber[0];
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final AtomicReference<PublishSubscriber<T>> current;
        volatile SimpleQueue<T> queue;
        int sourceMode;
        volatile Object terminalEvent;
        final AtomicReference<Subscription> upstream = new AtomicReference<>();
        final AtomicReference<InnerSubscriber<T>[]> subscribers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        public PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference, int i2) {
            this.current = atomicReference;
            this.bufferSize = i2;
        }

        public boolean add(InnerSubscriber<T> innerSubscriber) {
            while (true) {
                InnerSubscriber<T>[] innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriberArr.length;
                InnerSubscriber<T>[] innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
                AtomicReference<InnerSubscriber<T>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                    if (atomicReference.get() != innerSubscriberArr) {
                    }
                }
                return true;
            }
        }

        public boolean checkTerminated(Object obj, boolean z2) {
            int i2 = 0;
            if (obj != null) {
                if (!NotificationLite.isComplete(obj)) {
                    Throwable error = NotificationLite.getError(obj);
                    AtomicReference<PublishSubscriber<T>> atomicReference = this.current;
                    while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
                    }
                    InnerSubscriber<T>[] andSet = this.subscribers.getAndSet(TERMINATED);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i2 < length) {
                            andSet[i2].child.onError(error);
                            i2++;
                        }
                    } else {
                        RxJavaPlugins.onError(error);
                    }
                    return true;
                }
                if (z2) {
                    AtomicReference<PublishSubscriber<T>> atomicReference2 = this.current;
                    while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                    }
                    InnerSubscriber<T>[] andSet2 = this.subscribers.getAndSet(TERMINATED);
                    int length2 = andSet2.length;
                    while (i2 < length2) {
                        andSet2[i2].child.onComplete();
                        i2++;
                    }
                    return true;
                }
            }
            return false;
        }

        public void dispatch() {
            boolean z2;
            T tPoll;
            InnerSubscriber<T>[] innerSubscriberArr;
            T tPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<InnerSubscriber<T>[]> atomicReference = this.subscribers;
            boolean z3 = true;
            InnerSubscriber<T>[] innerSubscriberArr2 = atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                Object obj = this.terminalEvent;
                SimpleQueue<T> simpleQueue = this.queue;
                boolean z4 = (simpleQueue == null || simpleQueue.isEmpty()) ? z3 : false;
                if (checkTerminated(obj, z4)) {
                    return;
                }
                if (z4) {
                    z2 = z3;
                } else {
                    int length = innerSubscriberArr2.length;
                    int i2 = 0;
                    long jMin = Long.MAX_VALUE;
                    for (InnerSubscriber<T> innerSubscriber : innerSubscriberArr2) {
                        long j = innerSubscriber.get();
                        if (j != Long.MIN_VALUE) {
                            jMin = Math.min(jMin, j - innerSubscriber.emitted);
                        } else {
                            i2++;
                        }
                    }
                    long j2 = 1;
                    if (length == i2) {
                        Object objError = this.terminalEvent;
                        try {
                            tPoll = simpleQueue.poll();
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.get().cancel();
                            objError = NotificationLite.error(th);
                            this.terminalEvent = objError;
                            tPoll = null;
                        }
                        if (checkTerminated(objError, tPoll == null ? z3 : false)) {
                            return;
                        }
                        if (this.sourceMode != z3) {
                            this.upstream.get().request(1L);
                        }
                        z2 = z3;
                        innerSubscriberArr = innerSubscriberArr2;
                    } else {
                        int i3 = 0;
                        while (true) {
                            long j3 = i3;
                            if (j3 < jMin) {
                                Object objError2 = this.terminalEvent;
                                try {
                                    tPoll2 = simpleQueue.poll();
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.upstream.get().cancel();
                                    objError2 = NotificationLite.error(th2);
                                    this.terminalEvent = objError2;
                                    tPoll2 = null;
                                }
                                boolean z5 = tPoll2 == null ? z3 : false;
                                if (checkTerminated(objError2, z5)) {
                                    return;
                                }
                                if (z5) {
                                    z4 = z5;
                                } else {
                                    Object value = NotificationLite.getValue(tPoll2);
                                    int length2 = innerSubscriberArr2.length;
                                    int i4 = 0;
                                    boolean z6 = false;
                                    while (i4 < length2) {
                                        long j4 = j2;
                                        InnerSubscriber<T> innerSubscriber2 = innerSubscriberArr2[i4];
                                        long j5 = innerSubscriber2.get();
                                        if (j5 != Long.MIN_VALUE) {
                                            if (j5 != Long.MAX_VALUE) {
                                                innerSubscriber2.emitted += j4;
                                            }
                                            innerSubscriber2.child.onNext(value);
                                        } else {
                                            z6 = true;
                                        }
                                        i4++;
                                        innerSubscriberArr2 = innerSubscriberArr2;
                                        j2 = j4;
                                    }
                                    InnerSubscriber<T>[] innerSubscriberArr3 = innerSubscriberArr2;
                                    long j6 = j2;
                                    i3++;
                                    InnerSubscriber<T>[] innerSubscriberArr4 = atomicReference.get();
                                    if (z6 || innerSubscriberArr4 != innerSubscriberArr3) {
                                        if (i3 != 0 && this.sourceMode != 1) {
                                            this.upstream.get().request(i3);
                                        }
                                        innerSubscriberArr2 = innerSubscriberArr4;
                                        z3 = true;
                                    } else {
                                        innerSubscriberArr2 = innerSubscriberArr3;
                                        z4 = z5;
                                        j2 = j6;
                                        z3 = true;
                                    }
                                }
                            }
                            innerSubscriberArr = innerSubscriberArr2;
                            if (i3 != 0) {
                                z2 = true;
                                if (this.sourceMode != 1) {
                                    this.upstream.get().request(j3);
                                }
                            } else {
                                z2 = true;
                            }
                            if (jMin == 0 || z4) {
                            }
                            z3 = z2;
                        }
                    }
                    innerSubscriberArr2 = innerSubscriberArr;
                    z3 = z2;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                innerSubscriberArr2 = atomicReference.get();
                z3 = z2;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            InnerSubscriber<T>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<T>[] innerSubscriberArr2 = TERMINATED;
            if (innerSubscriberArr == innerSubscriberArr2 || this.subscribers.getAndSet(innerSubscriberArr2) == innerSubscriberArr2) {
                return;
            }
            AtomicReference<PublishSubscriber<T>> atomicReference = this.current;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            SubscriptionHelper.cancel(this.upstream);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.complete();
                dispatch();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.terminalEvent != null) {
                RxJavaPlugins.onError(th);
            } else {
                this.terminalEvent = NotificationLite.error(th);
                dispatch();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.sourceMode != 0 || this.queue.offer(t)) {
                dispatch();
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
                        this.terminalEvent = NotificationLite.complete();
                        dispatch();
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

        public void remove(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber<T>[] innerSubscriberArr;
            while (true) {
                InnerSubscriber<T>[] innerSubscriberArr2 = this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (innerSubscriberArr2[i2].equals(innerSubscriber)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr = EMPTY;
                } else {
                    InnerSubscriber<T>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr2, 0, innerSubscriberArr3, 0, i2);
                    System.arraycopy(innerSubscriberArr2, i2 + 1, innerSubscriberArr3, i2, (length - i2) - 1);
                    innerSubscriberArr = innerSubscriberArr3;
                }
                AtomicReference<InnerSubscriber<T>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(innerSubscriberArr2, innerSubscriberArr)) {
                    if (atomicReference.get() != innerSubscriberArr2) {
                    }
                }
                return;
            }
        }
    }

    private FlowablePublish(Publisher<T> publisher, Flowable<T> flowable, AtomicReference<PublishSubscriber<T>> atomicReference, int i2) {
        this.onSubscribe = publisher;
        this.source = flowable;
        this.current = atomicReference;
        this.bufferSize = i2;
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowablePublish(new FlowablePublisher(atomicReference, i2), flowable, atomicReference, i2));
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        PublishSubscriber<T> publishSubscriber;
        loop0: while (true) {
            publishSubscriber = this.current.get();
            if (publishSubscriber != null && !publishSubscriber.isDisposed()) {
                break;
            }
            PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.current, this.bufferSize);
            AtomicReference<PublishSubscriber<T>> atomicReference = this.current;
            do {
                if (atomicReference.compareAndSet(publishSubscriber, publishSubscriber2)) {
                    publishSubscriber = publishSubscriber2;
                    break loop0;
                }
            } while (atomicReference.get() == publishSubscriber);
        }
        boolean z2 = false;
        if (!publishSubscriber.shouldConnect.get() && publishSubscriber.shouldConnect.compareAndSet(false, true)) {
            z2 = true;
        }
        try {
            consumer.accept(publishSubscriber);
            if (z2) {
                this.source.subscribe((FlowableSubscriber) publishSubscriber);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowablePublishClassic
    public int publishBufferSize() {
        return this.bufferSize;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowablePublishClassic
    public Publisher<T> publishSource() {
        return this.source;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.onSubscribe.subscribe(subscriber);
    }
}
