package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
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

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j) {
            this.id = j;
            this.parent = mergeSubscriber;
            int i2 = mergeSubscriber.bufferSize;
            this.bufferSize = i2;
            this.limit = i2 >> 2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(U u2) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u2, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
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
        final AtomicThrowable errs = new AtomicThrowable();
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
            if (this.delayErrors || this.errs.get() == null) {
                return false;
            }
            clearScalarQueue();
            Throwable thTerminate = this.errs.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.downstream.onError(thTerminate);
            }
            return true;
        }

        public void clearScalarQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                simplePlainQueue.clear();
            }
        }

        public void disposeAll() {
            InnerSubscriber<?, ?>[] andSet;
            InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = CANCELLED;
            if (innerSubscriberArr == innerSubscriberArr2 || (andSet = this.subscribers.getAndSet(innerSubscriberArr2)) == innerSubscriberArr2) {
                return;
            }
            for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                innerSubscriber.dispose();
            }
            Throwable thTerminate = this.errs.terminate();
            if (thTerminate == null || thTerminate == ExceptionHelper.TERMINATED) {
                return;
            }
            RxJavaPlugins.onError(thTerminate);
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0153  */
        /* JADX WARN: Code duplicated, block: B:114:0x0177  */
        /* JADX WARN: Code duplicated, block: B:118:0x0181  */
        /* JADX WARN: Code duplicated, block: B:120:0x0185  */
        /* JADX WARN: Code duplicated, block: B:136:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:141:0x01b8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:143:0x01b8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x01b8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:155:0x018d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:156:0x017f A[EDGE_INSN: B:156:0x017f->B:117:0x017f BREAK  A[LOOP:3: B:65:0x00d9->B:121:0x0186], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:159:0x0186 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:162:0x00f2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:163:0x013a A[EDGE_INSN: B:163:0x013a->B:94:0x013a BREAK  A[LOOP:5: B:77:0x00f9->B:85:0x010f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00db  */
        /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:82:0x0104  */
        /* JADX WARN: Code duplicated, block: B:85:0x010f A[LOOP:5: B:77:0x00f9->B:85:0x010f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:96:0x013e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:97:0x0140  */
        /* JADX WARN: Code duplicated, block: B:98:0x0149  */
        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            boolean z2;
            long j;
            long j2;
            boolean z3;
            long j3;
            int i2;
            boolean z4;
            int i3;
            InnerSubscriber<T, U> innerSubscriber;
            U uPoll;
            SimpleQueue<U> simpleQueue;
            boolean z5;
            U u2;
            Subscriber<? super U> subscriber = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminate()) {
                SimplePlainQueue<U> simplePlainQueue = this.queue;
                long jAddAndGet = this.requested.get();
                boolean z6 = jAddAndGet == Long.MAX_VALUE;
                long j4 = 0;
                if (simplePlainQueue != null) {
                    j = 0;
                    do {
                        long j5 = 0;
                        u2 = null;
                        while (true) {
                            if (jAddAndGet == 0) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            U uPoll2 = simplePlainQueue.poll();
                            if (checkTerminate()) {
                                return;
                            }
                            if (uPoll2 == null) {
                                u2 = uPoll2;
                                break;
                            }
                            subscriber.onNext(uPoll2);
                            j++;
                            j5++;
                            jAddAndGet--;
                            u2 = uPoll2;
                        }
                        if (j5 != 0) {
                            jAddAndGet = z6 ? Long.MAX_VALUE : this.requested.addAndGet(-j5);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (u2 != null);
                } else {
                    z2 = true;
                    j = 0;
                }
                boolean z7 = this.done;
                SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (z7 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    Throwable thTerminate = this.errs.terminate();
                    if (thTerminate != ExceptionHelper.TERMINATED) {
                        if (thTerminate == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(thTerminate);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j6 = this.lastId;
                    int i4 = this.lastIndex;
                    if (length > i4) {
                        j3 = 1;
                        if (innerSubscriberArr[i4].id != j6) {
                        }
                        i2 = i4;
                        z4 = false;
                        i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                innerSubscriberArr = innerSubscriberArr;
                                j2 = j4;
                                break;
                            }
                            if (checkTerminate()) {
                                return;
                            }
                            innerSubscriber = innerSubscriberArr[i2];
                            uPoll = null;
                            while (!checkTerminate()) {
                                simpleQueue = innerSubscriber.queue;
                                if (simpleQueue == null) {
                                    innerSubscriberArr = innerSubscriberArr;
                                    j2 = j4;
                                } else {
                                    j2 = j4;
                                    while (jAddAndGet != j2) {
                                        try {
                                            uPoll = simpleQueue.poll();
                                            if (uPoll == null) {
                                                break;
                                            }
                                            subscriber.onNext(uPoll);
                                            if (checkTerminate()) {
                                                return;
                                            }
                                            jAddAndGet -= j3;
                                            j4 += j3;
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            innerSubscriber.dispose();
                                            this.errs.addThrowable(th);
                                            if (!this.delayErrors) {
                                                this.upstream.cancel();
                                            }
                                            if (checkTerminate()) {
                                                return;
                                            }
                                            removeInner(innerSubscriber);
                                            i3++;
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
                                    } else {
                                        innerSubscriberArr = innerSubscriberArr;
                                    }
                                    if (jAddAndGet == j2 && uPoll != null) {
                                        innerSubscriberArr = innerSubscriberArr;
                                        j4 = j2;
                                    }
                                }
                                z5 = innerSubscriber.done;
                                SimpleQueue<U> simpleQueue2 = innerSubscriber.queue;
                                if (z5 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                    removeInner(innerSubscriber);
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    j += j3;
                                    z4 = z2;
                                }
                                if (jAddAndGet == j2) {
                                    break;
                                }
                                i2++;
                                if (i2 == length) {
                                    i2 = 0;
                                }
                                i3++;
                                innerSubscriberArr = innerSubscriberArr;
                                j4 = j2;
                            }
                            return;
                        }
                        z3 = z4;
                        this.lastIndex = i2;
                        this.lastId = innerSubscriberArr[i2].id;
                    } else {
                        j3 = 1;
                    }
                    if (length <= i4) {
                        i4 = 0;
                    }
                    for (int i5 = 0; i5 < length && innerSubscriberArr[i4].id != j6; i5++) {
                        i4++;
                        if (i4 == length) {
                            i4 = 0;
                        }
                    }
                    this.lastIndex = i4;
                    this.lastId = innerSubscriberArr[i4].id;
                    i2 = i4;
                    z4 = false;
                    i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            innerSubscriberArr = innerSubscriberArr;
                            j2 = j4;
                            break;
                        }
                        if (checkTerminate()) {
                            return;
                        }
                        innerSubscriber = innerSubscriberArr[i2];
                        uPoll = null;
                        while (!checkTerminate()) {
                            simpleQueue = innerSubscriber.queue;
                            if (simpleQueue == null) {
                                innerSubscriberArr = innerSubscriberArr;
                                j2 = j4;
                            } else {
                                j2 = j4;
                                while (jAddAndGet != j2) {
                                    uPoll = simpleQueue.poll();
                                    if (uPoll == null) {
                                        break;
                                        break;
                                    }
                                    subscriber.onNext(uPoll);
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    jAddAndGet -= j3;
                                    j4 += j3;
                                }
                                if (j4 != j2) {
                                    if (z6) {
                                        jAddAndGet = this.requested.addAndGet(-j4);
                                    } else {
                                        jAddAndGet = Long.MAX_VALUE;
                                    }
                                    innerSubscriber.requestMore(j4);
                                } else {
                                    innerSubscriberArr = innerSubscriberArr;
                                }
                                if (jAddAndGet == j2) {
                                }
                            }
                            z5 = innerSubscriber.done;
                            SimpleQueue<U> simpleQueue3 = innerSubscriber.queue;
                            if (z5) {
                                removeInner(innerSubscriber);
                                if (checkTerminate()) {
                                    return;
                                }
                                j += j3;
                                z4 = z2;
                            }
                            if (jAddAndGet == j2) {
                                break;
                                break;
                            }
                            i2++;
                            if (i2 == length) {
                                i2 = 0;
                            }
                            i3++;
                            innerSubscriberArr = innerSubscriberArr;
                            j4 = j2;
                        }
                        return;
                    }
                    z3 = z4;
                    this.lastIndex = i2;
                    this.lastId = innerSubscriberArr[i2].id;
                } else {
                    j2 = 0;
                    z3 = false;
                }
                long j7 = j;
                if (j7 != j2 && !this.cancelled) {
                    this.upstream.request(j7);
                }
                if (!z3 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                }
            }
        }

        public SimpleQueue<U> getInnerQueue(InnerSubscriber<T, U> innerSubscriber) {
            SimpleQueue<U> simpleQueue = innerSubscriber.queue;
            if (simpleQueue != null) {
                return simpleQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
            innerSubscriber.queue = spscArrayQueue;
            return spscArrayQueue;
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
            if (!this.errs.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            innerSubscriber.done = true;
            if (!this.delayErrors) {
                this.upstream.cancel();
                for (InnerSubscriber<?, ?> innerSubscriber2 : this.subscribers.getAndSet(CANCELLED)) {
                    innerSubscriber2.dispose();
                }
            }
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.errs.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            if (!this.delayErrors) {
                for (InnerSubscriber<?, ?> innerSubscriber : this.subscribers.getAndSet(CANCELLED)) {
                    innerSubscriber.dispose();
                }
            }
            drain();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null Publisher");
                if (!(publisher instanceof Callable)) {
                    long j = this.uniqueId;
                    this.uniqueId = 1 + j;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j);
                    if (addInner(innerSubscriber)) {
                        publisher.subscribe(innerSubscriber);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) publisher).call();
                    if (objCall != null) {
                        tryEmitScalar(objCall);
                        return;
                    }
                    if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                        return;
                    }
                    int i2 = this.scalarEmitted + 1;
                    this.scalarEmitted = i2;
                    int i3 = this.scalarLimit;
                    if (i2 == i3) {
                        this.scalarEmitted = 0;
                        this.upstream.request(i3);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.errs.addThrowable(th);
                    drain();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
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
                SimpleQueue<U> innerQueue = innerSubscriber.queue;
                if (j == 0 || !(innerQueue == null || innerQueue.isEmpty())) {
                    if (innerQueue == null) {
                        innerQueue = getInnerQueue(innerSubscriber);
                    }
                    if (!innerQueue.offer(u2)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
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
                SimpleQueue spscArrayQueue = innerSubscriber.queue;
                if (spscArrayQueue == null) {
                    spscArrayQueue = new SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = spscArrayQueue;
                }
                if (!spscArrayQueue.offer(u2)) {
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
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
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
                onError(new IllegalStateException("Scalar queue full?!"));
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

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) subscribe(subscriber, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
