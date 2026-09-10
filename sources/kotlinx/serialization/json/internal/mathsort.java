package kotlinx.serialization.json.internal;

import com.ironsource.mediationsdk.metadata.a;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StringOps.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t*\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\"(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u001a\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, d2 = {"", "i", "", "marial", "(I)C", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "value", "", "dern", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "", "wireman", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "attabal", "[Ljava/lang/String;", "saneness", "()[Ljava/lang/String;", "getESCAPE_STRINGS$annotations", "()V", "ESCAPE_STRINGS", "", "[B", "()[B", "ESCAPE_MARKERS", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class mathsort {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String[] f32528attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final byte[] f32529saneness;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + marial(i >> 12) + marial(i >> 8) + marial(i >> 4) + marial(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f32528attabal = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f32529saneness = bArr;
    }

    public static final byte[] attabal() {
        return f32529saneness;
    }

    public static final void dern(StringBuilder sb, String value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb.append('\"');
        int length = value.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = value.charAt(i2);
            String[] strArr = f32528attabal;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) value, i, i2);
                sb.append(strArr[cCharAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) value, i, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final char marial(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }

    public static final String[] saneness() {
        return f32528attabal;
    }

    public static final Boolean wireman(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (p002kotlin.text.dovishness.stratoscope(str, a.g, true)) {
            return Boolean.TRUE;
        }
        if (p002kotlin.text.dovishness.stratoscope(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }
}
