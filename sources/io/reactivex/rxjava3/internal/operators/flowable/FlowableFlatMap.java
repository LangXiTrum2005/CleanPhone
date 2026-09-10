package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends Publisher<? extends U>> mapper;
    final int maxConcurrency;

    public static final class InnerSubscriber<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit;
        final MergeSubscriber<T, U> parent;
        long produced;
        volatile SimpleQueue<U> queue;

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, int i2, long j) {
            this.id = j;
            this.parent = mergeSubscriber;
            this.bufferSize = i2;
            this.limit = i2 >> 2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(U u2) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u2, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                    }
                }
                subscription.request(this.bufferSize);
            }
        }

        public void requestMore(long j) {
            if (this.fusionMode != 1) {
                long j2 = this.produced + j;
                if (j2 < this.limit) {
                    this.produced = j2;
                } else {
                    this.produced = 0L;
                    get().request(j2);
                }
            }
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Subscriber<? super U> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends Publisher<? extends U>> mapper;
        final int maxConcurrency;
        volatile SimplePlainQueue<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        long uniqueId;
        Subscription upstream;
        static final InnerSubscriber<?, ?>[] EMPTY = new InnerSubscriber[0];
        static final InnerSubscriber<?, ?>[] CANCELLED = new InnerSubscriber[0];

        public MergeSubscriber(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z2, int i2, int i3) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = subscriber;
            this.mapper = function;
            this.delayErrors = z2;
            this.maxConcurrency = i2;
            this.bufferSize = i3;
            this.scalarLimit = Math.max(1, i2 >> 1);
            atomicReference.lazySet(EMPTY);
        }

        public boolean addInner(InnerSubscriber<T, U> innerSubscriber) {
            while (true) {
                InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == CANCELLED) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                InnerSubscriber[] innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
                AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(innerSubscriberArr, (InnerSubscriber<?, ?>[]) innerSubscriberArr2)) {
                    if (atomicReference.get() != innerSubscriberArr) {
                    }
                }
                return true;
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SimplePlainQueue<U> simplePlainQueue;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeAll();
            if (getAndIncrement() != 0 || (simplePlainQueue = this.queue) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            }
            if (this.delayErrors || this.errors.get() == null) {
                return false;
            }
            clearScalarQueue();
            this.errors.tryTerminateConsumer(this.downstream);
            return true;
        }

        public void clearScalarQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                simplePlainQueue.clear();
            }
        }

        public void disposeAll() {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = this.subscribers;
            InnerSubscriber<?, ?>[] innerSubscriberArr = CANCELLED;
            InnerSubscriber<?, ?>[] andSet = atomicReference.getAndSet(innerSubscriberArr);
            if (andSet != innerSubscriberArr) {
                for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                    innerSubscriber.dispose();
                }
                this.errors.tryTerminateAndReport();
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x015d  */
        /* JADX WARN: Code duplicated, block: B:106:0x0167  */
        /* JADX WARN: Code duplicated, block: B:108:0x016d  */
        /* JADX WARN: Code duplicated, block: B:124:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:129:0x01a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:130:0x01a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:132:0x01a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:141:0x0175 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x0165 A[EDGE_INSN: B:142:0x0165->B:105:0x0165 BREAK  A[LOOP:2: B:56:0x00b9->B:109:0x016e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x016e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:148:0x00ca A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:150:0x0117 A[EDGE_INSN: B:150:0x0117->B:82:0x0117 BREAK  A[LOOP:4: B:65:0x00d5->B:73:0x00e8], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:60:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:73:0x00e8 A[LOOP:4: B:65:0x00d5->B:73:0x00e8, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:84:0x011b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:85:0x011d  */
        /* JADX WARN: Code duplicated, block: B:86:0x0128  */
        /* JADX WARN: Code duplicated, block: B:88:0x0135  */
        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            boolean z2;
            long j;
            int i2;
            long j2;
            boolean z3;
            long j3;
            int i3;
            int i4;
            boolean z4;
            InnerSubscriber<T, U> innerSubscriber;
            U uPoll;
            SimpleQueue<U> simpleQueue;
            int i5;
            boolean z5;
            long j4;
            long jAddAndGet;
            Subscriber<? super U> subscriber = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminate()) {
                SimplePlainQueue<U> simplePlainQueue = this.queue;
                long jAddAndGet2 = this.requested.get();
                boolean z6 = jAddAndGet2 == Long.MAX_VALUE;
                if (simplePlainQueue != null) {
                    long j5 = 0;
                    j = 0;
                    while (true) {
                        if (jAddAndGet2 == 0) {
                            z2 = true;
                            break;
                        }
                        z2 = true;
                        U uPoll2 = simplePlainQueue.poll();
                        if (checkTerminate()) {
                            return;
                        }
                        if (uPoll2 == null) {
                            break;
                        }
                        subscriber.onNext(uPoll2);
                        j++;
                        j5++;
                        jAddAndGet2--;
                    }
                    if (j5 != 0) {
                        jAddAndGet2 = z6 ? Long.MAX_VALUE : this.requested.addAndGet(-j5);
                    }
                } else {
                    z2 = true;
                    j = 0;
                }
                boolean z7 = this.done;
                SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (z7 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                }
                if (length != 0) {
                    long j6 = this.lastId;
                    int i6 = this.lastIndex;
                    if (length > i6) {
                        j2 = 0;
                        if (innerSubscriberArr[i6].id != j6) {
                        }
                        j3 = jAddAndGet2;
                        i3 = 0;
                        i4 = i6;
                        z4 = false;
                        while (true) {
                            if (i3 < length) {
                                i2 = iAddAndGet;
                                innerSubscriberArr = innerSubscriberArr;
                                break;
                            }
                            if (checkTerminate()) {
                                return;
                            }
                            innerSubscriber = innerSubscriberArr[i4];
                            uPoll = null;
                            while (true) {
                                simpleQueue = innerSubscriber.queue;
                                if (simpleQueue != null) {
                                    i2 = iAddAndGet;
                                    i3 = i3;
                                    innerSubscriberArr = innerSubscriberArr;
                                    break;
                                }
                                i2 = iAddAndGet;
                                j4 = j2;
                                while (j3 != j2) {
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    try {
                                        uPoll = simpleQueue.poll();
                                        if (uPoll == null) {
                                            break;
                                        }
                                        subscriber.onNext(uPoll);
                                        j3--;
                                        j4++;
                                    } catch (Throwable th) {
                                        Exceptions.throwIfFatal(th);
                                        innerSubscriber.dispose();
                                        this.errors.tryAddThrowableOrReport(th);
                                        if (!this.delayErrors) {
                                            this.upstream.cancel();
                                        }
                                        if (checkTerminate()) {
                                            return;
                                        }
                                        removeInner(innerSubscriber);
                                        i5 = i3 + 1;
                                        innerSubscriberArr = innerSubscriberArr;
                                        z4 = z2;
                                    }
                                }
                                if (j4 != j2) {
                                    if (z6) {
                                        jAddAndGet = Long.MAX_VALUE;
                                    } else {
                                        jAddAndGet = this.requested.addAndGet(-j4);
                                    }
                                    innerSubscriber.requestMore(j4);
                                    j3 = jAddAndGet;
                                } else {
                                    i3 = i3;
                                    innerSubscriberArr = innerSubscriberArr;
                                }
                                if (j3 == j2 || uPoll == null) {
                                    break;
                                }
                                innerSubscriberArr = innerSubscriberArr;
                                iAddAndGet = i2;
                                i3 = i3;
                            }
                            z5 = innerSubscriber.done;
                            SimpleQueue<U> simpleQueue2 = innerSubscriber.queue;
                            if (z5 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                removeInner(innerSubscriber);
                                if (checkTerminate()) {
                                    return;
                                }
                                j++;
                                z4 = z2;
                            }
                            if (j3 == j2) {
                                break;
                            }
                            i4++;
                            i5 = i3;
                            if (i4 == length) {
                                i4 = 0;
                            }
                            i3 = i5 + 1;
                            innerSubscriberArr = innerSubscriberArr;
                            iAddAndGet = i2;
                        }
                        z3 = z4;
                        this.lastIndex = i4;
                        this.lastId = innerSubscriberArr[i4].id;
                    } else {
                        j2 = 0;
                    }
                    if (length <= i6) {
                        i6 = 0;
                    }
                    for (int i7 = 0; i7 < length && innerSubscriberArr[i6].id != j6; i7++) {
                        i6++;
                        if (i6 == length) {
                            i6 = 0;
                        }
                    }
                    this.lastIndex = i6;
                    this.lastId = innerSubscriberArr[i6].id;
                    j3 = jAddAndGet2;
                    i3 = 0;
                    i4 = i6;
                    z4 = false;
                    while (true) {
                        if (i3 < length) {
                            i2 = iAddAndGet;
                            innerSubscriberArr = innerSubscriberArr;
                            break;
                        }
                        if (checkTerminate()) {
                            return;
                        }
                        innerSubscriber = innerSubscriberArr[i4];
                        uPoll = null;
                        while (true) {
                            simpleQueue = innerSubscriber.queue;
                            if (simpleQueue != null) {
                                i2 = iAddAndGet;
                                j4 = j2;
                                while (j3 != j2) {
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    uPoll = simpleQueue.poll();
                                    if (uPoll == null) {
                                        break;
                                        break;
                                    } else {
                                        subscriber.onNext(uPoll);
                                        j3--;
                                        j4++;
                                    }
                                }
                                if (j4 != j2) {
                                    if (z6) {
                                        jAddAndGet = this.requested.addAndGet(-j4);
                                    } else {
                                        jAddAndGet = Long.MAX_VALUE;
                                    }
                                    innerSubscriber.requestMore(j4);
                                    j3 = jAddAndGet;
                                } else {
                                    i3 = i3;
                                    innerSubscriberArr = innerSubscriberArr;
                                }
                                if (j3 == j2) {
                                    break;
                                }
                                break;
                                break;
                            }
                            i2 = iAddAndGet;
                            i3 = i3;
                            innerSubscriberArr = innerSubscriberArr;
                            break;
                            innerSubscriberArr = innerSubscriberArr;
                            iAddAndGet = i2;
                            i3 = i3;
                        }
                        z5 = innerSubscriber.done;
                        SimpleQueue<U> simpleQueue3 = innerSubscriber.queue;
                        if (z5) {
                            removeInner(innerSubscriber);
                            if (checkTerminate()) {
                                return;
                            }
                            j++;
                            z4 = z2;
                        }
                        if (j3 == j2) {
                            break;
                            break;
                        }
                        i4++;
                        i5 = i3;
                        if (i4 == length) {
                            i4 = 0;
                        }
                        i3 = i5 + 1;
                        innerSubscriberArr = innerSubscriberArr;
                        iAddAndGet = i2;
                    }
                    z3 = z4;
                    this.lastIndex = i4;
                    this.lastId = innerSubscriberArr[i4].id;
                } else {
                    i2 = iAddAndGet;
                    j2 = 0;
                    z3 = false;
                }
                long j7 = j;
                if (j7 != j2 && !this.cancelled) {
                    this.upstream.request(j7);
                }
                if (z3) {
                    iAddAndGet = i2;
                } else {
                    iAddAndGet = addAndGet(-i2);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        public SimpleQueue<U> getMainQueue() {
            SimplePlainQueue<U> spscLinkedArrayQueue = this.queue;
            if (spscLinkedArrayQueue == null) {
                spscLinkedArrayQueue = this.maxConcurrency == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                this.queue = spscLinkedArrayQueue;
            }
            return spscLinkedArrayQueue;
        }

        public void innerError(InnerSubscriber<T, U> innerSubscriber, Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                innerSubscriber.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    for (InnerSubscriber<?, ?> innerSubscriber2 : this.subscribers.getAndSet(CANCELLED)) {
                        innerSubscriber2.dispose();
                    }
                }
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                if (!this.delayErrors) {
                    for (InnerSubscriber<?, ?> innerSubscriber : this.subscribers.getAndSet(CANCELLED)) {
                        innerSubscriber.dispose();
                    }
                }
                drain();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                Publisher<? extends U> publisherApply = this.mapper.apply(t);
                Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                Publisher<? extends U> publisher = publisherApply;
                if (!(publisher instanceof Supplier)) {
                    int i2 = this.bufferSize;
                    long j = this.uniqueId;
                    this.uniqueId = 1 + j;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, i2, j);
                    if (addInner(innerSubscriber)) {
                        publisher.subscribe(innerSubscriber);
                        return;
                    }
                    return;
                }
                try {
                    Object obj = ((Supplier) publisher).get();
                    if (obj != null) {
                        tryEmitScalar(obj);
                        return;
                    }
                    if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                        return;
                    }
                    int i3 = this.scalarEmitted + 1;
                    this.scalarEmitted = i3;
                    int i4 = this.scalarLimit;
                    if (i3 == i4) {
                        this.scalarEmitted = 0;
                        this.upstream.request(i4);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.errors.tryAddThrowableOrReport(th);
                    drain();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                int i2 = this.maxConcurrency;
                if (i2 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i2);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void removeInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            while (true) {
                InnerSubscriber<?, ?>[] innerSubscriberArr2 = this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (innerSubscriberArr2[i2] == innerSubscriber) {
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
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr2, 0, innerSubscriberArr3, 0, i2);
                    System.arraycopy(innerSubscriberArr2, i2 + 1, innerSubscriberArr3, i2, (length - i2) - 1);
                    innerSubscriberArr = innerSubscriberArr3;
                }
                AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(innerSubscriberArr2, innerSubscriberArr)) {
                    if (atomicReference.get() != innerSubscriberArr2) {
                    }
                }
                return;
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public void tryEmit(U u2, InnerSubscriber<T, U> innerSubscriber) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                SimpleQueue spscArrayQueue = innerSubscriber.queue;
                if (j == 0 || !(spscArrayQueue == null || spscArrayQueue.isEmpty())) {
                    if (spscArrayQueue == null) {
                        spscArrayQueue = new SpscArrayQueue(this.bufferSize);
                        innerSubscriber.queue = spscArrayQueue;
                    }
                    if (!spscArrayQueue.offer(u2)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                    }
                } else {
                    this.downstream.onNext(u2);
                    if (j != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    innerSubscriber.requestMore(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscArrayQueue2 = innerSubscriber.queue;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = spscArrayQueue2;
                }
                if (!spscArrayQueue2.offer(u2)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void tryEmitScalar(U u2) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                SimpleQueue<U> mainQueue = this.queue;
                if (j == 0 || !(mainQueue == null || mainQueue.isEmpty())) {
                    if (mainQueue == null) {
                        mainQueue = getMainQueue();
                    }
                    if (!mainQueue.offer(u2)) {
                        onError(new MissingBackpressureException("Scalar queue full?!"));
                    }
                } else {
                    this.downstream.onNext(u2);
                    if (j != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i2 = this.scalarEmitted + 1;
                        this.scalarEmitted = i2;
                        int i3 = this.scalarLimit;
                        if (i2 == i3) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i3);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u2)) {
                onError(new MissingBackpressureException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    public FlowableFlatMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends U>> function, boolean z2, int i2, int i3) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z2;
        this.maxConcurrency = i2;
        this.bufferSize = i3;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z2, int i2, int i3) {
        return new MergeSubscriber(subscriber, function, z2, i2, i3);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) subscribe(subscriber, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
