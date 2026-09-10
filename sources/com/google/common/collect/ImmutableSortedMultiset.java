package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedMultiset<E> extends ImmutableMultiset<E> implements SortedMultiset<E> {
    public static final /* synthetic */ int g0 = 0;
    private static final long serialVersionUID = 912559;
    public transient ImmutableSortedMultiset f0;

    public static class Builder<E> extends ImmutableMultiset.Builder<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Comparator f19858c;
        public Object[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f19859e;
        public int f;
        public boolean g;

        public Builder(Comparator comparator) {
            this.f19850b = false;
            this.f19849a = null;
            comparator.getClass();
            this.f19858c = comparator;
            this.d = new Object[4];
            this.f19859e = new int[4];
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public final ImmutableCollection.Builder b(Object obj) {
            f(1, obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        /* JADX INFO: renamed from: c */
        public final ImmutableMultiset.Builder b(Object obj) {
            f(1, obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public final /* bridge */ /* synthetic */ ImmutableMultiset.Builder d(int i2, Object obj) {
            f(i2, obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public final /* bridge */ /* synthetic */ ImmutableMultiset e() {
            throw null;
        }

        public final void f(int i2, Object obj) {
            obj.getClass();
            CollectPreconditions.b(i2, "occurrences");
            if (i2 == 0) {
                return;
            }
            int i3 = this.f;
            Object[] objArr = this.d;
            if (i3 == objArr.length) {
                g(true);
            } else if (this.g) {
                this.d = Arrays.copyOf(objArr, objArr.length);
            }
            this.g = false;
            Object[] objArr2 = this.d;
            int i4 = this.f;
            objArr2[i4] = obj;
            this.f19859e[i4] = i2;
            this.f = i4 + 1;
        }

        public final void g(boolean z2) {
            int i2 = this.f;
            if (i2 == 0) {
                return;
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.d, i2);
            Comparator comparator = this.f19858c;
            Arrays.sort(objArrCopyOf, comparator);
            int i3 = 1;
            for (int i4 = 1; i4 < objArrCopyOf.length; i4++) {
                if (comparator.compare(objArrCopyOf[i3 - 1], objArrCopyOf[i4]) < 0) {
                    objArrCopyOf[i3] = objArrCopyOf[i4];
                    i3++;
                }
            }
            Arrays.fill(objArrCopyOf, i3, this.f, (Object) null);
            if (z2) {
                int i5 = i3 * 4;
                int i6 = this.f;
                if (i5 > i6 * 3) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Ints.e(((long) i6) + ((long) ((i6 / 2) + 1))));
                }
            }
            int[] iArr = new int[objArrCopyOf.length];
            for (int i7 = 0; i7 < this.f; i7++) {
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, 0, i3, this.d[i7], comparator);
                int i8 = this.f19859e[i7];
                if (i8 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i8;
                } else {
                    iArr[iBinarySearch] = ~i8;
                }
            }
            this.d = objArrCopyOf;
            this.f19859e = iArr;
            this.f = i3;
        }
    }

    public static final class SerializedForm<E> implements Serializable {
        public final Comparator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Object[] f19860Y;
        public final int[] Z;

        public SerializedForm(ImmutableSortedMultiset immutableSortedMultiset) {
            this.X = immutableSortedMultiset.comparator();
            int size = immutableSortedMultiset.entrySet().size();
            this.f19860Y = new Object[size];
            this.Z = new int[size];
            int i2 = 0;
            for (Multiset.Entry entry : immutableSortedMultiset.entrySet()) {
                this.f19860Y[i2] = entry.d();
                this.Z[i2] = entry.getCount();
                i2++;
            }
        }

        public Object readResolve() {
            int i2;
            Object[] objArr = this.f19860Y;
            int length = objArr.length;
            Builder builder = new Builder(this.X);
            for (int i3 = 0; i3 < length; i3++) {
                builder.f(this.Z[i3], objArr[i3]);
            }
            builder.g(false);
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i2 = builder.f;
                if (i4 >= i2) {
                    break;
                }
                int[] iArr = builder.f19859e;
                int i6 = iArr[i4];
                if (i6 > 0) {
                    Object[] objArr2 = builder.d;
                    objArr2[i5] = objArr2[i4];
                    iArr[i5] = i6;
                    i5++;
                }
                i4++;
            }
            Arrays.fill(builder.d, i5, i2, (Object) null);
            Arrays.fill(builder.f19859e, i5, builder.f, 0);
            builder.f = i5;
            Comparator comparator = builder.f19858c;
            if (i5 == 0) {
                int i7 = ImmutableSortedMultiset.g0;
                return NaturalOrdering.Z.equals(comparator) ? RegularImmutableSortedMultiset.m0 : new RegularImmutableSortedMultiset(comparator);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.B(comparator, i5, builder.d);
            long[] jArr = new long[builder.f + 1];
            int i8 = 0;
            while (i8 < builder.f) {
                int i9 = i8 + 1;
                jArr[i9] = jArr[i8] + ((long) builder.f19859e[i8]);
                i8 = i9;
            }
            builder.g = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, builder.f);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return k().e0;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset n(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        Preconditions.h(k().e0.compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return z0(obj, boundType).t0(obj2, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset q() {
        ImmutableSortedMultiset descendingImmutableSortedMultiset = this.f0;
        if (descendingImmutableSortedMultiset == null) {
            if (isEmpty()) {
                Ordering orderingJ = Ordering.b(k().e0).j();
                descendingImmutableSortedMultiset = NaturalOrdering.Z.equals(orderingJ) ? RegularImmutableSortedMultiset.m0 : new RegularImmutableSortedMultiset(orderingJ);
            } else {
                descendingImmutableSortedMultiset = new DescendingImmutableSortedMultiset(this);
            }
            this.f0 = descendingImmutableSortedMultiset;
        }
        return descendingImmutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: w */
    public abstract ImmutableSortedSet k();

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: x */
    public abstract ImmutableSortedMultiset t0(Object obj, BoundType boundType);

    @Override // com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: y */
    public abstract ImmutableSortedMultiset z0(Object obj, BoundType boundType);
}
