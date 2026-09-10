package io.reactivex.rxjava3.internal.operators.flowable;

import androidx.datastore.preferences.protobuf.a;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableFromArray<T> extends Flowable<T> {
    final T[] array;

    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super T> downstream;

        public ArrayConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            for (int i2 = this.index; i2 != length; i2++) {
                if (this.cancelled) {
                    return;
                }
                T t = tArr[i2];
                if (t == null) {
                    conditionalSubscriber.onError(new NullPointerException(a.k("The element at index ", i2, " is null")));
                    return;
                }
                conditionalSubscriber.tryOnNext(t);
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void slowPath(long j) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i2 = this.index;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == length) {
                        if (i2 == length) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        T t = tArr[i2];
                        if (t == null) {
                            conditionalSubscriber.onError(new NullPointerException(a.k("The element at index ", i2, " is null")));
                            return;
                        } else {
                            if (conditionalSubscriber.tryOnNext(t)) {
                                j2++;
                            }
                            i2++;
                        }
                    }
                }
                this.index = i2;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final Subscriber<? super T> downstream;

        public ArraySubscription(Subscriber<? super T> subscriber, T[] tArr) {
            super(tArr);
            this.downstream = subscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            Subscriber<? super T> subscriber = this.downstream;
            for (int i2 = this.index; i2 != length; i2++) {
                if (this.cancelled) {
                    return;
                }
                T t = tArr[i2];
                if (t == null) {
                    subscriber.onError(new NullPointerException(a.k("The element at index ", i2, " is null")));
                    return;
                }
                subscriber.onNext(t);
            }
            if (this.cancelled) {
                return;
            }
            subscriber.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void slowPath(long j) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i2 = this.index;
            Subscriber<? super T> subscriber = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == length) {
                        if (i2 == length) {
                            if (this.cancelled) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        T t = tArr[i2];
                        if (t == null) {
                            subscriber.onError(new NullPointerException(a.k("The element at index ", i2, " is null")));
                            return;
                        } else {
                            subscriber.onNext(t);
                            j2++;
                            i2++;
                        }
                    }
                }
                this.index = i2;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        public BaseArraySubscription(T[] tArr) {
            this.array = tArr;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, io.reactivex.rxjava3.internal.fuseable.QueueSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.array.length;
        }

        public abstract void fastPath();

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.array.length;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final T poll() {
            int i2 = this.index;
            T[] tArr = this.array;
            if (i2 == tArr.length) {
                return null;
            }
            this.index = i2 + 1;
            T t = tArr[i2];
            Objects.requireNonNull(t, "array element is null");
            return t;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, io.reactivex.rxjava3.internal.fuseable.QueueSubscription, org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && BackpressureHelper.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i2) {
            return i2 & 1;
        }

        public abstract void slowPath(long j);
    }

    public FlowableFromArray(T[] tArr) {
        this.array = tArr;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.onSubscribe(new ArrayConditionalSubscription((ConditionalSubscriber) subscriber, this.array));
        } else {
            subscriber.onSubscribe(new ArraySubscription(subscriber, this.array));
        }
    }
}
