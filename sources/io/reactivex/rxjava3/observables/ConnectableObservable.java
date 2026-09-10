package io.reactivex.rxjava3.observables;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.observable.ObservableAutoConnect;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import io.reactivex.rxjava3.internal.util.ConnectConsumer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ConnectableObservable<T> extends Observable<T> {
    @CheckReturnValue
    @SchedulerSupport("none")
    public Observable<T> autoConnect() {
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

    @CheckReturnValue
    @SchedulerSupport("none")
    public Observable<T> refCount() {
        return RxJavaPlugins.onAssembly(new ObservableRefCount(this));
    }

    @SchedulerSupport("none")
    public abstract void reset();

    @CheckReturnValue
    @SchedulerSupport("none")
    public Observable<T> autoConnect(int i2) {
        return autoConnect(i2, Functions.emptyConsumer());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> refCount(int i2) {
        return refCount(i2, 0L, TimeUnit.NANOSECONDS, Schedulers.trampoline());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public Observable<T> autoConnect(int i2, Consumer<? super Disposable> consumer) {
        Objects.requireNonNull(consumer, "connection is null");
        if (i2 <= 0) {
            connect(consumer);
            return RxJavaPlugins.onAssembly((ConnectableObservable) this);
        }
        return RxJavaPlugins.onAssembly(new ObservableAutoConnect(this, i2, consumer));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> refCount(long j, TimeUnit timeUnit) {
        return refCount(1, j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> refCount(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return refCount(1, j, timeUnit, scheduler);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> refCount(int i2, long j, TimeUnit timeUnit) {
        return refCount(i2, j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> refCount(int i2, long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.verifyPositive(i2, "subscriberCount");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableRefCount(this, i2, j, timeUnit, scheduler));
    }
}
