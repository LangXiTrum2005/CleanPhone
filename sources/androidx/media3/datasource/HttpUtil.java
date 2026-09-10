package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.media3.common.util.Log;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class HttpUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f5776a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f5777b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sbV = android.support.v4.media.a.v(j, "bytes=", TokenBuilder.TOKEN_DELIMITER);
        if (j2 != -1) {
            sbV.append((j + j2) - 1);
        }
        return sbV.toString();
    }

    public static long b(String str, String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                Log.c("HttpUtil", "Unexpected Content-Length [" + str + d9.i.f24752e);
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f5776a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            String strGroup = matcher.group(2);
            strGroup.getClass();
            long j2 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j3 = (j2 - Long.parseLong(strGroup2)) + 1;
            if (j < 0) {
                return j3;
            }
            if (j == j3) {
                return j;
            }
            Log.g("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + d9.i.f24752e);
            return Math.max(j, j3);
        } catch (NumberFormatException unused2) {
            Log.c("HttpUtil", "Unexpected Content-Range [" + str2 + d9.i.f24752e);
            return j;
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f5777b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }
}
