package com.google.common.math;

import androidx.datastore.preferences.protobuf.a;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class IntMath {

    /* JADX INFO: renamed from: com.google.common.math.IntMath$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20036a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f20036a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20036a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20036a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20036a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20036a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20036a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20036a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20036a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int i2, int i3) {
        long j = ((long) i2) + ((long) i3);
        int i4 = (int) j;
        MathPreconditions.a(i2, i3, "checkedAdd", j == ((long) i4));
        return i4;
    }

    public static int b(int i2) {
        long j = ((long) i2) * ((long) 3);
        int i3 = (int) j;
        MathPreconditions.a(i2, 3, "checkedMultiply", j == ((long) i3));
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r0 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r4 < 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r4, int r5) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r0.getClass()
            if (r5 == 0) goto L4c
            int r1 = r4 / r5
            int r2 = r5 * r1
            int r2 = r4 - r2
            if (r2 != 0) goto L10
            goto L43
        L10:
            r4 = r4 ^ r5
            int r4 = r4 >> 31
            r4 = r4 | 1
            int[] r3 = com.google.common.math.IntMath.AnonymousClass1.f20036a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L43;
                case 3: goto L3d;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L26;
                case 7: goto L26;
                case 8: goto L26;
                default: goto L20;
            }
        L20:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L26:
            int r0 = java.lang.Math.abs(r2)
            int r5 = java.lang.Math.abs(r5)
            int r5 = r5 - r0
            int r0 = r0 - r5
            if (r0 != 0) goto L37
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_EVEN
            goto L43
        L37:
            if (r0 <= 0) goto L43
            goto L3f
        L3a:
            if (r4 <= 0) goto L43
            goto L3f
        L3d:
            if (r4 >= 0) goto L43
        L3f:
            int r1 = r1 + r4
            return r1
        L41:
            if (r2 != 0) goto L44
        L43:
            return r1
        L44:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "mode was UNNECESSARY, but rounding was necessary"
            r4.<init>(r5)
            throw r4
        L4c:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "/ by zero"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.IntMath.c(int, int):int");
    }

    public static int d(int i2) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i2 <= 0) {
            throw new IllegalArgumentException(a.k("x (", i2, ") must be > 0"));
        }
        switch (AnonymousClass1.f20036a[roundingMode.ordinal()]) {
            case 1:
                if (!((i2 > 0) & (((i2 + (-1)) & i2) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i2))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }
}
