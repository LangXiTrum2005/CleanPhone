package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.Allocator;

/* JADX INFO: loaded from: classes.dex */
public abstract class WrappingMediaSource extends CompositeMediaSource<Void> {
    public final MediaSource l0;

    public WrappingMediaSource(MediaSource mediaSource) {
        this.l0 = mediaSource;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return this.l0.A(mediaPeriodId, allocator, j);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void G(MediaPeriod mediaPeriod) {
        this.l0.G(mediaPeriod);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void M(MediaItem mediaItem) {
        this.l0.M(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void X(TransferListener transferListener) {
        super.X(transferListener);
        h0();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId a0(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        return g0(mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final long b0(Object obj, long j, MediaSource.MediaPeriodId mediaPeriodId) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final int c0(Object obj, int i2) {
        return i2;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void d0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        W(timeline);
    }

    public MediaSource.MediaPeriodId g0(MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public void h0() {
        e0(null, this.l0);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaItem m() {
        return this.l0.m();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean r() {
        return this.l0.r();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public Timeline s() {
        return this.l0.s();
    }
}
