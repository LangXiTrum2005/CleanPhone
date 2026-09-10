package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerId {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LogSessionIdApi31 f6036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6037c;

    public static final class LogSessionIdApi31 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final LogSessionIdApi31 f6038b = new LogSessionIdApi31(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LogSessionId f6039a;

        public LogSessionIdApi31(LogSessionId logSessionId) {
            this.f6039a = logSessionId;
        }
    }

    static {
        if (Util.f5683a < 31) {
            new PlayerId("");
        } else {
            new PlayerId(LogSessionIdApi31.f6038b, "");
        }
    }

    public PlayerId(String str) {
        Assertions.e(Util.f5683a < 31);
        this.f6035a = str;
        this.f6036b = null;
        this.f6037c = new Object();
    }

    public final LogSessionId a() {
        LogSessionIdApi31 logSessionIdApi31 = this.f6036b;
        logSessionIdApi31.getClass();
        return logSessionIdApi31.f6039a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerId)) {
            return false;
        }
        PlayerId playerId = (PlayerId) obj;
        return Objects.equals(this.f6035a, playerId.f6035a) && Objects.equals(this.f6036b, playerId.f6036b) && Objects.equals(this.f6037c, playerId.f6037c);
    }

    public final int hashCode() {
        return Objects.hash(this.f6035a, this.f6036b, this.f6037c);
    }

    public PlayerId(LogSessionId logSessionId, String str) {
        this(new LogSessionIdApi31(logSessionId), str);
    }

    public PlayerId(LogSessionIdApi31 logSessionIdApi31, String str) {
        this.f6036b = logSessionIdApi31;
        this.f6035a = str;
        this.f6037c = new Object();
    }
}
