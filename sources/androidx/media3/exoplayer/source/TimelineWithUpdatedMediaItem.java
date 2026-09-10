package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;

/* JADX INFO: loaded from: classes.dex */
public final class TimelineWithUpdatedMediaItem extends ForwardingTimeline {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaItem f6462c;

    public TimelineWithUpdatedMediaItem(Timeline timeline, MediaItem mediaItem) {
        super(timeline);
        this.f6462c = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public final Timeline.Window m(int i2, Timeline.Window window, long j) {
        super.m(i2, window, j);
        MediaItem mediaItem = this.f6462c;
        window.f5515c = mediaItem;
        MediaItem.LocalConfiguration localConfiguration = mediaItem.f5438b;
        window.f5514b = null;
        return window;
    }
}
