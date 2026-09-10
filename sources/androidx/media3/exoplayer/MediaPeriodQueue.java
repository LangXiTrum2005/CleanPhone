package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class MediaPeriodQueue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsCollector f5938c;
    public final HandlerWrapper d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f5939e;
    public long f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaPeriodHolder f5941i;
    public MediaPeriodHolder j;
    public MediaPeriodHolder k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5942l;
    public Object m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5943n;
    public ExoPlayer.PreloadConfiguration o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline.Period f5936a = new Timeline.Period();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timeline.Window f5937b = new Timeline.Window();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f5944p = new ArrayList();

    public MediaPeriodQueue(AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, f fVar, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.f5938c = analyticsCollector;
        this.d = handlerWrapper;
        this.f5939e = fVar;
        this.o = preloadConfiguration;
    }

    public static MediaSource.MediaPeriodId l(Timeline timeline, Object obj, long j, long j2, Timeline.Window window, Timeline.Period period) {
        timeline.g(obj, period);
        timeline.n(period.f5510c, window);
        timeline.b(obj);
        int i2 = period.g.f5368a;
        if (i2 != 0) {
            if (i2 == 1) {
                period.f(0);
            }
            period.g.getClass();
            period.g(0);
        }
        timeline.g(obj, period);
        int iC = period.c(j);
        return iC == -1 ? new MediaSource.MediaPeriodId(obj, j2, period.b(j)) : new MediaSource.MediaPeriodId(obj, iC, period.e(iC), j2, -1);
    }

    public final MediaPeriodHolder a() {
        MediaPeriodHolder mediaPeriodHolder = this.f5941i;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.j) {
            this.j = mediaPeriodHolder.f5928l;
        }
        mediaPeriodHolder.g();
        int i2 = this.f5942l - 1;
        this.f5942l = i2;
        if (i2 == 0) {
            this.k = null;
            MediaPeriodHolder mediaPeriodHolder2 = this.f5941i;
            this.m = mediaPeriodHolder2.f5923b;
            this.f5943n = mediaPeriodHolder2.f.f5930a.d;
        }
        this.f5941i = this.f5941i.f5928l;
        j();
        return this.f5941i;
    }

    public final void b() {
        if (this.f5942l == 0) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder = this.f5941i;
        Assertions.f(mediaPeriodHolder);
        this.m = mediaPeriodHolder.f5923b;
        this.f5943n = mediaPeriodHolder.f.f5930a.d;
        while (mediaPeriodHolder != null) {
            mediaPeriodHolder.g();
            mediaPeriodHolder = mediaPeriodHolder.f5928l;
        }
        this.f5941i = null;
        this.k = null;
        this.j = null;
        this.f5942l = 0;
        j();
    }

    public final MediaPeriodInfo c(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j) {
        Timeline timeline2;
        Timeline.Period period;
        Object obj;
        long j2;
        long j3;
        long j4;
        long jN;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f;
        long j5 = (mediaPeriodHolder.o + mediaPeriodInfo.f5933e) - j;
        if (mediaPeriodInfo.g) {
            MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.f;
            MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo2.f5930a;
            int iD = timeline.d(timeline.b(mediaPeriodId.f6384a), this.f5936a, this.f5937b, this.g, this.f5940h);
            if (iD != -1) {
                Timeline.Period period2 = this.f5936a;
                int i2 = timeline.f(iD, period2, true).f5510c;
                Object obj2 = period2.f5509b;
                obj2.getClass();
                long j6 = mediaPeriodId.d;
                if (timeline.m(i2, this.f5937b, 0L).m == iD) {
                    Pair pairJ = timeline.j(this.f5937b, this.f5936a, i2, -9223372036854775807L, Math.max(0L, j5));
                    if (pairJ != null) {
                        Object obj3 = pairJ.first;
                        long jLongValue = ((Long) pairJ.second).longValue();
                        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder.f5928l;
                        if (mediaPeriodHolder2 == null || !mediaPeriodHolder2.f5923b.equals(obj3)) {
                            jN = n(obj3);
                            if (jN == -1) {
                                jN = this.f;
                                this.f = 1 + jN;
                            }
                        } else {
                            jN = mediaPeriodHolder2.f.f5930a.d;
                        }
                        obj = obj3;
                        j2 = jLongValue;
                        j4 = jN;
                        j3 = -9223372036854775807L;
                    }
                } else {
                    obj = obj2;
                    j2 = 0;
                    j3 = 0;
                    j4 = j6;
                }
                MediaSource.MediaPeriodId mediaPeriodIdL = l(timeline, obj, j2, j4, this.f5937b, this.f5936a);
                if (j3 != -9223372036854775807L && mediaPeriodInfo2.f5932c != -9223372036854775807L) {
                    int i3 = timeline.g(mediaPeriodId.f6384a, period2).g.f5368a;
                    period2.g.getClass();
                    if (i3 > 0) {
                        period2.g(0);
                    }
                }
                return d(timeline, mediaPeriodIdL, j3, j2);
            }
            return null;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodInfo.f5930a;
        Object obj4 = mediaPeriodId2.f6384a;
        Timeline.Period period3 = this.f5936a;
        timeline.g(obj4, period3);
        boolean zB = mediaPeriodId2.b();
        Object obj5 = mediaPeriodId2.f6384a;
        if (!zB) {
            int i4 = mediaPeriodId2.f6387e;
            if (i4 != -1) {
                period3.f(i4);
            }
            int iE = period3.e(i4);
            period3.g(i4);
            if (iE != period3.g.a(i4).f5370a) {
                return e(timeline, mediaPeriodId2.f6384a, mediaPeriodId2.f6387e, iE, mediaPeriodInfo.f5933e, mediaPeriodId2.d);
            }
            timeline.g(obj5, period3);
            period3.d(i4);
            period3.g.a(i4).getClass();
            return f(timeline, mediaPeriodId2.f6384a, 0L, mediaPeriodInfo.f5933e, mediaPeriodId2.d);
        }
        AdPlaybackState adPlaybackState = period3.g;
        int i5 = mediaPeriodId2.f6385b;
        int i6 = adPlaybackState.a(i5).f5370a;
        if (i6 == -1) {
            return null;
        }
        int iA = period3.g.a(i5).a(mediaPeriodId2.f6386c);
        if (iA < i6) {
            return e(timeline, mediaPeriodId2.f6384a, i5, iA, mediaPeriodInfo.f5932c, mediaPeriodId2.d);
        }
        long jLongValue2 = mediaPeriodInfo.f5932c;
        if (jLongValue2 == -9223372036854775807L) {
            period = period3;
            timeline2 = timeline;
            Pair pairJ2 = timeline2.j(this.f5937b, period, period.f5510c, -9223372036854775807L, Math.max(0L, j5));
            if (pairJ2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairJ2.second).longValue();
        } else {
            timeline2 = timeline;
            period = period3;
        }
        timeline2.g(obj5, period);
        int i7 = mediaPeriodId2.f6385b;
        period.d(i7);
        period.g.a(i7).getClass();
        return f(timeline2, mediaPeriodId2.f6384a, Math.max(0L, jLongValue2), mediaPeriodInfo.f5932c, mediaPeriodId2.d);
    }

    public final MediaPeriodInfo d(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, long j2) {
        timeline.g(mediaPeriodId.f6384a, this.f5936a);
        return mediaPeriodId.b() ? e(timeline, mediaPeriodId.f6384a, mediaPeriodId.f6385b, mediaPeriodId.f6386c, j, mediaPeriodId.d) : f(timeline, mediaPeriodId.f6384a, j2, j, mediaPeriodId.d);
    }

    public final MediaPeriodInfo e(Timeline timeline, Object obj, int i2, int i3, long j, long j2) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i2, i3, j2, -1);
        Timeline.Period period = this.f5936a;
        long jA = timeline.g(obj, period).a(i2, i3);
        if (i3 == period.e(i2)) {
            period.g.getClass();
        }
        period.g(i2);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new MediaPeriodInfo(mediaPeriodId, jMax, j, -9223372036854775807L, jA, false, false, false, false);
    }

    public final MediaPeriodInfo f(Timeline timeline, Object obj, long j, long j2, long j3) {
        long j4;
        Timeline.Period period = this.f5936a;
        timeline.g(obj, period);
        int iB = period.b(j);
        if (iB != -1) {
            period.f(iB);
        }
        boolean z2 = false;
        if (iB != -1) {
            period.g(iB);
        } else if (period.g.f5368a > 0) {
            period.g(0);
        }
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j3, iB);
        if (!mediaPeriodId.b() && iB == -1) {
            z2 = true;
        }
        boolean zI = i(timeline, mediaPeriodId);
        boolean zH = h(timeline, mediaPeriodId, z2);
        if (iB != -1) {
            period.g(iB);
        }
        if (iB != -1) {
            period.d(iB);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? period.d : j4;
        return new MediaPeriodInfo(mediaPeriodId, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - ((long) 1)), j2, j4, j5, false, z2, zI, zH);
    }

    public final MediaPeriodInfo g(Timeline timeline, MediaPeriodInfo mediaPeriodInfo) {
        long j;
        long jA;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f5930a;
        boolean zB = mediaPeriodId.b();
        int i2 = mediaPeriodId.f6387e;
        boolean z2 = !zB && i2 == -1;
        boolean zI = i(timeline, mediaPeriodId);
        boolean zH = h(timeline, mediaPeriodId, z2);
        Object obj = mediaPeriodId.f6384a;
        Timeline.Period period = this.f5936a;
        timeline.g(obj, period);
        if (mediaPeriodId.b() || i2 == -1) {
            j = -9223372036854775807L;
        } else {
            period.d(i2);
            j = 0;
        }
        boolean zB2 = mediaPeriodId.b();
        int i3 = mediaPeriodId.f6385b;
        if (zB2) {
            jA = period.a(i3, mediaPeriodId.f6386c);
        } else {
            jA = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? period.d : j;
        }
        if (mediaPeriodId.b()) {
            period.g(i3);
        } else if (i2 != -1) {
            period.g(i2);
        }
        return new MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.f5931b, mediaPeriodInfo.f5932c, j, jA, false, z2, zI, zH);
    }

    public final boolean h(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, boolean z2) {
        int iB = timeline.b(mediaPeriodId.f6384a);
        if (!timeline.m(timeline.f(iB, this.f5936a, false).f5510c, this.f5937b, 0L).f5517h) {
            if (timeline.d(iB, this.f5936a, this.f5937b, this.g, this.f5940h) == -1 && z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.b() && mediaPeriodId.f6387e == -1) {
            Object obj = mediaPeriodId.f6384a;
            if (timeline.m(timeline.g(obj, this.f5936a).f5510c, this.f5937b, 0L).f5520n == timeline.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        ImmutableList.Builder builderS = ImmutableList.s();
        for (MediaPeriodHolder mediaPeriodHolder = this.f5941i; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f5928l) {
            builderS.h(mediaPeriodHolder.f.f5930a);
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.j;
        this.d.post(new p(this, builderS, mediaPeriodHolder2 == null ? null : mediaPeriodHolder2.f.f5930a, 0));
    }

    public final boolean k(MediaPeriodHolder mediaPeriodHolder) {
        Assertions.f(mediaPeriodHolder);
        boolean z2 = false;
        if (mediaPeriodHolder.equals(this.k)) {
            return false;
        }
        this.k = mediaPeriodHolder;
        while (true) {
            mediaPeriodHolder = mediaPeriodHolder.f5928l;
            if (mediaPeriodHolder == null) {
                break;
            }
            if (mediaPeriodHolder == this.j) {
                this.j = this.f5941i;
                z2 = true;
            }
            mediaPeriodHolder.g();
            this.f5942l--;
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.k;
        mediaPeriodHolder2.getClass();
        if (mediaPeriodHolder2.f5928l != null) {
            mediaPeriodHolder2.b();
            mediaPeriodHolder2.f5928l = null;
            mediaPeriodHolder2.c();
        }
        j();
        return z2;
    }

    public final MediaSource.MediaPeriodId m(Timeline timeline, Object obj, long j) {
        long jN;
        int iB;
        Object obj2 = obj;
        Timeline.Period period = this.f5936a;
        int i2 = timeline.g(obj2, period).f5510c;
        Object obj3 = this.m;
        if (obj3 == null || (iB = timeline.b(obj3)) == -1 || timeline.f(iB, period, false).f5510c != i2) {
            MediaPeriodHolder mediaPeriodHolder = this.f5941i;
            while (true) {
                if (mediaPeriodHolder == null) {
                    MediaPeriodHolder mediaPeriodHolder2 = this.f5941i;
                    while (true) {
                        if (mediaPeriodHolder2 == null) {
                            jN = n(obj2);
                            if (jN != -1) {
                                break;
                            }
                            jN = this.f;
                            this.f = 1 + jN;
                            if (this.f5941i != null) {
                                break;
                            }
                            this.m = obj2;
                            this.f5943n = jN;
                            break;
                        }
                        int iB2 = timeline.b(mediaPeriodHolder2.f5923b);
                        if (iB2 != -1 && timeline.f(iB2, period, false).f5510c == i2) {
                            jN = mediaPeriodHolder2.f.f5930a.d;
                            break;
                        }
                        mediaPeriodHolder2 = mediaPeriodHolder2.f5928l;
                    }
                } else {
                    if (mediaPeriodHolder.f5923b.equals(obj2)) {
                        jN = mediaPeriodHolder.f.f5930a.d;
                        break;
                    }
                    mediaPeriodHolder = mediaPeriodHolder.f5928l;
                }
            }
        } else {
            jN = this.f5943n;
        }
        timeline.g(obj2, period);
        int i3 = period.f5510c;
        Timeline.Window window = this.f5937b;
        timeline.n(i3, window);
        boolean z2 = false;
        for (int iB3 = timeline.b(obj); iB3 >= window.m; iB3--) {
            timeline.f(iB3, period, true);
            boolean z3 = period.g.f5368a > 0;
            z2 |= z3;
            if (period.c(period.d) != -1) {
                obj2 = period.f5509b;
                obj2.getClass();
            }
            if (z2 && (!z3 || period.d != 0)) {
                break;
            }
        }
        return l(timeline, obj2, j, jN, this.f5937b, this.f5936a);
    }

    public final long n(Object obj) {
        for (int i2 = 0; i2 < this.f5944p.size(); i2++) {
            MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) this.f5944p.get(i2);
            if (mediaPeriodHolder.f5923b.equals(obj)) {
                return mediaPeriodHolder.f.f5930a.d;
            }
        }
        return -1L;
    }

    public final boolean o(Timeline timeline) {
        Timeline timeline2;
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodHolder mediaPeriodHolder2 = this.f5941i;
        if (mediaPeriodHolder2 == null) {
            return true;
        }
        int iB = timeline.b(mediaPeriodHolder2.f5923b);
        while (true) {
            timeline2 = timeline;
            iB = timeline2.d(iB, this.f5936a, this.f5937b, this.g, this.f5940h);
            while (true) {
                mediaPeriodHolder = mediaPeriodHolder2.f5928l;
                if (mediaPeriodHolder == null || mediaPeriodHolder2.f.g) {
                    break;
                }
                mediaPeriodHolder2 = mediaPeriodHolder;
            }
            if (iB == -1 || mediaPeriodHolder == null || timeline2.b(mediaPeriodHolder.f5923b) != iB) {
                break;
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
            timeline = timeline2;
        }
        boolean zK = k(mediaPeriodHolder2);
        mediaPeriodHolder2.f = g(timeline2, mediaPeriodHolder2.f);
        return !zK;
    }

    public final boolean p(Timeline timeline, long j, long j2) {
        MediaPeriodInfo mediaPeriodInfoG;
        MediaPeriodHolder mediaPeriodHolder = this.f5941i;
        MediaPeriodHolder mediaPeriodHolder2 = null;
        while (mediaPeriodHolder != null) {
            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f;
            if (mediaPeriodHolder2 == null) {
                mediaPeriodInfoG = g(timeline, mediaPeriodInfo);
            } else {
                MediaPeriodInfo mediaPeriodInfoC = c(timeline, mediaPeriodHolder2, j);
                if (mediaPeriodInfoC == null) {
                    return !k(mediaPeriodHolder2);
                }
                if (mediaPeriodInfo.f5931b != mediaPeriodInfoC.f5931b || !mediaPeriodInfo.f5930a.equals(mediaPeriodInfoC.f5930a)) {
                    return !k(mediaPeriodHolder2);
                }
                mediaPeriodInfoG = mediaPeriodInfoC;
            }
            mediaPeriodHolder.f = mediaPeriodInfoG.a(mediaPeriodInfo.f5932c);
            long j3 = mediaPeriodInfo.f5933e;
            if (j3 != -9223372036854775807L) {
                long j4 = mediaPeriodInfoG.f5933e;
                if (j3 != j4) {
                    mediaPeriodHolder.i();
                    boolean z2 = mediaPeriodHolder == this.j && !mediaPeriodHolder.f.f && (j2 == Long.MIN_VALUE || j2 >= ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : mediaPeriodHolder.o + j4));
                    if (k(mediaPeriodHolder) || z2) {
                        return false;
                    }
                }
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
            mediaPeriodHolder = mediaPeriodHolder.f5928l;
        }
        return true;
    }
}
