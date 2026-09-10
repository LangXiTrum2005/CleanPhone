package oa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f47226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47228c;

    public b0(int i10) {
        q.d(i10, "initialCapacity");
        this.f47226a = new Object[i10];
        this.f47227b = 0;
    }

    public static int f(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i11 <= i10) {
            return i10;
        }
        int iHighestOneBit = i10 + (i10 >> 1) + 1;
        if (iHighestOneBit < i11) {
            iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public abstract b0 a(Object obj);

    public final void b(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f47226a;
        int i10 = this.f47227b;
        this.f47227b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void c(Object... objArr) {
        int length = objArr.length;
        q.b(length, objArr);
        e(length);
        System.arraycopy(objArr, 0, this.f47226a, this.f47227b, length);
        this.f47227b += length;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof c0) {
                this.f47227b = ((c0) collection).m(this.f47227b, this.f47226a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f47226a;
        int iF = f(objArr.length, this.f47227b + i10);
        if (iF > objArr.length || this.f47228c) {
            this.f47226a = Arrays.copyOf(this.f47226a, iF);
            this.f47228c = false;
        }
    }
}
