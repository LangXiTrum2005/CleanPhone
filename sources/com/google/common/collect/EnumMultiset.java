package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 0;
    public transient Class Z;
    public transient Enum[] e0;
    public transient int[] f0;
    public transient int g0;
    public transient long h0;

    public abstract class Itr<T> implements Iterator<T> {
        public int X = 0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19816Y = -1;

        public Itr() {
        }

        public abstract Object a(int i2);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (true) {
                int i2 = this.X;
                EnumMultiset enumMultiset = EnumMultiset.this;
                if (i2 >= enumMultiset.e0.length) {
                    return false;
                }
                if (enumMultiset.f0[i2] > 0) {
                    return true;
                }
                this.X = i2 + 1;
            }
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objA = a(this.X);
            int i2 = this.X;
            this.f19816Y = i2;
            this.X = i2 + 1;
            return objA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.f19816Y >= 0);
            EnumMultiset enumMultiset = EnumMultiset.this;
            int[] iArr = enumMultiset.f0;
            int i2 = this.f19816Y;
            int i3 = iArr[i2];
            if (i3 > 0) {
                enumMultiset.g0--;
                enumMultiset.h0 -= (long) i3;
                iArr[i2] = 0;
            }
            this.f19816Y = -1;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Class cls = (Class) object;
        this.Z = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.e0 = enumArr;
        this.f0 = new int[enumArr.length];
        Serialization.d(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.Z);
        Serialization.g(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int Q0(Object obj) {
        Enum r6 = (Enum) obj;
        o(r6);
        CollectPreconditions.b(0, "count");
        int iOrdinal = r6.ordinal();
        int[] iArr = this.f0;
        int i2 = iArr[iOrdinal];
        iArr[iOrdinal] = 0;
        this.h0 += (long) (0 - i2);
        if (i2 > 0) {
            this.g0--;
        }
        return i2;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i2, Object obj) {
        Enum r9 = (Enum) obj;
        o(r9);
        CollectPreconditions.b(i2, "occurrences");
        if (i2 == 0) {
            return w0(r9);
        }
        int iOrdinal = r9.ordinal();
        int i3 = this.f0[iOrdinal];
        long j = i2;
        long j2 = ((long) i3) + j;
        Preconditions.d(j2, j2 <= 2147483647L, "too many occurrences: %s");
        this.f0[iOrdinal] = (int) j2;
        if (i3 == 0) {
            this.g0++;
        }
        this.h0 += j;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Arrays.fill(this.f0, 0);
        this.h0 = 0L;
        this.g0 = 0;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int h() {
        return this.g0;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator i() {
        return new EnumMultiset<Enum<Object>>.Itr<Enum<Object>>() { // from class: com.google.common.collect.EnumMultiset.1
            @Override // com.google.common.collect.EnumMultiset.Itr
            public final Object a(int i2) {
                return EnumMultiset.this.e0[i2];
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator l() {
        return new EnumMultiset<Enum<Object>>.Itr<Multiset.Entry<Enum<Object>>>() { // from class: com.google.common.collect.EnumMultiset.2
            @Override // com.google.common.collect.EnumMultiset.Itr
            public final Object a(final int i2) {
                return new Multisets.AbstractEntry<Enum<Object>>() { // from class: com.google.common.collect.EnumMultiset.2.1
                    @Override // com.google.common.collect.Multiset.Entry
                    public final Object d() {
                        return EnumMultiset.this.e0[i2];
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public final int getCount() {
                        return EnumMultiset.this.f0[i2];
                    }
                };
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int m(int i2, Object obj) {
        if (obj != null && p(obj)) {
            Enum r1 = (Enum) obj;
            CollectPreconditions.b(i2, "occurrences");
            if (i2 == 0) {
                return w0(obj);
            }
            int iOrdinal = r1.ordinal();
            int[] iArr = this.f0;
            int i3 = iArr[iOrdinal];
            if (i3 != 0) {
                if (i3 > i2) {
                    iArr[iOrdinal] = i3 - i2;
                    this.h0 -= (long) i2;
                    return i3;
                }
                iArr[iOrdinal] = 0;
                this.g0--;
                this.h0 -= (long) i3;
                return i3;
            }
        }
        return 0;
    }

    public final void o(Object obj) {
        obj.getClass();
        if (p(obj)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.Z + " but got " + obj);
    }

    public final boolean p(Object obj) {
        if (obj instanceof Enum) {
            Enum r5 = (Enum) obj;
            int iOrdinal = r5.ordinal();
            Enum[] enumArr = this.e0;
            if (iOrdinal < enumArr.length && enumArr[iOrdinal] == r5) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return Ints.e(this.h0);
    }

    @Override // com.google.common.collect.Multiset
    public final int w0(Object obj) {
        if (obj == null || !p(obj)) {
            return 0;
        }
        return this.f0[((Enum) obj).ordinal()];
    }
}
