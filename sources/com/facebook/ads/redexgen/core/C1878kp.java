package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1878kp<E> extends AbstractCollection<E> {
    public static String[] A02 = {"psRx", "PaE", "QiZgSeBrDq6phMoyY15Rwd7xkYcWmlyn", "uVAvG1n4qY9Qm2x2Wwx", "SVY", "R4BVVGRseyt6VeG7R8", "WLKIpS44UKGOH0fPOaMwAxdsVmPqX8", "BDwHYCW9PjOYM7xnzaTutUE85f87LOy"};
    public final InterfaceC1719iE<? super E> A00;
    public final Collection<E> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super E> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    public C1878kp(Collection<E> unfiltered, InterfaceC1719iE<? super E> predicate) {
        this.A01 = unfiltered;
        this.A00 = predicate;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(@ParametricNullness E element) {
        AbstractC1718iD.A0C(this.A00.A42(element));
        return this.A01.add(element);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A02;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "Kot";
            strArr2[0] = "MSwZ";
            if (zHasNext) {
                E element = it.next();
                AbstractC1718iD.A0C(this.A00.A42(element));
            } else {
                return this.A01.addAll(collection);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        AbstractC1963mH.A03(this.A01, this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object element) {
        if (AbstractC1882kt.A03(this.A01, element)) {
            return this.A00.A42(element);
        }
        String[] strArr = A02;
        if (strArr[6].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A02[7] = "9iIPWTKMkBhlqzWY";
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return AbstractC1882kt.A04(this, collection);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !AbstractC1963mH.A02(this.A01, this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return AbstractC1970mO.A01(this.A01.iterator(), this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object element) {
        if (contains(element)) {
            Collection<E> collection = this.A01;
            if (A02[2].charAt(1) == 'w') {
                throw new RuntimeException();
            }
            A02[2] = "9yXQ23WyWLgHpbgnupjKfVlvAqZ13eIO";
            if (collection.remove(element)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(final Collection<?> collection) {
        boolean z = false;
        Iterator<E> it = this.A01.iterator();
        while (changed) {
            E next = it.next();
            boolean changed = this.A00.A42(next);
            if (changed) {
                boolean changed2 = collection.contains(next);
                if (changed2) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(final Collection<?> collection) {
        boolean z = false;
        Iterator<E> it = this.A01.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A02;
            if (strArr[6].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A02[7] = "eduZnFsmDO9t4YELThQVy46ccpCSsmF";
            if (zHasNext) {
                E next = it.next();
                boolean changed = this.A00.A42(next);
                if (changed) {
                    boolean changed2 = collection.contains(next);
                    if (!changed2) {
                        it.remove();
                        z = true;
                    }
                }
            } else {
                return z;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        Iterator<E> it = this.A01.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A02[7].length() == 13) {
                throw new RuntimeException();
            }
            A02[7] = "AcviO2YMuORzBgOxIFInwgIFg";
            if (zHasNext) {
                boolean zA42 = this.A00.A42(it.next());
                String[] strArr = A02;
                String str = strArr[3];
                String str2 = strArr[1];
                int length = str.length();
                int size = str2.length();
                if (length != size) {
                    A02[7] = "u87jus";
                    if (zA42) {
                        i++;
                    }
                } else if (zA42) {
                    i++;
                }
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1990mj.A05(iterator()).toArray();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kp != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC1990mj.A05(iterator()).toArray(tArr);
    }
}
