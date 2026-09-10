package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.Allocator;

/* JADX INFO: loaded from: classes.dex */
public final class ExternallyLoadedMediaSource extends BaseMediaSource {
    public MediaItem i0;

    public static final class Factory implements MediaSource.Factory {
        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource a(MediaItem mediaItem) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaItem mediaItemM = m();
        mediaItemM.f5438b.getClass();
        MediaItem.LocalConfiguration localConfiguration = mediaItemM.f5438b;
        if (localConfiguration.f5459b != null) {
            return new ExternallyLoadedMediaPeriod(localConfiguration.f5458a, localConfiguration.f5459b);
        }
        throw new NullPointerException("Externally loaded mediaItems require a MIME type.");
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        ((ExternallyLoadedMediaPeriod) mediaPeriod).getClass();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized void M(MediaItem mediaItem) {
        this.i0 = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void X(TransferListener transferListener) {
        Y(new SinglePeriodTimeline(0L, true, false, m()));
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void Z() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized MediaItem m() {
        return this.i0;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
