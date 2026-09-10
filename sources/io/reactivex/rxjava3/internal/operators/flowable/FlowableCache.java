package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableCache<T> extends AbstractFlowableWithUpstream<T, T> implements FlowableSubscriber<T> {
    static final CacheSubscription[] EMPTY = new CacheSubscription[0];
    static final CacheSubscription[] TERMINATED = new CacheSubscription[0];
    final int capacityHint;
    volatile boolean done;
    Throwable error;
    final Node<T> head;
    final AtomicBoolean once;
    volatile long size;
    final AtomicReference<CacheSubscription<T>[]> subscribers;
    Node<T> tail;
    int tailOffset;

    public static final class CacheSubscription<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 6770240836423125754L;
        final Subscriber<? super T> downstream;
        long index;
        Node<T> node;
        int offset;
        final FlowableCache<T> parent;
        final AtomicLong requested = new AtomicLong();

        public CacheSubscription(Subscriber<? super T> subscriber, FlowableCache<T> flowableCache) {
            this.downstream = subscriber;
            this.parent = flowableCache;
            this.node = flowableCache.head;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.addCancel(this.requested, j);
                this.parent.replay(this);
            }
        }
    }

    public static final class Node<T> {
        volatile Node<T> next;
        final T[] values;

        public Node(int i2) {
            this.values = (T[]) new Object[i2];
        }
    }

    public FlowableCache(Flowable<T> flowable, int i2) {
        super(flowable);
        this.capacityHint = i2;
        this.once = new AtomicBoolean();
        Node<T> node = new Node<>(i2);
        this.head = node;
        this.tail = node;
        this.subscribers = new AtomicReference<>(EMPTY);
    }

    public void add(CacheSubscription<T> cacheSubscription) {
        while (true) {
            CacheSubscription<T>[] cacheSubscriptionArr = this.subscribers.get();
            if (cacheSubscriptionArr == TERMINATED) {
                return;
            }
            int length = cacheSubscriptionArr.length;
            CacheSubscription<T>[] cacheSubscriptionArr2 = new CacheSubscription[length + 1];
            System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr2, 0, length);
            cacheSubscriptionArr2[length] = cacheSubscription;
            AtomicReference<CacheSubscription<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(cacheSubscriptionArr, cacheSubscriptionArr2)) {
                if (atomicReference.get() != cacheSubscriptionArr) {
                }
            }
            return;
        }
    }

    public long cachedEventCount() {
        return this.size;
    }

    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    public boolean isConnected() {
        return this.once.get();
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onComplete() {
        this.done = true;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onNext(T t) {
        int i2 = this.tailOffset;
        if (i2 == this.capacityHint) {
            Node<T> node = new Node<>(i2);
            node.values[0] = t;
            this.tailOffset = 1;
            this.tail.next = node;
            this.tail = node;
        } else {
            this.tail.values[i2] = t;
            this.tailOffset = i2 + 1;
        }
        this.size++;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.get()) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    public void remove(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        while (true) {
            CacheSubscription<T>[] cacheSubscriptionArr2 = this.subscribers.get();
            int length = cacheSubscriptionArr2.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (cacheSubscriptionArr2[i2] == cacheSubscription) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                cacheSubscriptionArr = EMPTY;
            } else {
                CacheSubscription<T>[] cacheSubscriptionArr3 = new CacheSubscription[length - 1];
                System.arraycopy(cacheSubscriptionArr2, 0, cacheSubscriptionArr3, 0, i2);
                System.arraycopy(cacheSubscriptionArr2, i2 + 1, cacheSubscriptionArr3, i2, (length - i2) - 1);
                cacheSubscriptionArr = cacheSubscriptionArr3;
            }
            AtomicReference<CacheSubscription<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(cacheSubscriptionArr2, cacheSubscriptionArr)) {
                if (atomicReference.get() != cacheSubscriptionArr2) {
                }
            }
            return;
        }
    }

    public void replay(CacheSubscription<T> cacheSubscription) {
        if (cacheSubscription.getAndIncrement() != 0) {
            return;
        }
        long j = cacheSubscription.index;
        int i2 = cacheSubscription.offset;
        Node<T> node = cacheSubscription.node;
        AtomicLong atomicLong = cacheSubscription.requested;
        Subscriber<? super T> subscriber = cacheSubscription.downstream;
        int i3 = this.capacityHint;
        int iAddAndGet = 1;
        while (true) {
            boolean z2 = this.done;
            boolean z3 = this.size == j;
            if (z2 && z3) {
                cacheSubscription.node = null;
                Throwable th = this.error;
                if (th != null) {
                    subscriber.onError(th);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            if (!z3) {
                long j2 = atomicLong.get();
                if (j2 == Long.MIN_VALUE) {
                    cacheSubscription.node = null;
                    return;
                } else if (j2 != j) {
                    if (i2 == i3) {
                        node = node.next;
                        i2 = 0;
                    }
                    subscriber.onNext(node.values[i2]);
                    i2++;
                    j++;
                }
            }
            cacheSubscription.index = j;
            cacheSubscription.offset = i2;
            cacheSubscription.node = node;
            iAddAndGet = cacheSubscription.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        CacheSubscription<T> cacheSubscription = new CacheSubscription<>(subscriber, this);
        subscriber.onSubscribe(cacheSubscription);
        add(cacheSubscription);
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            replay(cacheSubscription);
        } else {
            this.source.subscribe((FlowableSubscriber) this);
        }
    }
}
