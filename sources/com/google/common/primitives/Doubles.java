package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Doubles extends DoublesMethodsForWeb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20051a = 0;

    public static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f20052Y;

        public DoubleArrayAsList(int i2, int i3) {
            this.X = i2;
            this.f20052Y = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Double)) {
                return false;
            }
            ((Double) obj).doubleValue();
            int i2 = Doubles.f20051a;
            if (this.X >= this.f20052Y) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DoubleArrayAsList)) {
                return super.equals(obj);
            }
            int size = size();
            if (((DoubleArrayAsList) obj).size() != size) {
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
            if (this.X >= this.f20052Y) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            ((Double) obj).doubleValue();
            int i2 = Doubles.f20051a;
            if (this.X >= this.f20052Y) {
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
            if (!(obj instanceof Double)) {
                return -1;
            }
            ((Double) obj).doubleValue();
            int i2 = Doubles.f20051a;
            if (this.f20052Y - 1 < this.X) {
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
            return this.f20052Y - this.X;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i2, int i3) {
            Preconditions.l(i2, i3, size());
            if (i2 == i3) {
                return Collections.EMPTY_LIST;
            }
            int i4 = this.X;
            return new DoubleArrayAsList(i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 12).append(AbstractJsonLexerKt.BEGIN_LIST);
            throw null;
        }
    }

    public static final class DoubleConverter extends Converter<String, Double> implements Serializable {
        public static final Converter X = new DoubleConverter();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return X;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            return Double.valueOf((String) obj);
        }

        public final String toString() {
            return "Doubles.stringConverter()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<double[]> {
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
        public final int compare(double[] dArr, double[] dArr2) {
            double[] dArr3 = dArr;
            double[] dArr4 = dArr2;
            int iMin = Math.min(dArr3.length, dArr4.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iCompare = Double.compare(dArr3[i2], dArr4[i2]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return dArr3.length - dArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    static {
        Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", "+"));
    }
}
