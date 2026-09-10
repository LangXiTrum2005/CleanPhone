package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class TrampolineScheduler extends Scheduler {
    private static final TrampolineScheduler INSTANCE = new TrampolineScheduler();

    public static final class SleepingRunnable implements Runnable {
        private final long execTime;
        private final Runnable run;
        private final TrampolineWorker worker;

        public SleepingRunnable(Runnable runnable, TrampolineWorker trampolineWorker, long j) {
            this.run = runnable;
            this.worker = trampolineWorker;
            this.execTime = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.worker.disposed) {
                return;
            }
            long jNow = this.worker.now(TimeUnit.MILLISECONDS);
            long j = this.execTime;
            if (j > jNow) {
                try {
                    Thread.sleep(j - jNow);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    RxJavaPlugins.onError(e2);
                    return;
                }
            }
            if (this.worker.disposed) {
                return;
            }
            this.run.run();
        }
    }

    public static final class TimedRunnable implements Comparable<TimedRunnable> {
        final int count;
        volatile boolean disposed;
        final long execTime;
        final Runnable run;

        public TimedRunnable(Runnable runnable, Long l2, int i2) {
            this.run = runnable;
            this.execTime = l2.longValue();
            this.count = i2;
        }

        @Override // java.lang.Comparable
        public int compareTo(TimedRunnable timedRunnable) {
            int iCompare = Long.compare(this.execTime, timedRunnable.execTime);
            return iCompare == 0 ? Integer.compare(this.count, timedRunnable.count) : iCompare;
        }
    }

    public static final class TrampolineWorker extends Scheduler.Worker implements Disposable {
        volatile boolean disposed;
        final PriorityBlockingQueue<TimedRunnable> queue = new PriorityBlockingQueue<>();
        private final AtomicInteger wip = new AtomicInteger();
        final AtomicInteger counter = new AtomicInteger();

        public final class AppendToQueueTask implements Runnable {
            final TimedRunnable timedRunnable;

            public AppendToQueueTask(TimedRunnable timedRunnable) {
                this.timedRunnable = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.timedRunnable.disposed = true;
                TrampolineWorker.this.queue.remove(this.timedRunnable);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        public Disposable enqueue(Runnable runnable, long j) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            TimedRunnable timedRunnable = new TimedRunnable(runnable, Long.valueOf(j), this.counter.incrementAndGet());
            this.queue.add(timedRunnable);
            if (this.wip.getAndIncrement() != 0) {
                return Disposable.fromRunnable(new AppendToQueueTask(timedRunnable));
            }
            int iAddAndGet = 1;
            while (!this.disposed) {
                TimedRunnable timedRunnablePoll = this.queue.poll();
                if (timedRunnablePoll == null) {
                    iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!timedRunnablePoll.disposed) {
                    timedRunnablePoll.run.run();
                }
            }
            this.queue.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public Disposable schedule(Runnable runnable) {
            return enqueue(runnable, now(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + now(TimeUnit.MILLISECONDS);
            return enqueue(new SleepingRunnable(runnable, this, millis), millis);
        }
    }

    public static TrampolineScheduler instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public Scheduler.Worker createWorker() {
        return new TrampolineWorker();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public Disposable scheduleDirect(Runnable runnable) {
        RxJavaPlugins.onSchedule(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            RxJavaPlugins.onSchedule(runnable).run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.onError(e2);
        }
        return EmptyDisposable.INSTANCE;
    }
}
