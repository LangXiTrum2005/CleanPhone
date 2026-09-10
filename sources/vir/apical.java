package vir;

import android.text.TextUtils;
import com.ironsource.X3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: HttpUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Pattern f39537attabal = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Pattern f39538saneness = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String attabal(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    public static long dern(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f39538saneness.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) decarock.attabal.marial(matcher.group(1)));
        }
        return -1L;
    }

    public static long saneness(String str, String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                decarock.triweekly.dern("HttpUtil", "Unexpected Content-Length [" + str + X3.j.e);
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f39537attabal.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong((String) decarock.attabal.marial(matcher.group(2))) - Long.parseLong((String) decarock.attabal.marial(matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            decarock.triweekly.impromptu("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + X3.j.e);
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            decarock.triweekly.dern("HttpUtil", "Unexpected Content-Range [" + str2 + X3.j.e);
            return j;
        }
    }
}
