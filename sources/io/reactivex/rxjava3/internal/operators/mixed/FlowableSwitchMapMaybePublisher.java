package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableSwitchMapMaybePublisher<T, R> extends Flowable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    final Publisher<T> source;

    public FlowableSwitchMapMaybePublisher(Publisher<T> publisher, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2) {
        this.source = publisher;
        this.mapper = function;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe(new FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber(subscriber, this.mapper, this.delayErrors));
    }
}
