package androidx.collection;

import android.support.v4.media.a;
import androidx.collection.internal.ContainerHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "ElementIterator", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ArraySet<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {
    public int[] X = ContainerHelpersKt.f3775a;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object[] f3735Y = ContainerHelpersKt.f3777c;
    public int Z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.Z);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object a(int i2) {
            return ArraySet.this.f3735Y[i2];
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void c(int i2) {
            ArraySet.this.a(i2);
        }
    }

    public ArraySet(int i2) {
        if (i2 > 0) {
            ArraySetKt.a(this, i2);
        }
    }

    public final Object a(int i2) {
        int i3 = this.Z;
        Object[] objArr = this.f3735Y;
        Object obj = objArr[i2];
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i4 = i3 - 1;
        int[] iArr = this.X;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i2 < i4) {
                int i5 = i2 + 1;
                ArraysKt.n(i2, i5, i3, iArr, iArr);
                Object[] objArr2 = this.f3735Y;
                ArraysKt.o(objArr2, i2, objArr2, i5, i3);
            }
            this.f3735Y[i4] = null;
        } else {
            ArraySetKt.a(this, i3 > 8 ? i3 + (i3 >> 1) : 8);
            if (i2 > 0) {
                ArraysKt.n(0, 0, i2, iArr, this.X);
                ArraysKt.p(objArr, 0, this.f3735Y, i2, 6);
            }
            if (i2 < i4) {
                int i6 = i2 + 1;
                ArraysKt.n(i2, i6, i3, iArr, this.X);
                ArraysKt.o(objArr, i2, this.f3735Y, i6, i3);
            }
        }
        if (i3 != this.Z) {
            throw new ConcurrentModificationException();
        }
        this.Z = i4;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int iB;
        int i3 = this.Z;
        if (obj == null) {
            iB = ArraySetKt.b(this, null, 0);
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iB = ArraySetKt.b(this, obj, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i4 = ~iB;
        int[] iArr = this.X;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f3735Y;
            ArraySetKt.a(this, i5);
            if (i3 != this.Z) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.X;
            if (iArr2.length != 0) {
                ArraysKt.n(0, 0, iArr.length, iArr, iArr2);
                ArraysKt.p(objArr, 0, this.f3735Y, objArr.length, 6);
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.X;
            int i6 = i4 + 1;
            ArraysKt.n(i6, i4, i3, iArr3, iArr3);
            Object[] objArr2 = this.f3735Y;
            ArraysKt.o(objArr2, i6, objArr2, i4, i3);
        }
        int i7 = this.Z;
        if (i3 == i7) {
            int[] iArr4 = this.X;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.f3735Y[i4] = obj;
                this.Z = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        int size = elements.size() + this.Z;
        int i2 = this.Z;
        int[] iArr = this.X;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3735Y;
            ArraySetKt.a(this, size);
            int i3 = this.Z;
            if (i3 > 0) {
                ArraysKt.n(0, 0, i3, iArr, this.X);
                ArraysKt.p(objArr, 0, this.f3735Y, this.Z, 6);
            }
        }
        if (this.Z != i2) {
            throw new ConcurrentModificationException();
        }
        Iterator<E> it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.Z != 0) {
            this.X = ContainerHelpersKt.f3775a;
            this.f3735Y = ContainerHelpersKt.f3777c;
            this.Z = 0;
        }
        if (this.Z != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? ArraySetKt.b(this, null, 0) : ArraySetKt.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        Iterator<E> it = elements.iterator();
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
        if (!(obj instanceof Set) || this.Z != ((Set) obj).size()) {
            return false;
        }
        try {
            int i2 = this.Z;
            for (int i3 = 0; i3 < i2; i3++) {
                if (!((Set) obj).contains(this.f3735Y[i3])) {
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
        int[] iArr = this.X;
        int i2 = this.Z;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.Z <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB = obj == null ? ArraySetKt.b(this, null, 0) : ArraySetKt.b(this, obj, obj.hashCode());
        if (iB < 0) {
            return false;
        }
        a(iB);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        Iterator<E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        boolean z2 = false;
        for (int i2 = this.Z - 1; -1 < i2; i2--) {
            if (!CollectionsKt.o(elements, this.f3735Y[i2])) {
                a(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.Z;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.r(this.f3735Y, 0, this.Z);
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.Z * 14);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i2 = this.Z;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3735Y[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.f(array, "array");
        int i2 = this.Z;
        if (array.length < i2) {
            array = (Object[]) a.e(i2, array);
        } else if (array.length > i2) {
            array[i2] = null;
        }
        ArraysKt.o(this.f3735Y, 0, array, 0, this.Z);
        return array;
    }
}
