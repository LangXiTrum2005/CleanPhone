package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final UnmodifiableListIterator f19830Y = new Itr(0, RegularImmutableList.f0);
    private static final long serialVersionUID = -889275714;

    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        /* JADX INFO: renamed from: b */
        public final ImmutableCollection.ArrayBasedBuilder c(Object obj) {
            super.c(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        public final ImmutableCollection.Builder c(Object obj) {
            super.c(obj);
            return this;
        }

        public final void h(Object obj) {
            super.c(obj);
        }

        public final void i(Object... objArr) {
            d(objArr.length, objArr);
        }

        public final ImmutableList j() {
            this.f19828c = true;
            return ImmutableList.p(this.f19827b, this.f19826a);
        }
    }

    public static class Itr<E> extends AbstractIndexedListIterator<E> {
        public final ImmutableList Z;

        public Itr(int i2, ImmutableList immutableList) {
            super(immutableList.size(), i2);
            this.Z = immutableList;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final Object a(int i2) {
            return this.Z.get(i2);
        }
    }

    public static class ReverseImmutableList<E> extends ImmutableList<E> {
        public final transient ImmutableList Z;

        public ReverseImmutableList(ImmutableList immutableList) {
            this.Z = immutableList;
        }

        @Override // com.google.common.collect.ImmutableList
        public final ImmutableList C() {
            return this.Z;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final ImmutableList subList(int i2, int i3) {
            ImmutableList immutableList = this.Z;
            Preconditions.l(i2, i3, immutableList.size());
            return immutableList.subList(immutableList.size() - i3, immutableList.size() - i2).C();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.Z.contains(obj);
        }

        @Override // java.util.List
        public final Object get(int i2) {
            ImmutableList immutableList = this.Z;
            Preconditions.i(i2, immutableList.size());
            return immutableList.get((immutableList.size() - 1) - i2);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(Object obj) {
            ImmutableList immutableList = this.Z;
            int iLastIndexOf = immutableList.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return (immutableList.size() - 1) - iLastIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return this.Z.l();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(Object obj) {
            ImmutableList immutableList = this.Z;
            int iIndexOf = immutableList.indexOf(obj);
            if (iIndexOf >= 0) {
                return (immutableList.size() - 1) - iIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.Z.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return listIterator(i2);
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] X;

        public SerializedForm(Object[] objArr) {
            this.X = objArr;
        }

        public Object readResolve() {
            return ImmutableList.v(this.X);
        }
    }

    public class SubList extends ImmutableList<E> {
        public final transient int Z;
        public final transient int e0;

        public SubList(int i2, int i3) {
            this.Z = i2;
            this.e0 = i3;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: E */
        public final ImmutableList subList(int i2, int i3) {
            Preconditions.l(i2, i3, this.e0);
            int i4 = this.Z;
            return ImmutableList.this.subList(i2 + i4, i3 + i4);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final Object[] g() {
            return ImmutableList.this.g();
        }

        @Override // java.util.List
        public final Object get(int i2) {
            Preconditions.i(i2, this.e0);
            return ImmutableList.this.get(i2 + this.Z);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int h() {
            return ImmutableList.this.i() + this.Z + this.e0;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int i() {
            return ImmutableList.this.i() + this.Z;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.e0;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return listIterator(i2);
        }
    }

    public static ImmutableList A(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ObjectArrays.a(2, objArr);
        return p(2, objArr);
    }

    public static ImmutableList B(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        Preconditions.e("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        ObjectArrays.a(length, objArr2);
        return p(length, objArr2);
    }

    public static ImmutableList D(Ordering ordering, Collection collection) {
        ordering.getClass();
        Object[] array = (collection instanceof Collection ? collection : Lists.a(collection.iterator())).toArray();
        ObjectArrays.a(array.length, array);
        Arrays.sort(array, ordering);
        return p(array.length, array);
    }

    public static ImmutableList p(int i2, Object[] objArr) {
        return i2 == 0 ? RegularImmutableList.f0 : new RegularImmutableList(objArr, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static Builder s() {
        return new Builder(4);
    }

    public static Builder t(int i2) {
        CollectPreconditions.b(i2, "expectedSize");
        return new Builder(i2);
    }

    public static ImmutableList u(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            Object[] array = collection.toArray();
            ObjectArrays.a(array.length, array);
            return p(array.length, array);
        }
        ImmutableList immutableListD = ((ImmutableCollection) collection).d();
        if (!immutableListD.l()) {
            return immutableListD;
        }
        Object[] array2 = immutableListD.toArray(ImmutableCollection.X);
        return p(array2.length, array2);
    }

    public static ImmutableList v(Object[] objArr) {
        if (objArr.length == 0) {
            return RegularImmutableList.f0;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        ObjectArrays.a(objArr2.length, objArr2);
        return p(objArr2.length, objArr2);
    }

    public static ImmutableList x() {
        return RegularImmutableList.f0;
    }

    public static ImmutableList y(Long l2, Long l3, Long l4, Long l5, Long l6) {
        Object[] objArr = {l2, l3, l4, l5, l6};
        ObjectArrays.a(5, objArr);
        return p(5, objArr);
    }

    public static ImmutableList z(Object obj) {
        Object[] objArr = {obj};
        ObjectArrays.a(1, objArr);
        return p(1, objArr);
    }

    public ImmutableList C() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: E */
    public ImmutableList subList(int i2, int i3) {
        Preconditions.l(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        return i4 == 0 ? RegularImmutableList.f0 : new SubList(i2, i4);
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList d() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int e(int i2, Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && Objects.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        if (Objects.a(get(i2), list.get(i2))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~(get(i3).hashCode() + (i2 * 31)));
        }
        return i2;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: o */
    public final UnmodifiableIterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public UnmodifiableListIterator listIterator(int i2) {
        Preconditions.k(i2, size());
        return isEmpty() ? f19830Y : new Itr(i2, this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.X));
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }
}
