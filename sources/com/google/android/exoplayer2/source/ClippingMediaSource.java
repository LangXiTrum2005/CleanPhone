package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ClippingMediaSource extends WrappingMediaSource {
    public final long m0;
    public final long n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final ArrayList r0;
    public final Timeline.Window s0;
    public ClippingTimeline t0;
    public IllegalClippingException u0;
    public long v0;
    public long w0;

    public static final class ClippingTimeline extends ForwardingTimeline {
        public final long Z;
        public final long e0;
        public final long f0;
        public final boolean g0;

        public ClippingTimeline(Timeline timeline, long j, long j2) throws IllegalClippingException {
            super(timeline);
            boolean z2 = false;
            if (timeline.h() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window windowM = timeline.m(0, new Timeline.Window(), 0L);
            long jMax = Math.max(0L, j);
            if (!windowM.l0 && jMax != 0 && !windowM.h0) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? windowM.n0 : Math.max(0L, j2);
            long j3 = windowM.n0;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.Z = jMax;
            this.e0 = jMax2;
            this.f0 = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
            if (windowM.i0 && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z2 = true;
            }
            this.g0 = z2;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            this.f18333Y.f(0, period, z2);
            long j = period.f0 - this.Z;
            long j2 = this.f0;
            period.g(period.X, period.f17208Y, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, AdPlaybackState.g0, false);
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            this.f18333Y.m(0, window, 0L);
            long j2 = window.q0;
            long j3 = this.Z;
            window.q0 = j2 + j3;
            window.n0 = this.f0;
            window.i0 = this.g0;
            long j4 = window.m0;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                window.m0 = jMax;
                long j5 = this.e0;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                window.m0 = jMax - j3;
            }
            long J2 = Util.J(j3);
            long j6 = window.e0;
            if (j6 != -9223372036854775807L) {
                window.e0 = j6 + J2;
            }
            long j7 = window.f0;
            if (j7 != -9223372036854775807L) {
                window.f0 = j7 + J2;
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
    public ClippingMediaSource(MediaSource mediaSource, long j, long j2, boolean z2, boolean z3, boolean z4) {
        super(mediaSource);
        mediaSource.getClass();
        Assertions.b(j >= 0);
        this.m0 = j;
        this.n0 = j2;
        this.o0 = z2;
        this.p0 = z3;
        this.q0 = z4;
        this.r0 = new ArrayList();
        this.s0 = new Timeline.Window();
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final void B(MediaPeriod mediaPeriod) {
        ArrayList arrayList = this.r0;
        Assertions.d(arrayList.remove(mediaPeriod));
        this.l0.B(((ClippingMediaPeriod) mediaPeriod).X);
        if (!arrayList.isEmpty() || this.p0) {
            return;
        }
        ClippingTimeline clippingTimeline = this.t0;
        clippingTimeline.getClass();
        f0(clippingTimeline.f18333Y);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void S(Timeline timeline) {
        if (this.u0 != null) {
            return;
        }
        f0(timeline);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void V() {
        super.V();
        this.u0 = null;
        this.t0 = null;
    }

    public final void f0(Timeline timeline) {
        long j;
        long j2;
        long j3;
        Timeline.Window window = this.s0;
        timeline.n(0, window);
        long j4 = window.q0;
        ClippingTimeline clippingTimeline = this.t0;
        ArrayList arrayList = this.r0;
        long j5 = this.n0;
        if (clippingTimeline == null || arrayList.isEmpty() || this.p0) {
            boolean z2 = this.q0;
            j = this.m0;
            if (z2) {
                long j6 = window.m0;
                j += j6;
                j2 = j6 + j5;
            } else {
                j2 = j5;
            }
            this.v0 = j4 + j;
            this.w0 = j5 != Long.MIN_VALUE ? j4 + j2 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) arrayList.get(i2);
                long j7 = this.v0;
                long j8 = this.w0;
                clippingMediaPeriod.f0 = j7;
                clippingMediaPeriod.g0 = j8;
            }
            j3 = j2;
        } else {
            j = this.v0 - j4;
            j3 = j5 != Long.MIN_VALUE ? this.w0 - j4 : Long.MIN_VALUE;
        }
        try {
            ClippingTimeline clippingTimeline2 = new ClippingTimeline(timeline, j, j3);
            this.t0 = clippingTimeline2;
            U(clippingTimeline2);
        } catch (IllegalClippingException e2) {
            this.u0 = e2;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((ClippingMediaPeriod) arrayList.get(i3)).h0 = this.u0;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.u0;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.l0.u(mediaPeriodId, allocator, j), this.o0, this.v0, this.w0);
        this.r0.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }
}
