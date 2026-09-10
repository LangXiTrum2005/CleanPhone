package com.google.common.collect;

import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingQueue<E> extends ForwardingCollection<E> implements Queue<E> {
    @Override // com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract Queue x();

    @Override // java.util.Queue
    public final Object element() {
        return w().element();
    }

    public boolean offer(Object obj) {
        return w().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return w().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return w().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return w().remove();
    }
}
