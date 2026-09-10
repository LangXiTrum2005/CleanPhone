package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class MaskingMediaSource extends WrappingMediaSource {
    public final boolean m0;
    public final Timeline.Window n0;
    public final Timeline.Period o0;
    public MaskingTimeline p0;
    public MaskingMediaPeriod q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;

    public static final class MaskingTimeline extends ForwardingTimeline {
        public static final Object f0 = new Object();
        public final Object Z;
        public final Object e0;

        public MaskingTimeline(Timeline timeline, Object obj, Object obj2) {
            super(timeline);
            this.Z = obj;
            this.e0 = obj2;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final int b(Object obj) {
            Object obj2;
            if (f0.equals(obj) && (obj2 = this.e0) != null) {
                obj = obj2;
            }
            return this.f18333Y.b(obj);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            this.f18333Y.f(i2, period, z2);
            if (Util.a(period.f17208Y, this.e0) && z2) {
                period.f17208Y = f0;
            }
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final Object l(int i2) {
            Object objL = this.f18333Y.l(i2);
            return Util.a(objL, this.e0) ? f0 : objL;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            this.f18333Y.m(i2, window, j);
            if (Util.a(window.X, this.Z)) {
                window.X = Timeline.Window.r0;
            }
            return window;
        }
    }

    public static final class PlaceholderTimeline extends Timeline {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final MediaItem f18341Y;

        public PlaceholderTimeline(MediaItem mediaItem) {
            this.f18341Y = mediaItem;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int b(Object obj) {
            return obj == MaskingTimeline.f0 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            period.g(z2 ? 0 : null, z2 ? MaskingTimeline.f0 : null, 0, -9223372036854775807L, 0L, AdPlaybackState.g0, true);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int h() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Object l(int i2) {
            return MaskingTimeline.f0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            window.b(Timeline.Window.r0, this.f18341Y, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            window.l0 = true;
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int o() {
            return 1;
        }
    }

    public MaskingMediaSource(MediaSource mediaSource, boolean z2) {
        super(mediaSource);
        this.m0 = z2 && mediaSource.r();
        this.n0 = new Timeline.Window();
        this.o0 = new Timeline.Period();
        Timeline timelineS = mediaSource.s();
        if (timelineS == null) {
            this.p0 = new MaskingTimeline(new PlaceholderTimeline(mediaSource.m()), Timeline.Window.r0, MaskingTimeline.f0);
        } else {
            this.p0 = new MaskingTimeline(timelineS, null, null);
            this.t0 = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final void B(MediaPeriod mediaPeriod) {
        ((MaskingMediaPeriod) mediaPeriod).g();
        if (mediaPeriod == this.q0) {
            this.q0 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void S(Timeline timeline) {
        long j;
        MaskingTimeline maskingTimeline;
        MediaSource.MediaPeriodId mediaPeriodIdB;
        MaskingTimeline maskingTimeline2;
        if (this.s0) {
            MaskingTimeline maskingTimeline3 = this.p0;
            this.p0 = new MaskingTimeline(timeline, maskingTimeline3.Z, maskingTimeline3.e0);
            MaskingMediaPeriod maskingMediaPeriod = this.q0;
            if (maskingMediaPeriod != null) {
                g0(maskingMediaPeriod.j0);
            }
        } else {
            if (!timeline.p()) {
                Timeline.Window window = this.n0;
                timeline.n(0, window);
                long j2 = window.m0;
                Object obj = window.X;
                MaskingMediaPeriod maskingMediaPeriod2 = this.q0;
                if (maskingMediaPeriod2 != null) {
                    MaskingTimeline maskingTimeline4 = this.p0;
                    Object obj2 = maskingMediaPeriod2.X.f18347a;
                    Timeline.Period period = this.o0;
                    maskingTimeline4.g(obj2, period);
                    long j3 = period.f0 + maskingMediaPeriod2.f18340Y;
                    this.p0.m(0, window, 0L);
                    if (j3 != window.m0) {
                        j = j3;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairI = timeline.i(this.n0, this.o0, 0, j);
                Object obj3 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.t0) {
                    MaskingTimeline maskingTimeline5 = this.p0;
                    maskingTimeline = new MaskingTimeline(timeline, maskingTimeline5.Z, maskingTimeline5.e0);
                } else {
                    maskingTimeline = new MaskingTimeline(timeline, obj, obj3);
                }
                this.p0 = maskingTimeline;
                MaskingMediaPeriod maskingMediaPeriod3 = this.q0;
                if (maskingMediaPeriod3 != null) {
                    g0(jLongValue);
                    MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod3.X;
                    Object obj4 = this.p0.e0;
                    Object obj5 = mediaPeriodId.f18347a;
                    if (obj4 != null && obj5.equals(MaskingTimeline.f0)) {
                        obj5 = this.p0.e0;
                    }
                    mediaPeriodIdB = mediaPeriodId.b(obj5);
                }
                this.t0 = true;
                this.s0 = true;
                U(this.p0);
                if (mediaPeriodIdB != null) {
                    MaskingMediaPeriod maskingMediaPeriod4 = this.q0;
                    maskingMediaPeriod4.getClass();
                    maskingMediaPeriod4.b(mediaPeriodIdB);
                }
            }
            if (this.t0) {
                MaskingTimeline maskingTimeline6 = this.p0;
                maskingTimeline2 = new MaskingTimeline(timeline, maskingTimeline6.Z, maskingTimeline6.e0);
            } else {
                maskingTimeline2 = new MaskingTimeline(timeline, Timeline.Window.r0, MaskingTimeline.f0);
            }
            this.p0 = maskingTimeline2;
        }
        mediaPeriodIdB = null;
        this.t0 = true;
        this.s0 = true;
        U(this.p0);
        if (mediaPeriodIdB != null) {
            MaskingMediaPeriod maskingMediaPeriod5 = this.q0;
            maskingMediaPeriod5.getClass();
            maskingMediaPeriod5.b(mediaPeriodIdB);
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void V() {
        this.s0 = false;
        this.r0 = false;
        super.V();
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    public final MediaSource.MediaPeriodId c0(MediaSource.MediaPeriodId mediaPeriodId) {
        Object obj = mediaPeriodId.f18347a;
        Object obj2 = this.p0.e0;
        if (obj2 != null && obj2.equals(obj)) {
            obj = MaskingTimeline.f0;
        }
        return mediaPeriodId.b(obj);
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    public final void e0() {
        if (this.m0) {
            return;
        }
        this.r0 = true;
        d0();
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final MaskingMediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
        maskingMediaPeriod.h(this.l0);
        if (!this.s0) {
            this.q0 = maskingMediaPeriod;
            if (!this.r0) {
                this.r0 = true;
                d0();
            }
            return maskingMediaPeriod;
        }
        Object obj = this.p0.e0;
        Object obj2 = mediaPeriodId.f18347a;
        if (obj != null && obj2.equals(MaskingTimeline.f0)) {
            obj2 = this.p0.e0;
        }
        maskingMediaPeriod.b(mediaPeriodId.b(obj2));
        return maskingMediaPeriod;
    }

    public final void g0(long j) {
        MaskingMediaPeriod maskingMediaPeriod = this.q0;
        int iB = this.p0.b(maskingMediaPeriod.X.f18347a);
        if (iB == -1) {
            return;
        }
        MaskingTimeline maskingTimeline = this.p0;
        Timeline.Period period = this.o0;
        maskingTimeline.f(iB, period, false);
        long j2 = period.e0;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        maskingMediaPeriod.j0 = j;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
