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
public final class ImmutableIntArray implements Serializable {
    public static final ImmutableIntArray e0 = new ImmutableIntArray(new int[0], 0, 0);
    public final int[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final transient int f20055Y;
    public final int Z;

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        public final ImmutableIntArray X;

        public AsList(ImmutableIntArray immutableIntArray) {
            this.X = immutableIntArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z2 = obj instanceof AsList;
            ImmutableIntArray immutableIntArray = this.X;
            if (z2) {
                return immutableIntArray.equals(((AsList) obj).X);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableIntArray.d() != list.size()) {
                return false;
            }
            int i2 = immutableIntArray.f20055Y;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i3 = i2 + 1;
                    if (immutableIntArray.X[i2] == ((Integer) obj2).intValue()) {
                        i2 = i3;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            ImmutableIntArray immutableIntArray = this.X;
            Preconditions.i(i2, immutableIntArray.d());
            return Integer.valueOf(immutableIntArray.X[immutableIntArray.f20055Y + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                ImmutableIntArray immutableIntArray = this.X;
                int i2 = immutableIntArray.f20055Y;
                for (int i3 = i2; i3 < immutableIntArray.Z; i3++) {
                    if (immutableIntArray.X[i3] == iIntValue) {
                        return i3 - i2;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i2;
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                ImmutableIntArray immutableIntArray = this.X;
                int i3 = immutableIntArray.Z;
                do {
                    i3--;
                    i2 = immutableIntArray.f20055Y;
                    if (i3 >= i2) {
                    }
                } while (immutableIntArray.X[i3] != iIntValue);
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
            ImmutableIntArray immutableIntArray;
            ImmutableIntArray immutableIntArray2 = this.X;
            Preconditions.l(i2, i3, immutableIntArray2.d());
            if (i2 == i3) {
                immutableIntArray = ImmutableIntArray.e0;
            } else {
                int i4 = immutableIntArray2.f20055Y;
                immutableIntArray = new ImmutableIntArray(immutableIntArray2.X, i2 + i4, i4 + i3);
            }
            return new AsList(immutableIntArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.X.toString();
        }
    }

    public static final class Builder {
    }

    public ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public final int d() {
        return this.Z - this.f20055Y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableIntArray) {
            ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
            if (d() == immutableIntArray.d()) {
                for (int i2 = 0; i2 < d(); i2++) {
                    Preconditions.i(i2, d());
                    int i3 = this.X[this.f20055Y + i2];
                    Preconditions.i(i2, immutableIntArray.d());
                    if (i3 == immutableIntArray.X[immutableIntArray.f20055Y + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = this.f20055Y; i3 < this.Z; i3++) {
            i2 = (i2 * 31) + this.X[i3];
        }
        return i2;
    }

    public Object readResolve() {
        return this.Z == this.f20055Y ? e0 : this;
    }

    public final String toString() {
        int i2 = this.f20055Y;
        int i3 = this.Z;
        if (i3 == i2) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(d() * 5);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int[] iArr = this.X;
        sb.append(iArr[i2]);
        while (true) {
            i2++;
            if (i2 >= i3) {
                sb.append(AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i2]);
        }
    }

    public Object writeReplace() {
        int i2 = this.Z;
        int[] iArr = this.X;
        int i3 = this.f20055Y;
        return (i3 > 0 || i2 < iArr.length) ? new ImmutableIntArray(Arrays.copyOfRange(iArr, i3, i2)) : this;
    }

    public ImmutableIntArray(int[] iArr, int i2, int i3) {
        this.X = iArr;
        this.f20055Y = i2;
        this.Z = i3;
    }
}
