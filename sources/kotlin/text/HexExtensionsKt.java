package kotlin.text;

import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HexExtensionsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f44698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f44699b;

    static {
        int[] iArr = new int[256];
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            iArr[i3] = "0123456789abcdef".charAt(i3 & 15) | ("0123456789abcdef".charAt(i3 >> 4) << '\b');
        }
        f44698a = iArr;
        int[] iArr2 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr2[i4] = "0123456789ABCDEF".charAt(i4 & 15) | ("0123456789ABCDEF".charAt(i4 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i5 = 0; i5 < 256; i5++) {
            iArr3[i5] = -1;
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i6)] = i7;
            i6++;
            i7++;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i8)] = i9;
            i8++;
            i9++;
        }
        long[] jArr = new long[256];
        for (int i10 = 0; i10 < 256; i10++) {
            jArr[i10] = -1;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i11)] = i12;
            i11++;
            i12++;
        }
        int i13 = 0;
        while (i2 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i2)] = i13;
            i2++;
            i13++;
        }
        f44699b = jArr;
    }

    public static final void a(int i2, int i3, String str) {
        int i4 = i3 - i2;
        if (i4 < 1) {
            Intrinsics.d(str, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = str.substring(i2, i3);
            Intrinsics.e(strSubstring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i2 + ", but was \"" + strSubstring + "\" of length " + i4);
        }
        if (i4 > 16) {
            int i5 = (i4 + i2) - 16;
            while (i2 < i5) {
                if (str.charAt(i2) != '0') {
                    StringBuilder sbU = android.support.v4.media.a.u(i2, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbU.append(str.charAt(i2));
                    sbU.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbU.toString());
                }
                i2++;
            }
        }
    }

    public static long b(int i2, int i3, String str) {
        HexFormat format = HexFormat.d;
        Intrinsics.f(str, "<this>");
        Intrinsics.f(format, "format");
        AbstractList.Companion companion = AbstractList.INSTANCE;
        int length = str.length();
        companion.getClass();
        AbstractList.Companion.a(i2, i3, length);
        if (format.f44702c.f44705a) {
            a(i2, i3, str);
            return c(i2, i3, str);
        }
        if (i3 - i2 > 0) {
            a(i2, i3, str);
            return c(i2, i3, str);
        }
        String strSubstring = str.substring(i2, i3);
        Intrinsics.e(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    public static final long c(int i2, int i3, String str) {
        long j = 0;
        while (i2 < i3) {
            long j2 = j << 4;
            char cCharAt = str.charAt(i2);
            if ((cCharAt >>> '\b') == 0) {
                long j3 = f44699b[cCharAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i2++;
                }
            }
            StringBuilder sbU = android.support.v4.media.a.u(i2, "Expected a hexadecimal digit at index ", ", but was ");
            sbU.append(str.charAt(i2));
            throw new NumberFormatException(sbU.toString());
        }
        return j;
    }
}
