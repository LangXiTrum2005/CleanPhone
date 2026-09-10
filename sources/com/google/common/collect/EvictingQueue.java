package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class EvictingQueue<E> extends ForwardingQueue<E> implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.ForwardingQueue
    /* JADX INFO: renamed from: A */
    public final Queue x() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < 0) {
            return Iterators.a(this, collection.iterator());
        }
        clear();
        Preconditions.e("number to skip cannot be negative", size >= 0);
        Iterable anonymousClass6 = new FluentIterable<Object>(size, collection) { // from class: com.google.common.collect.Iterables.6

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ Collection f19865Y;
            public final /* synthetic */ int Z;

            /* JADX INFO: renamed from: com.google.common.collect.Iterables$6$1 */
            class AnonymousClass1 implements Iterator<Object> {
                public boolean X = true;

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ Iterator f19866Y;

                public AnonymousClass1() {
                    it = it;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    Object next = it.next();
                    this.X = false;
                    return next;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    CollectPreconditions.d(!this.X);
                    it.remove();
                }
            }

            public AnonymousClass6(int size2, Collection collection2) {
                this.f19865Y = collection2;
                this.Z = size2;
            }

            @Override // java.lang.Iterable
            public final Iterator iterator() {
                Collection collection2 = this.f19865Y;
                boolean z2 = collection2 instanceof List;
                int i2 = this.Z;
                if (z2) {
                    List list = (List) collection2;
                    return list.subList(Math.min(list.size(), i2), list.size()).iterator();
                }
                Iterator it = collection2.iterator();
                it.getClass();
                Preconditions.e("numberToAdvance must be nonnegative", i2 >= 0);
                for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
                    it.next();
                }
                return new Iterator<Object>() { // from class: com.google.common.collect.Iterables.6.1
                    public boolean X = true;

                    /* JADX INFO: renamed from: Y */
                    public final /* synthetic */ Iterator f19866Y;

                    public AnonymousClass1() {
                        it = it;
                    }

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final Object next() {
                        Object next = it.next();
                        this.X = false;
                        return next;
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        CollectPreconditions.d(!this.X);
                        it.remove();
                    }
                };
            }
        };
        return anonymousClass6 instanceof Collection ? addAll((Collection) anonymousClass6) : Iterators.a(this, anonymousClass6.iterator());
    }

    @Override // com.google.common.collect.ForwardingQueue, java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        return true;
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: w */
    public final /* bridge */ /* synthetic */ Object x() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection
    public final /* bridge */ /* synthetic */ Collection x() {
        return null;
    }
}
