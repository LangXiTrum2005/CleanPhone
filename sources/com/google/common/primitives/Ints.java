package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Ints extends IntsMethodsForWeb {

    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final int[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f20059Y;
        public final int Z;

        public IntArrayAsList(int[] iArr, int i2, int i3) {
            this.X = iArr;
            this.f20059Y = i2;
            this.Z = i3;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f20059Y;
            while (i2 < this.Z) {
                if (this.X[i2] == iIntValue) {
                    if (i2 != -1) {
                        return true;
                    }
                    return false;
                }
                i2++;
            }
            i2 = -1;
            if (i2 != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.X[this.f20059Y + i2] != intArrayAsList.X[intArrayAsList.f20059Y + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            Preconditions.i(i2, size());
            return Integer.valueOf(this.X[this.f20059Y + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i2 = 1;
            for (int i3 = this.f20059Y; i3 < this.Z; i3++) {
                i2 = (i2 * 31) + this.X[i3];
            }
            return i2;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001f  */
        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int i2 = this.f20059Y;
                int i3 = i2;
                while (i3 < this.Z) {
                    if (this.X[i3] != iIntValue) {
                        i3++;
                    } else if (i3 >= 0) {
                        return i3 - i2;
                    }
                }
                i3 = -1;
                if (i3 >= 0) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i2;
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int i3 = this.Z;
                do {
                    i3--;
                    i2 = this.f20059Y;
                    if (i3 < i2) {
                        i3 = -1;
                        break;
                    }
                } while (this.X[i3] != iIntValue);
                if (i3 >= 0) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i2, Object obj) {
            Integer num = (Integer) obj;
            Preconditions.i(i2, size());
            int i3 = this.f20059Y + i2;
            int[] iArr = this.X;
            int i4 = iArr[i3];
            num.getClass();
            iArr[i3] = num.intValue();
            return Integer.valueOf(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.Z - this.f20059Y;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i2, int i3) {
            Preconditions.l(i2, i3, size());
            if (i2 == i3) {
                return Collections.EMPTY_LIST;
            }
            int i4 = this.f20059Y;
            return new IntArrayAsList(this.X, i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            int[] iArr = this.X;
            int i2 = this.f20059Y;
            sb.append(iArr[i2]);
            while (true) {
                i2++;
                if (i2 >= this.Z) {
                    sb.append(AbstractJsonLexerKt.END_LIST);
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(iArr[i2]);
            }
        }
    }

    public static final class IntConverter extends Converter<String, Integer> implements Serializable {
        public static final Converter X = new IntConverter();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return X;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            return Integer.decode((String) obj);
        }

        public final String toString() {
            return "Ints.stringConverter()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<int[]> {
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
        public final int compare(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int iMin = Math.min(iArr3.length, iArr4.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int i3 = iArr3[i2];
                int i4 = iArr4[i2];
                int i5 = i3 < i4 ? -1 : i3 > i4 ? 1 : 0;
                if (i5 != 0) {
                    return i5;
                }
            }
            return iArr3.length - iArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new IntArrayAsList(iArr, 0, iArr.length);
    }

    public static int b(long j) {
        int i2 = (int) j;
        Preconditions.d(j, ((long) i2) == j, "Out of range: %s");
        return i2;
    }

    public static int c(int i2, int i3) {
        Preconditions.b(i3, 1073741823, "min (%s) must be less than or equal to max (%s)", i3 <= 1073741823);
        return Math.min(Math.max(i2, i3), 1073741823);
    }

    public static int d(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((b4 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b5 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static int e(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] f(Collection collection) {
        if (collection instanceof IntArrayAsList) {
            IntArrayAsList intArrayAsList = (IntArrayAsList) collection;
            return Arrays.copyOfRange(intArrayAsList.X, intArrayAsList.f20059Y, intArrayAsList.Z);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    public static Integer g(String str) {
        byte b2;
        Long lValueOf;
        byte b3;
        str.getClass();
        if (!str.isEmpty()) {
            int i2 = str.charAt(0) == '-' ? 1 : 0;
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt < 128) {
                    b2 = Longs.AsciiDigits.f20060a[cCharAt];
                } else {
                    byte[] bArr = Longs.AsciiDigits.f20060a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10) {
                    long j = -b2;
                    long j2 = 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i3 >= str.length()) {
                            if (i2 == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i4 = i3 + 1;
                        char cCharAt2 = str.charAt(i3);
                        if (cCharAt2 < 128) {
                            b3 = Longs.AsciiDigits.f20060a[cCharAt2];
                        } else {
                            byte[] bArr2 = Longs.AsciiDigits.f20060a;
                            b3 = -1;
                        }
                        if (b3 >= 0 && b3 < 10 && j >= j3) {
                            long j4 = j * j2;
                            int i5 = i2;
                            long j5 = b3;
                            if (j4 >= j5 - Long.MIN_VALUE) {
                                j = j4 - j5;
                                i3 = i4;
                                i2 = i5;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }
}
