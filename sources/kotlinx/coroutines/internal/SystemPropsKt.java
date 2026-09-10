package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
public final class SystemPropsKt {
    public static final int a() {
        return SystemPropsKt__SystemPropsKt.f45047a;
    }

    public static final long b(String str, long j, long j2, long j3) {
        String strC = c(str);
        if (strC == null) {
            return j;
        }
        Long lZ = StringsKt.Z(strC);
        if (lZ == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strC + '\'').toString());
        }
        long jLongValue = lZ.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j2);
        androidx.datastore.preferences.protobuf.a.A(sb, "..", j3, ", but is '");
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final String c(String str) {
        int i2 = SystemPropsKt__SystemPropsKt.f45047a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static int d(int i2, int i3, String str) {
        return (int) b(str, i2, 1, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
