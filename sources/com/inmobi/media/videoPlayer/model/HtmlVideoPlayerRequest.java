package com.inmobi.media.videoPlayer.model;

import com.ironsource.C3700q2;
import com.ironsource.Ua;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/inmobi/media/videoPlayer/model/HtmlVideoPlayerRequest;", "", "<init>", "()V", "videoFiles", "", "Lcom/inmobi/media/videoPlayer/model/HtmlVideoFile;", "getVideoFiles", "()Ljava/util/List;", "setVideoFiles", "(Ljava/util/List;)V", "isCache", "", "()Z", "setCache", "(Z)V", C3700q2.t, "", "getLoadTimeout", "()J", "setLoadTimeout", "(J)V", "config", "Lcom/inmobi/media/videoPlayer/model/HtmlVideoPlayerConfig;", "getConfig", "()Lcom/inmobi/media/videoPlayer/model/HtmlVideoPlayerConfig;", "setConfig", "(Lcom/inmobi/media/videoPlayer/model/HtmlVideoPlayerConfig;)V", "omidTrackers", "Lcom/inmobi/media/videoPlayer/model/HtmlOmidTracker;", "getOmidTrackers", "setOmidTrackers", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HtmlVideoPlayerRequest {
    private boolean isCache;
    private List<HtmlVideoFile> videoFiles = adultoid.formularize();
    private long loadTimeout = Ua.C;
    private HtmlVideoPlayerConfig config = new HtmlVideoPlayerConfig();
    private List<HtmlOmidTracker> omidTrackers = adultoid.formularize();

    public final HtmlVideoPlayerConfig getConfig() {
        return this.config;
    }

    public final long getLoadTimeout() {
        return this.loadTimeout;
    }

    public final List<HtmlOmidTracker> getOmidTrackers() {
        return this.omidTrackers;
    }

    public final List<HtmlVideoFile> getVideoFiles() {
        return this.videoFiles;
    }

    /* JADX INFO: renamed from: isCache, reason: from getter */
    public final boolean getIsCache() {
        return this.isCache;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    public final void setConfig(HtmlVideoPlayerConfig htmlVideoPlayerConfig) {
        Intrinsics.checkNotNullParameter(htmlVideoPlayerConfig, "<set-?>");
        this.config = htmlVideoPlayerConfig;
    }

    public final void setLoadTimeout(long j) {
        this.loadTimeout = j;
    }

    public final void setOmidTrackers(List<HtmlOmidTracker> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.omidTrackers = list;
    }

    public final void setVideoFiles(List<HtmlVideoFile> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.videoFiles = list;
    }
}
