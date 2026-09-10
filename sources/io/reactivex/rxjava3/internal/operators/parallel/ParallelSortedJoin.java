package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class ParallelSortedJoin<T> extends Flowable<T> {
    final Comparator<? super T> comparator;
    final ParallelFlowable<List<T>> source;

    public static final class SortedJoinInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        final int index;
        final SortedJoinSubscription<T> parent;

        public SortedJoinInnerSubscriber(SortedJoinSubscription<T> sortedJoinSubscription, int i2) {
            this.parent = sortedJoinSubscription;
            this.index = i2;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(List<T> list) {
            this.parent.innerNext(list, this.index);
        }
    }

    public static final class SortedJoinSubscription<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 3481980673745556697L;
        volatile boolean cancelled;
        final Comparator<? super T> comparator;
        final Subscriber<? super T> downstream;
        final int[] indexes;
        final List<T>[] lists;
        final SortedJoinInnerSubscriber<T>[] subscribers;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger remaining = new AtomicInteger();
        final AtomicReference<Throwable> error = new AtomicReference<>();

        public SortedJoinSubscription(Subscriber<? super T> subscriber, int i2, Comparator<? super T> comparator) {
            this.downstream = subscriber;
            this.comparator = comparator;
            SortedJoinInnerSubscriber<T>[] sortedJoinInnerSubscriberArr = new SortedJoinInnerSubscriber[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                sortedJoinInnerSubscriberArr[i3] = new SortedJoinInnerSubscriber<>(this, i3);
            }
            this.subscribers = sortedJoinInnerSubscriberArr;
            this.lists = new List[i2];
            this.indexes = new int[i2];
            this.remaining.lazySet(i2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.lists, (Object) null);
            }
        }

        public void cancelAll() {
            for (SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.subscribers) {
                sortedJoinInnerSubscriber.cancel();
            }
        }

        public void drain() {
            int i2;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.downstream;
            List<T>[] listArr = this.lists;
            int[] iArr = this.indexes;
            int length = iArr.length;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    i2 = 0;
                    if (j2 != j) {
                        if (this.cancelled) {
                            Arrays.fill(listArr, (Object) null);
                            return;
                        }
                        Throwable th = this.error.get();
                        if (th != null) {
                            cancelAll();
                            Arrays.fill(listArr, (Object) null);
                            subscriber.onError(th);
                            return;
                        }
                        int i3 = -1;
                        T t = null;
                        while (i2 < length) {
                            List<T> list = listArr[i2];
                            int i4 = iArr[i2];
                            if (list.size() != i4) {
                                if (t == null) {
                                    t = list.get(i4);
                                } else {
                                    T t2 = list.get(i4);
                                    try {
                                        if (this.comparator.compare(t, t2) > 0) {
                                            t = t2;
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        cancelAll();
                                        Arrays.fill(listArr, (Object) null);
                                        AtomicReference<Throwable> atomicReference = this.error;
                                        for (Throwable th3 = null; !atomicReference.compareAndSet(th3, th2); th3 = null) {
                                            if (atomicReference.get() != null) {
                                                RxJavaPlugins.onError(th2);
                                                break;
                                            }
                                        }
                                        subscriber.onError(this.error.get());
                                        return;
                                    }
                                }
                                i3 = i2;
                            }
                            i2++;
                        }
                        if (t == null) {
                            Arrays.fill(listArr, (Object) null);
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onNext(t);
                            iArr[i3] = iArr[i3] + 1;
                            j2++;
                        }
                    }
                }
                if (this.cancelled) {
                    Arrays.fill(listArr, (Object) null);
                    return;
                }
                Throwable th4 = this.error.get();
                if (th4 != null) {
                    cancelAll();
                    Arrays.fill(listArr, (Object) null);
                    subscriber.onError(th4);
                    return;
                }
                while (true) {
                    if (i2 >= length) {
                        Arrays.fill(listArr, (Object) null);
                        subscriber.onComplete();
                        return;
                    } else if (iArr[i2] != listArr[i2].size()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.produced(this.requested, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void innerError(Throwable th) {
            AtomicReference<Throwable> atomicReference = this.error;
            while (!atomicReference.compareAndSet(null, th)) {
                if (atomicReference.get() != null) {
                    if (th != this.error.get()) {
                        RxJavaPlugins.onError(th);
                        return;
                    }
                    return;
                }
            }
            drain();
        }

        public void innerNext(List<T> list, int i2) {
            this.lists[i2] = list;
            if (this.remaining.decrementAndGet() == 0) {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                if (this.remaining.get() == 0) {
                    drain();
                }
            }
        }
    }

    public ParallelSortedJoin(ParallelFlowable<List<T>> parallelFlowable, Comparator<? super T> comparator) {
        this.source = parallelFlowable;
        this.comparator = comparator;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SortedJoinSubscription sortedJoinSubscription = new SortedJoinSubscription(subscriber, this.source.parallelism(), this.comparator);
        subscriber.onSubscribe(sortedJoinSubscription);
        this.source.subscribe(sortedJoinSubscription.subscribers);
    }
}
