package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Longs {

    public static final class AsciiDigits {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte[] f20060a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i2 = 0; i2 < 10; i2++) {
                bArr[i2 + 48] = (byte) i2;
            }
            for (int i3 = 0; i3 < 26; i3++) {
                byte b2 = (byte) (i3 + 10);
                bArr[i3 + 65] = b2;
                bArr[i3 + 97] = b2;
            }
            f20060a = bArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<long[]> {
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
        public final int compare(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int iMin = Math.min(jArr3.length, jArr4.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                long j = jArr3[i2];
                long j2 = jArr4[i2];
                int i3 = j < j2 ? -1 : j > j2 ? 1 : 0;
                if (i3 != 0) {
                    return i3;
                }
            }
            return jArr3.length - jArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f20061Y;

        public LongArrayAsList(int i2, int i3) {
            this.X = i2;
            this.f20061Y = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            ((Long) obj).longValue();
            if (this.X >= this.f20061Y) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            int size = size();
            if (((LongArrayAsList) obj).size() != size) {
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
            if (this.X >= this.f20061Y) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            ((Long) obj).longValue();
            if (this.X >= this.f20061Y) {
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
            if (!(obj instanceof Long)) {
                return -1;
            }
            ((Long) obj).longValue();
            if (this.f20061Y - 1 < this.X) {
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
            return this.f20061Y - this.X;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i2, int i3) {
            Preconditions.l(i2, i3, size());
            if (i2 == i3) {
                return Collections.EMPTY_LIST;
            }
            int i4 = this.X;
            return new LongArrayAsList(i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 10).append(AbstractJsonLexerKt.BEGIN_LIST);
            throw null;
        }
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {
        public static final Converter X = new LongConverter();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return X;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            return Long.decode((String) obj);
        }

        public final String toString() {
            return "Longs.stringConverter()";
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static long b(long... jArr) {
        Preconditions.f(jArr.length > 0);
        long j = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }
}
