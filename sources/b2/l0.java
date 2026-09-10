package b2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f5321c = new l0(0, C.TIME_UNSET);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f5322d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5324b;

    public l0(long j10, long j11) {
        this.f5323a = j10;
        this.f5324b = j11;
    }

    public static l0 a(String str) {
        long j10;
        Matcher matcher = f5322d.matcher(str);
        boolean zMatches = matcher.matches();
        Pattern pattern = j0.f5303a;
        if (!zMatches) {
            throw i1.e0.b(str, null);
        }
        String strGroup = matcher.group(1);
        if (strGroup == null) {
            throw i1.e0.b(str, null);
        }
        String str2 = l1.y.f44830a;
        long j11 = strGroup.equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j10 = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                if (j10 < j11) {
                    throw i1.e0.b(str, null);
                }
            } catch (NumberFormatException e10) {
                throw i1.e0.b(strGroup2, e10);
            }
        } else {
            j10 = C.TIME_UNSET;
        }
        return new l0(j11, j10);
    }
}
