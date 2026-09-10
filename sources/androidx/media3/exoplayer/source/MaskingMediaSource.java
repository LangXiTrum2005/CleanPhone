package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.Allocator;

/* JADX INFO: loaded from: classes.dex */
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

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Object f6375e = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f6376c;
        public final Object d;

        public MaskingTimeline(Timeline timeline, Object obj, Object obj2) {
            super(timeline);
            this.f6376c = obj;
            this.d = obj2;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final int b(Object obj) {
            Object obj2;
            if (f6375e.equals(obj) && (obj2 = this.d) != null) {
                obj = obj2;
            }
            return this.f6366b.b(obj);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            this.f6366b.f(i2, period, z2);
            if (Util.a(period.f5509b, this.d) && z2) {
                period.f5509b = f6375e;
            }
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Object l(int i2) {
            Object objL = this.f6366b.l(i2);
            return Util.a(objL, this.d) ? f6375e : objL;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            this.f6366b.m(i2, window, j);
            if (Util.a(window.f5513a, this.f6376c)) {
                window.f5513a = Timeline.Window.f5512p;
            }
            return window;
        }
    }

    public static final class PlaceholderTimeline extends Timeline {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaItem f6377b;

        public PlaceholderTimeline(MediaItem mediaItem) {
            this.f6377b = mediaItem;
        }

        @Override // androidx.media3.common.Timeline
        public final int b(Object obj) {
            return obj == MaskingTimeline.f6375e ? 0 : -1;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            period.h(z2 ? 0 : null, z2 ? MaskingTimeline.f6375e : null, 0, -9223372036854775807L, 0L, AdPlaybackState.f5367c, true);
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public final int h() {
            return 1;
        }

        @Override // androidx.media3.common.Timeline
        public final Object l(int i2) {
            return MaskingTimeline.f6375e;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            window.b(Timeline.Window.f5512p, this.f6377b, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            window.j = true;
            return window;
        }

        @Override // androidx.media3.common.Timeline
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
            this.p0 = new MaskingTimeline(new PlaceholderTimeline(mediaSource.m()), Timeline.Window.f5512p, MaskingTimeline.f6375e);
        } else {
            this.p0 = new MaskingTimeline(timelineS, null, null);
            this.t0 = true;
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        ((MaskingMediaPeriod) mediaPeriod).h();
        if (mediaPeriod == this.q0) {
            this.q0 = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void M(MediaItem mediaItem) {
        if (this.t0) {
            MaskingTimeline maskingTimeline = this.p0;
            this.p0 = new MaskingTimeline(new TimelineWithUpdatedMediaItem(this.p0.f6366b, mediaItem), maskingTimeline.f6376c, maskingTimeline.d);
        } else {
            this.p0 = new MaskingTimeline(new PlaceholderTimeline(mediaItem), Timeline.Window.f5512p, MaskingTimeline.f6375e);
        }
        this.l0.M(mediaItem);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void W(Timeline timeline) {
        long j;
        MaskingTimeline maskingTimeline;
        MediaSource.MediaPeriodId mediaPeriodIdA;
        MaskingTimeline maskingTimeline2;
        if (this.s0) {
            MaskingTimeline maskingTimeline3 = this.p0;
            this.p0 = new MaskingTimeline(timeline, maskingTimeline3.f6376c, maskingTimeline3.d);
            MaskingMediaPeriod maskingMediaPeriod = this.q0;
            if (maskingMediaPeriod != null) {
                j0(maskingMediaPeriod.j0);
            }
        } else {
            if (!timeline.p()) {
                Timeline.Window window = this.n0;
                timeline.n(0, window);
                long j2 = window.k;
                Object obj = window.f5513a;
                MaskingMediaPeriod maskingMediaPeriod2 = this.q0;
                if (maskingMediaPeriod2 != null) {
                    MaskingTimeline maskingTimeline4 = this.p0;
                    Object obj2 = maskingMediaPeriod2.X.f6384a;
                    Timeline.Period period = this.o0;
                    maskingTimeline4.g(obj2, period);
                    long j3 = period.f5511e + maskingMediaPeriod2.f6374Y;
                    this.p0.m(0, window, 0L);
                    if (j3 != window.k) {
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
                    maskingTimeline = new MaskingTimeline(timeline, maskingTimeline5.f6376c, maskingTimeline5.d);
                } else {
                    maskingTimeline = new MaskingTimeline(timeline, obj, obj3);
                }
                this.p0 = maskingTimeline;
                MaskingMediaPeriod maskingMediaPeriod3 = this.q0;
                if (maskingMediaPeriod3 != null && j0(jLongValue)) {
                    MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod3.X;
                    Object obj4 = this.p0.d;
                    Object obj5 = mediaPeriodId.f6384a;
                    if (obj4 != null && obj5.equals(MaskingTimeline.f6375e)) {
                        obj5 = this.p0.d;
                    }
                    mediaPeriodIdA = mediaPeriodId.a(obj5);
                }
                this.t0 = true;
                this.s0 = true;
                Y(this.p0);
                if (mediaPeriodIdA != null) {
                    MaskingMediaPeriod maskingMediaPeriod4 = this.q0;
                    maskingMediaPeriod4.getClass();
                    maskingMediaPeriod4.g(mediaPeriodIdA);
                }
            }
            if (this.t0) {
                MaskingTimeline maskingTimeline6 = this.p0;
                maskingTimeline2 = new MaskingTimeline(timeline, maskingTimeline6.f6376c, maskingTimeline6.d);
            } else {
                maskingTimeline2 = new MaskingTimeline(timeline, Timeline.Window.f5512p, MaskingTimeline.f6375e);
            }
            this.p0 = maskingTimeline2;
        }
        mediaPeriodIdA = null;
        this.t0 = true;
        this.s0 = true;
        Y(this.p0);
        if (mediaPeriodIdA != null) {
            MaskingMediaPeriod maskingMediaPeriod5 = this.q0;
            maskingMediaPeriod5.getClass();
            maskingMediaPeriod5.g(mediaPeriodIdA);
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void Z() {
        this.s0 = false;
        this.r0 = false;
        super.Z();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public final MediaSource.MediaPeriodId g0(MediaSource.MediaPeriodId mediaPeriodId) {
        Object obj = mediaPeriodId.f6384a;
        Object obj2 = this.p0.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = MaskingTimeline.f6375e;
        }
        return mediaPeriodId.a(obj);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public final void h0() {
        if (this.m0) {
            return;
        }
        this.r0 = true;
        e0(null, this.l0);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final MaskingMediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
        MediaSource mediaSource = this.l0;
        maskingMediaPeriod.i(mediaSource);
        if (!this.s0) {
            this.q0 = maskingMediaPeriod;
            if (!this.r0) {
                this.r0 = true;
                e0(null, mediaSource);
            }
            return maskingMediaPeriod;
        }
        Object obj = this.p0.d;
        Object obj2 = mediaPeriodId.f6384a;
        if (obj != null && obj2.equals(MaskingTimeline.f6375e)) {
            obj2 = this.p0.d;
        }
        maskingMediaPeriod.g(mediaPeriodId.a(obj2));
        return maskingMediaPeriod;
    }

    public final boolean j0(long j) {
        MaskingMediaPeriod maskingMediaPeriod = this.q0;
        int iB = this.p0.b(maskingMediaPeriod.X.f6384a);
        if (iB == -1) {
            return false;
        }
        MaskingTimeline maskingTimeline = this.p0;
        Timeline.Period period = this.o0;
        maskingTimeline.f(iB, period, false);
        long j2 = period.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        maskingMediaPeriod.j0 = j;
        return true;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
