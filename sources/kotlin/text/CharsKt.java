package kotlin.text;

import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/CharsKt__CharKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class CharsKt extends CharsKt__CharKt {
    public static void b(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder sbU = android.support.v4.media.a.u(i2, "radix ", " was not in valid range ");
            sbU.append(new IntRange(2, 36, 1));
            throw new IllegalArgumentException(sbU.toString());
        }
    }

    public static boolean c(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }
}
