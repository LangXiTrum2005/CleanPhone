package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import org.reactivestreams.Processor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FlowableProcessor<T> extends Flowable<T> implements Processor<T, T>, FlowableSubscriber<T> {
    @CheckReturnValue
    public abstract Throwable getThrowable();

    @CheckReturnValue
    public abstract boolean hasComplete();

    @CheckReturnValue
    public abstract boolean hasSubscribers();

    @CheckReturnValue
    public abstract boolean hasThrowable();

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @CheckReturnValue
    public final FlowableProcessor<T> toSerialized() {
        return this instanceof SerializedProcessor ? this : new SerializedProcessor(this);
    }
}
