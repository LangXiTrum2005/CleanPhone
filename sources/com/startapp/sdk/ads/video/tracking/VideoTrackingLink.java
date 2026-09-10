package com.startapp.sdk.ads.video.tracking;

import com.startapp.json.TypeInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class VideoTrackingLink implements Serializable {
    private static final long serialVersionUID = 734821160635474852L;
    private boolean appendReplayParameter;
    private String replayParameter;

    @TypeInfo(type = TrackingSource.class)
    private TrackingSource trackingSource;
    private String trackingUrl;

    public enum TrackingSource {
        STARTAPP,
        EXTERNAL
    }

    public final void a(String str) {
        this.trackingUrl = str;
    }

    public final TrackingSource b() {
        return this.trackingSource;
    }

    public final String c() {
        return this.trackingUrl;
    }

    public final void d() {
        this.appendReplayParameter = true;
    }

    public final void e() {
        this.replayParameter = "";
    }

    public final boolean f() {
        return this.appendReplayParameter;
    }

    public final String a() {
        return this.replayParameter;
    }
}
