package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableElementAtMaybePublisher<T> extends Maybe<T> {
    final long index;
    final Publisher<T> source;

    public FlowableElementAtMaybePublisher(Publisher<T> publisher, long j) {
        this.source = publisher;
        this.index = j;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new FlowableElementAtMaybe.ElementAtSubscriber(maybeObserver, this.index));
    }
}
