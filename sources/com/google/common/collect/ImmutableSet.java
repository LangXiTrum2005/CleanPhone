package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public static final /* synthetic */ int Z = 0;
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient ImmutableList f19855Y;

    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Builder c(Object obj) {
            obj.getClass();
            super.c(obj);
            return this;
        }

        public Builder i(Object... objArr) {
            d(objArr.length, objArr);
            return this;
        }

        public Builder j(Iterable iterable) {
            iterable.getClass();
            e(iterable);
            return this;
        }

        public ImmutableSet k() {
            int i2 = this.f19827b;
            if (i2 == 0) {
                int i3 = ImmutableSet.Z;
                return RegularImmutableSet.k0;
            }
            if (i2 != 1) {
                ImmutableSet immutableSetT = ImmutableSet.t(i2, this.f19826a);
                this.f19827b = immutableSetT.size();
                this.f19828c = true;
                return immutableSetT;
            }
            Object obj = this.f19826a[0];
            Objects.requireNonNull(obj);
            int i4 = ImmutableSet.Z;
            return new SingletonImmutableSet(obj);
        }

        public Builder l(Builder builder) {
            d(builder.f19827b, builder.f19826a);
            return this;
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] X;

        public SerializedForm(Object[] objArr) {
            this.X = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.v(this.X);
        }
    }

    public static ImmutableSet A(String str, String str2, String str3) {
        return t(3, str, str2, str3);
    }

    public static Builder p() {
        return new Builder(4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static int s(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            Preconditions.e("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static ImmutableSet t(int i2, Object... objArr) {
        if (i2 == 0) {
            return RegularImmutableSet.k0;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new SingletonImmutableSet(obj);
        }
        int iS = s(i2);
        Object[] objArr2 = new Object[iS];
        int i3 = iS - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj2 = objArr[i6];
            if (obj2 == null) {
                throw new NullPointerException(android.support.v4.media.a.h(i6, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iB = Hashing.b(iHashCode);
            while (true) {
                int i7 = iB & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new SingletonImmutableSet(obj4);
        }
        if (s(i5) < iS / 2) {
            return t(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new RegularImmutableSet(objArr, i4, objArr2, i3, i5);
    }

    public static ImmutableSet u(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.l()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    public static ImmutableSet v(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? t(objArr.length, (Object[]) objArr.clone()) : new SingletonImmutableSet(objArr[0]);
        }
        return RegularImmutableSet.k0;
    }

    public static ImmutableSet y() {
        return RegularImmutableSet.k0;
    }

    public static ImmutableSet z(String str) {
        return new SingletonImmutableSet(str);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList d() {
        ImmutableList immutableList = this.f19855Y;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList immutableListW = w();
        this.f19855Y = immutableListW;
        return immutableListW;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && x() && ((ImmutableSet) obj).x() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.e(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public ImmutableList w() {
        Object[] array = toArray(ImmutableCollection.X);
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        return ImmutableList.p(array.length, array);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.X));
    }

    public boolean x() {
        return this instanceof EmptyContiguousSet;
    }
}
