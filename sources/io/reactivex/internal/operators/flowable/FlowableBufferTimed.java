package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {
    final Callable<U> bufferSupplier;
    final int maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    public static final class BufferExactBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable, Disposable {
        U buffer;
        final Callable<U> bufferSupplier;
        long consumerIndex;
        final int maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        Disposable timer;
        final long timespan;
        final TimeUnit unit;
        Subscription upstream;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final Scheduler.Worker f42945w;

        public BufferExactBoundedSubscriber(Subscriber<? super U> subscriber, Callable<U> callable, long j, TimeUnit timeUnit, int i2, boolean z2, Scheduler.Worker worker) {
            super(subscriber, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j;
            this.unit = timeUnit;
            this.maxSize = i2;
            this.restartTimerOnMaxSize = z2;
            this.f42945w = worker;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(Subscriber subscriber, Object obj) {
            return accept((Subscriber<? super Collection>) subscriber, (Collection) obj);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            synchronized (this) {
                this.buffer = null;
            }
            this.upstream.cancel();
            this.f42945w.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f42945w.isDisposed();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            U u2;
            synchronized (this) {
                u2 = this.buffer;
                this.buffer = null;
            }
            if (u2 != null) {
                this.queue.offer(u2);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                }
                this.f42945w.dispose();
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
            this.f42945w.dispose();
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0062 */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0078
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U extends java.util.Collection<? super T> r0 = r7.buffer     // Catch: java.lang.Throwable -> L73
                if (r0 != 0) goto Lc
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                r8 = r0
                r1 = r7
                goto L76
            Lc:
                r0.add(r8)     // Catch: java.lang.Throwable -> L73
                int r8 = r0.size()     // Catch: java.lang.Throwable -> L73
                int r1 = r7.maxSize     // Catch: java.lang.Throwable -> L73
                if (r8 >= r1) goto L19
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L19:
                r8 = 0
                r7.buffer = r8     // Catch: java.lang.Throwable -> L73
                long r1 = r7.producerIndex     // Catch: java.lang.Throwable -> L73
                r3 = 1
                long r1 = r1 + r3
                r7.producerIndex = r1     // Catch: java.lang.Throwable -> L73
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L73
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L2d
                io.reactivex.disposables.Disposable r8 = r7.timer
                r8.dispose()
            L2d:
                r8 = 0
                r7.fastPathOrderedEmitMax(r0, r8, r7)
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r8 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L64
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L64
                java.lang.String r0 = "The supplied buffer is null"
                java.lang.Object r8 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)     // Catch: java.lang.Throwable -> L64
                java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L64
                monitor-enter(r7)
                r7.buffer = r8     // Catch: java.lang.Throwable -> L5d
                long r0 = r7.consumerIndex     // Catch: java.lang.Throwable -> L5d
                long r0 = r0 + r3
                r7.consumerIndex = r0     // Catch: java.lang.Throwable -> L5d
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L5d
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L5b
                io.reactivex.Scheduler$Worker r0 = r7.f42945w
                long r2 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r4 = r2
                r1 = r7
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodically(r1, r2, r4, r6)
                r1.timer = r8
                return
            L5b:
                r1 = r7
                return
            L5d:
                r0 = move-exception
                r1 = r7
            L5f:
                r8 = r0
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L62
                throw r8
            L62:
                r0 = move-exception
                goto L5f
            L64:
                r0 = move-exception
                r1 = r7
                r8 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                r7.cancel()
                org.reactivestreams.Subscriber<? super V> r0 = r1.downstream
                r0.onError(r8)
                return
            L73:
                r0 = move-exception
                r1 = r7
            L75:
                r8 = r0
            L76:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L78
                throw r8
            L78:
                r0 = move-exception
                goto L75
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferExactBoundedSubscriber.onNext(java.lang.Object):void");
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f42945w;
                    long j = this.timespan;
                    this.timer = worker.schedulePeriodically(this, j, j, this.unit);
                    subscription.request(Long.MAX_VALUE);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.f42945w.dispose();
                    subscription.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u3 = this.buffer;
                    if (u3 != null && this.producerIndex == this.consumerIndex) {
                        this.buffer = u2;
                        fastPathOrderedEmitMax(u3, false, this);
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }

        public boolean accept(Subscriber<? super U> subscriber, U u2) {
            subscriber.onNext(u2);
            return true;
        }
    }

    public static final class BufferExactUnboundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable, Disposable {
        U buffer;
        final Callable<U> bufferSupplier;
        final Scheduler scheduler;
        final AtomicReference<Disposable> timer;
        final long timespan;
        final TimeUnit unit;
        Subscription upstream;

        public BufferExactUnboundedSubscriber(Subscriber<? super U> subscriber, Callable<U> callable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(subscriber, new MpscLinkedQueue());
            this.timer = new AtomicReference<>();
            this.bufferSupplier = callable;
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(Subscriber subscriber, Object obj) {
            return accept((Subscriber<? super Collection>) subscriber, (Collection) obj);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.timer.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            DisposableHelper.dispose(this.timer);
            synchronized (this) {
                try {
                    U u2 = this.buffer;
                    if (u2 == null) {
                        return;
                    }
                    this.buffer = null;
                    this.queue.offer(u2);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, null, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.timer);
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u2 = this.buffer;
                    if (u2 != null) {
                        u2.add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
                        subscription.request(Long.MAX_VALUE);
                        Scheduler scheduler = this.scheduler;
                        long j = this.timespan;
                        Disposable disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j, j, this.unit);
                        AtomicReference<Disposable> atomicReference = this.timer;
                        while (!atomicReference.compareAndSet(null, disposableSchedulePeriodicallyDirect)) {
                            if (atomicReference.get() != null) {
                                disposableSchedulePeriodicallyDirect.dispose();
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        U u3 = this.buffer;
                        if (u3 == null) {
                            return;
                        }
                        this.buffer = u2;
                        fastPathEmitMax(u3, false, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.downstream.onError(th2);
            }
        }

        public boolean accept(Subscriber<? super U> subscriber, U u2) {
            this.downstream.onNext(u2);
            return true;
        }
    }

    public static final class BufferSkipBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable {
        final Callable<U> bufferSupplier;
        final List<U> buffers;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        Subscription upstream;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final Scheduler.Worker f42946w;

        public final class RemoveFromBuffer implements Runnable {
            private final U buffer;

            public RemoveFromBuffer(U u2) {
                this.buffer = u2;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedSubscriber.this) {
                    BufferSkipBoundedSubscriber.this.buffers.remove(this.buffer);
                }
                BufferSkipBoundedSubscriber bufferSkipBoundedSubscriber = BufferSkipBoundedSubscriber.this;
                bufferSkipBoundedSubscriber.fastPathOrderedEmitMax(this.buffer, false, bufferSkipBoundedSubscriber.f42946w);
            }
        }

        public BufferSkipBoundedSubscriber(Subscriber<? super U> subscriber, Callable<U> callable, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(subscriber, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j;
            this.timeskip = j2;
            this.unit = timeUnit;
            this.f42946w = worker;
            this.buffers = new LinkedList();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(Subscriber subscriber, Object obj) {
            return accept((Subscriber<? super Collection>) subscriber, (Collection) obj);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.f42946w.dispose();
            clear();
        }

        public void clear() {
            synchronized (this) {
                this.buffers.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.buffers);
                this.buffers.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.queue.offer((U) ((Collection) it.next()));
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this.f42946w, this);
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.done = true;
            this.f42946w.dispose();
            clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            synchronized (this) {
                try {
                    Iterator<U> it = this.buffers.iterator();
                    while (it.hasNext()) {
                        it.next().add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.buffers.add((U) collection);
                    this.downstream.onSubscribe(this);
                    subscription.request(Long.MAX_VALUE);
                    Scheduler.Worker worker = this.f42946w;
                    long j = this.timeskip;
                    worker.schedulePeriodically(this, j, j, this.unit);
                    this.f42946w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.f42946w.dispose();
                    subscription.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.buffers.add((U) collection);
                        this.f42946w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.downstream.onError(th2);
            }
        }

        public boolean accept(Subscriber<? super U> subscriber, U u2) {
            subscriber.onNext(u2);
            return true;
        }
    }

    public FlowableBufferTimed(Flowable<T> flowable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i2, boolean z2) {
        super(flowable);
        this.timespan = j;
        this.timeskip = j2;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSupplier = callable;
        this.maxSize = i2;
        this.restartTimerOnMaxSize = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        if (this.timespan == this.timeskip && this.maxSize == Integer.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new BufferExactUnboundedSubscriber(new SerializedSubscriber(subscriber), this.bufferSupplier, this.timespan, this.unit, this.scheduler));
            return;
        }
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        if (this.timespan == this.timeskip) {
            this.source.subscribe((FlowableSubscriber) new BufferExactBoundedSubscriber(new SerializedSubscriber(subscriber), this.bufferSupplier, this.timespan, this.unit, this.maxSize, this.restartTimerOnMaxSize, workerCreateWorker));
        } else {
            this.source.subscribe((FlowableSubscriber) new BufferSkipBoundedSubscriber(new SerializedSubscriber(subscriber), this.bufferSupplier, this.timespan, this.timeskip, this.unit, workerCreateWorker));
        }
    }
}
