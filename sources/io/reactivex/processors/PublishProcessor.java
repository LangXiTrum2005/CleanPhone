package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class PublishProcessor<T> extends FlowableProcessor<T> {
    Throwable error;
    final AtomicReference<PublishSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
    static final PublishSubscription[] TERMINATED = new PublishSubscription[0];
    static final PublishSubscription[] EMPTY = new PublishSubscription[0];

    public static final class PublishSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 3562861878281475070L;
        final Subscriber<? super T> downstream;
        final PublishProcessor<T> parent;

        public PublishSubscription(Subscriber<? super T> subscriber, PublishProcessor<T> publishProcessor) {
            this.downstream = subscriber;
            this.parent = publishProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        public boolean isFull() {
            return get() == 0;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public void onNext(T t) {
            long j = get();
            if (j == Long.MIN_VALUE) {
                return;
            }
            if (j != 0) {
                this.downstream.onNext(t);
                BackpressureHelper.producedCancel(this, 1L);
            } else {
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.addCancel(this, j);
            }
        }
    }

    @CheckReturnValue
    public static <T> PublishProcessor<T> create() {
        return new PublishProcessor<>();
    }

    public boolean add(PublishSubscription<T> publishSubscription) {
        while (true) {
            PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
            if (publishSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            PublishSubscription<T>[] publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
            AtomicReference<PublishSubscription<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2)) {
                if (atomicReference.get() != publishSubscriptionArr) {
                }
            }
            return true;
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        if (this.subscribers.get() == TERMINATED) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.subscribers.get() == TERMINATED && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.subscribers.get() == TERMINATED && this.error != null;
    }

    public boolean offer(T t) {
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        for (PublishSubscription<T> publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.isFull()) {
                return false;
            }
        }
        for (PublishSubscription<T> publishSubscription2 : publishSubscriptionArr) {
            publishSubscription2.onNext(t);
        }
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor, org.reactivestreams.Subscriber
    public void onComplete() {
        PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = TERMINATED;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            return;
        }
        for (PublishSubscription<T> publishSubscription : this.subscribers.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.onComplete();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = TERMINATED;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        for (PublishSubscription<T> publishSubscription : this.subscribers.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.onError(th);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, org.reactivestreams.Subscriber
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription<T> publishSubscription : this.subscribers.get()) {
            publishSubscription.onNext(t);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.subscribers.get() == TERMINATED) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void remove(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        while (true) {
            PublishSubscription<T>[] publishSubscriptionArr2 = this.subscribers.get();
            if (publishSubscriptionArr2 == TERMINATED || publishSubscriptionArr2 == EMPTY) {
                return;
            }
            int length = publishSubscriptionArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (publishSubscriptionArr2[i2] == publishSubscription) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                publishSubscriptionArr = EMPTY;
            } else {
                PublishSubscription<T>[] publishSubscriptionArr3 = new PublishSubscription[length - 1];
                System.arraycopy(publishSubscriptionArr2, 0, publishSubscriptionArr3, 0, i2);
                System.arraycopy(publishSubscriptionArr2, i2 + 1, publishSubscriptionArr3, i2, (length - i2) - 1);
                publishSubscriptionArr = publishSubscriptionArr3;
            }
            AtomicReference<PublishSubscription<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(publishSubscriptionArr2, publishSubscriptionArr)) {
                if (atomicReference.get() != publishSubscriptionArr2) {
                }
            }
            return;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        PublishSubscription<T> publishSubscription = new PublishSubscription<>(subscriber, this);
        subscriber.onSubscribe(publishSubscription);
        if (add(publishSubscription)) {
            if (publishSubscription.isCancelled()) {
                remove(publishSubscription);
            }
        } else {
            Throwable th = this.error;
            if (th != null) {
                subscriber.onError(th);
            } else {
                subscriber.onComplete();
            }
        }
    }
}
