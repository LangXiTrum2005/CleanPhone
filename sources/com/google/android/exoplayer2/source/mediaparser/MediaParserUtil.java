package com.google.android.exoplayer2.source.mediaparser;

import android.media.MediaParser;
import android.media.metrics.LogSessionId;
import com.google.android.exoplayer2.analytics.PlayerId;

/* JADX INFO: loaded from: classes3.dex */
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
