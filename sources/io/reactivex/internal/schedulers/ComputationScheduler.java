package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ComputationScheduler extends Scheduler implements SchedulerMultiWorkerSupport {
    private static final String KEY_COMPUTATION_PRIORITY = "rx2.computation-priority";
    static final String KEY_MAX_THREADS = "rx2.computation-threads";
    static final int MAX_THREADS = cap(Runtime.getRuntime().availableProcessors(), Integer.getInteger(KEY_MAX_THREADS, 0).intValue());
    static final FixedSchedulerPool NONE;
    static final PoolWorker SHUTDOWN_WORKER;
    static final RxThreadFactory THREAD_FACTORY;
    private static final String THREAD_NAME_PREFIX = "RxComputationThreadPool";
    final AtomicReference<FixedSchedulerPool> pool;
    final ThreadFactory threadFactory;

    public static final class FixedSchedulerPool implements SchedulerMultiWorkerSupport {
        final int cores;
        final PoolWorker[] eventLoops;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f42970n;

        public FixedSchedulerPool(int i2, ThreadFactory threadFactory) {
            this.cores = i2;
            this.eventLoops = new PoolWorker[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.eventLoops[i3] = new PoolWorker(threadFactory);
            }
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
        public void createWorkers(int i2, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
            int i3 = this.cores;
            if (i3 == 0) {
                for (int i4 = 0; i4 < i2; i4++) {
                    workerCallback.onWorker(i4, ComputationScheduler.SHUTDOWN_WORKER);
                }
                return;
            }
            int i5 = ((int) this.f42970n) % i3;
            for (int i6 = 0; i6 < i2; i6++) {
                workerCallback.onWorker(i6, new EventLoopWorker(this.eventLoops[i5]));
                i5++;
                if (i5 == i3) {
                    i5 = 0;
                }
            }
            this.f42970n = i5;
        }

        public PoolWorker getEventLoop() {
            int i2 = this.cores;
            if (i2 == 0) {
                return ComputationScheduler.SHUTDOWN_WORKER;
            }
            PoolWorker[] poolWorkerArr = this.eventLoops;
            long j = this.f42970n;
            this.f42970n = 1 + j;
            return poolWorkerArr[(int) (j % ((long) i2))];
        }

        public void shutdown() {
            for (PoolWorker poolWorker : this.eventLoops) {
                poolWorker.dispose();
            }
        }
    }

    public static final class PoolWorker extends NewThreadWorker {
        public PoolWorker(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        PoolWorker poolWorker = new PoolWorker(new RxThreadFactory("RxComputationShutdown"));
        SHUTDOWN_WORKER = poolWorker;
        poolWorker.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory(THREAD_NAME_PREFIX, Math.max(1, Math.min(10, Integer.getInteger(KEY_COMPUTATION_PRIORITY, 5).intValue())), true);
        THREAD_FACTORY = rxThreadFactory;
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(0, rxThreadFactory);
        NONE = fixedSchedulerPool;
        fixedSchedulerPool.shutdown();
    }

    public ComputationScheduler() {
        this(THREAD_FACTORY);
    }

    public static int cap(int i2, int i3) {
        return (i3 <= 0 || i3 > i2) ? i2 : i3;
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.Worker createWorker() {
        return new EventLoopWorker(this.pool.get().getEventLoop());
    }

    @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public void createWorkers(int i2, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
        ObjectHelper.verifyPositive(i2, "number > 0 required");
        this.pool.get().createWorkers(i2, workerCallback);
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.pool.get().getEventLoop().scheduleDirect(runnable, j, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.pool.get().getEventLoop().schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        while (true) {
            FixedSchedulerPool fixedSchedulerPool = this.pool.get();
            FixedSchedulerPool fixedSchedulerPool2 = NONE;
            if (fixedSchedulerPool == fixedSchedulerPool2) {
                return;
            }
            AtomicReference<FixedSchedulerPool> atomicReference = this.pool;
            do {
                if (atomicReference.compareAndSet(fixedSchedulerPool, fixedSchedulerPool2)) {
                    fixedSchedulerPool.shutdown();
                    return;
                }
            } while (atomicReference.get() == fixedSchedulerPool);
        }
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(MAX_THREADS, this.threadFactory);
        AtomicReference<FixedSchedulerPool> atomicReference = this.pool;
        FixedSchedulerPool fixedSchedulerPool2 = NONE;
        while (!atomicReference.compareAndSet(fixedSchedulerPool2, fixedSchedulerPool)) {
            if (atomicReference.get() != fixedSchedulerPool2) {
                fixedSchedulerPool.shutdown();
                return;
            }
        }
    }

    public ComputationScheduler(ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
        this.pool = new AtomicReference<>(NONE);
        start();
    }

    public static final class EventLoopWorker extends Scheduler.Worker {
        private final ListCompositeDisposable both;
        volatile boolean disposed;
        private final PoolWorker poolWorker;
        private final ListCompositeDisposable serial;
        private final CompositeDisposable timed;

        public EventLoopWorker(PoolWorker poolWorker) {
            this.poolWorker = poolWorker;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.serial = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.timed = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.both = listCompositeDisposable2;
            listCompositeDisposable2.add(listCompositeDisposable);
            listCompositeDisposable2.add(compositeDisposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.both.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable) {
            return this.disposed ? EmptyDisposable.INSTANCE : this.poolWorker.scheduleActual(runnable, 0L, TimeUnit.MILLISECONDS, this.serial);
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            return this.poolWorker.scheduleActual(runnable, j, timeUnit, this.timed);
        }
    }
}
