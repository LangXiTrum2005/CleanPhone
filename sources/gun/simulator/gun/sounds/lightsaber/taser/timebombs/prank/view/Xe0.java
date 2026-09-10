package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class Xe0 implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f3984a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof We0)) {
            return false;
        }
        long j = ((We0) obj).f3931a;
        long[] jArr = this.f3984a;
        AbstractC2995aW.q(jArr, "<this>");
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            if (j == jArr[i]) {
                return i >= 0;
            }
            i++;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC2995aW.q(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        loop0: for (Object obj : collection2) {
            if (obj instanceof We0) {
                long j = ((We0) obj).f3931a;
                long[] jArr = this.f3984a;
                AbstractC2995aW.q(jArr, "<this>");
                int length = jArr.length;
                for (int i = 0; i < length; i++) {
                    if (j == jArr[i]) {
                        if (i < 0) {
                            break loop0;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof Xe0) {
            return AbstractC2995aW.i(this.f3984a, ((Xe0) obj).f3984a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f3984a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3984a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Me0(this.f3984a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3984a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return BF.r(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f3984a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC2995aW.q(objArr, "array");
        return BF.s(this, objArr);
    }
}
