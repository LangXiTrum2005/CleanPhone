package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.AbstractConcatenatedTimeline;
import androidx.media3.exoplayer.upstream.Allocator;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> {
    public static final MediaItem o0;
    public Handler l0;
    public boolean m0;
    public ShuffleOrder n0;

    public static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        @Override // androidx.media3.common.Timeline
        public final int h() {
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public final int o() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int q(Object obj) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int r(int i2) {
            return Util.d(null, i2 + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int s(int i2) {
            return Util.d(null, i2 + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final Object t(int i2) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int u(int i2) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int v(int i2) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final Timeline x(int i2) {
            throw null;
        }
    }

    public static final class FakeMediaSource extends BaseMediaSource {
        @Override // androidx.media3.exoplayer.source.MediaSource
        public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public final void G(MediaPeriod mediaPeriod) {
        }

        @Override // androidx.media3.exoplayer.source.BaseMediaSource
        public final void X(TransferListener transferListener) {
        }

        @Override // androidx.media3.exoplayer.source.BaseMediaSource
        public final void Z() {
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public final MediaItem m() {
            return ConcatenatingMediaSource.o0;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public final void maybeThrowSourceInfoRefreshError() {
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
        builder.f5442b = Uri.EMPTY;
        o0 = builder.a();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        int i2 = AbstractConcatenatedTimeline.d;
        Pair pair = (Pair) mediaPeriodId.f6384a;
        Object obj = pair.first;
        mediaPeriodId.a(pair.second);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void U() {
        super.U();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void V() {
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final synchronized void X(TransferListener transferListener) {
        super.X(transferListener);
        this.l0 = new Handler(new b(this, 0));
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final synchronized void Z() {
        super.Z();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId a0(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        ((MediaSourceHolder) obj).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final int c0(Object obj, int i2) {
        ((MediaSourceHolder) obj).getClass();
        return i2;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void d0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        ((MediaSourceHolder) obj).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaItem m() {
        return o0;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized Timeline s() {
        this.n0.getLength();
        throw null;
    }
}
