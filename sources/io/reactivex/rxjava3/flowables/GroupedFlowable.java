package io.reactivex.rxjava3.flowables;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class GroupedFlowable<K, T> extends Flowable<T> {
    final K key;

    public GroupedFlowable(K k) {
        this.key = k;
    }

    public K getKey() {
        return this.key;
    }
}
