package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.AbstractConcatenatedTimeline;
import androidx.media3.exoplayer.upstream.Allocator;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class LoopingMediaSource extends WrappingMediaSource {

    public static final class InfinitelyLoopingTimeline extends ForwardingTimeline {
        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final int e(int i2, int i3, boolean z2) {
            Timeline timeline = this.f6366b;
            int iE = timeline.e(i2, i3, z2);
            return iE == -1 ? timeline.a(z2) : iE;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final int k(int i2, int i3, boolean z2) {
            Timeline timeline = this.f6366b;
            int iK = timeline.k(i2, i3, z2);
            return iK == -1 ? timeline.c(z2) : iK;
        }
    }

    public static final class LoopingTimeline extends AbstractConcatenatedTimeline {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Timeline f6373e;
        public final int f;
        public final int g;

        public LoopingTimeline(Timeline timeline) {
            super(new ShuffleOrder.UnshuffledShuffleOrder(0));
            this.f6373e = timeline;
            int iH = timeline.h();
            this.f = iH;
            this.g = timeline.o();
            if (iH > 0) {
                Assertions.d("LoopingMediaSource contains too many periods", Integer.MAX_VALUE / iH >= 0);
            }
        }

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
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int r(int i2) {
            return i2 / this.f;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int s(int i2) {
            return i2 / this.g;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final Object t(int i2) {
            return Integer.valueOf(i2);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int u(int i2) {
            return i2 * this.f;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int v(int i2) {
            return i2 * this.g;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final Timeline x(int i2) {
            return this.f6373e;
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        int i2 = AbstractConcatenatedTimeline.d;
        mediaPeriodId.a(((Pair) mediaPeriodId.f6384a).second);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        this.l0.G(mediaPeriod);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void W(Timeline timeline) {
        Y(new LoopingTimeline(timeline));
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public final MediaSource.MediaPeriodId g0(MediaSource.MediaPeriodId mediaPeriodId) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final boolean r() {
        return false;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final Timeline s() {
        return new LoopingTimeline(((MaskingMediaSource) this.l0).p0);
    }
}
