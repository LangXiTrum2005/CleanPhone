package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final androidx.media3.datasource.a g = new androidx.media3.datasource.a(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Random f17226h = new Random();
    public MediaMetricsListener d;
    public String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline.Window f17227a = new Timeline.Window();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timeline.Period f17228b = new Timeline.Period();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f17229c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Timeline f17230e = Timeline.X;

    public final class SessionDescriptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f17233c;
        public final MediaSource.MediaPeriodId d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17234e;
        public boolean f;

        public SessionDescriptor(String str, int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            this.f17231a = str;
            this.f17232b = i2;
            this.f17233c = mediaPeriodId == null ? -1L : mediaPeriodId.d;
            if (mediaPeriodId == null || !mediaPeriodId.a()) {
                return;
            }
            this.d = mediaPeriodId;
        }

        public final boolean a(AnalyticsListener.EventTime eventTime) {
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
            if (mediaPeriodId == null) {
                return this.f17232b != eventTime.f17215c;
            }
            long j = this.f17233c;
            if (j == -1) {
                return false;
            }
            if (mediaPeriodId.d > j) {
                return true;
            }
            MediaSource.MediaPeriodId mediaPeriodId2 = this.d;
            if (mediaPeriodId2 == null) {
                return false;
            }
            Timeline timeline = eventTime.f17214b;
            int iB = timeline.b(mediaPeriodId.f18347a);
            int iB2 = timeline.b(mediaPeriodId2.f18347a);
            if (mediaPeriodId.d < mediaPeriodId2.d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            boolean zA = mediaPeriodId.a();
            int i2 = mediaPeriodId2.f18348b;
            if (!zA) {
                int i3 = mediaPeriodId.f18350e;
                return i3 == -1 || i3 > i2;
            }
            int i4 = mediaPeriodId.f18348b;
            if (i4 > i2) {
                return true;
            }
            if (i4 == i2) {
                return mediaPeriodId.f18349c > mediaPeriodId2.f18349c;
            }
            return false;
        }

        public final boolean b(Timeline timeline, Timeline timeline2) {
            MediaSource.MediaPeriodId mediaPeriodId;
            int i2 = this.f17232b;
            if (i2 < timeline.o()) {
                DefaultPlaybackSessionManager defaultPlaybackSessionManager = DefaultPlaybackSessionManager.this;
                timeline.n(i2, defaultPlaybackSessionManager.f17227a);
                Timeline.Window window = defaultPlaybackSessionManager.f17227a;
                int i3 = window.o0;
                while (true) {
                    if (i3 > window.p0) {
                        i2 = -1;
                        break;
                    }
                    int iB = timeline2.b(timeline.l(i3));
                    if (iB != -1) {
                        i2 = timeline2.f(iB, defaultPlaybackSessionManager.f17228b, false).Z;
                        break;
                    }
                    i3++;
                }
            } else if (i2 >= timeline2.o()) {
                i2 = -1;
                break;
            }
            this.f17232b = i2;
            return i2 != -1 && ((mediaPeriodId = this.d) == null || timeline2.b(mediaPeriodId.f18347a) != -1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final SessionDescriptor a(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        long j;
        HashMap map = this.f17229c;
        SessionDescriptor sessionDescriptor = null;
        long j2 = Long.MAX_VALUE;
        for (SessionDescriptor sessionDescriptor2 : map.values()) {
            if (sessionDescriptor2.f17233c == -1 && i2 == sessionDescriptor2.f17232b && mediaPeriodId != null) {
                sessionDescriptor2.f17233c = mediaPeriodId.d;
            }
            if (mediaPeriodId != null) {
                MediaSource.MediaPeriodId mediaPeriodId2 = sessionDescriptor2.d;
                long j3 = mediaPeriodId.d;
                if (mediaPeriodId2 == null) {
                    if (!mediaPeriodId.a() && j3 == sessionDescriptor2.f17233c) {
                        j = sessionDescriptor2.f17233c;
                        if (j != -1) {
                        }
                        sessionDescriptor = sessionDescriptor2;
                        j2 = j;
                    }
                } else if (j3 == mediaPeriodId2.d && mediaPeriodId.f18348b == mediaPeriodId2.f18348b && mediaPeriodId.f18349c == mediaPeriodId2.f18349c) {
                    j = sessionDescriptor2.f17233c;
                    if (j != -1) {
                    }
                    sessionDescriptor = sessionDescriptor2;
                    j2 = j;
                }
            } else if (i2 == sessionDescriptor2.f17232b) {
                j = sessionDescriptor2.f17233c;
                if (j != -1 || j < j2) {
                    sessionDescriptor = sessionDescriptor2;
                    j2 = j;
                } else if (j == j2) {
                    int i3 = Util.f18979a;
                    if (sessionDescriptor.d != null && sessionDescriptor2.d != null) {
                        sessionDescriptor = sessionDescriptor2;
                    }
                }
            }
        }
        if (sessionDescriptor != null) {
            return sessionDescriptor;
        }
        String str = (String) g.get();
        SessionDescriptor sessionDescriptor3 = new SessionDescriptor(str, i2, mediaPeriodId);
        map.put(str, sessionDescriptor3);
        return sessionDescriptor3;
    }

    public final synchronized String b(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return a(timeline.g(mediaPeriodId.f18347a, this.f17228b).Z, mediaPeriodId).f17231a;
    }

    public final void c(AnalyticsListener.EventTime eventTime) {
        MediaSource.MediaPeriodId mediaPeriodId;
        if (eventTime.f17214b.p()) {
            this.f = null;
            return;
        }
        SessionDescriptor sessionDescriptor = (SessionDescriptor) this.f17229c.get(this.f);
        int i2 = eventTime.f17215c;
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.d;
        this.f = a(i2, mediaPeriodId2).f17231a;
        d(eventTime);
        if (mediaPeriodId2 == null || !mediaPeriodId2.a()) {
            return;
        }
        long j = mediaPeriodId2.d;
        if (sessionDescriptor != null && sessionDescriptor.f17233c == j && (mediaPeriodId = sessionDescriptor.d) != null && mediaPeriodId.f18348b == mediaPeriodId2.f18348b && mediaPeriodId.f18349c == mediaPeriodId2.f18349c) {
            return;
        }
        a(i2, new MediaSource.MediaPeriodId(mediaPeriodId2.f18347a, j));
        this.d.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r1.d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.d(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime):void");
    }
}
