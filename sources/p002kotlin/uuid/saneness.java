package p002kotlin.uuid;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.wireman;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001b\u0010\u0018\u001a\u00020\n*\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "", "dst", "", "dstOffset", "startIndex", "endIndex", "", "impromptu", "(J[BIII)V", "", "index", "competently", "(Ljava/lang/String;I)V", "value", "taiyuan", "([BIJ)V", "hexDashString", "Lkotlin/uuid/Uuid;", "formularize", "(Ljava/lang/String;)Lkotlin/uuid/Uuid;", "hexString", "apical", "maxLength", "cutely", "(Ljava/lang/String;I)Ljava/lang/String;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
public class saneness extends attabal {
    public static final Uuid apical(String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        return Uuid.INSTANCE.attabal(wireman.beachfront(hexString, 0, 16, null, 4, null), wireman.beachfront(hexString, 16, 32, null, 4, null));
    }

    public static final void competently(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.charAt(i) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i + ", but was '" + str.charAt(i) + '\'').toString());
    }

    public static final String cutely(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Intrinsics.competently(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append("...");
        return sb.toString();
    }

    public static final Uuid formularize(String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        long jBeachfront = wireman.beachfront(hexDashString, 0, 8, null, 4, null);
        competently(hexDashString, 8);
        long jBeachfront2 = wireman.beachfront(hexDashString, 9, 13, null, 4, null);
        competently(hexDashString, 13);
        long jBeachfront3 = wireman.beachfront(hexDashString, 14, 18, null, 4, null);
        competently(hexDashString, 18);
        long jBeachfront4 = wireman.beachfront(hexDashString, 19, 23, null, 4, null);
        competently(hexDashString, 23);
        return Uuid.INSTANCE.attabal((jBeachfront2 << 16) | (jBeachfront << 32) | jBeachfront3, (jBeachfront4 << 48) | wireman.beachfront(hexDashString, 24, 36, null, 4, null));
    }

    public static final void impromptu(long j, byte[] dst, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = wireman.wireman()[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            dst[i] = (byte) (i6 >> 8);
            i += 2;
            dst[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final void taiyuan(byte[] bArr, int i, long j) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i2 = 7;
        while (-1 < i2) {
            bArr[i] = (byte) (j >> (i2 << 3));
            i2--;
            i++;
        }
    }
}
