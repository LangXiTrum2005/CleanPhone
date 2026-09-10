package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
@Immutable
public final class ImmutableDoubleArray implements Serializable {
    public static final ImmutableDoubleArray e0 = new ImmutableDoubleArray(new double[0], 0, 0);
    public final double[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final transient int f20054Y;
    public final int Z;

    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        public final ImmutableDoubleArray X;

        public AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.X = immutableDoubleArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z2 = obj instanceof AsList;
            ImmutableDoubleArray immutableDoubleArray = this.X;
            if (z2) {
                return immutableDoubleArray.equals(((AsList) obj).X);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableDoubleArray.d() != list.size()) {
                return false;
            }
            int i2 = immutableDoubleArray.f20054Y;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i3 = i2 + 1;
                    if (ImmutableDoubleArray.a(immutableDoubleArray.X[i2], ((Double) obj2).doubleValue())) {
                        i2 = i3;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            ImmutableDoubleArray immutableDoubleArray = this.X;
            Preconditions.i(i2, immutableDoubleArray.d());
            return Double.valueOf(immutableDoubleArray.X[immutableDoubleArray.f20054Y + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                ImmutableDoubleArray immutableDoubleArray = this.X;
                int i2 = immutableDoubleArray.f20054Y;
                for (int i3 = i2; i3 < immutableDoubleArray.Z; i3++) {
                    if (ImmutableDoubleArray.a(immutableDoubleArray.X[i3], dDoubleValue)) {
                        return i3 - i2;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i2;
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                ImmutableDoubleArray immutableDoubleArray = this.X;
                int i3 = immutableDoubleArray.Z;
                do {
                    i3--;
                    i2 = immutableDoubleArray.f20054Y;
                    if (i3 >= i2) {
                    }
                } while (!ImmutableDoubleArray.a(immutableDoubleArray.X[i3], dDoubleValue));
                return i3 - i2;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.X.d();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i2, int i3) {
            ImmutableDoubleArray immutableDoubleArray;
            ImmutableDoubleArray immutableDoubleArray2 = this.X;
            Preconditions.l(i2, i3, immutableDoubleArray2.d());
            if (i2 == i3) {
                immutableDoubleArray = ImmutableDoubleArray.e0;
            } else {
                int i4 = immutableDoubleArray2.f20054Y;
                immutableDoubleArray = new ImmutableDoubleArray(immutableDoubleArray2.X, i2 + i4, i4 + i3);
            }
            return new AsList(immutableDoubleArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.X.toString();
        }
    }

    public static final class Builder {
    }

    public ImmutableDoubleArray(double[] dArr, int i2, int i3) {
        this.X = dArr;
        this.f20054Y = i2;
        this.Z = i3;
    }

    public static boolean a(double d, double d2) {
        return Double.doubleToLongBits(d) == Double.doubleToLongBits(d2);
    }

    public final int d() {
        return this.Z - this.f20054Y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableDoubleArray) {
            ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
            if (d() == immutableDoubleArray.d()) {
                for (int i2 = 0; i2 < d(); i2++) {
                    Preconditions.i(i2, d());
                    double d = this.X[this.f20054Y + i2];
                    Preconditions.i(i2, immutableDoubleArray.d());
                    if (a(d, immutableDoubleArray.X[immutableDoubleArray.f20054Y + i2])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i2 = this.f20054Y; i2 < this.Z; i2++) {
            double d = this.X[i2];
            int i3 = Doubles.f20051a;
            iHashCode = (iHashCode * 31) + Double.valueOf(d).hashCode();
        }
        return iHashCode;
    }

    public Object readResolve() {
        return this.Z == this.f20054Y ? e0 : this;
    }

    public final String toString() {
        int i2 = this.f20054Y;
        int i3 = this.Z;
        if (i3 == i2) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(d() * 5);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        double[] dArr = this.X;
        sb.append(dArr[i2]);
        while (true) {
            i2++;
            if (i2 >= i3) {
                sb.append(AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            sb.append(", ");
            sb.append(dArr[i2]);
        }
    }

    public Object writeReplace() {
        int i2 = this.Z;
        double[] dArr = this.X;
        int i3 = this.f20054Y;
        if (i3 <= 0 && i2 >= dArr.length) {
            return this;
        }
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i3, i2);
        return new ImmutableDoubleArray(dArrCopyOfRange, 0, dArrCopyOfRange.length);
    }
}
