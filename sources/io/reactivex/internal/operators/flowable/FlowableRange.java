package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableRange extends Flowable<Integer> {
    final int end;
    final int start;

    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        public BaseRangeSubscription(int i2, int i3) {
            this.index = i2;
            this.end = i3;
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.end;
        }

        public abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && BackpressureHelper.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i2) {
            return i2 & 1;
        }

        public abstract void slowPath(long j);

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Integer poll() {
            int i2 = this.index;
            if (i2 == this.end) {
                return null;
            }
            this.index = i2 + 1;
            return Integer.valueOf(i2);
        }
    }

    public static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super Integer> downstream;

        public RangeConditionalSubscription(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i2, int i3) {
            super(i2, i3);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void fastPath() {
            int i2 = this.end;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            for (int i3 = this.index; i3 != i2; i3++) {
                if (this.cancelled) {
                    return;
                }
                conditionalSubscriber.tryOnNext(Integer.valueOf(i3));
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void slowPath(long j) {
            int i2 = this.end;
            int i3 = this.index;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i3 == i2) {
                        if (i3 == i2) {
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
                        if (conditionalSubscriber.tryOnNext(Integer.valueOf(i3))) {
                            j2++;
                        }
                        i3++;
                    }
                }
                this.index = i3;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final Subscriber<? super Integer> downstream;

        public RangeSubscription(Subscriber<? super Integer> subscriber, int i2, int i3) {
            super(i2, i3);
            this.downstream = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void fastPath() {
            int i2 = this.end;
            Subscriber<? super Integer> subscriber = this.downstream;
            for (int i3 = this.index; i3 != i2; i3++) {
                if (this.cancelled) {
                    return;
                }
                subscriber.onNext(Integer.valueOf(i3));
            }
            if (this.cancelled) {
                return;
            }
            subscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void slowPath(long j) {
            int i2 = this.end;
            int i3 = this.index;
            Subscriber<? super Integer> subscriber = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i3 == i2) {
                        if (i3 == i2) {
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
                        subscriber.onNext(Integer.valueOf(i3));
                        j2++;
                        i3++;
                    }
                }
                this.index = i3;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public FlowableRange(int i2, int i3) {
        this.start = i2;
        this.end = i2 + i3;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Integer> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) subscriber, this.start, this.end));
        } else {
            subscriber.onSubscribe(new RangeSubscription(subscriber, this.start, this.end));
        }
    }
}
