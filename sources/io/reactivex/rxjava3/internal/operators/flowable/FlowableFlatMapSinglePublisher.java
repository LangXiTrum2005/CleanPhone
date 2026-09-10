package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableFlatMapSinglePublisher<T, R> extends Flowable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final int maxConcurrency;
    final Publisher<T> source;

    public FlowableFlatMapSinglePublisher(Publisher<T> publisher, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z2, int i2) {
        this.source = publisher;
        this.mapper = function;
        this.delayErrors = z2;
        this.maxConcurrency = i2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe(new FlowableFlatMapSingle.FlatMapSingleSubscriber(subscriber, this.mapper, this.delayErrors, this.maxConcurrency));
    }
}
