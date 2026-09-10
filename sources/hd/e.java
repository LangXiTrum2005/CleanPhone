package hd;

import java.util.Locale;
import java.util.regex.Pattern;
import v0.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f42322a = Pattern.compile("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f42323b = i.d(6);

    public static void b(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (str.length() > 40) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("Attribute key length must not exceed 40 characters");
        }
        if (str2.length() > 100) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("Attribute value length must not exceed 100 characters");
        }
        if (!f42322a.matcher(str).matches()) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static String c(String str) {
        String str2;
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            Locale locale = Locale.US;
            return "Metric name must not exceed 100 characters";
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (int i10 : f42323b) {
            switch (i10) {
                case 1:
                    str2 = "_fstec";
                    break;
                case 2:
                    str2 = "_fsntc";
                    break;
                case 3:
                    str2 = "_tsns";
                    break;
                case 4:
                    str2 = "_fr_tot";
                    break;
                case 5:
                    str2 = "_fr_slo";
                    break;
                case 6:
                    str2 = "_fr_fzn";
                    break;
                default:
                    throw null;
            }
            if (str2.equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public abstract boolean a();
}
