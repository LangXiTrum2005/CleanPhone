package t3;

import i1.e0;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import l1.q;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f50478a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(q qVar) {
        qVar.getClass();
        String strN = qVar.n(StandardCharsets.UTF_8);
        return strN != null && strN.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = y.f44830a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str3);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static void d(q qVar) {
        int i10 = qVar.f44814b;
        if (a(qVar)) {
            return;
        }
        qVar.M(i10);
        throw e0.a(null, "Expected WEBVTT. Got " + qVar.n(StandardCharsets.UTF_8));
    }
}
