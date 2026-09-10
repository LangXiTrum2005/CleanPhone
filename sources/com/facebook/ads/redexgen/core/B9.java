package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public final class B9<K, V> extends AbstractC2752oX<K, V> {
    public static String[] A03 = {"BLd", "8EKeVjTJIU6MDNPM6ZTo", "HWbOsw9VtzWta1ewMSd8SFleZB3uycJV", "4g", "oHZcZe8PYtJP7zuLK1jInYJjmOVWCxEe", "hqSXyAZ2zuGNDHd4PkKakj6NBzhfvhom", "1gwnz8jAk7EqAxYvZHDnpar6edM6d04", "wfrdBhaNwCqY"};
    public static final AbstractC2752oX<Object, Object> A04 = new B9(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient Object[] A00;
    public final transient int A01;

    @CheckForNull
    public final transient Object A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <K, V> B9<K, V> A00(int n2, Object[] alternatingKeysAndValues, C2750oV<K, V> builder) {
        Object obj;
        if (n2 == 0) {
            return (B9) A04;
        }
        if (n2 == 1) {
            AbstractC2677nJ.A03(Objects.requireNonNull(alternatingKeysAndValues[0]), Objects.requireNonNull(alternatingKeysAndValues[1]));
            return new B9<>(null, alternatingKeysAndValues, 1);
        }
        AbstractC2530ki.A01(n2, alternatingKeysAndValues.length >> 1);
        Object objA02 = A02(alternatingKeysAndValues, n2, BO.A03(n2), 0);
        if (objA02 instanceof Object[]) {
            Object[] objArr = (Object[]) objA02;
            C2749oU c2749oU = (C2749oU) objArr[2];
            if (builder == null) {
                throw c2749oU.A02();
            }
            builder.A01 = c2749oU;
            obj = objArr[0];
            n2 = ((Integer) objArr[1]).intValue();
            alternatingKeysAndValues = Arrays.copyOf(alternatingKeysAndValues, n2 * 2);
        } else {
            obj = objA02;
        }
        return new B9<>(obj, alternatingKeysAndValues, n2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    public B9(@CheckForNull Object hashTable, Object[] alternatingKeysAndValues, int size) {
        this.A02 = hashTable;
        this.A00 = alternatingKeysAndValues;
        this.A01 = size;
    }

    @CheckForNull
    public static Object A01(@CheckForNull Object hashTableObject, @CheckForNull Object[] alternatingKeysAndValues, int size, int keyOffset, Object key) {
        int keyIndex;
        if (key == null) {
            return null;
        }
        if (size == 1) {
            if (!Objects.requireNonNull(alternatingKeysAndValues[keyOffset]).equals(key)) {
                return null;
            }
            Object obj = alternatingKeysAndValues[keyOffset ^ 1];
            if (A03[3].length() == 2) {
                String[] strArr = A03;
                strArr[4] = "QVSrtcZKARogVSSTsDMErisHHhx3s08I";
                strArr[2] = "AM5zanCyyloF9oZfJSoNtkvSUtakyhf1";
                return Objects.requireNonNull(obj);
            }
        } else {
            if (hashTableObject == null) {
                return null;
            }
            if (hashTableObject instanceof byte[]) {
                String[] strArr2 = A03;
                if (strArr2[4].charAt(30) != strArr2[2].charAt(30)) {
                    String[] strArr3 = A03;
                    strArr3[0] = "33E";
                    strArr3[7] = "0IVWz8DDpNA7";
                    byte[] bArr = (byte[]) hashTableObject;
                    int mask = bArr.length - 1;
                    int iA00 = AbstractC2737oI.A00(key.hashCode());
                    while (true) {
                        int i2 = iA00 & mask;
                        int i3 = bArr[i2];
                        String[] strArr4 = A03;
                        if (strArr4[0].length() == strArr4[7].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A03;
                        strArr5[4] = "Av4xGd01JYXCpVUXSFBX5Q3qG21nzo21";
                        strArr5[2] = "UuPO1t2w2j7pNt6wRWMrea5HC47YMJTH";
                        keyIndex = i3 & 255;
                        if (keyIndex == 255) {
                            return null;
                        }
                        boolean zEquals = key.equals(alternatingKeysAndValues[keyIndex]);
                        String[] strArr6 = A03;
                        if (strArr6[0].length() != strArr6[7].length()) {
                            A03[6] = "uEfKnUldtWRHisqrfIDf4ni9PGEoRP0";
                            if (zEquals) {
                                break;
                            }
                            iA00 = i2 + 1;
                        } else {
                            A03[1] = "rg32th7lbb1pJpYlIRnh";
                            if (zEquals) {
                                break;
                            }
                            iA00 = i2 + 1;
                        }
                    }
                    Object obj2 = alternatingKeysAndValues[keyIndex ^ 1];
                    if (A03[1].length() != 20) {
                        return obj2;
                    }
                    A03[1] = "OPXdJDLfRI5AGRwdD0N1";
                    return obj2;
                }
            } else if (hashTableObject instanceof short[]) {
                short[] sArr = (short[]) hashTableObject;
                int mask2 = sArr.length - 1;
                int iA01 = AbstractC2737oI.A00(key.hashCode());
                while (true) {
                    int i4 = iA01 & mask2;
                    int h2 = sArr[i4] & 65535;
                    if (h2 == 65535) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h2])) {
                        return alternatingKeysAndValues[h2 ^ 1];
                    }
                    iA01 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) hashTableObject;
                int mask3 = iArr.length - 1;
                int iA02 = AbstractC2737oI.A00(key.hashCode());
                while (true) {
                    int i5 = iA02 & mask3;
                    int h3 = iArr[i5];
                    if (h3 == -1) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h3])) {
                        return alternatingKeysAndValues[h3 ^ 1];
                    }
                    iA02 = i5 + 1;
                }
            }
        }
        throw new RuntimeException();
    }

    @CheckForNull
    public static Object A02(Object[] alternatingKeysAndValues, int n2, int tableSize, int keyOffset) {
        if (n2 == 1) {
            AbstractC2677nJ.A03(Objects.requireNonNull(alternatingKeysAndValues[keyOffset]), Objects.requireNonNull(alternatingKeysAndValues[keyOffset ^ 1]));
            return null;
        }
        int h2 = tableSize - 1;
        C2749oU c2749oU = null;
        int i2 = -1;
        if (tableSize > 128) {
            if (tableSize <= 32768) {
                short[] hashTable = new short[tableSize];
                Arrays.fill(hashTable, (short) -1);
                int keyIndex = 0;
                for (int i3 = 0; i3 < n2; i3++) {
                    int i4 = (i3 * 2) + keyOffset;
                    int h3 = (keyIndex * 2) + keyOffset;
                    Object value = Objects.requireNonNull(alternatingKeysAndValues[i4]);
                    Object objRequireNonNull = Objects.requireNonNull(alternatingKeysAndValues[i4 ^ 1]);
                    AbstractC2677nJ.A03(value, objRequireNonNull);
                    int iA00 = AbstractC2737oI.A00(value.hashCode());
                    while (true) {
                        int i5 = iA00 & h2;
                        int i6 = hashTable[i5] & 65535;
                        if (i6 == 65535) {
                            hashTable[i5] = (short) h3;
                            if (keyIndex < i3) {
                                alternatingKeysAndValues[h3] = value;
                                alternatingKeysAndValues[h3 ^ 1] = objRequireNonNull;
                            }
                            keyIndex++;
                            break;
                        }
                        boolean zEquals = value.equals(alternatingKeysAndValues[i6]);
                        if (A03[5].charAt(16) != 'P') {
                            throw new RuntimeException();
                        }
                        A03[5] = "XeR3XdSVagosh0VhP9e0zQ2n8NaTx8OB";
                        if (zEquals) {
                            c2749oU = new C2749oU(value, objRequireNonNull, Objects.requireNonNull(alternatingKeysAndValues[i6 ^ 1]));
                            alternatingKeysAndValues[i6 ^ 1] = objRequireNonNull;
                            break;
                        }
                        iA00 = i5 + 1;
                    }
                }
                return keyIndex == n2 ? hashTable : new Object[]{hashTable, Integer.valueOf(keyIndex), c2749oU};
            }
            int[] hashTable2 = new int[tableSize];
            Arrays.fill(hashTable2, -1);
            int i7 = 0;
            int i8 = 0;
            while (i8 < n2) {
                int i9 = (i8 * 2) + keyOffset;
                int i10 = (i7 * 2) + keyOffset;
                Object objRequireNonNull2 = Objects.requireNonNull(alternatingKeysAndValues[i9]);
                Object objRequireNonNull3 = Objects.requireNonNull(alternatingKeysAndValues[i9 ^ 1]);
                AbstractC2677nJ.A03(objRequireNonNull2, objRequireNonNull3);
                int outKeyIndex = AbstractC2737oI.A00(objRequireNonNull2.hashCode());
                while (true) {
                    int outKeyIndex2 = outKeyIndex & h2;
                    int i11 = hashTable2[outKeyIndex2];
                    if (i11 == i2) {
                        hashTable2[outKeyIndex2] = i10;
                        if (i7 < i8) {
                            alternatingKeysAndValues[i10] = objRequireNonNull2;
                            alternatingKeysAndValues[i10 ^ 1] = objRequireNonNull3;
                        }
                        i7++;
                        break;
                    }
                    if (objRequireNonNull2.equals(alternatingKeysAndValues[i11])) {
                        c2749oU = new C2749oU(objRequireNonNull2, objRequireNonNull3, Objects.requireNonNull(alternatingKeysAndValues[i11 ^ 1]));
                        alternatingKeysAndValues[i11 ^ 1] = objRequireNonNull3;
                        break;
                    }
                    outKeyIndex = outKeyIndex2 + 1;
                    i2 = -1;
                }
                i8++;
                i2 = -1;
            }
            return i7 == n2 ? hashTable2 : new Object[]{hashTable2, Integer.valueOf(i7), c2749oU};
        }
        byte[] bArr = new byte[tableSize];
        Arrays.fill(bArr, (byte) -1);
        int i12 = 0;
        for (int i13 = 0; i13 < n2; i13++) {
            int i14 = (i13 * 2) + keyOffset;
            int i15 = (i12 * 2) + keyOffset;
            Object objRequireNonNull4 = Objects.requireNonNull(alternatingKeysAndValues[i14]);
            Object objRequireNonNull5 = Objects.requireNonNull(alternatingKeysAndValues[i14 ^ 1]);
            AbstractC2677nJ.A03(objRequireNonNull4, objRequireNonNull5);
            int keyIndex2 = AbstractC2737oI.A00(objRequireNonNull4.hashCode());
            while (true) {
                int keyIndex3 = keyIndex2 & h2;
                int previousKeyIndex = bArr[keyIndex3] & 255;
                if (previousKeyIndex == 255) {
                    bArr[keyIndex3] = (byte) i15;
                    if (i12 < i13) {
                        alternatingKeysAndValues[i15] = objRequireNonNull4;
                        alternatingKeysAndValues[i15 ^ 1] = objRequireNonNull5;
                    }
                    i12++;
                    break;
                }
                if (objRequireNonNull4.equals(alternatingKeysAndValues[previousKeyIndex])) {
                    c2749oU = new C2749oU(objRequireNonNull4, objRequireNonNull5, Objects.requireNonNull(alternatingKeysAndValues[previousKeyIndex ^ 1]));
                    alternatingKeysAndValues[previousKeyIndex ^ 1] = objRequireNonNull5;
                    break;
                }
                keyIndex2 = keyIndex3 + 1;
            }
        }
        return i12 == n2 ? bArr : new Object[]{bArr, Integer.valueOf(i12), c2749oU};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2752oX
    public final AbstractC2743oO<V> A0A() {
        return new C2A(this.A00, 1, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2752oX
    public final BO<Map.Entry<K, V>> A0D() {
        return new C2C(this, this.A00, 0, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<K> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2752oX
    public final BO<K> A0E() {
        final C2A c2a = new C2A(this.A00, 0, this.A01);
        return new BO<K>(this, c2a) { // from class: com.facebook.ads.redexgen.X.2B
            public final transient BP<K> A00;
            public final transient AbstractC2752oX<K, ?> A01;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, ?> */
            {
                this.A01 = this;
                this.A00 = c2a;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC2743oO
            public final int A0I(Object[] dst, int offset) {
                return A0J().A0I(dst, offset);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.BO, com.facebook.ads.redexgen.core.AbstractC2743oO
            public final BP<K> A0J() {
                return this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC2743oO
            public final boolean A0K() {
                return true;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: A0N */
            public final C4C<K> iterator() {
                return A0J().iterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC2743oO, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object object) {
                return this.A01.get(object) != null;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.A01.size();
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2752oX
    public final boolean A0F() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2752oX, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        V v = (V) A01(this.A02, this.A00, this.A01, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // java.util.Map
    public final int size() {
        return this.A01;
    }
}
