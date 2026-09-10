package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C03440g<E> extends C4Z<E> {
    public final OI<E> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0g != com.google.common.collect.ImmutableList$Itr<E> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    /* JADX WARN: Illegal instructions before constructor call */
    public C03440g(OI<E> list, final int index) {
        final int size = list.size();
        new AbstractC0916Np<E>(size, index) { // from class: com.facebook.ads.redexgen.X.4Z
            public static String[] A02 = {"CGVvWGsuzzGHQgo9zzOKQIJUE", "KVb58jbZH1vlab4O5iE8zizSXMaJECXq", "VptaZc", "glKzXP3GfNyb6OMGvuDXfVC1yHy2PNCZ", "pmbHPYSyFX1GsR09gqUeaAeR0V5aRJK7", "qAEg6Zt1UGu8L4Bf8ygtzAiT", "mjI", "bmKWD7kDb3scBQ7vRqmkLSkTVZvrcW"};
            public int A00;
            public final int A01;

            @ParametricNullness
            public abstract E A00(int index2);

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Z != com.google.common.collect.AbstractIndexedListIterator<E> */
            {
                AbstractC1718iD.A01(index, size);
                this.A01 = size;
                this.A00 = index;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Z != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.Iterator, java.util.ListIterator
            public final boolean hasNext() {
                return this.A00 < this.A01;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Z != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.A00 > 0;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Z != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.Iterator, java.util.ListIterator
            @ParametricNullness
            public final E next() {
                if (hasNext()) {
                    int i = this.A00;
                    this.A00 = i + 1;
                    if (A02[1].charAt(25) == 'X') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[2] = "xP2Fxu";
                    strArr[0] = "lDEAidUPCXG34cALHoPwa9Bl5";
                    return A00(i);
                }
                throw new NoSuchElementException();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Z != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Z != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.ListIterator
            @ParametricNullness
            public final E previous() {
                if (hasPrevious()) {
                    int i = this.A00 - 1;
                    this.A00 = i;
                    return A00(i);
                }
                throw new NoSuchElementException();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Z != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.A00 - 1;
            }
        };
        this.A00 = list;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0g != com.google.common.collect.ImmutableList$Itr<E> */
    @Override // com.facebook.ads.redexgen.core.C4Z
    public final E A00(int index) {
        return this.A00.get(index);
    }
}
