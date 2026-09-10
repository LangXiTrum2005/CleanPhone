package xj;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends f implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f53846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53849d;

    public f0(int i10, Object[] objArr) {
        this.f53846a = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i10 <= objArr.length) {
            this.f53847b = objArr.length;
            this.f53849d = i10;
        } else {
            StringBuilder sbU = defpackage.e.u(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbU.append(objArr.length);
            throw new IllegalArgumentException(sbU.toString().toString());
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c cVar = f.Companion;
        int size = size();
        cVar.getClass();
        c.a(i10, size);
        return this.f53846a[(this.f53848c + i10) % this.f53847b];
    }

    @Override // xj.a
    public final int getSize() {
        return this.f53849d;
    }

    public final void h() {
        if (400 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 400, size = " + size()).toString());
        }
        int i10 = this.f53848c;
        int i11 = this.f53847b;
        int i12 = (i10 + 400) % i11;
        Object[] objArr = this.f53846a;
        if (i10 > i12) {
            Arrays.fill(objArr, i10, i11, (Object) null);
            Arrays.fill(objArr, 0, i12, (Object) null);
        } else {
            Arrays.fill(objArr, i10, i12, (Object) null);
        }
        this.f53848c = i12;
        this.f53849d = size() - 400;
    }

    @Override // xj.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new e0(this);
    }

    @Override // xj.a, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.n.f(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            kotlin.jvm.internal.n.e(array, "copyOf(...)");
        }
        int size = size();
        int i10 = this.f53848c;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objArr = this.f53846a;
            if (i12 >= size || i10 >= this.f53847b) {
                break;
            }
            array[i12] = objArr[i10];
            i12++;
            i10++;
        }
        while (i12 < size) {
            array[i12] = objArr[i11];
            i12++;
            i11++;
        }
        if (size < array.length) {
            array[size] = null;
        }
        return array;
    }

    @Override // xj.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
