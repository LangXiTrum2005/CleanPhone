package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3187cf0 implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short[] f4235a;

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
        if (!(obj instanceof C3099bf0)) {
            return false;
        }
        short s = ((C3099bf0) obj).f4180a;
        short[] sArr = this.f4235a;
        AbstractC2995aW.q(sArr, "<this>");
        int length = sArr.length;
        int i = 0;
        while (i < length) {
            if (s == sArr[i]) {
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
            if (obj instanceof C3099bf0) {
                short s = ((C3099bf0) obj).f4180a;
                short[] sArr = this.f4235a;
                AbstractC2995aW.q(sArr, "<this>");
                int length = sArr.length;
                for (int i = 0; i < length; i++) {
                    if (s == sArr[i]) {
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
        if (obj instanceof C3187cf0) {
            return AbstractC2995aW.i(this.f4235a, ((C3187cf0) obj).f4235a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f4235a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4235a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Me0(this.f4235a);
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
        return this.f4235a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return BF.r(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f4235a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC2995aW.q(objArr, "array");
        return BF.s(this, objArr);
    }
}
