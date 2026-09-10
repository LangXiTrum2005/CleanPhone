package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.n;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Collection, Set, kk.b, kk.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f53495a = y.a.f54098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f53496b = y.a.f54099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53497c;

    public f(int i10) {
        if (i10 > 0) {
            h.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iB;
        int i11 = this.f53497c;
        if (obj == null) {
            iB = h.b(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iB = h.b(this, obj, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i12 = ~iB;
        int[] iArr = this.f53495a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f53496b;
            int[] iArr2 = new int[i13];
            this.f53495a = iArr2;
            this.f53496b = new Object[i13];
            if (i11 != this.f53497c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                k.f0(0, 0, iArr, iArr2, iArr.length);
                k.h0(0, objArr.length, 6, objArr, this.f53496b);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f53495a;
            int i14 = i12 + 1;
            k.f0(i14, i12, iArr3, iArr3, i11);
            Object[] objArr2 = this.f53496b;
            k.e0(i14, i12, i11, objArr2, objArr2);
        }
        int i15 = this.f53497c;
        if (i11 == i15) {
            int[] iArr4 = this.f53495a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f53496b[i12] = obj;
                this.f53497c = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        n.f(elements, "elements");
        int size = elements.size() + this.f53497c;
        int i10 = this.f53497c;
        int[] iArr = this.f53495a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f53496b;
            int[] iArr2 = new int[size];
            this.f53495a = iArr2;
            this.f53496b = new Object[size];
            if (i10 > 0) {
                k.f0(0, 0, iArr, iArr2, i10);
                k.h0(0, this.f53497c, 6, objArr, this.f53496b);
            }
        }
        if (this.f53497c != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i10) {
        int i11 = this.f53497c;
        Object[] objArr = this.f53496b;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f53495a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                k.f0(i10, i13, iArr, iArr, i11);
                Object[] objArr2 = this.f53496b;
                k.e0(i10, i13, i11, objArr2, objArr2);
            }
            this.f53496b[i12] = null;
        } else {
            int i14 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArr2 = new int[i14];
            this.f53495a = iArr2;
            this.f53496b = new Object[i14];
            if (i10 > 0) {
                k.f0(0, 0, iArr, iArr2, i10);
                k.h0(0, i10, 6, objArr, this.f53496b);
            }
            if (i10 < i12) {
                int i15 = i10 + 1;
                k.f0(i10, i15, iArr, this.f53495a, i11);
                k.e0(i10, i15, i11, objArr, this.f53496b);
            }
        }
        if (i11 != this.f53497c) {
            throw new ConcurrentModificationException();
        }
        this.f53497c = i12;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f53497c != 0) {
            this.f53495a = y.a.f54098a;
            this.f53496b = y.a.f54099b;
            this.f53497c = 0;
        }
        if (this.f53497c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? h.b(this, null, 0) : h.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        n.f(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f53497c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f53497c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f53496b[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f53495a;
        int i10 = this.f53497c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f53497c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB = obj == null ? h.b(this, null, 0) : h.b(this, obj, obj.hashCode());
        if (iB < 0) {
            return false;
        }
        b(iB);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        n.f(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        n.f(elements, "elements");
        boolean z10 = false;
        for (int i10 = this.f53497c - 1; -1 < i10; i10--) {
            if (!xj.n.i0(elements, this.f53496b[i10])) {
                b(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f53497c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return k.j0(0, this.f53497c, this.f53496b);
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f53497c * 14);
        sb2.append('{');
        int i10 = this.f53497c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f53496b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        n.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        n.f(array, "array");
        int i10 = this.f53497c;
        if (array.length < i10) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i10);
        } else if (array.length > i10) {
            array[i10] = null;
        }
        k.e0(0, 0, this.f53497c, this.f53496b, array);
        return array;
    }
}
