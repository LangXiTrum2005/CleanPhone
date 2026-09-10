package androidx.media3.common;

import android.net.Uri;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes.dex */
public abstract class Timeline {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Timeline f5507a = new AnonymousClass1();

    /* JADX INFO: renamed from: androidx.media3.common.Timeline$1, reason: invalid class name */
    public class AnonymousClass1 extends Timeline {
        @Override // androidx.media3.common.Timeline
        public final int b(Object obj) {
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public final Period f(int i2, Period period, boolean z2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public final int h() {
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public final Object l(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public final Window m(int i2, Window window, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public final int o() {
            return 0;
        }
    }

    public static final class Period {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5510c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f5511e;
        public boolean f;
        public AdPlaybackState g = AdPlaybackState.f5367c;

        static {
            a.s(0, 1, 2, 3, 4);
        }

        public final long a(int i2, int i3) {
            AdPlaybackState.AdGroup adGroupA = this.g.a(i2);
            if (adGroupA.f5370a != -1) {
                return adGroupA.f[i3];
            }
            return -9223372036854775807L;
        }

        public final int b(long j) {
            int i2;
            AdPlaybackState.AdGroup adGroupA;
            int i3;
            AdPlaybackState adPlaybackState = this.g;
            long j2 = this.d;
            adPlaybackState.getClass();
            if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
                int i4 = 0;
                while (true) {
                    i2 = adPlaybackState.f5368a;
                    if (i4 >= i2) {
                        break;
                    }
                    adPlaybackState.a(i4).getClass();
                    adPlaybackState.a(i4).getClass();
                    if (0 > j && ((i3 = (adGroupA = adPlaybackState.a(i4)).f5370a) == -1 || adGroupA.a(-1) < i3)) {
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
            AdPlaybackState adPlaybackState = this.g;
            int i2 = adPlaybackState.f5368a - 1;
            adPlaybackState.b(i2);
            while (i2 >= 0 && j != Long.MIN_VALUE) {
                adPlaybackState.a(i2).getClass();
                if (j >= 0) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                AdPlaybackState.AdGroup adGroupA = adPlaybackState.a(i2);
                int i3 = adGroupA.f5370a;
                if (i3 != -1) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = adGroupA.f5373e[i4];
                        if (i5 != 0 && i5 != 1) {
                        }
                    }
                }
                return i2;
            }
            return -1;
        }

        public final long d(int i2) {
            this.g.a(i2).getClass();
            return 0L;
        }

        public final int e(int i2) {
            return this.g.a(i2).a(-1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Period.class.equals(obj.getClass())) {
                return false;
            }
            Period period = (Period) obj;
            return Util.a(this.f5508a, period.f5508a) && Util.a(this.f5509b, period.f5509b) && this.f5510c == period.f5510c && this.d == period.d && this.f5511e == period.f5511e && this.f == period.f && Util.a(this.g, period.g);
        }

        public final boolean f(int i2) {
            AdPlaybackState adPlaybackState = this.g;
            if (i2 != adPlaybackState.f5368a - 1) {
                return false;
            }
            adPlaybackState.b(i2);
            return false;
        }

        public final boolean g(int i2) {
            this.g.a(i2).getClass();
            return false;
        }

        public final void h(Object obj, Object obj2, int i2, long j, long j2, AdPlaybackState adPlaybackState, boolean z2) {
            this.f5508a = obj;
            this.f5509b = obj2;
            this.f5510c = i2;
            this.d = j;
            this.f5511e = j2;
            this.g = adPlaybackState;
            this.f = z2;
        }

        public final int hashCode() {
            Object obj = this.f5508a;
            int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f5509b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f5510c) * 31;
            long j = this.d;
            int i2 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f5511e;
            return this.g.hashCode() + ((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
        }
    }

    public static final class RemotableTimeline extends Timeline {
        @Override // androidx.media3.common.Timeline
        public final int a(boolean z2) {
            if (p()) {
                return -1;
            }
            if (z2) {
                throw null;
            }
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public final int b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.Timeline
        public final int c(boolean z2) {
            if (p()) {
                return -1;
            }
            if (z2) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int e(int i2, int i3, boolean z2) {
            if (i3 == 1) {
                return i2;
            }
            c(z2);
            if (i2 == -1) {
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

        @Override // androidx.media3.common.Timeline
        public final Period f(int i2, Period period, boolean z2) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int h() {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int k(int i2, int i3, boolean z2) {
            if (i3 == 1) {
                return i2;
            }
            if (i2 != a(z2)) {
                if (z2) {
                    throw null;
                }
                return i2 - 1;
            }
            if (i3 != 2) {
                return -1;
            }
            c(z2);
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public final Object l(int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.Timeline
        public final Window m(int i2, Window window, long j) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int o() {
            throw null;
        }
    }

    public static final class Window {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Object f5512p = new Object();
        public static final MediaItem q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5514b;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f5516e;
        public long f;
        public boolean g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f5517h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public MediaItem.LiveConfiguration f5518i;
        public boolean j;
        public long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f5519l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5520n;
        public long o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5513a = f5512p;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public MediaItem f5515c = q;

        static {
            MediaItem.Builder builder = new MediaItem.Builder();
            builder.f5441a = "androidx.media3.common.Timeline";
            builder.f5442b = Uri.EMPTY;
            q = builder.a();
            a.s(1, 2, 3, 4, 5);
            a.s(6, 7, 8, 9, 10);
            Util.E(11);
            Util.E(12);
            Util.E(13);
        }

        public final boolean a() {
            return this.f5518i != null;
        }

        public final void b(Object obj, MediaItem mediaItem, long j, long j2, long j3, boolean z2, boolean z3, MediaItem.LiveConfiguration liveConfiguration, long j4, long j5, int i2, int i3, long j6) {
            this.f5513a = obj;
            this.f5515c = mediaItem != null ? mediaItem : q;
            if (mediaItem != null) {
                MediaItem.LocalConfiguration localConfiguration = mediaItem.f5438b;
            }
            this.f5514b = null;
            this.d = j;
            this.f5516e = j2;
            this.f = j3;
            this.g = z2;
            this.f5517h = z3;
            this.f5518i = liveConfiguration;
            this.k = j4;
            this.f5519l = j5;
            this.m = i2;
            this.f5520n = i3;
            this.o = j6;
            this.j = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            return Util.a(this.f5513a, window.f5513a) && Util.a(this.f5515c, window.f5515c) && Util.a(this.f5518i, window.f5518i) && this.d == window.d && this.f5516e == window.f5516e && this.f == window.f && this.g == window.g && this.f5517h == window.f5517h && this.j == window.j && this.k == window.k && this.f5519l == window.f5519l && this.m == window.m && this.f5520n == window.f5520n && this.o == window.o;
        }

        public final int hashCode() {
            int iHashCode = (this.f5515c.hashCode() + ((this.f5513a.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 961;
            MediaItem.LiveConfiguration liveConfiguration = this.f5518i;
            int iHashCode2 = liveConfiguration == null ? 0 : liveConfiguration.hashCode();
            long j = this.d;
            int i2 = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f5516e;
            int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f;
            int i4 = (((((((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.f5517h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
            long j4 = this.k;
            int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f5519l;
            int i6 = (((((i5 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.f5520n) * 31;
            long j6 = this.o;
            return i6 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    static {
        Util.E(0);
        Util.E(1);
        Util.E(2);
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
        int i4 = f(i2, period, false).f5510c;
        if (m(i4, window, 0L).f5520n != i2) {
            return i2 + 1;
        }
        int iE = e(i4, i3, z2);
        if (iE == -1) {
            return -1;
        }
        return m(iE, window, 0L).m;
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
            j = window.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = window.m;
        f(i3, period, false);
        while (i3 < window.f5520n && period.f5511e != j) {
            int i4 = i3 + 1;
            if (f(i4, period, false).f5511e > j) {
                break;
            }
            i3 = i4;
        }
        f(i3, period, true);
        long jMin = j - period.f5511e;
        long j3 = period.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = period.f5509b;
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
