package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.QueueDrainObserver;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {
    final Supplier<U> bufferSupplier;
    final int maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    public static final class BufferExactBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        U buffer;
        final Supplier<U> bufferSupplier;
        long consumerIndex;
        final int maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        Disposable timer;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final Scheduler.Worker f42983w;

        public BufferExactBoundedObserver(Observer<? super U> observer, Supplier<U> supplier, long j, TimeUnit timeUnit, int i2, boolean z2, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.bufferSupplier = supplier;
            this.timespan = j;
            this.unit = timeUnit;
            this.maxSize = i2;
            this.restartTimerOnMaxSize = z2;
            this.f42983w = worker;
        }

        @Override // io.reactivex.rxjava3.internal.observers.QueueDrainObserver, io.reactivex.rxjava3.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(Observer observer, Object obj) {
            accept((Observer<? super Collection>) observer, (Collection) obj);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            this.f42983w.dispose();
            synchronized (this) {
                this.buffer = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            U u2;
            this.f42983w.dispose();
            synchronized (this) {
                u2 = this.buffer;
                this.buffer = null;
            }
            if (u2 != null) {
                this.queue.offer(u2);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
            this.f42983w.dispose();
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0061 */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0077
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // io.reactivex.rxjava3.core.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U extends java.util.Collection<? super T> r0 = r7.buffer     // Catch: java.lang.Throwable -> L72
                if (r0 != 0) goto Lc
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                r8 = r0
                r1 = r7
                goto L75
            Lc:
                r0.add(r8)     // Catch: java.lang.Throwable -> L72
                int r8 = r0.size()     // Catch: java.lang.Throwable -> L72
                int r1 = r7.maxSize     // Catch: java.lang.Throwable -> L72
                if (r8 >= r1) goto L19
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L19:
                r8 = 0
                r7.buffer = r8     // Catch: java.lang.Throwable -> L72
                long r1 = r7.producerIndex     // Catch: java.lang.Throwable -> L72
                r3 = 1
                long r1 = r1 + r3
                r7.producerIndex = r1     // Catch: java.lang.Throwable -> L72
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L72
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L2d
                io.reactivex.rxjava3.disposables.Disposable r8 = r7.timer
                r8.dispose()
            L2d:
                r8 = 0
                r7.fastPathOrderedEmit(r0, r8, r7)
                io.reactivex.rxjava3.functions.Supplier<U extends java.util.Collection<? super T>> r8 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L63
                java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L63
                java.lang.String r0 = "The buffer supplied is null"
                java.util.Objects.requireNonNull(r8, r0)     // Catch: java.lang.Throwable -> L63
                java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L63
                monitor-enter(r7)
                r7.buffer = r8     // Catch: java.lang.Throwable -> L5c
                long r0 = r7.consumerIndex     // Catch: java.lang.Throwable -> L5c
                long r0 = r0 + r3
                r7.consumerIndex = r0     // Catch: java.lang.Throwable -> L5c
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L5c
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L5a
                io.reactivex.rxjava3.core.Scheduler$Worker r0 = r7.f42983w
                long r2 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r4 = r2
                r1 = r7
                io.reactivex.rxjava3.disposables.Disposable r8 = r0.schedulePeriodically(r1, r2, r4, r6)
                r1.timer = r8
                return
            L5a:
                r1 = r7
                return
            L5c:
                r0 = move-exception
                r1 = r7
            L5e:
                r8 = r0
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L61
                throw r8
            L61:
                r0 = move-exception
                goto L5e
            L63:
                r0 = move-exception
                r1 = r7
                r8 = r0
                io.reactivex.rxjava3.exceptions.Exceptions.throwIfFatal(r8)
                io.reactivex.rxjava3.core.Observer<? super V> r0 = r1.downstream
                r0.onError(r8)
                r7.dispose()
                return
            L72:
                r0 = move-exception
                r1 = r7
            L74:
                r8 = r0
            L75:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L77
                throw r8
            L77:
                r0 = move-exception
                goto L74
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.ObservableBufferTimed.BufferExactBoundedObserver.onNext(java.lang.Object):void");
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    U u2 = this.bufferSupplier.get();
                    Objects.requireNonNull(u2, "The buffer supplied is null");
                    this.buffer = u2;
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f42983w;
                    long j = this.timespan;
                    this.timer = worker.schedulePeriodically(this, j, j, this.unit);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    EmptyDisposable.error(th, this.downstream);
                    this.f42983w.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u2 = this.bufferSupplier.get();
                Objects.requireNonNull(u2, "The bufferSupplier returned a null buffer");
                U u3 = u2;
                synchronized (this) {
                    U u4 = this.buffer;
                    if (u4 != null && this.producerIndex == this.consumerIndex) {
                        this.buffer = u3;
                        fastPathOrderedEmit(u4, false, this);
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                dispose();
                this.downstream.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void accept(Observer<? super U> observer, U u2) {
            observer.onNext(u2);
        }
    }

    public static final class BufferExactUnboundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        U buffer;
        final Supplier<U> bufferSupplier;
        final Scheduler scheduler;
        final AtomicReference<Disposable> timer;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;

        public BufferExactUnboundedObserver(Observer<? super U> observer, Supplier<U> supplier, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(observer, new MpscLinkedQueue());
            this.timer = new AtomicReference<>();
            this.bufferSupplier = supplier;
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.rxjava3.internal.observers.QueueDrainObserver, io.reactivex.rxjava3.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(Observer observer, Object obj) {
            accept((Observer<? super Collection>) observer, (Collection) obj);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.timer);
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.timer.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.Observer
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
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, null, this);
                }
            }
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u2 = this.buffer;
                    if (u2 == null) {
                        return;
                    }
                    u2.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    U u2 = this.bufferSupplier.get();
                    Objects.requireNonNull(u2, "The buffer supplied is null");
                    this.buffer = u2;
                    this.downstream.onSubscribe(this);
                    if (!DisposableHelper.isDisposed(this.timer.get())) {
                        Scheduler scheduler = this.scheduler;
                        long j = this.timespan;
                        DisposableHelper.set(this.timer, scheduler.schedulePeriodicallyDirect(this, j, j, this.unit));
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    dispose();
                    EmptyDisposable.error(th, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u2;
            try {
                U u3 = this.bufferSupplier.get();
                Objects.requireNonNull(u3, "The bufferSupplier returned a null buffer");
                U u4 = u3;
                synchronized (this) {
                    try {
                        u2 = this.buffer;
                        if (u2 != null) {
                            this.buffer = u4;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (u2 == null) {
                    DisposableHelper.dispose(this.timer);
                } else {
                    fastPathEmit(u2, false, this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
                dispose();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void accept(Observer<? super U> observer, U u2) {
            this.downstream.onNext((Object) u2);
        }
    }

    public static final class BufferSkipBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        final Supplier<U> bufferSupplier;
        final List<U> buffers;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final Scheduler.Worker f42984w;

        public final class RemoveFromBuffer implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final U f42985b;

            public RemoveFromBuffer(U u2) {
                this.f42985b = u2;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    BufferSkipBoundedObserver.this.buffers.remove(this.f42985b);
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.fastPathOrderedEmit(this.f42985b, false, bufferSkipBoundedObserver.f42984w);
            }
        }

        public final class RemoveFromBufferEmit implements Runnable {
            private final U buffer;

            public RemoveFromBufferEmit(U u2) {
                this.buffer = u2;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    BufferSkipBoundedObserver.this.buffers.remove(this.buffer);
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.fastPathOrderedEmit(this.buffer, false, bufferSkipBoundedObserver.f42984w);
            }
        }

        public BufferSkipBoundedObserver(Observer<? super U> observer, Supplier<U> supplier, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.bufferSupplier = supplier;
            this.timespan = j;
            this.timeskip = j2;
            this.unit = timeUnit;
            this.f42984w = worker;
            this.buffers = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.internal.observers.QueueDrainObserver, io.reactivex.rxjava3.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(Observer observer, Object obj) {
            accept((Observer<? super Collection>) observer, (Collection) obj);
        }

        public void clear() {
            synchronized (this) {
                this.buffers.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            clear();
            this.upstream.dispose();
            this.f42984w.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.core.Observer
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
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this.f42984w, this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            this.done = true;
            clear();
            this.downstream.onError(th);
            this.f42984w.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
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

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    U u2 = this.bufferSupplier.get();
                    Objects.requireNonNull(u2, "The buffer supplied is null");
                    U u3 = u2;
                    this.buffers.add(u3);
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f42984w;
                    long j = this.timeskip;
                    worker.schedulePeriodically(this, j, j, this.unit);
                    this.f42984w.schedule(new RemoveFromBufferEmit(u3), this.timespan, this.unit);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    EmptyDisposable.error(th, this.downstream);
                    this.f42984w.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            try {
                U u2 = this.bufferSupplier.get();
                Objects.requireNonNull(u2, "The bufferSupplier returned a null buffer");
                U u3 = u2;
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.buffers.add(u3);
                        this.f42984w.schedule(new RemoveFromBuffer(u3), this.timespan, this.unit);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
                dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void accept(Observer<? super U> observer, U u2) {
            observer.onNext(u2);
        }
    }

    public ObservableBufferTimed(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Supplier<U> supplier, int i2, boolean z2) {
        super(observableSource);
        this.timespan = j;
        this.timeskip = j2;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSupplier = supplier;
        this.maxSize = i2;
        this.restartTimerOnMaxSize = z2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (this.timespan == this.timeskip && this.maxSize == Integer.MAX_VALUE) {
            this.source.subscribe(new BufferExactUnboundedObserver(new SerializedObserver(observer), this.bufferSupplier, this.timespan, this.unit, this.scheduler));
            return;
        }
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        if (this.timespan == this.timeskip) {
            this.source.subscribe(new BufferExactBoundedObserver(new SerializedObserver(observer), this.bufferSupplier, this.timespan, this.unit, this.maxSize, this.restartTimerOnMaxSize, workerCreateWorker));
        } else {
            this.source.subscribe(new BufferSkipBoundedObserver(new SerializedObserver(observer), this.bufferSupplier, this.timespan, this.timeskip, this.unit, workerCreateWorker));
        }
    }
}
