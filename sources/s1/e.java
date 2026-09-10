package s1;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import i1.e0;
import j2.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f50012a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // j2.p
    public final Object j(Uri uri, n1.j jVar) throws IOException {
        String line = new BufferedReader(new InputStreamReader(jVar, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = f50012a.matcher(line);
            if (!matcher.matches()) {
                throw e0.b("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j11 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) * j10;
            }
            return Long.valueOf(time);
        } catch (ParseException e10) {
            throw e0.b(null, e10);
        }
    }
}
