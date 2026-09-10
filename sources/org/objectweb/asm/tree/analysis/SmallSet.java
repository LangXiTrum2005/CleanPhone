package org.objectweb.asm.tree.analysis;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
final class SmallSet<T> extends AbstractSet<T> {
    private final T element1;
    private final T element2;

    public static class IteratorImpl<T> implements Iterator<T> {
        private T firstElement;
        private T secondElement;

        public IteratorImpl(T t, T t2) {
            this.firstElement = t;
            this.secondElement = t2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.firstElement != null;
        }

        @Override // java.util.Iterator
        public T next() {
            T t = this.firstElement;
            if (t == null) {
                throw new NoSuchElementException();
            }
            this.firstElement = this.secondElement;
            this.secondElement = null;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public SmallSet() {
        this.element1 = null;
        this.element2 = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        return new IteratorImpl(this.element1, this.element2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (this.element1 == null) {
            return 0;
        }
        return this.element2 == null ? 1 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
    
        if (r0 != r2) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Set<T> union(org.objectweb.asm.tree.analysis.SmallSet<T> r5) {
        /*
            r4 = this;
            T r0 = r5.element1
            T r1 = r4.element1
            if (r0 != r1) goto Lc
            T r2 = r5.element2
            T r3 = r4.element2
            if (r2 == r3) goto L2b
        Lc:
            T r2 = r4.element2
            if (r0 != r2) goto L15
            T r3 = r5.element2
            if (r3 != r1) goto L15
            goto L2b
        L15:
            if (r0 != 0) goto L18
            goto L2b
        L18:
            if (r1 != 0) goto L1b
            goto L32
        L1b:
            T r3 = r5.element2
            if (r3 != 0) goto L2c
            if (r2 != 0) goto L27
            org.objectweb.asm.tree.analysis.SmallSet r5 = new org.objectweb.asm.tree.analysis.SmallSet
            r5.<init>(r1, r0)
            return r5
        L27:
            if (r0 == r1) goto L2b
            if (r0 != r2) goto L2c
        L2b:
            return r4
        L2c:
            if (r2 != 0) goto L33
            if (r1 == r0) goto L32
            if (r1 != r3) goto L33
        L32:
            return r5
        L33:
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 4
            r0.<init>(r1)
            T r1 = r4.element1
            r0.add(r1)
            T r1 = r4.element2
            if (r1 == 0) goto L45
            r0.add(r1)
        L45:
            T r1 = r5.element1
            r0.add(r1)
            T r5 = r5.element2
            if (r5 == 0) goto L51
            r0.add(r5)
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.SmallSet.union(org.objectweb.asm.tree.analysis.SmallSet):java.util.Set");
    }

    public SmallSet(T t) {
        this.element1 = t;
        this.element2 = null;
    }

    private SmallSet(T t, T t2) {
        this.element1 = t;
        this.element2 = t2;
    }
}
