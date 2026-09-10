package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {
    public final DefaultDataSource.Factory i0;
    public final LoadErrorHandlingPolicy k0;
    public TransferListener m0;
    public final long j0 = -9223372036854775807L;
    public final boolean l0 = true;

    public static final class Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoadErrorHandlingPolicy f6456a;

        public Factory(DefaultDataSource.Factory factory) {
            factory.getClass();
            this.f6456a = new DefaultLoadErrorHandlingPolicy();
        }
    }

    public SingleSampleMediaSource(MediaItem.SubtitleConfiguration subtitleConfiguration, DefaultDataSource.Factory factory, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.i0 = factory;
        this.k0 = loadErrorHandlingPolicy;
        new MediaItem.Builder().f5442b = Uri.EMPTY;
        subtitleConfiguration.getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        TransferListener transferListener = this.m0;
        MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher(this.Z.f6390c, 0, mediaPeriodId);
        return new SingleSampleMediaPeriod(null, this.i0, transferListener, null, this.j0, this.k0, eventDispatcher, this.l0);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        ((SingleSampleMediaPeriod) mediaPeriod).j0.d(null);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void X(TransferListener transferListener) {
        this.m0 = transferListener;
        Y(null);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void Z() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaItem m() {
        return null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
