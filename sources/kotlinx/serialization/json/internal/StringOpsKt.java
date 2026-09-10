package kotlinx.serialization.json.internal;

import com.smartdigimkt.q8.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0010\u001a\u00020\u0011*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0000\u001a\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0017\"&\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u000b\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"toHexChar", "", i.f37957c, "", "ESCAPE_STRINGS", "", "", "getESCAPE_STRINGS$annotations", "()V", "getESCAPE_STRINGS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "ESCAPE_MARKERS", "", "getESCAPE_MARKERS", "()[B", "printQuoted", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "toBooleanStrictOrNull", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StringOpsKt {
    private static final byte[] ESCAPE_MARKERS;
    private static final String[] ESCAPE_STRINGS;

    static {
        String[] strArr = new String[93];
        for (int i2 = 0; i2 < 32; i2++) {
            strArr[i2] = "\\u" + toHexChar(i2 >> 12) + toHexChar(i2 >> 8) + toHexChar(i2 >> 4) + toHexChar(i2);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        ESCAPE_STRINGS = strArr;
        byte[] bArr = new byte[93];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr[i3] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        ESCAPE_MARKERS = bArr;
    }

    public static final byte[] getESCAPE_MARKERS() {
        return ESCAPE_MARKERS;
    }

    public static final String[] getESCAPE_STRINGS() {
        return ESCAPE_STRINGS;
    }

    public static /* synthetic */ void getESCAPE_STRINGS$annotations() {
    }

    public static final void printQuoted(StringBuilder sb, String value) {
        Intrinsics.f(sb, "<this>");
        Intrinsics.f(value, "value");
        sb.append(AbstractJsonLexerKt.STRING);
        int length = value.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = value.charAt(i3);
            String[] strArr = ESCAPE_STRINGS;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) value, i2, i3);
                sb.append(strArr[cCharAt]);
                i2 = i3 + 1;
            }
        }
        if (i2 != 0) {
            sb.append((CharSequence) value, i2, value.length());
        } else {
            sb.append(value);
        }
        sb.append(AbstractJsonLexerKt.STRING);
    }

    public static final Boolean toBooleanStrictOrNull(String str) {
        Intrinsics.f(str, "<this>");
        if (str.equalsIgnoreCase(com.p004ironsource.mediationsdk.metadata.a.g)) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static final char toHexChar(int i2) {
        int i3 = i2 & 15;
        return (char) (i3 < 10 ? i3 + 48 : i3 + 87);
    }
}
