package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    public Handler l0;
    public boolean m0;

    public static final class Builder {
    }

    public static final class ConcatenatedTimeline extends Timeline {
        @Override // com.google.android.exoplayer2.Timeline
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

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Period g(Object obj, Timeline.Period period) {
            Pair pair = (Pair) obj;
            ((Integer) pair.first).intValue();
            Object obj2 = pair.second;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int h() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Object l(int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            Object obj = Timeline.Window.r0;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int o() {
            return 1;
        }
    }

    public static final class MediaSourceHolder {
    }

    public static void c0() {
        new Timeline.Period();
        ImmutableList.s();
        ImmutableList.s();
        ImmutableList.s();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void B(MediaPeriod mediaPeriod) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void R() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void T(TransferListener transferListener) {
        super.T(transferListener);
        this.l0 = new Handler(new b(this, 1));
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void V() {
        super.V();
        Handler handler = this.l0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.l0 = null;
        }
        this.m0 = false;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId W(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        long j = mediaPeriodId.d;
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final /* bridge */ /* synthetic */ int Y(Object obj, int i2) {
        return 0;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final void Z(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        if (this.m0) {
            return;
        }
        Handler handler = this.l0;
        handler.getClass();
        handler.obtainMessage(0).sendToTarget();
        this.m0 = true;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaItem m() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final Timeline s() {
        c0();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        ((Integer) ((Pair) mediaPeriodId.f18347a).first).intValue();
        throw null;
    }
}
