package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    public Handler l0;
    public boolean m0;
    public MediaItem n0;

    public static final class Builder {
    }

    public static final class ConcatenatedTimeline extends Timeline {
        @Override // androidx.media3.common.Timeline
        public final int b(Object obj) {
            if (!(obj instanceof Pair)) {
                return -1;
            }
            Object obj2 = ((Pair) obj).first;
            if (!(obj2 instanceof Integer)) {
                return -1;
            }
            ((Integer) obj2).intValue();
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            q(i2);
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Period g(Object obj, Timeline.Period period) {
            Pair pair = (Pair) obj;
            ((Integer) pair.first).intValue();
            Object obj2 = pair.second;
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int h() {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Object l(int i2) {
            q(i2);
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            Object obj = Timeline.Window.f5512p;
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int o() {
            return 1;
        }

        public final int q(int i2) {
            int i3 = Util.f5683a;
            throw null;
        }
    }

    public static final class MediaSourceHolder {
    }

    public static void g0() {
        new Timeline.Period();
        ImmutableList.s();
        ImmutableList.s();
        ImmutableList.s();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        ((Integer) ((Pair) mediaPeriodId.f6384a).first).intValue();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized void M(MediaItem mediaItem) {
        this.n0 = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void V() {
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void X(TransferListener transferListener) {
        super.X(transferListener);
        this.l0 = new Handler(new b(this, 1));
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void Z() {
        super.Z();
        Handler handler = this.l0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.l0 = null;
        }
        this.m0 = false;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId a0(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        long j = mediaPeriodId.d;
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final long b0(Object obj, long j, MediaSource.MediaPeriodId mediaPeriodId) {
        Integer num = (Integer) obj;
        if (j == -9223372036854775807L || mediaPeriodId == null || mediaPeriodId.b()) {
            return j;
        }
        num.intValue();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final /* bridge */ /* synthetic */ int c0(Object obj, int i2) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void d0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        if (this.m0) {
            return;
        }
        Handler handler = this.l0;
        handler.getClass();
        handler.obtainMessage(1).sendToTarget();
        this.m0 = true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized MediaItem m() {
        return this.n0;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final Timeline s() {
        g0();
        throw null;
    }
}
