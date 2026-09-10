package kotlinx.serialization.internal;

import com.p004ironsource.dc;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/internal/InternalHexConverter;", "", "<init>", "()V", "hexCode", "", "parseHexBinary", "", "s", "hexToInt", "", "ch", "", "printHexBinary", "data", "lowerCase", "", "toHexString", dc.q, "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InternalHexConverter {
    public static final InternalHexConverter INSTANCE = new InternalHexConverter();
    private static final String hexCode = "0123456789ABCDEF";

    private InternalHexConverter() {
    }

    private final int hexToInt(char ch) {
        if ('0' <= ch && ch < ':') {
            return ch - '0';
        }
        if ('A' <= ch && ch < 'G') {
            return ch - '7';
        }
        if ('a' > ch || ch >= 'g') {
            return -1;
        }
        return ch - 'W';
    }

    public static /* synthetic */ String printHexBinary$default(InternalHexConverter internalHexConverter, byte[] bArr, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return internalHexConverter.printHexBinary(bArr, z2);
    }

    public final byte[] parseHexBinary(String s) {
        Intrinsics.f(s, "s");
        int length = s.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("HexBinary string must be even length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 < length; i2 += 2) {
            int iHexToInt = hexToInt(s.charAt(i2));
            int i3 = i2 + 1;
            int iHexToInt2 = hexToInt(s.charAt(i3));
            if (iHexToInt == -1 || iHexToInt2 == -1) {
                throw new IllegalArgumentException(("Invalid hex chars: " + s.charAt(i2) + s.charAt(i3)).toString());
            }
            bArr[i2 / 2] = (byte) ((iHexToInt << 4) + iHexToInt2);
        }
        return bArr;
    }

    public final String printHexBinary(byte[] data, boolean lowerCase) {
        Intrinsics.f(data, "data");
        StringBuilder sb = new StringBuilder(data.length * 2);
        for (byte b2 : data) {
            sb.append(hexCode.charAt((b2 >> 4) & 15));
            sb.append(hexCode.charAt(b2 & 15));
        }
        if (!lowerCase) {
            String string = sb.toString();
            Intrinsics.e(string, "toString(...)");
            return string;
        }
        String string2 = sb.toString();
        Intrinsics.e(string2, "toString(...)");
        String lowerCase2 = string2.toLowerCase(Locale.ROOT);
        Intrinsics.e(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }

    public final String toHexString(int n2) {
        CharSequence charSequenceSubSequence;
        byte[] bArr = new byte[4];
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3] = (byte) (n2 >> (24 - (i3 * 8)));
        }
        String strPrintHexBinary = printHexBinary(bArr, true);
        char[] cArr = {'0'};
        Intrinsics.f(strPrintHexBinary, "<this>");
        int length = strPrintHexBinary.length();
        while (true) {
            if (i2 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!ArraysKt.h(cArr, strPrintHexBinary.charAt(i2))) {
                charSequenceSubSequence = strPrintHexBinary.subSequence(i2, strPrintHexBinary.length());
                break;
            }
            i2++;
        }
        String string = charSequenceSubSequence.toString();
        if (string.length() <= 0) {
            string = null;
        }
        return string == null ? "0" : string;
    }
}
