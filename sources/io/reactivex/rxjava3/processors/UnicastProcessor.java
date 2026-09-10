package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    boolean enableOperatorFusion;
    Throwable error;
    final AtomicReference<Runnable> onTerminate;
    final SpscLinkedArrayQueue<T> queue;
    final AtomicReference<Subscriber<? super T>> downstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();
    final BasicIntQueueSubscription<T> wip = new UnicastQueueSubscription();
    final AtomicLong requested = new AtomicLong();

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.rxjava3.internal.fuseable.QueueSubscription, org.reactivestreams.Subscription
        public void cancel() {
            if (UnicastProcessor.this.cancelled) {
                return;
            }
            UnicastProcessor.this.cancelled = true;
            UnicastProcessor.this.doTerminate();
            UnicastProcessor.this.downstream.lazySet(null);
            if (UnicastProcessor.this.wip.getAndIncrement() == 0) {
                UnicastProcessor.this.downstream.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.enableOperatorFusion) {
                    return;
                }
                unicastProcessor.queue.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastProcessor.this.queue.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastProcessor.this.queue.isEmpty();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public T poll() {
            return UnicastProcessor.this.queue.poll();
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.rxjava3.internal.fuseable.QueueSubscription, org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(UnicastProcessor.this.requested, j);
                UnicastProcessor.this.drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public int requestFusion(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.enableOperatorFusion = true;
            return 2;
        }
    }

    public UnicastProcessor(int i2, Runnable runnable, boolean z2) {
        this.queue = new SpscLinkedArrayQueue<>(i2);
        this.onTerminate = new AtomicReference<>(runnable);
        this.delayError = z2;
    }

    @CheckReturnValue
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, true);
    }

    public boolean checkTerminated(boolean z2, boolean z3, boolean z4, Subscriber<? super T> subscriber, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.cancelled) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            return true;
        }
        if (!z3) {
            return false;
        }
        if (z2 && this.error != null) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            subscriber.onError(this.error);
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th = this.error;
        this.downstream.lazySet(null);
        if (th != null) {
            subscriber.onError(th);
        } else {
            subscriber.onComplete();
        }
        return true;
    }

    public void doTerminate() {
        Runnable andSet = this.onTerminate.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    public void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        Subscriber<? super T> subscriber = this.downstream.get();
        int iAddAndGet = 1;
        while (subscriber == null) {
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                subscriber = this.downstream.get();
            }
        }
        if (this.enableOperatorFusion) {
            drainFused(subscriber);
        } else {
            drainRegular(subscriber);
        }
    }

    public void drainFused(Subscriber<? super T> subscriber) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z2 = this.delayError;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z3 = this.done;
            if (!z2 && z3 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                subscriber.onError(this.error);
                return;
            }
            subscriber.onNext(null);
            if (z3) {
                this.downstream.lazySet(null);
                Throwable th = this.error;
                if (th != null) {
                    subscriber.onError(th);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        this.downstream.lazySet(null);
    }

    public void drainRegular(Subscriber<? super T> subscriber) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z2 = !this.delayError;
        int iAddAndGet = 1;
        do {
            long j = this.requested.get();
            long j2 = 0;
            while (j != j2) {
                boolean z3 = this.done;
                T tPoll = spscLinkedArrayQueue.poll();
                boolean z4 = tPoll == null;
                if (checkTerminated(z2, z3, z4, subscriber, spscLinkedArrayQueue)) {
                    return;
                }
                if (z4) {
                    break;
                }
                subscriber.onNext(tPoll);
                j2++;
            }
            if (j == j2 && checkTerminated(z2, this.done, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue)) {
                return;
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                this.requested.addAndGet(-j2);
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasComplete() {
        return this.done && this.error == null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasSubscribers() {
        return this.downstream.get() != null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasThrowable() {
        return this.done && this.error != null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor, org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.done || this.cancelled) {
            return;
        }
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor, org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        ExceptionHelper.nullCheck(th, "onError called with a null Throwable.");
        if (this.done || this.cancelled) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor, org.reactivestreams.Subscriber
    public void onNext(T t) {
        ExceptionHelper.nullCheck(t, "onNext called with a null value.");
        if (this.done || this.cancelled) {
            return;
        }
        this.queue.offer(t);
        drain();
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.done || this.cancelled) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), subscriber);
            return;
        }
        subscriber.onSubscribe(this.wip);
        this.downstream.set(subscriber);
        if (this.cancelled) {
            this.downstream.lazySet(null);
        } else {
            drain();
        }
    }

    @CheckReturnValue
    public static <T> UnicastProcessor<T> create(int i2) {
        ObjectHelper.verifyPositive(i2, "capacityHint");
        return new UnicastProcessor<>(i2, null, true);
    }

    @CheckReturnValue
    public static <T> UnicastProcessor<T> create(boolean z2) {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, z2);
    }

    @CheckReturnValue
    public static <T> UnicastProcessor<T> create(int i2, Runnable runnable) {
        return create(i2, runnable, true);
    }

    @CheckReturnValue
    public static <T> UnicastProcessor<T> create(int i2, Runnable runnable, boolean z2) {
        Objects.requireNonNull(runnable, "onTerminate");
        ObjectHelper.verifyPositive(i2, "capacityHint");
        return new UnicastProcessor<>(i2, runnable, z2);
    }
}
