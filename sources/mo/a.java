package mo;

import java.io.EOFException;
import kotlin.jvm.internal.n;
import lo.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f46262a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(an.a.f3768a);
        n.e(bytes, "this as java.lang.String).getBytes(charset)");
        f46262a = bytes;
    }

    public static final String a(long j10, e eVar) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.h(j11) == 13) {
                String string = eVar.readString(j11, an.a.f3768a);
                eVar.skip(2L);
                return string;
            }
        }
        String string2 = eVar.readString(j10, an.a.f3768a);
        eVar.skip(1L);
        return string2;
    }
}
