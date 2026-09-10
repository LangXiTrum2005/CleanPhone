package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingIterator<T> extends ForwardingObject implements Iterator<T> {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return w().hasNext();
    }

    public Object next() {
        return w().next();
    }

    public void remove() {
        w().remove();
    }

    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract Iterator w();
}
