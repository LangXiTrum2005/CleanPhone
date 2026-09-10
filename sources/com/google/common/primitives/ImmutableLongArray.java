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
public final class ImmutableLongArray implements Serializable {
    public static final ImmutableLongArray e0 = new ImmutableLongArray(new long[0], 0, 0);
    public final long[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final transient int f20056Y;
    public final int Z;

    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {
        public final ImmutableLongArray X;

        public AsList(ImmutableLongArray immutableLongArray) {
            this.X = immutableLongArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z2 = obj instanceof AsList;
            ImmutableLongArray immutableLongArray = this.X;
            if (z2) {
                return immutableLongArray.equals(((AsList) obj).X);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableLongArray.d() != list.size()) {
                return false;
            }
            int i2 = immutableLongArray.f20056Y;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i3 = i2 + 1;
                    if (immutableLongArray.X[i2] == ((Long) obj2).longValue()) {
                        i2 = i3;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            ImmutableLongArray immutableLongArray = this.X;
            Preconditions.i(i2, immutableLongArray.d());
            return Long.valueOf(immutableLongArray.X[immutableLongArray.f20056Y + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Long) {
                long jLongValue = ((Long) obj).longValue();
                ImmutableLongArray immutableLongArray = this.X;
                int i2 = immutableLongArray.f20056Y;
                for (int i3 = i2; i3 < immutableLongArray.Z; i3++) {
                    if (immutableLongArray.X[i3] == jLongValue) {
                        return i3 - i2;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i2;
            if (obj instanceof Long) {
                long jLongValue = ((Long) obj).longValue();
                ImmutableLongArray immutableLongArray = this.X;
                int i3 = immutableLongArray.Z;
                do {
                    i3--;
                    i2 = immutableLongArray.f20056Y;
                    if (i3 >= i2) {
                    }
                } while (immutableLongArray.X[i3] != jLongValue);
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
            ImmutableLongArray immutableLongArray;
            ImmutableLongArray immutableLongArray2 = this.X;
            Preconditions.l(i2, i3, immutableLongArray2.d());
            if (i2 == i3) {
                immutableLongArray = ImmutableLongArray.e0;
            } else {
                int i4 = immutableLongArray2.f20056Y;
                immutableLongArray = new ImmutableLongArray(immutableLongArray2.X, i2 + i4, i4 + i3);
            }
            return new AsList(immutableLongArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.X.toString();
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long[] f20057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20058b;
    }

    public ImmutableLongArray(long[] jArr, int i2, int i3) {
        this.X = jArr;
        this.f20056Y = i2;
        this.Z = i3;
    }

    public final int d() {
        return this.Z - this.f20056Y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableLongArray) {
            ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
            if (d() == immutableLongArray.d()) {
                for (int i2 = 0; i2 < d(); i2++) {
                    Preconditions.i(i2, d());
                    long j = this.X[this.f20056Y + i2];
                    Preconditions.i(i2, immutableLongArray.d());
                    if (j == immutableLongArray.X[immutableLongArray.f20056Y + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = 1;
        for (int i2 = this.f20056Y; i2 < this.Z; i2++) {
            iA = (iA * 31) + Longs.a(this.X[i2]);
        }
        return iA;
    }

    public Object readResolve() {
        return this.Z == this.f20056Y ? e0 : this;
    }

    public final String toString() {
        int i2 = this.f20056Y;
        int i3 = this.Z;
        if (i3 == i2) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(d() * 5);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        long[] jArr = this.X;
        sb.append(jArr[i2]);
        while (true) {
            i2++;
            if (i2 >= i3) {
                sb.append(AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            sb.append(", ");
            sb.append(jArr[i2]);
        }
    }

    public Object writeReplace() {
        int i2 = this.Z;
        long[] jArr = this.X;
        int i3 = this.f20056Y;
        if (i3 <= 0 && i2 >= jArr.length) {
            return this;
        }
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i3, i2);
        return new ImmutableLongArray(jArrCopyOfRange, 0, jArrCopyOfRange.length);
    }
}
