package androidx.media3.exoplayer.source;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaSource extends WrappingMediaSource {
    public final long m0;
    public final boolean n0;
    public final ArrayList o0;
    public final Timeline.Window p0;
    public ClippingTimeline q0;
    public IllegalClippingException r0;
    public long s0;
    public long t0;

    public static final class ClippingTimeline extends ForwardingTimeline {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6345c;
        public final long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f6346e;
        public final boolean f;

        public ClippingTimeline(Timeline timeline, long j, long j2) throws IllegalClippingException {
            super(timeline);
            boolean z2 = false;
            if (timeline.h() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window windowM = timeline.m(0, new Timeline.Window(), 0L);
            long jMax = Math.max(0L, j);
            if (!windowM.j && jMax != 0 && !windowM.g) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? windowM.f5519l : Math.max(0L, j2);
            long j3 = windowM.f5519l;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f6345c = jMax;
            this.d = jMax2;
            this.f6346e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
            if (windowM.f5517h && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z2 = true;
            }
            this.f = z2;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            this.f6366b.f(0, period, z2);
            long j = period.f5511e - this.f6345c;
            long j2 = this.f6346e;
            period.h(period.f5508a, period.f5509b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, AdPlaybackState.f5367c, false);
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            this.f6366b.m(0, window, 0L);
            long j2 = window.o;
            long j3 = this.f6345c;
            window.o = j2 + j3;
            window.f5519l = this.f6346e;
            window.f5517h = this.f;
            long j4 = window.k;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                window.k = jMax;
                long j5 = this.d;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                window.k = jMax - j3;
            }
            long jT = Util.T(j3);
            long j6 = window.d;
            if (j6 != -9223372036854775807L) {
                window.d = j6 + jT;
            }
            long j7 = window.f5516e;
            if (j7 != -9223372036854775807L) {
                window.f5516e = j7 + jT;
            }
            return window;
        }
    }

    public static final class IllegalClippingException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int i2) {
            super("Illegal clipping: ".concat(i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClippingMediaSource(MediaSource mediaSource, long j, boolean z2) {
        super(mediaSource);
        mediaSource.getClass();
        this.m0 = j;
        this.n0 = z2;
        this.o0 = new ArrayList();
        this.p0 = new Timeline.Window();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.l0.A(mediaPeriodId, allocator, j), this.n0, this.s0, this.t0);
        this.o0.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        ArrayList arrayList = this.o0;
        Assertions.e(arrayList.remove(mediaPeriod));
        this.l0.G(((ClippingMediaPeriod) mediaPeriod).X);
        if (arrayList.isEmpty()) {
            ClippingTimeline clippingTimeline = this.q0;
            clippingTimeline.getClass();
            i0(clippingTimeline.f6366b);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void W(Timeline timeline) {
        if (this.r0 != null) {
            return;
        }
        i0(timeline);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void Z() {
        super.Z();
        this.r0 = null;
        this.q0 = null;
    }

    public final void i0(Timeline timeline) {
        long j;
        Timeline.Window window = this.p0;
        timeline.n(0, window);
        long j2 = window.o;
        ClippingTimeline clippingTimeline = this.q0;
        ArrayList arrayList = this.o0;
        long j3 = this.m0;
        if (clippingTimeline == null || arrayList.isEmpty()) {
            this.s0 = j2;
            this.t0 = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) arrayList.get(i2);
                long j4 = this.s0;
                long j5 = this.t0;
                clippingMediaPeriod.f0 = j4;
                clippingMediaPeriod.g0 = j5;
            }
            j = 0;
        } else {
            j = this.s0 - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.t0 - j2;
        }
        try {
            ClippingTimeline clippingTimeline2 = new ClippingTimeline(timeline, j, j3);
            this.q0 = clippingTimeline2;
            Y(clippingTimeline2);
        } catch (IllegalClippingException e2) {
            this.r0 = e2;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((ClippingMediaPeriod) arrayList.get(i3)).h0 = this.r0;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.r0;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }
}
