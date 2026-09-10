package androidx.media3.common.util;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class CodecSpecificDataUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5627a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f5628b = {"", "A", "B", "C"};

    public static String a(int i2, boolean z2, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = {f5628b[i2], Integer.valueOf(i3), Integer.valueOf(i4), Character.valueOf(z2 ? 'H' : 'L'), Integer.valueOf(i5)};
        int i6 = Util.f5683a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i7 = 0; i7 < length; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }
}
