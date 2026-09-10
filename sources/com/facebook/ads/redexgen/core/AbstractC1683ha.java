package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import com.google.common.base.ParametricNullness;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC1683ha<T> implements Iterator<T> {
    public EnumC1682hZ A00 = EnumC1682hZ.A04;

    @CheckForNull
    public T A01;

    @CheckForNull
    public abstract T A03();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ha != com.google.common.base.AbstractIterator<T> */
    private boolean A01() {
        this.A00 = EnumC1682hZ.A03;
        this.A01 = A03();
        if (this.A00 != EnumC1682hZ.A02) {
            this.A00 = EnumC1682hZ.A05;
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ha != com.google.common.base.AbstractIterator<T> */
    @CheckForNull
    public final T A02() {
        this.A00 = EnumC1682hZ.A02;
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ha != com.google.common.base.AbstractIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC1718iD.A0D(this.A00 != EnumC1682hZ.A03);
        switch (this.A00) {
            case A02:
                return false;
            case A05:
                return true;
            default:
                return A01();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ha != com.google.common.base.AbstractIterator<T> */
    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (hasNext()) {
            this.A00 = EnumC1682hZ.A04;
            T t = (T) AbstractC1711i5.A00(this.A01);
            this.A01 = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ha != com.google.common.base.AbstractIterator<T> */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
