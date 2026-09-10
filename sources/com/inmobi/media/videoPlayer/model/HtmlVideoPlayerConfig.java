package com.inmobi.media.videoPlayer.model;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/inmobi/media/videoPlayer/model/HtmlVideoPlayerConfig;", "", "<init>", "()V", "videoViewPosition", "Lcom/inmobi/media/videoPlayer/model/VideoViewPosition;", "getVideoViewPosition", "()Lcom/inmobi/media/videoPlayer/model/VideoViewPosition;", "setVideoViewPosition", "(Lcom/inmobi/media/videoPlayer/model/VideoViewPosition;)V", "fullscreenEnabled", "", "getFullscreenEnabled", "()Z", "setFullscreenEnabled", "(Z)V", "muted", "getMuted", "setMuted", "autoplay", "getAutoplay", "setAutoplay", "trackPercentages", "Lcom/inmobi/media/videoPlayer/model/TrackPercentage;", "getTrackPercentages", "()Lcom/inmobi/media/videoPlayer/model/TrackPercentage;", "setTrackPercentages", "(Lcom/inmobi/media/videoPlayer/model/TrackPercentage;)V", "playbackInterval", "", "getPlaybackInterval", "()J", "setPlaybackInterval", "(J)V", "skippable", "getSkippable", "setSkippable", "skipOffset", "", "getSkipOffset", "()F", "setSkipOffset", "(F)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HtmlVideoPlayerConfig {
    private boolean autoplay;
    private boolean muted;
    private float skipOffset;
    private boolean skippable;
    private VideoViewPosition videoViewPosition;
    private boolean fullscreenEnabled = true;
    private TrackPercentage trackPercentages = new TrackPercentage();
    private long playbackInterval = 1000;

    public final boolean getAutoplay() {
        return this.autoplay;
    }

    public final boolean getFullscreenEnabled() {
        return this.fullscreenEnabled;
    }

    public final boolean getMuted() {
        return this.muted;
    }

    public final long getPlaybackInterval() {
        return this.playbackInterval;
    }

    public final float getSkipOffset() {
        return this.skipOffset;
    }

    public final boolean getSkippable() {
        return this.skippable;
    }

    public final TrackPercentage getTrackPercentages() {
        return this.trackPercentages;
    }

    public final VideoViewPosition getVideoViewPosition() {
        return this.videoViewPosition;
    }

    public final void setAutoplay(boolean z) {
        this.autoplay = z;
    }

    public final void setFullscreenEnabled(boolean z) {
        this.fullscreenEnabled = z;
    }

    public final void setMuted(boolean z) {
        this.muted = z;
    }

    public final void setPlaybackInterval(long j) {
        this.playbackInterval = j;
    }

    public final void setSkipOffset(float f) {
        this.skipOffset = f;
    }

    public final void setSkippable(boolean z) {
        this.skippable = z;
    }

    public final void setTrackPercentages(TrackPercentage trackPercentage) {
        Intrinsics.checkNotNullParameter(trackPercentage, "<set-?>");
        this.trackPercentages = trackPercentage;
    }

    public final void setVideoViewPosition(VideoViewPosition videoViewPosition) {
        this.videoViewPosition = videoViewPosition;
    }
}
