package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleDelay<T> extends Single<T> {
    final boolean delayError;
    final Scheduler scheduler;
    final SingleSource<? extends T> source;
    final long time;
    final TimeUnit unit;

    public final class Delay implements SingleObserver<T> {
        final SingleObserver<? super T> downstream;
        private final SequentialDisposable sd;

        public final class OnError implements Runnable {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Throwable f42991e;

            public OnError(Throwable th) {
                this.f42991e = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                Delay.this.downstream.onError(this.f42991e);
            }
        }

        public final class OnSuccess implements Runnable {
            private final T value;

            public OnSuccess(T t) {
                this.value = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                Delay.this.downstream.onSuccess(this.value);
            }
        }

        public Delay(SequentialDisposable sequentialDisposable, SingleObserver<? super T> singleObserver) {
            this.sd = sequentialDisposable;
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable th) {
            SequentialDisposable sequentialDisposable = this.sd;
            Scheduler scheduler = SingleDelay.this.scheduler;
            OnError onError = new OnError(th);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(onError, singleDelay.delayError ? singleDelay.time : 0L, singleDelay.unit));
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.sd.replace(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(T t) {
            SequentialDisposable sequentialDisposable = this.sd;
            Scheduler scheduler = SingleDelay.this.scheduler;
            OnSuccess onSuccess = new OnSuccess(t);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(onSuccess, singleDelay.time, singleDelay.unit));
        }
    }

    public SingleDelay(SingleSource<? extends T> singleSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        this.source = singleSource;
        this.time = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z2;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.source.subscribe(new Delay(sequentialDisposable, singleObserver));
    }
}
