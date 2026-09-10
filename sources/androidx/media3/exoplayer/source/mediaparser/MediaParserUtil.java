package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaParser;
import android.media.metrics.LogSessionId;
import androidx.media3.exoplayer.analytics.PlayerId;

/* JADX INFO: loaded from: classes.dex */
public final class MediaParserUtil {

    public static final class Api31 {
        public static void a(MediaParser mediaParser, PlayerId playerId) {
            LogSessionId logSessionIdA = playerId.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            mediaParser.setLogSessionId(logSessionIdA);
        }
    }
}
