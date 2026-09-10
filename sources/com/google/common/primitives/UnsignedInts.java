package com.google.common.primitives;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedInts {

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
                if (i3 != i4) {
                    int i5 = i3 ^ Integer.MIN_VALUE;
                    int i6 = Integer.MIN_VALUE ^ i4;
                    if (i5 < i6) {
                        return -1;
                    }
                    return i5 > i6 ? 1 : 0;
                }
            }
            return iArr3.length - iArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }
}
