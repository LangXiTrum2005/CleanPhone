package com.google.android.exoplayer2;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Timeline implements Bundleable {
    public static final Timeline X = new AnonymousClass1();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.Timeline$1, reason: invalid class name */
    public class AnonymousClass1 extends Timeline {
        @Override // com.google.android.exoplayer2.Timeline
        public final int b(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Period f(int i2, Period period, boolean z2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int h() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Object l(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Window m(int i2, Window window, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int o() {
            return 0;
        }
    }

    public static final class Period implements Bundleable {
        public static final String i0;
        public static final String j0;
        public static final String k0;
        public static final String l0;
        public static final String m0;
        public Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f17208Y;
        public int Z;
        public long e0;
        public long f0;
        public boolean g0;
        public AdPlaybackState h0 = AdPlaybackState.g0;

        static {
            int i2 = Util.f18979a;
            i0 = Integer.toString(0, 36);
            j0 = Integer.toString(1, 36);
            k0 = Integer.toString(2, 36);
            l0 = Integer.toString(3, 36);
            m0 = Integer.toString(4, 36);
        }

        public final long a(int i2, int i3) {
            AdPlaybackState.AdGroup adGroupA = this.h0.a(i2);
            if (adGroupA.f18427Y != -1) {
                return adGroupA.g0[i3];
            }
            return -9223372036854775807L;
        }

        public final int b(long j) {
            int i2;
            AdPlaybackState.AdGroup adGroupA;
            int i3;
            AdPlaybackState adPlaybackState = this.h0;
            long j2 = this.e0;
            adPlaybackState.getClass();
            if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
                int i4 = adPlaybackState.e0;
                while (true) {
                    i2 = adPlaybackState.X;
                    if (i4 >= i2 || ((adPlaybackState.a(i4).X == Long.MIN_VALUE || adPlaybackState.a(i4).X > j) && ((i3 = (adGroupA = adPlaybackState.a(i4)).f18427Y) == -1 || adGroupA.a(-1) < i3))) {
                        break;
                    }
                    i4++;
                }
                if (i4 < i2) {
                    return i4;
                }
            }
            return -1;
        }

        public final int c(long j) {
            AdPlaybackState adPlaybackState = this.h0;
            long j2 = this.e0;
            int i2 = adPlaybackState.X - 1;
            while (i2 >= 0 && j != Long.MIN_VALUE) {
                long j3 = adPlaybackState.a(i2).X;
                if (j3 != Long.MIN_VALUE) {
                    if (j >= j3) {
                        break;
                    }
                    i2--;
                } else {
                    if (j2 != -9223372036854775807L && j >= j2) {
                        break;
                    }
                    i2--;
                }
            }
            if (i2 >= 0) {
                AdPlaybackState.AdGroup adGroupA = adPlaybackState.a(i2);
                int i3 = adGroupA.f18427Y;
                if (i3 != -1) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = adGroupA.f0[i4];
                        if (i5 != 0 && i5 != 1) {
                        }
                    }
                }
                return i2;
            }
            return -1;
        }

        public final int d(int i2, int i3) {
            AdPlaybackState.AdGroup adGroupA = this.h0.a(i2);
            if (adGroupA.f18427Y != -1) {
                return adGroupA.f0[i3];
            }
            return 0;
        }

        public final int e(int i2) {
            return this.h0.a(i2).a(-1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Period.class.equals(obj.getClass())) {
                Period period = (Period) obj;
                if (Util.a(this.X, period.X) && Util.a(this.f17208Y, period.f17208Y) && this.Z == period.Z && this.e0 == period.e0 && this.f0 == period.f0 && this.g0 == period.g0 && Util.a(this.h0, period.h0)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean f(int i2) {
            return this.h0.a(i2).i0;
        }

        public final void g(Object obj, Object obj2, int i2, long j, long j2, AdPlaybackState adPlaybackState, boolean z2) {
            this.X = obj;
            this.f17208Y = obj2;
            this.Z = i2;
            this.e0 = j;
            this.f0 = j2;
            this.h0 = adPlaybackState;
            this.g0 = z2;
        }

        public final int hashCode() {
            Object obj = this.X;
            int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f17208Y;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.Z) * 31;
            long j = this.e0;
            int i2 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f0;
            return this.h0.hashCode() + ((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.g0 ? 1 : 0)) * 31);
        }
    }

    public static final class RemotableTimeline extends Timeline {
        @Override // com.google.android.exoplayer2.Timeline
        public final int a(boolean z2) {
            if (p()) {
                return -1;
            }
            if (z2) {
                throw null;
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int c(boolean z2) {
            if (p()) {
                return -1;
            }
            if (z2) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int e(int i2, int i3, boolean z2) {
            if (i3 == 1) {
                return i2;
            }
            if (i2 == c(z2)) {
                if (i3 == 2) {
                    return a(z2);
                }
                return -1;
            }
            if (z2) {
                throw null;
            }
            return i2 + 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Period f(int i2, Period period, boolean z2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int h() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int k(int i2, int i3, boolean z2) {
            if (i3 == 1) {
                return i2;
            }
            if (i2 == a(z2)) {
                if (i3 == 2) {
                    return c(z2);
                }
                return -1;
            }
            if (z2) {
                throw null;
            }
            return i2 - 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Object l(int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Window m(int i2, Window window, long j) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int o() {
            throw null;
        }
    }

    public static final class Window implements Bundleable {
        public static final String A0;
        public static final String B0;
        public static final String C0;
        public static final String D0;
        public static final String E0;
        public static final String F0;
        public static final String G0;
        public static final Object r0 = new Object();
        public static final Object s0 = new Object();
        public static final MediaItem t0;
        public static final String u0;
        public static final String v0;
        public static final String w0;
        public static final String x0;
        public static final String y0;
        public static final String z0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f17209Y;
        public long e0;
        public long f0;
        public long g0;
        public boolean h0;
        public boolean i0;
        public boolean j0;
        public MediaItem.LiveConfiguration k0;
        public boolean l0;
        public long m0;
        public long n0;
        public int o0;
        public int p0;
        public long q0;
        public Object X = r0;
        public MediaItem Z = t0;

        static {
            MediaItem.Builder builder = new MediaItem.Builder();
            builder.f17096a = "com.google.android.exoplayer2.Timeline";
            builder.f17097b = Uri.EMPTY;
            t0 = builder.a();
            int i2 = Util.f18979a;
            u0 = Integer.toString(1, 36);
            v0 = Integer.toString(2, 36);
            w0 = Integer.toString(3, 36);
            x0 = Integer.toString(4, 36);
            y0 = Integer.toString(5, 36);
            z0 = Integer.toString(6, 36);
            A0 = Integer.toString(7, 36);
            B0 = Integer.toString(8, 36);
            C0 = Integer.toString(9, 36);
            D0 = Integer.toString(10, 36);
            E0 = Integer.toString(11, 36);
            F0 = Integer.toString(12, 36);
            G0 = Integer.toString(13, 36);
        }

        public final boolean a() {
            Assertions.d(this.j0 == (this.k0 != null));
            return this.k0 != null;
        }

        public final void b(Object obj, MediaItem mediaItem, long j, long j2, long j3, boolean z2, boolean z3, MediaItem.LiveConfiguration liveConfiguration, long j4, long j5, int i2, int i3, long j6) {
            this.X = obj;
            this.Z = mediaItem != null ? mediaItem : t0;
            if (mediaItem != null) {
                MediaItem.PlaybackProperties playbackProperties = mediaItem.f17095Y;
            }
            this.f17209Y = null;
            this.e0 = j;
            this.f0 = j2;
            this.g0 = j3;
            this.h0 = z2;
            this.i0 = z3;
            this.j0 = liveConfiguration != null;
            this.k0 = liveConfiguration;
            this.m0 = j4;
            this.n0 = j5;
            this.o0 = i2;
            this.p0 = i3;
            this.q0 = j6;
            this.l0 = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            return Util.a(this.X, window.X) && Util.a(this.Z, window.Z) && Util.a(this.k0, window.k0) && this.e0 == window.e0 && this.f0 == window.f0 && this.g0 == window.g0 && this.h0 == window.h0 && this.i0 == window.i0 && this.l0 == window.l0 && this.m0 == window.m0 && this.n0 == window.n0 && this.o0 == window.o0 && this.p0 == window.p0 && this.q0 == window.q0;
        }

        public final int hashCode() {
            int iHashCode = (this.Z.hashCode() + ((this.X.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 961;
            MediaItem.LiveConfiguration liveConfiguration = this.k0;
            int iHashCode2 = liveConfiguration == null ? 0 : liveConfiguration.hashCode();
            long j = this.e0;
            int i2 = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f0;
            int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.g0;
            int i4 = (((((((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h0 ? 1 : 0)) * 31) + (this.i0 ? 1 : 0)) * 31) + (this.l0 ? 1 : 0)) * 31;
            long j4 = this.m0;
            int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.n0;
            int i6 = (((((i5 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.o0) * 31) + this.p0) * 31;
            long j6 = this.q0;
            return i6 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    static {
        int i2 = Util.f18979a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public int a(boolean z2) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z2) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i2, Period period, Window window, int i3, boolean z2) {
        int i4 = f(i2, period, false).Z;
        if (m(i4, window, 0L).p0 != i2) {
            return i2 + 1;
        }
        int iE = e(i4, i3, z2);
        if (iE == -1) {
            return -1;
        }
        return m(iE, window, 0L).o0;
    }

    public int e(int i2, int i3, boolean z2) {
        if (i3 == 0) {
            if (i2 == c(z2)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == c(z2) ? a(z2) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof Timeline) {
                Timeline timeline = (Timeline) obj;
                if (timeline.o() == o() && timeline.h() == h()) {
                    Window window = new Window();
                    Period period = new Period();
                    Window window2 = new Window();
                    Period period2 = new Period();
                    for (int i2 = 0; i2 < o(); i2++) {
                        if (m(i2, window, 0L).equals(timeline.m(i2, window2, 0L))) {
                        }
                    }
                    for (int i3 = 0; i3 < h(); i3++) {
                        if (f(i3, period, true).equals(timeline.f(i3, period2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == timeline.a(true) && (iC = c(true)) == timeline.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == timeline.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Period f(int i2, Period period, boolean z2);

    public Period g(Object obj, Period period) {
        return f(b(obj), period, true);
    }

    public abstract int h();

    public final int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int iO = o() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i2 = 0; i2 < o(); i2++) {
            iO = (iO * 31) + m(i2, window, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i3 = 0; i3 < h(); i3++) {
            iH = (iH * 31) + f(i3, period, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(Window window, Period period, int i2, long j) {
        Pair pairJ = j(window, period, i2, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(Window window, Period period, int i2, long j, long j2) {
        Assertions.c(i2, o());
        m(i2, window, j2);
        if (j == -9223372036854775807L) {
            j = window.m0;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = window.o0;
        f(i3, period, false);
        while (i3 < window.p0 && period.f0 != j) {
            int i4 = i3 + 1;
            if (f(i4, period, false).f0 > j) {
                break;
            }
            i3 = i4;
        }
        f(i3, period, true);
        long jMin = j - period.f0;
        long j3 = period.e0;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = period.f17208Y;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i2, int i3, boolean z2) {
        if (i3 == 0) {
            if (i2 == a(z2)) {
                return -1;
            }
            return i2 - 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == a(z2) ? c(z2) : i2 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i2);

    public abstract Window m(int i2, Window window, long j);

    public final void n(int i2, Window window) {
        m(i2, window, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
