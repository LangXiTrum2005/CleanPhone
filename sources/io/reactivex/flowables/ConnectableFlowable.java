package io.reactivex.flowables;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableAutoConnect;
import io.reactivex.internal.operators.flowable.FlowablePublishAlt;
import io.reactivex.internal.operators.flowable.FlowablePublishClassic;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.internal.util.ConnectConsumer;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ConnectableFlowable<T> extends Flowable<T> {
    /* JADX WARN: Multi-variable type inference failed */
    private ConnectableFlowable<T> onRefCount() {
        if (!(this instanceof FlowablePublishClassic)) {
            return this;
        }
        FlowablePublishClassic flowablePublishClassic = (FlowablePublishClassic) this;
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowablePublishAlt(flowablePublishClassic.publishSource(), flowablePublishClassic.publishBufferSize()));
    }

    public Flowable<T> autoConnect() {
        return autoConnect(1);
    }

    public final Disposable connect() {
        ConnectConsumer connectConsumer = new ConnectConsumer();
        connect(connectConsumer);
        return connectConsumer.disposable;
    }

    public abstract void connect(Consumer<? super Disposable> consumer);

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public Flowable<T> refCount() {
        return RxJavaPlugins.onAssembly(new FlowableRefCount(onRefCount()));
    }

    public Flowable<T> autoConnect(int i2) {
        return autoConnect(i2, Functions.emptyConsumer());
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(int i2) {
        return refCount(i2, 0L, TimeUnit.NANOSECONDS, Schedulers.trampoline());
    }

    public Flowable<T> autoConnect(int i2, Consumer<? super Disposable> consumer) {
        if (i2 <= 0) {
            connect(consumer);
            return RxJavaPlugins.onAssembly((ConnectableFlowable) this);
        }
        return RxJavaPlugins.onAssembly(new FlowableAutoConnect(this, i2, consumer));
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(long j, TimeUnit timeUnit) {
        return refCount(1, j, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return refCount(1, j, timeUnit, scheduler);
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(int i2, long j, TimeUnit timeUnit) {
        return refCount(i2, j, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(int i2, long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.verifyPositive(i2, "subscriberCount");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableRefCount(onRefCount(), i2, j, timeUnit, scheduler));
    }
}
