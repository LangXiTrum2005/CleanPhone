package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f21798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21800c;

    public x91(int i10) {
        rb0.p(i10, "initialCapacity");
        this.f21798a = new Object[i10];
        this.f21799b = 0;
    }

    public static int d(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i11 <= i10) {
            return i10;
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int iHighestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        return i12;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f21798a;
        int i10 = this.f21799b;
        this.f21799b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void b(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof y91) {
                this.f21799b = ((y91) collection).s(this.f21798a, this.f21799b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public abstract x91 c(Object obj);

    public final void e(int i10) {
        int length = this.f21798a.length;
        int iD = d(length, this.f21799b + i10);
        if (iD > length || this.f21800c) {
            this.f21798a = Arrays.copyOf(this.f21798a, iD);
            this.f21800c = false;
        }
    }
}
