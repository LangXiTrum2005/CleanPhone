package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> {
    public static final MediaItem o0;
    public Handler l0;
    public boolean m0;
    public ShuffleOrder n0;

    public static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        @Override // com.google.android.exoplayer2.Timeline
        public final int h() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int o() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int q(Object obj) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int r(int i2) {
            return Util.e(null, i2 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int s(int i2) {
            return Util.e(null, i2 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final Object t(int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int u(int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int v(int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final Timeline x(int i2) {
            throw null;
        }
    }

    public static final class FakeMediaSource extends BaseMediaSource {
        @Override // com.google.android.exoplayer2.source.MediaSource
        public final void B(MediaPeriod mediaPeriod) {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        public final void T(TransferListener transferListener) {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        public final void V() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public final MediaItem m() {
            return ConcatenatingMediaSource.o0;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public final void maybeThrowSourceInfoRefreshError() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public final MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class HandlerAndRunnable {
    }

    public static final class MediaSourceHolder {
    }

    public static final class MessageData<T> {
    }

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f17097b = Uri.EMPTY;
        o0 = builder.a();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void B(MediaPeriod mediaPeriod) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void Q() {
        super.Q();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void R() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final synchronized void T(TransferListener transferListener) {
        super.T(transferListener);
        this.l0 = new Handler(new b(this, 0));
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final synchronized void V() {
        super.V();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId W(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        ((MediaSourceHolder) obj).getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final int Y(Object obj, int i2) {
        ((MediaSourceHolder) obj).getClass();
        return i2;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final void Z(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        ((MediaSourceHolder) obj).getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaItem m() {
        return o0;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final synchronized Timeline s() {
        this.n0.getLength();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        int i2 = AbstractConcatenatedTimeline.e0;
        Pair pair = (Pair) mediaPeriodId.f18347a;
        Object obj = pair.first;
        mediaPeriodId.b(pair.second);
        throw null;
    }
}
