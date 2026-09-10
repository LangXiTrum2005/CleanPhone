package io.reactivex.flowables;

import io.reactivex.Flowable;

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
