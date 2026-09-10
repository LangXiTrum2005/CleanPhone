package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class TestScheduler extends Scheduler {
    long counter;
    final Queue<TimedRunnable> queue = new PriorityBlockingQueue(11);
    volatile long time;

    public static final class TimedRunnable implements Comparable<TimedRunnable> {
        final long count;
        final Runnable run;
        final TestWorker scheduler;
        final long time;

        public TimedRunnable(TestWorker testWorker, long j, Runnable runnable, long j2) {
            this.time = j;
            this.run = runnable;
            this.scheduler = testWorker;
            this.count = j2;
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.time), this.run.toString());
        }

        @Override // java.lang.Comparable
        public int compareTo(TimedRunnable timedRunnable) {
            long j = this.time;
            long j2 = timedRunnable.time;
            return j == j2 ? Long.compare(this.count, timedRunnable.count) : Long.compare(j, j2);
        }
    }

    public TestScheduler() {
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(timeUnit.toNanos(j) + this.time, TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        triggerActions(timeUnit.toNanos(j));
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public Scheduler.Worker createWorker() {
        return new TestWorker();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public long now(TimeUnit timeUnit) {
        return timeUnit.convert(this.time, TimeUnit.NANOSECONDS);
    }

    public void triggerActions() {
        triggerActions(this.time);
    }

    private void triggerActions(long j) {
        while (true) {
            TimedRunnable timedRunnablePeek = this.queue.peek();
            if (timedRunnablePeek == null) {
                break;
            }
            long j2 = timedRunnablePeek.time;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.time;
            }
            this.time = j2;
            this.queue.remove(timedRunnablePeek);
            if (!timedRunnablePeek.scheduler.disposed) {
                timedRunnablePeek.run.run();
            }
        }
        this.time = j;
    }

    public TestScheduler(long j, TimeUnit timeUnit) {
        this.time = timeUnit.toNanos(j);
    }

    public final class TestWorker extends Scheduler.Worker {
        volatile boolean disposed;

        public final class QueueRemove implements Runnable {
            final TimedRunnable timedAction;

            public QueueRemove(TimedRunnable timedRunnable) {
                this.timedAction = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                TestScheduler.this.queue.remove(this.timedAction);
            }
        }

        public TestWorker() {
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public long now(TimeUnit timeUnit) {
            return TestScheduler.this.now(timeUnit);
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = timeUnit.toNanos(j) + TestScheduler.this.time;
            TestScheduler testScheduler = TestScheduler.this;
            long j2 = testScheduler.counter;
            testScheduler.counter = 1 + j2;
            TimedRunnable timedRunnable = new TimedRunnable(this, nanos, runnable, j2);
            TestScheduler.this.queue.add(timedRunnable);
            return Disposable.fromRunnable(new QueueRemove(timedRunnable));
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public Disposable schedule(Runnable runnable) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            TestScheduler testScheduler = TestScheduler.this;
            long j = testScheduler.counter;
            testScheduler.counter = 1 + j;
            TimedRunnable timedRunnable = new TimedRunnable(this, 0L, runnable, j);
            TestScheduler.this.queue.add(timedRunnable);
            return Disposable.fromRunnable(new QueueRemove(timedRunnable));
        }
    }
}
