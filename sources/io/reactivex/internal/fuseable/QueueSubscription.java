package io.reactivex.internal.fuseable;

import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public interface QueueSubscription<T> extends QueueFuseable<T>, Subscription {
    @Override // org.reactivestreams.Subscription
    /* synthetic */ void cancel();

    @Override // org.reactivestreams.Subscription
    /* synthetic */ void request(long j);
}
