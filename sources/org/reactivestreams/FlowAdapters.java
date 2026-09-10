package org.reactivestreams;

import j$.util.concurrent.Flow$Processor;
import j$.util.concurrent.Flow$Publisher;
import j$.util.concurrent.Flow$Subscriber;
import j$.util.concurrent.Flow$Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowAdapters {

    public static final class FlowPublisherFromReactive<T> implements Flow$Publisher<T> {
        @Override // j$.util.concurrent.Flow$Publisher
        public final void subscribe(Flow$Subscriber flow$Subscriber) {
            throw null;
        }
    }

    public static final class FlowToReactiveProcessor<T, U> implements Flow$Processor<T, U> {
        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onSubscribe(Flow$Subscription flow$Subscription) {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Publisher
        public final void subscribe(Flow$Subscriber flow$Subscriber) {
            throw null;
        }
    }

    public static final class FlowToReactiveSubscriber<T> implements Flow$Subscriber<T> {
        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onSubscribe(Flow$Subscription flow$Subscription) {
            throw null;
        }
    }

    public static final class FlowToReactiveSubscription implements Flow$Subscription {
        @Override // j$.util.concurrent.Flow$Subscription
        public final void cancel() {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscription
        public final void request(long j) {
            throw null;
        }
    }

    public static final class ReactivePublisherFromFlow<T> implements Publisher<T> {
        @Override // org.reactivestreams.Publisher
        public final void subscribe(Subscriber subscriber) {
            throw null;
        }
    }

    public static final class ReactiveToFlowProcessor<T, U> implements Processor<T, U> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            throw null;
        }

        @Override // org.reactivestreams.Publisher
        public final void subscribe(Subscriber subscriber) {
            throw null;
        }
    }

    public static final class ReactiveToFlowSubscriber<T> implements Subscriber<T> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            throw null;
        }
    }

    public static final class ReactiveToFlowSubscription implements Subscription {
        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            throw null;
        }
    }
}
