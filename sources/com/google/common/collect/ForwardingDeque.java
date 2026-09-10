package com.google.common.collect;

import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingDeque<E> extends ForwardingQueue<E> implements Deque<E> {
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract Deque x();

    @Override // java.util.Deque
    public final void addFirst(Object obj) {
        w().addFirst(obj);
    }

    @Override // java.util.Deque
    public final void addLast(Object obj) {
        w().addLast(obj);
    }

    @Override // java.util.Deque
    public final Iterator descendingIterator() {
        return w().descendingIterator();
    }

    @Override // java.util.Deque
    public final Object getFirst() {
        return w().getFirst();
    }

    @Override // java.util.Deque
    public final Object getLast() {
        return w().getLast();
    }

    @Override // java.util.Deque
    public final boolean offerFirst(Object obj) {
        return w().offerFirst(obj);
    }

    @Override // java.util.Deque
    public final boolean offerLast(Object obj) {
        return w().offerLast(obj);
    }

    @Override // java.util.Deque
    public final Object peekFirst() {
        return w().peekFirst();
    }

    @Override // java.util.Deque
    public final Object peekLast() {
        return w().peekLast();
    }

    @Override // java.util.Deque
    public final Object pollFirst() {
        return w().pollFirst();
    }

    @Override // java.util.Deque
    public final Object pollLast() {
        return w().pollLast();
    }

    @Override // java.util.Deque
    public final Object pop() {
        return w().pop();
    }

    @Override // java.util.Deque
    public final void push(Object obj) {
        w().push(obj);
    }

    @Override // java.util.Deque
    public final Object removeFirst() {
        return w().removeFirst();
    }

    @Override // java.util.Deque
    public final boolean removeFirstOccurrence(Object obj) {
        return w().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    public final Object removeLast() {
        return w().removeLast();
    }

    @Override // java.util.Deque
    public final boolean removeLastOccurrence(Object obj) {
        return w().removeLastOccurrence(obj);
    }
}
