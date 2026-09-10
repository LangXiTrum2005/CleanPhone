package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableSwitchMapSinglePublisher<T, R> extends Flowable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final Publisher<T> source;

    public FlowableSwitchMapSinglePublisher(Publisher<T> publisher, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z2) {
        this.source = publisher;
        this.mapper = function;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe(new FlowableSwitchMapSingle.SwitchMapSingleSubscriber(subscriber, this.mapper, this.delayErrors));
    }
}
