package kotlin.text;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UStringsKt {
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public static final byte a(String str) {
        UByte uByte;
        Intrinsics.f(str, "<this>");
        UInt uIntC = c(str);
        if (uIntC != null) {
            int i2 = uIntC.X;
            if (Integer.compare(Integer.MIN_VALUE ^ i2, -2147483393) > 0) {
                uByte = null;
            } else {
                uByte = new UByte((byte) i2);
            }
        } else {
            uByte = null;
        }
        if (uByte != null) {
            return uByte.X;
        }
        StringsKt__StringNumberConversionsKt.b(str);
        throw null;
    }

    public static final int b(String str) {
        Intrinsics.f(str, "<this>");
        UInt uIntC = c(str);
        if (uIntC != null) {
            return uIntC.X;
        }
        StringsKt__StringNumberConversionsKt.b(str);
        throw null;
    }

    public static final UInt c(String str) {
        int i2;
        Intrinsics.f(str, "<this>");
        CharsKt.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.h(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int i4 = 119304647;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), 10);
            if (iDigit < 0) {
                return null;
            }
            int i5 = i3 ^ Integer.MIN_VALUE;
            if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                if (i4 != 119304647) {
                    return null;
                }
                i4 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i6 = i3 * 10;
            int i7 = iDigit + i6;
            if (Integer.compare(i7 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            i3 = i7;
        }
        return new UInt(i3);
    }

    public static final long d(String str) {
        Intrinsics.f(str, "<this>");
        ULong uLongE = e(str);
        if (uLongE != null) {
            return uLongE.X;
        }
        StringsKt__StringNumberConversionsKt.b(str);
        throw null;
    }

    public static final ULong e(String str) {
        int i2;
        Intrinsics.f(str, "<this>");
        int i3 = 10;
        CharsKt.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i4 = 1;
        if (Intrinsics.h(cCharAt, 48) >= 0) {
            i2 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i2 = 1;
        }
        long j = 10;
        long j2 = 0;
        long j3 = 512409557603043100L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i3);
            if (iDigit < 0) {
                return null;
            }
            int i5 = length;
            long j4 = j2 ^ Long.MIN_VALUE;
            int i6 = i2;
            if (Long.compare(j4, j3 ^ Long.MIN_VALUE) <= 0) {
                j = j;
            } else {
                if (j3 != 512409557603043100L) {
                    return null;
                }
                if (j < 0) {
                    j3 = Long.MAX_VALUE < (j ^ Long.MIN_VALUE) ? 0L : 1L;
                } else {
                    long j5 = (Long.MAX_VALUE / j) << i4;
                    j3 = j5 + ((long) ((((-1) - (j5 * j)) ^ Long.MIN_VALUE) >= (j ^ Long.MIN_VALUE) ? i4 : 0));
                }
                if (Long.compare(j4, j3 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j6 = j2 * j;
            long j7 = (((long) iDigit) & 4294967295L) + j6;
            if (Long.compare(j7 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2 = i6 + 1;
            j2 = j7;
            length = i5;
            j = j;
            i3 = 10;
            i4 = 1;
        }
        return new ULong(j2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public static final short f(String str) {
        UShort uShort;
        Intrinsics.f(str, "<this>");
        UInt uIntC = c(str);
        if (uIntC != null) {
            int i2 = uIntC.X;
            if (Integer.compare(Integer.MIN_VALUE ^ i2, -2147418113) > 0) {
                uShort = null;
            } else {
                uShort = new UShort((short) i2);
            }
        } else {
            uShort = null;
        }
        if (uShort != null) {
            return uShort.X;
        }
        StringsKt__StringNumberConversionsKt.b(str);
        throw null;
    }
}
