package io.reactivex.rxjava3.flowables;

import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableAutoConnect;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.internal.util.ConnectConsumer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ConnectableFlowable<T> extends Flowable<T> {
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public Flowable<T> autoConnect() {
        return autoConnect(1);
    }

    @SchedulerSupport("none")
    public final Disposable connect() {
        ConnectConsumer connectConsumer = new ConnectConsumer();
        connect(connectConsumer);
        return connectConsumer.disposable;
    }

    @SchedulerSupport("none")
    public abstract void connect(Consumer<? super Disposable> consumer);

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public Flowable<T> refCount() {
        return RxJavaPlugins.onAssembly(new FlowableRefCount(this));
    }

    @SchedulerSupport("none")
    public abstract void reset();

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public Flowable<T> autoConnect(int i2) {
        return autoConnect(i2, Functions.emptyConsumer());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable<T> refCount(int i2) {
        return refCount(i2, 0L, TimeUnit.NANOSECONDS, Schedulers.trampoline());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public Flowable<T> autoConnect(int i2, Consumer<? super Disposable> consumer) {
        Objects.requireNonNull(consumer, "connection is null");
        if (i2 <= 0) {
            connect(consumer);
            return RxJavaPlugins.onAssembly((ConnectableFlowable) this);
        }
        return RxJavaPlugins.onAssembly(new FlowableAutoConnect(this, i2, consumer));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> refCount(long j, TimeUnit timeUnit) {
        return refCount(1, j, timeUnit, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable<T> refCount(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return refCount(1, j, timeUnit, scheduler);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> refCount(int i2, long j, TimeUnit timeUnit) {
        return refCount(i2, j, timeUnit, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable<T> refCount(int i2, long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.verifyPositive(i2, "subscriberCount");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableRefCount(this, i2, j, timeUnit, scheduler));
    }
}
