package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class LoopingMediaSource extends WrappingMediaSource {

    public static final class InfinitelyLoopingTimeline extends ForwardingTimeline {
        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final int e(int i2, int i3, boolean z2) {
            Timeline timeline = this.f18333Y;
            int iE = timeline.e(i2, i3, z2);
            return iE == -1 ? timeline.a(z2) : iE;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final int k(int i2, int i3, boolean z2) {
            Timeline timeline = this.f18333Y;
            int iK = timeline.k(i2, i3, z2);
            return iK == -1 ? timeline.c(z2) : iK;
        }
    }

    public static final class LoopingTimeline extends AbstractConcatenatedTimeline {
        public final Timeline f0;
        public final int g0;
        public final int h0;

        public LoopingTimeline(Timeline timeline) {
            super(new ShuffleOrder.UnshuffledShuffleOrder(0));
            this.f0 = timeline;
            int iH = timeline.h();
            this.g0 = iH;
            this.h0 = timeline.o();
            if (iH > 0) {
                if (!(Integer.MAX_VALUE / iH >= 0)) {
                    throw new IllegalStateException("LoopingMediaSource contains too many periods");
                }
            }
        }

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
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int r(int i2) {
            return i2 / this.g0;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int s(int i2) {
            return i2 / this.h0;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final Object t(int i2) {
            return Integer.valueOf(i2);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int u(int i2) {
            return i2 * this.g0;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int v(int i2) {
            return i2 * this.h0;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final Timeline x(int i2) {
            return this.f0;
        }
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final void B(MediaPeriod mediaPeriod) {
        this.l0.B(mediaPeriod);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void S(Timeline timeline) {
        U(new LoopingTimeline(timeline));
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    public final MediaSource.MediaPeriodId c0(MediaSource.MediaPeriodId mediaPeriodId) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final boolean r() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final Timeline s() {
        return new LoopingTimeline(((MaskingMediaSource) this.l0).p0);
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        int i2 = AbstractConcatenatedTimeline.e0;
        mediaPeriodId.b(((Pair) mediaPeriodId.f18347a).second);
        throw null;
    }
}
