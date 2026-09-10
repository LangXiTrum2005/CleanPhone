package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public final class ParallelFlatMapIterable<T, R> extends ParallelFlowable<R> {
    final Function<? super T, ? extends Iterable<? extends R>> mapper;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelFlatMapIterable(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends Iterable<? extends R>> function, int i2) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.prefetch = i2;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i2 = 0; i2 < length; i2++) {
                subscriberArr2[i2] = FlowableFlattenIterable.subscribe(subscriberArr[i2], this.mapper, this.prefetch);
            }
            this.source.subscribe(subscriberArr2);
        }
    }
}
