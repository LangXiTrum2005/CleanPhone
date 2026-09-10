package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
final class MediaPeriodQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline.Period f17151a = new Timeline.Period();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timeline.Window f17152b = new Timeline.Window();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsCollector f17153c;
    public final HandlerWrapper d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17154e;
    public int f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaPeriodHolder f17155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaPeriodHolder f17156i;
    public MediaPeriodHolder j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f17157l;
    public long m;

    public MediaPeriodQueue(AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper) {
        this.f17153c = analyticsCollector;
        this.d = handlerWrapper;
    }

    public static MediaSource.MediaPeriodId l(Timeline timeline, Object obj, long j, long j2, Timeline.Window window, Timeline.Period period) {
        timeline.g(obj, period);
        timeline.n(period.Z, window);
        int iB = timeline.b(obj);
        while (period.e0 == 0) {
            AdPlaybackState adPlaybackState = period.h0;
            if (adPlaybackState.X <= 0 || !period.f(adPlaybackState.e0) || period.c(0L) != -1) {
                break;
            }
            int i2 = iB + 1;
            if (iB >= window.p0) {
                break;
            }
            timeline.f(i2, period, true);
            obj = period.f17208Y;
            obj.getClass();
            iB = i2;
        }
        timeline.g(obj, period);
        int iC = period.c(j);
        return iC == -1 ? new MediaSource.MediaPeriodId(obj, j2, period.b(j)) : new MediaSource.MediaPeriodId(obj, iC, period.e(iC), j2, -1);
    }

    public final MediaPeriodHolder a() {
        MediaPeriodHolder mediaPeriodHolder = this.f17155h;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.f17156i) {
            this.f17156i = mediaPeriodHolder.f17143l;
        }
        mediaPeriodHolder.f();
        int i2 = this.k - 1;
        this.k = i2;
        if (i2 == 0) {
            this.j = null;
            MediaPeriodHolder mediaPeriodHolder2 = this.f17155h;
            this.f17157l = mediaPeriodHolder2.f17138b;
            this.m = mediaPeriodHolder2.f.f17145a.d;
        }
        this.f17155h = this.f17155h.f17143l;
        j();
        return this.f17155h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder = this.f17155h;
        Assertions.e(mediaPeriodHolder);
        this.f17157l = mediaPeriodHolder.f17138b;
        this.m = mediaPeriodHolder.f.f17145a.d;
        while (mediaPeriodHolder != null) {
            mediaPeriodHolder.f();
            mediaPeriodHolder = mediaPeriodHolder.f17143l;
        }
        this.f17155h = null;
        this.j = null;
        this.f17156i = null;
        this.k = 0;
        j();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    public final MediaPeriodInfo c(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j) {
        Timeline timeline2;
        Timeline.Period period;
        long jLongValue;
        Object obj;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f;
        long j8 = (mediaPeriodHolder.o + mediaPeriodInfo.f17148e) - j;
        Timeline.Period period2 = this.f17151a;
        boolean z2 = mediaPeriodInfo.g;
        long j9 = mediaPeriodInfo.f17147c;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f17145a;
        if (!z2) {
            timeline.g(mediaPeriodId.f18347a, period2);
            boolean zA = mediaPeriodId.a();
            Object obj2 = mediaPeriodId.f18347a;
            if (!zA) {
                int i2 = mediaPeriodId.f18350e;
                int iE = period2.e(i2);
                boolean z3 = period2.f(i2) && period2.d(i2, iE) == 3;
                if (iE != period2.h0.a(i2).f18427Y && !z3) {
                    return e(timeline, mediaPeriodId.f18347a, mediaPeriodId.f18350e, iE, mediaPeriodInfo.f17148e, mediaPeriodId.d);
                }
                timeline.g(obj2, period2);
                long j10 = period2.h0.a(i2).X;
                return f(timeline, mediaPeriodId.f18347a, j10 == Long.MIN_VALUE ? period2.e0 : j10 + period2.h0.a(i2).h0, mediaPeriodInfo.f17148e, mediaPeriodId.d);
            }
            AdPlaybackState adPlaybackState = period2.h0;
            int i3 = mediaPeriodId.f18348b;
            int i4 = adPlaybackState.a(i3).f18427Y;
            if (i4 == -1) {
                return null;
            }
            int iA = period2.h0.a(i3).a(mediaPeriodId.f18349c);
            if (iA < i4) {
                return e(timeline, mediaPeriodId.f18347a, i3, iA, mediaPeriodInfo.f17147c, mediaPeriodId.d);
            }
            if (j9 == -9223372036854775807L) {
                timeline2 = timeline;
                period = period2;
                Pair pairJ = timeline2.j(this.f17152b, period, period2.Z, -9223372036854775807L, Math.max(0L, j8));
                if (pairJ == null) {
                    return null;
                }
                jLongValue = ((Long) pairJ.second).longValue();
            } else {
                timeline2 = timeline;
                period = period2;
                jLongValue = j9;
            }
            timeline2.g(obj2, period);
            AdPlaybackState adPlaybackState2 = period.h0;
            int i5 = mediaPeriodId.f18348b;
            long j11 = adPlaybackState2.a(i5).X;
            return f(timeline2, mediaPeriodId.f18347a, Math.max(j11 == Long.MIN_VALUE ? period.e0 : period.h0.a(i5).h0 + j11, jLongValue), mediaPeriodInfo.f17147c, mediaPeriodId.d);
        }
        int iD = timeline.d(timeline.b(mediaPeriodId.f18347a), this.f17151a, this.f17152b, this.f, this.g);
        if (iD != -1) {
            int i6 = timeline.f(iD, period2, true).Z;
            Object obj3 = period2.f17208Y;
            obj3.getClass();
            if (timeline.m(i6, this.f17152b, 0L).o0 == iD) {
                Pair pairJ2 = timeline.j(this.f17152b, this.f17151a, i6, -9223372036854775807L, Math.max(0L, j8));
                if (pairJ2 != null) {
                    Object obj4 = pairJ2.first;
                    long jLongValue2 = ((Long) pairJ2.second).longValue();
                    MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder.f17143l;
                    if (mediaPeriodHolder2 == null || !mediaPeriodHolder2.f17138b.equals(obj4)) {
                        j7 = this.f17154e;
                        this.f17154e = 1 + j7;
                    } else {
                        j7 = mediaPeriodHolder2.f.f17145a.d;
                    }
                    j3 = j7;
                    j2 = -9223372036854775807L;
                    obj = obj4;
                    j4 = jLongValue2;
                }
            } else {
                obj = obj3;
                j2 = 0;
                j3 = mediaPeriodId.d;
                j4 = 0;
            }
            MediaSource.MediaPeriodId mediaPeriodIdL = l(timeline, obj, j4, j3, this.f17152b, this.f17151a);
            if (j2 == -9223372036854775807L || j9 == -9223372036854775807L) {
                j5 = j4;
                j6 = j2;
            } else {
                boolean z4 = timeline.g(mediaPeriodId.f18347a, period2).h0.X > 0 && period2.f(period2.h0.e0);
                if (mediaPeriodIdL.a() && z4) {
                    j5 = j4;
                    j6 = j9;
                } else if (z4) {
                    j6 = j2;
                    j5 = j9;
                } else {
                    j5 = j4;
                    j6 = j2;
                }
            }
            return d(timeline, mediaPeriodIdL, j6, j5);
        }
        return null;
    }

    public final MediaPeriodInfo d(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, long j2) {
        timeline.g(mediaPeriodId.f18347a, this.f17151a);
        return mediaPeriodId.a() ? e(timeline, mediaPeriodId.f18347a, mediaPeriodId.f18348b, mediaPeriodId.f18349c, j, mediaPeriodId.d) : f(timeline, mediaPeriodId.f18347a, j2, j, mediaPeriodId.d);
    }

    public final MediaPeriodInfo e(Timeline timeline, Object obj, int i2, int i3, long j, long j2) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i2, i3, j2, -1);
        Timeline.Period period = this.f17151a;
        long jA = timeline.g(obj, period).a(i2, i3);
        long jMax = i3 == period.e(i2) ? period.h0.f18426Y : 0L;
        boolean zF = period.f(i2);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new MediaPeriodInfo(mediaPeriodId, jMax, j, -9223372036854775807L, jA, zF, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    public final MediaPeriodInfo f(Timeline timeline, Object obj, long j, long j2, long j3) {
        AdPlaybackState.AdGroup adGroupA;
        int i2;
        boolean z2;
        long j4;
        long j5;
        long j6;
        int i3;
        long jMax = j;
        Timeline.Period period = this.f17151a;
        timeline.g(obj, period);
        int iB = period.b(jMax);
        if (iB == -1) {
            AdPlaybackState adPlaybackState = period.h0;
            if (adPlaybackState.X <= 0 || !period.f(adPlaybackState.e0)) {
                z2 = false;
                break;
            }
            z2 = true;
        } else {
            if (!period.f(iB) || period.h0.a(iB).X != period.e0 || (i2 = (adGroupA = period.h0.a(iB)).f18427Y) == -1) {
                z2 = false;
                break;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z2 = true;
                    iB = -1;
                    break;
                }
                int i5 = adGroupA.f0[i4];
                if (i5 == 0 || i5 == 1) {
                    z2 = false;
                    break;
                }
                i4++;
            }
        }
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j3, iB);
        boolean z3 = !mediaPeriodId.a() && iB == -1;
        boolean zI = i(timeline, mediaPeriodId);
        boolean zH = h(timeline, mediaPeriodId, z3);
        boolean z4 = iB != -1 && period.f(iB);
        if (iB == -1) {
            if (z2) {
                j5 = period.e0;
            } else {
                j4 = -9223372036854775807L;
            }
            if (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) {
                j6 = period.e0;
            } else {
                j6 = j4;
            }
            if (j6 != -9223372036854775807L && jMax >= j6) {
                if (zH && z2) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                jMax = Math.max(0L, j6 - ((long) i3));
            }
            return new MediaPeriodInfo(mediaPeriodId, jMax, j2, j4, j6, z4, z3, zI, zH);
        }
        j5 = period.h0.a(iB).X;
        j4 = j5;
        if (j4 != -9223372036854775807L) {
            j6 = period.e0;
        } else {
            j6 = period.e0;
        }
        if (j6 != -9223372036854775807L) {
            if (zH) {
                i3 = 1;
            } else {
                i3 = 1;
            }
            jMax = Math.max(0L, j6 - ((long) i3));
        }
        return new MediaPeriodInfo(mediaPeriodId, jMax, j2, j4, j6, z4, z3, zI, zH);
    }

    public final MediaPeriodInfo g(Timeline timeline, MediaPeriodInfo mediaPeriodInfo) {
        long jA;
        boolean zF;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f17145a;
        boolean zA = mediaPeriodId.a();
        int i2 = mediaPeriodId.f18350e;
        boolean z2 = !zA && i2 == -1;
        boolean zI = i(timeline, mediaPeriodId);
        boolean zH = h(timeline, mediaPeriodId, z2);
        Object obj = mediaPeriodId.f18347a;
        Timeline.Period period = this.f17151a;
        timeline.g(obj, period);
        long j = (mediaPeriodId.a() || i2 == -1) ? -9223372036854775807L : period.h0.a(i2).X;
        boolean zA2 = mediaPeriodId.a();
        int i3 = mediaPeriodId.f18348b;
        if (zA2) {
            jA = period.a(i3, mediaPeriodId.f18349c);
        } else {
            jA = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? period.e0 : j;
        }
        if (mediaPeriodId.a()) {
            zF = period.f(i3);
        } else {
            zF = i2 != -1 && period.f(i2);
        }
        return new MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.f17146b, mediaPeriodInfo.f17147c, j, jA, zF, z2, zI, zH);
    }

    public final boolean h(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, boolean z2) {
        int iB = timeline.b(mediaPeriodId.f18347a);
        if (!timeline.m(timeline.f(iB, this.f17151a, false).Z, this.f17152b, 0L).i0) {
            if (timeline.d(iB, this.f17151a, this.f17152b, this.f, this.g) == -1 && z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.a() && mediaPeriodId.f18350e == -1) {
            Object obj = mediaPeriodId.f18347a;
            if (timeline.m(timeline.g(obj, this.f17151a).Z, this.f17152b, 0L).p0 == timeline.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        ImmutableList.Builder builderS = ImmutableList.s();
        for (MediaPeriodHolder mediaPeriodHolder = this.f17155h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f17143l) {
            builderS.h(mediaPeriodHolder.f.f17145a);
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.f17156i;
        this.d.post(new p(this, builderS, mediaPeriodHolder2 == null ? null : mediaPeriodHolder2.f.f17145a, 0));
    }

    public final boolean k(MediaPeriodHolder mediaPeriodHolder) {
        boolean z2 = false;
        Assertions.d(mediaPeriodHolder != null);
        if (mediaPeriodHolder.equals(this.j)) {
            return false;
        }
        this.j = mediaPeriodHolder;
        while (true) {
            mediaPeriodHolder = mediaPeriodHolder.f17143l;
            if (mediaPeriodHolder == null) {
                break;
            }
            if (mediaPeriodHolder == this.f17156i) {
                this.f17156i = this.f17155h;
                z2 = true;
            }
            mediaPeriodHolder.f();
            this.k--;
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.j;
        if (mediaPeriodHolder2.f17143l != null) {
            mediaPeriodHolder2.b();
            mediaPeriodHolder2.f17143l = null;
            mediaPeriodHolder2.c();
        }
        j();
        return z2;
    }

    public final MediaSource.MediaPeriodId m(Timeline timeline, Object obj, long j) {
        long j2;
        int iB;
        Object obj2 = obj;
        Timeline.Period period = this.f17151a;
        int i2 = timeline.g(obj2, period).Z;
        Object obj3 = this.f17157l;
        if (obj3 == null || (iB = timeline.b(obj3)) == -1 || timeline.f(iB, period, false).Z != i2) {
            MediaPeriodHolder mediaPeriodHolder = this.f17155h;
            while (true) {
                if (mediaPeriodHolder == null) {
                    MediaPeriodHolder mediaPeriodHolder2 = this.f17155h;
                    while (true) {
                        if (mediaPeriodHolder2 == null) {
                            j2 = this.f17154e;
                            this.f17154e = 1 + j2;
                            if (this.f17155h != null) {
                                break;
                            }
                            this.f17157l = obj2;
                            this.m = j2;
                            break;
                        }
                        int iB2 = timeline.b(mediaPeriodHolder2.f17138b);
                        if (iB2 != -1 && timeline.f(iB2, period, false).Z == i2) {
                            j2 = mediaPeriodHolder2.f.f17145a.d;
                            break;
                        }
                        mediaPeriodHolder2 = mediaPeriodHolder2.f17143l;
                    }
                } else {
                    if (mediaPeriodHolder.f17138b.equals(obj2)) {
                        j2 = mediaPeriodHolder.f.f17145a.d;
                        break;
                    }
                    mediaPeriodHolder = mediaPeriodHolder.f17143l;
                }
            }
        } else {
            j2 = this.m;
        }
        timeline.g(obj2, period);
        int i3 = period.Z;
        Timeline.Window window = this.f17152b;
        timeline.n(i3, window);
        boolean z2 = false;
        for (int iB3 = timeline.b(obj); iB3 >= window.o0; iB3--) {
            timeline.f(iB3, period, true);
            boolean z3 = period.h0.X > 0;
            z2 |= z3;
            if (period.c(period.e0) != -1) {
                obj2 = period.f17208Y;
                obj2.getClass();
            }
            if (z2 && (!z3 || period.e0 != 0)) {
                break;
            }
        }
        return l(timeline, obj2, j, j2, this.f17152b, this.f17151a);
    }

    public final boolean n(Timeline timeline) {
        Timeline timeline2;
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodHolder mediaPeriodHolder2 = this.f17155h;
        if (mediaPeriodHolder2 == null) {
            return true;
        }
        int iB = timeline.b(mediaPeriodHolder2.f17138b);
        while (true) {
            timeline2 = timeline;
            iB = timeline2.d(iB, this.f17151a, this.f17152b, this.f, this.g);
            while (true) {
                mediaPeriodHolder = mediaPeriodHolder2.f17143l;
                if (mediaPeriodHolder == null || mediaPeriodHolder2.f.g) {
                    break;
                }
                mediaPeriodHolder2 = mediaPeriodHolder;
            }
            if (iB == -1 || mediaPeriodHolder == null || timeline2.b(mediaPeriodHolder.f17138b) != iB) {
                break;
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
            timeline = timeline2;
        }
        boolean zK = k(mediaPeriodHolder2);
        mediaPeriodHolder2.f = g(timeline2, mediaPeriodHolder2.f);
        return !zK;
    }

    public final boolean o(Timeline timeline, long j, long j2) {
        MediaPeriodInfo mediaPeriodInfoG;
        MediaPeriodHolder mediaPeriodHolder = this.f17155h;
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
                if (mediaPeriodInfo.f17146b != mediaPeriodInfoC.f17146b || !mediaPeriodInfo.f17145a.equals(mediaPeriodInfoC.f17145a)) {
                    return !k(mediaPeriodHolder2);
                }
                mediaPeriodInfoG = mediaPeriodInfoC;
            }
            mediaPeriodHolder.f = mediaPeriodInfoG.a(mediaPeriodInfo.f17147c);
            long j3 = mediaPeriodInfo.f17148e;
            if (j3 != -9223372036854775807L) {
                long j4 = mediaPeriodInfoG.f17148e;
                if (j3 != j4) {
                    mediaPeriodHolder.h();
                    boolean z2 = mediaPeriodHolder == this.f17156i && !mediaPeriodHolder.f.f && (j2 == Long.MIN_VALUE || j2 >= ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : mediaPeriodHolder.o + j4));
                    if (k(mediaPeriodHolder) || z2) {
                        return false;
                    }
                }
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
            mediaPeriodHolder = mediaPeriodHolder.f17143l;
        }
        return true;
    }
}
