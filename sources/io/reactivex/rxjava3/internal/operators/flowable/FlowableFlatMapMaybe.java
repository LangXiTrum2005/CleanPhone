package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableFlatMapMaybe<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final boolean delayErrors;
    final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    final int maxConcurrency;

    public static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final Subscriber<? super R> downstream;
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        final int maxConcurrency;
        Subscription upstream;
        final AtomicLong requested = new AtomicLong();
        final CompositeDisposable set = new CompositeDisposable();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<SpscLinkedArrayQueue<R>> queue = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            public InnerObserver() {
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onComplete() {
                FlatMapMaybeSubscriber.this.innerComplete(this);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onError(Throwable th) {
                FlatMapMaybeSubscriber.this.innerError(this, th);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public void onSuccess(R r) {
                FlatMapMaybeSubscriber.this.innerSuccess(this, r);
            }
        }

        public FlatMapMaybeSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2, int i2) {
            this.downstream = subscriber;
            this.mapper = function;
            this.delayErrors = z2;
            this.maxConcurrency = i2;
        }

        public static boolean checkTerminate(boolean z2, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (z2) {
                return spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty();
            }
            return false;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
            this.errors.tryTerminateAndReport();
        }

        public void clear() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.queue.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            Subscriber<? super R> subscriber = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.queue;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.cancelled) {
                        clear();
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        clear();
                        this.errors.tryTerminateConsumer(subscriber);
                        return;
                    }
                    boolean z2 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = atomicReference.get();
                    R rPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                    boolean z3 = rPoll == null;
                    if (z2 && z3) {
                        this.errors.tryTerminateConsumer(subscriber);
                        return;
                    } else {
                        if (z3) {
                            break;
                        }
                        subscriber.onNext(rPoll);
                        j2++;
                    }
                }
                if (j2 == j) {
                    if (this.cancelled) {
                        clear();
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        clear();
                        this.errors.tryTerminateConsumer(subscriber);
                        return;
                    }
                    boolean z4 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = atomicReference.get();
                    boolean z5 = spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty();
                    if (z4 && z5) {
                        this.errors.tryTerminateConsumer(subscriber);
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.produced(this.requested, j2);
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public SpscLinkedArrayQueue<R> getOrCreateQueue() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.queue.get();
            if (spscLinkedArrayQueue != null) {
                return spscLinkedArrayQueue;
            }
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.queue;
            while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue2)) {
                if (atomicReference.get() != null) {
                    return this.queue.get();
                }
            }
            return spscLinkedArrayQueue2;
        }

        public void innerComplete(FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver) {
            this.set.delete(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    if (checkTerminate(this.active.decrementAndGet() == 0, this.queue.get())) {
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(1L);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    drainLoop();
                    return;
                }
            }
            this.active.decrementAndGet();
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
            drain();
        }

        public void innerError(FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver, Throwable th) {
            this.set.delete(innerObserver);
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    this.set.dispose();
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    this.upstream.request(1L);
                }
                this.active.decrementAndGet();
                drain();
            }
        }

        /* JADX WARN: Code duplicated, block: B:28:0x006a  */
        /* JADX WARN: Code duplicated, block: B:34:0x007e A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public void innerSuccess(FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver, R r) {
            SpscLinkedArrayQueue<R> orCreateQueue;
            this.set.delete(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z2 = this.active.decrementAndGet() == 0;
                    if (this.requested.get() != 0) {
                        this.downstream.onNext(r);
                        if (checkTerminate(z2, this.queue.get())) {
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        } else {
                            BackpressureHelper.produced(this.requested, 1L);
                            if (this.maxConcurrency != Integer.MAX_VALUE) {
                                this.upstream.request(1L);
                            }
                        }
                    } else {
                        SpscLinkedArrayQueue<R> orCreateQueue2 = getOrCreateQueue();
                        synchronized (orCreateQueue2) {
                            orCreateQueue2.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    orCreateQueue = getOrCreateQueue();
                    synchronized (orCreateQueue) {
                        orCreateQueue.offer(r);
                    }
                    this.active.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            } else {
                orCreateQueue = getOrCreateQueue();
                synchronized (orCreateQueue) {
                    orCreateQueue.offer(r);
                    this.active.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.active.decrementAndGet();
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            try {
                MaybeSource<? extends R> maybeSourceApply = this.mapper.apply(t);
                Objects.requireNonNull(maybeSourceApply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = maybeSourceApply;
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.cancelled || !this.set.add(innerObserver)) {
                    return;
                }
                maybeSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                int i2 = this.maxConcurrency;
                if (i2 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i2);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }
    }

    public FlowableFlatMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2, int i2) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z2;
        this.maxConcurrency = i2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new FlatMapMaybeSubscriber(subscriber, this.mapper, this.delayErrors, this.maxConcurrency));
    }
}
