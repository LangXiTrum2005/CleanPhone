package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Booleans {

    public static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f20047Y;

        public BooleanArrayAsList(int i2, int i3) {
            this.X = i2;
            this.f20047Y = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            ((Boolean) obj).booleanValue();
            if (this.X >= this.f20047Y) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            int size = size();
            if (((BooleanArrayAsList) obj).size() != size) {
                return false;
            }
            if (size <= 0) {
                return true;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            Preconditions.i(i2, size());
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            if (this.X >= this.f20047Y) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            ((Boolean) obj).booleanValue();
            if (this.X >= this.f20047Y) {
                return -1;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            ((Boolean) obj).booleanValue();
            if (this.f20047Y - 1 < this.X) {
                return -1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i2, Object obj) {
            Preconditions.i(i2, size());
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f20047Y - this.X;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i2, int i3) {
            Preconditions.l(i2, i3, size());
            if (i2 == i3) {
                return Collections.EMPTY_LIST;
            }
            int i4 = this.X;
            return new BooleanArrayAsList(i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 7);
            throw null;
        }
    }

    public enum BooleanComparator implements Comparator<Boolean> {
        /* JADX INFO: Fake field, exist only in values array */
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        /* JADX INFO: Fake field, exist only in values array */
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final String f20048Y;

        BooleanComparator(int i2, String str) {
            this.X = i2;
            this.f20048Y = str;
        }

        @Override // java.util.Comparator
        public final int compare(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool2;
            boolean zBooleanValue = bool.booleanValue();
            int i2 = this.X;
            return (bool3.booleanValue() ? i2 : 0) - (zBooleanValue ? i2 : 0);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f20048Y;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<boolean[]> {
        public static final /* synthetic */ LexicographicalComparator[] X = {new LexicographicalComparator("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        LexicographicalComparator EF5;

        public static LexicographicalComparator valueOf(String str) {
            return (LexicographicalComparator) Enum.valueOf(LexicographicalComparator.class, str);
        }

        public static LexicographicalComparator[] values() {
            return (LexicographicalComparator[]) X.clone();
        }

        @Override // java.util.Comparator
        public final int compare(boolean[] zArr, boolean[] zArr2) {
            boolean[] zArr3 = zArr;
            boolean[] zArr4 = zArr2;
            int iMin = Math.min(zArr3.length, zArr4.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                boolean z2 = zArr3[i2];
                int i3 = z2 == zArr4[i2] ? 0 : z2 ? 1 : -1;
                if (i3 != 0) {
                    return i3;
                }
            }
            return zArr3.length - zArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }
}
