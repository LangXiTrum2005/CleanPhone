package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WrappingMediaSource extends CompositeMediaSource<Void> {
    public final MediaSource l0;

    public WrappingMediaSource(MediaSource mediaSource) {
        this.l0 = mediaSource;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void B(MediaPeriod mediaPeriod) {
        this.l0.B(mediaPeriod);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void T(TransferListener transferListener) {
        super.T(transferListener);
        e0();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId W(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        return c0(mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final long X(Object obj, long j) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final int Y(Object obj, int i2) {
        return i2;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final void Z(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        S(timeline);
    }

    public MediaSource.MediaPeriodId c0(MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public final void d0() {
        a0(null, this.l0);
    }

    public void e0() {
        d0();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaItem m() {
        return this.l0.m();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public boolean r() {
        return this.l0.r();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public Timeline s() {
        return this.l0.s();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return this.l0.u(mediaPeriodId, allocator, j);
    }
}
