package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, Subscription {
    Throwable error;
    final AtomicReference<Subscription> upstream;
    T value;

    public FutureSubscriber() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        Subscription subscription = this.upstream.get();
        if (subscription == this || subscription == SubscriptionHelper.CANCELLED) {
            return;
        }
        AtomicReference<Subscription> atomicReference = this.upstream;
        while (!atomicReference.compareAndSet(subscription, this)) {
            if (atomicReference.get() != subscription) {
                return;
            }
        }
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        Subscription subscription;
        if (this.error == null && (subscription = this.upstream.get()) != this && subscription != SubscriptionHelper.CANCELLED) {
            AtomicReference<Subscription> atomicReference = this.upstream;
            while (!atomicReference.compareAndSet(subscription, this)) {
                if (atomicReference.get() != subscription) {
                }
            }
            this.error = th;
            countDown();
            return;
        }
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.value == null) {
            this.value = t;
        } else {
            this.upstream.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this.upstream, subscription, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        SubscriptionHelper subscriptionHelper;
        while (true) {
            Subscription subscription = this.upstream.get();
            if (subscription == this || subscription == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
            AtomicReference<Subscription> atomicReference = this.upstream;
            do {
                if (atomicReference.compareAndSet(subscription, subscriptionHelper)) {
                    if (subscription != null) {
                        subscription.cancel();
                    }
                    countDown();
                    return true;
                }
            } while (atomicReference.get() == subscription);
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.error;
            if (th == null) {
                return this.value;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
