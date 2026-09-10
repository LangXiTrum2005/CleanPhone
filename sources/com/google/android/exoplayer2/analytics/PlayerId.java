package com.google.android.exoplayer2.analytics;

import android.media.metrics.LogSessionId;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerId {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17257b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LogSessionIdApi31 f17258a;

    public static final class LogSessionIdApi31 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f17259b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LogSessionId f17260a;

        static {
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public LogSessionIdApi31(LogSessionId logSessionId) {
            this.f17260a = logSessionId;
        }
    }

    static {
        if (Util.f18979a < 31) {
            new PlayerId();
        } else {
            int i2 = LogSessionIdApi31.f17259b;
        }
    }

    public PlayerId() {
        this((LogSessionIdApi31) null);
        Assertions.d(Util.f18979a < 31);
    }

    public final LogSessionId a() {
        LogSessionIdApi31 logSessionIdApi31 = this.f17258a;
        logSessionIdApi31.getClass();
        return logSessionIdApi31.f17260a;
    }

    public PlayerId(LogSessionId logSessionId) {
        this(new LogSessionIdApi31(logSessionId));
    }

    public PlayerId(LogSessionIdApi31 logSessionIdApi31) {
        this.f17258a = logSessionIdApi31;
    }
}
