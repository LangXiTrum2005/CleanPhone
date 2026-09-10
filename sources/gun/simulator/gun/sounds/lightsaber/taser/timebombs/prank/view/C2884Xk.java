package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2884Xk implements LT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f3991a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LT
    public final Object l(Uri uri, C4692tl c4692tl) throws IOException {
        String line = new BufferedReader(new InputStreamReader(c4692tl, AbstractC2333Ce.c)).readLine();
        try {
            Matcher matcher = f3991a.matcher(line);
            if (!matcher.matches()) {
                throw KT.b("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j2 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw KT.b(null, e);
        }
    }
}
