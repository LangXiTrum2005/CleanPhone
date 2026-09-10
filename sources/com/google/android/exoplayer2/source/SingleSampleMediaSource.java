package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {
    public final DataSource.Factory i0;
    public final LoadErrorHandlingPolicy k0;
    public TransferListener m0;
    public final long j0 = -9223372036854775807L;
    public final boolean l0 = true;

    public static final class Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataSource.Factory f18418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LoadErrorHandlingPolicy f18419b;

        public Factory(DataSource.Factory factory) {
            factory.getClass();
            this.f18418a = factory;
            this.f18419b = new DefaultLoadErrorHandlingPolicy();
        }
    }

    public SingleSampleMediaSource(MediaItem.SubtitleConfiguration subtitleConfiguration, DataSource.Factory factory, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.i0 = factory;
        this.k0 = loadErrorHandlingPolicy;
        new MediaItem.Builder().f17097b = Uri.EMPTY;
        subtitleConfiguration.getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void B(MediaPeriod mediaPeriod) {
        ((SingleSampleMediaPeriod) mediaPeriod).j0.d(null);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void T(TransferListener transferListener) {
        this.m0 = transferListener;
        U(null);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void V() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaItem m() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        TransferListener transferListener = this.m0;
        MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher(this.Z.f18353c, 0, mediaPeriodId);
        return new SingleSampleMediaPeriod(null, this.i0, transferListener, null, this.j0, this.k0, eventDispatcher, this.l0);
    }
}
