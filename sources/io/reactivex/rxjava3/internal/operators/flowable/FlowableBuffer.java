package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {
    final Supplier<C> bufferSupplier;
    final int size;
    final int skip;

    public static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, Subscription {
        C buffer;
        final Supplier<C> bufferSupplier;
        boolean done;
        final Subscriber<? super C> downstream;
        int index;
        final int size;
        Subscription upstream;

        public PublisherBufferExactSubscriber(Subscriber<? super C> subscriber, int i2, Supplier<C> supplier) {
            this.downstream = subscriber;
            this.size = i2;
            this.bufferSupplier = supplier;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c2 = this.buffer;
            this.buffer = null;
            if (c2 != null) {
                this.downstream.onNext(c2);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.buffer = null;
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            C c2 = this.buffer;
            if (c2 == null) {
                try {
                    C c3 = this.bufferSupplier.get();
                    Objects.requireNonNull(c3, "The bufferSupplier returned a null buffer");
                    c2 = c3;
                    this.buffer = c2;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            c2.add(t);
            int i2 = this.index + 1;
            if (i2 != this.size) {
                this.index = i2;
                return;
            }
            this.index = 0;
            this.buffer = null;
            this.downstream.onNext(c2);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                this.upstream.request(BackpressureHelper.multiplyCap(j, this.size));
            }
        }
    }

    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, Subscription, BooleanSupplier {
        private static final long serialVersionUID = -7370244972039324525L;
        final Supplier<C> bufferSupplier;
        volatile boolean cancelled;
        boolean done;
        final Subscriber<? super C> downstream;
        int index;
        long produced;
        final int size;
        final int skip;
        Subscription upstream;
        final AtomicBoolean once = new AtomicBoolean();
        final ArrayDeque<C> buffers = new ArrayDeque<>();

        public PublisherBufferOverlappingSubscriber(Subscriber<? super C> subscriber, int i2, int i3, Supplier<C> supplier) {
            this.downstream = subscriber;
            this.size = i2;
            this.skip = i3;
            this.bufferSupplier = supplier;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        @Override // io.reactivex.rxjava3.functions.BooleanSupplier
        public boolean getAsBoolean() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            long j = this.produced;
            if (j != 0) {
                BackpressureHelper.produced(this, j);
            }
            QueueDrainHelper.postComplete(this.downstream, this.buffers, this, this);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.buffers;
            int i2 = this.index;
            int i3 = i2 + 1;
            if (i2 == 0) {
                try {
                    C c2 = this.bufferSupplier.get();
                    Objects.requireNonNull(c2, "The bufferSupplier returned a null buffer");
                    arrayDeque.offer(c2);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection.size() + 1 == this.size) {
                arrayDeque.poll();
                collection.add(t);
                this.produced++;
                this.downstream.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(t);
            }
            if (i3 == this.skip) {
                i3 = 0;
            }
            this.index = i3;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (!SubscriptionHelper.validate(j) || QueueDrainHelper.postCompleteRequest(j, this.downstream, this.buffers, this, this)) {
                return;
            }
            if (this.once.get() || !this.once.compareAndSet(false, true)) {
                this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j));
            } else {
                this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j - 1)));
            }
        }
    }

    public static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -5616169793639412593L;
        C buffer;
        final Supplier<C> bufferSupplier;
        boolean done;
        final Subscriber<? super C> downstream;
        int index;
        final int size;
        final int skip;
        Subscription upstream;

        public PublisherBufferSkipSubscriber(Subscriber<? super C> subscriber, int i2, int i3, Supplier<C> supplier) {
            this.downstream = subscriber;
            this.size = i2;
            this.skip = i3;
            this.bufferSupplier = supplier;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c2 = this.buffer;
            this.buffer = null;
            if (c2 != null) {
                this.downstream.onNext(c2);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            C c2 = this.buffer;
            int i2 = this.index;
            int i3 = i2 + 1;
            if (i2 == 0) {
                try {
                    C c3 = this.bufferSupplier.get();
                    Objects.requireNonNull(c3, "The bufferSupplier returned a null buffer");
                    c2 = c3;
                    this.buffer = c2;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (c2 != null) {
                c2.add(t);
                if (c2.size() == this.size) {
                    this.buffer = null;
                    this.downstream.onNext(c2);
                }
            }
            if (i3 == this.skip) {
                i3 = 0;
            }
            this.index = i3;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j));
                    return;
                }
                this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(j, this.size), BackpressureHelper.multiplyCap(this.skip - this.size, j - 1)));
            }
        }
    }

    public FlowableBuffer(Flowable<T> flowable, int i2, int i3, Supplier<C> supplier) {
        super(flowable);
        this.size = i2;
        this.skip = i3;
        this.bufferSupplier = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super C> subscriber) {
        int i2 = this.size;
        int i3 = this.skip;
        if (i2 == i3) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferExactSubscriber(subscriber, i2, this.bufferSupplier));
        } else if (i3 > i2) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferSkipSubscriber(subscriber, this.size, this.skip, this.bufferSupplier));
        } else {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferOverlappingSubscriber(subscriber, this.size, this.skip, this.bufferSupplier));
        }
    }
}
