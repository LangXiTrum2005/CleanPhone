package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final androidx.media3.datasource.a f6003h = new androidx.media3.datasource.a(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f6004i = new Random();
    public MediaMetricsListener d;
    public String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline.Window f6005a = new Timeline.Window();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timeline.Period f6006b = new Timeline.Period();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f6007c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Timeline f6008e = Timeline.f5507a;
    public long g = -1;

    public final class SessionDescriptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6011c;
        public final MediaSource.MediaPeriodId d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f6012e;
        public boolean f;

        public SessionDescriptor(String str, int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            this.f6009a = str;
            this.f6010b = i2;
            this.f6011c = mediaPeriodId == null ? -1L : mediaPeriodId.d;
            if (mediaPeriodId == null || !mediaPeriodId.b()) {
                return;
            }
            this.d = mediaPeriodId;
        }

        public final boolean a(AnalyticsListener.EventTime eventTime) {
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
            if (mediaPeriodId == null) {
                return this.f6010b != eventTime.f5992c;
            }
            long j = this.f6011c;
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
            Timeline timeline = eventTime.f5991b;
            int iB = timeline.b(mediaPeriodId.f6384a);
            int iB2 = timeline.b(mediaPeriodId2.f6384a);
            if (mediaPeriodId.d < mediaPeriodId2.d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            boolean zB = mediaPeriodId.b();
            int i2 = mediaPeriodId2.f6385b;
            if (!zB) {
                int i3 = mediaPeriodId.f6387e;
                return i3 == -1 || i3 > i2;
            }
            int i4 = mediaPeriodId.f6385b;
            if (i4 > i2) {
                return true;
            }
            if (i4 == i2) {
                return mediaPeriodId.f6386c > mediaPeriodId2.f6386c;
            }
            return false;
        }

        public final boolean b(Timeline timeline, Timeline timeline2) {
            MediaSource.MediaPeriodId mediaPeriodId;
            int i2 = this.f6010b;
            if (i2 < timeline.o()) {
                DefaultPlaybackSessionManager defaultPlaybackSessionManager = DefaultPlaybackSessionManager.this;
                timeline.n(i2, defaultPlaybackSessionManager.f6005a);
                Timeline.Window window = defaultPlaybackSessionManager.f6005a;
                int i3 = window.m;
                while (true) {
                    if (i3 > window.f5520n) {
                        i2 = -1;
                        break;
                    }
                    int iB = timeline2.b(timeline.l(i3));
                    if (iB != -1) {
                        i2 = timeline2.f(iB, defaultPlaybackSessionManager.f6006b, false).f5510c;
                        break;
                    }
                    i3++;
                }
            } else if (i2 >= timeline2.o()) {
                i2 = -1;
                break;
            }
            this.f6010b = i2;
            return i2 != -1 && ((mediaPeriodId = this.d) == null || timeline2.b(mediaPeriodId.f6384a) != -1);
        }
    }

    public final void a(SessionDescriptor sessionDescriptor) {
        long j = sessionDescriptor.f6011c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final SessionDescriptor b(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        long j;
        long j2;
        HashMap map = this.f6007c;
        SessionDescriptor sessionDescriptor = null;
        long j3 = Long.MAX_VALUE;
        for (SessionDescriptor sessionDescriptor2 : map.values()) {
            if (sessionDescriptor2.f6011c == -1 && i2 == sessionDescriptor2.f6010b && mediaPeriodId != null) {
                DefaultPlaybackSessionManager defaultPlaybackSessionManager = DefaultPlaybackSessionManager.this;
                SessionDescriptor sessionDescriptor3 = (SessionDescriptor) defaultPlaybackSessionManager.f6007c.get(defaultPlaybackSessionManager.f);
                if (sessionDescriptor3 != null) {
                    j2 = sessionDescriptor3.f6011c;
                    if (j2 == -1) {
                        j2 = 1 + defaultPlaybackSessionManager.g;
                    }
                } else {
                    j2 = 1 + defaultPlaybackSessionManager.g;
                }
                long j4 = mediaPeriodId.d;
                if (j4 >= j2) {
                    sessionDescriptor2.f6011c = j4;
                }
            }
            if (mediaPeriodId != null) {
                MediaSource.MediaPeriodId mediaPeriodId2 = sessionDescriptor2.d;
                long j5 = mediaPeriodId.d;
                if (mediaPeriodId2 == null) {
                    if (!mediaPeriodId.b() && j5 == sessionDescriptor2.f6011c) {
                        j = sessionDescriptor2.f6011c;
                        if (j != -1) {
                        }
                        sessionDescriptor = sessionDescriptor2;
                        j3 = j;
                    }
                } else if (j5 == mediaPeriodId2.d && mediaPeriodId.f6385b == mediaPeriodId2.f6385b && mediaPeriodId.f6386c == mediaPeriodId2.f6386c) {
                    j = sessionDescriptor2.f6011c;
                    if (j != -1) {
                    }
                    sessionDescriptor = sessionDescriptor2;
                    j3 = j;
                }
            } else if (i2 == sessionDescriptor2.f6010b) {
                j = sessionDescriptor2.f6011c;
                if (j != -1 || j < j3) {
                    sessionDescriptor = sessionDescriptor2;
                    j3 = j;
                } else if (j == j3) {
                    int i3 = Util.f5683a;
                    if (sessionDescriptor.d != null && sessionDescriptor2.d != null) {
                        sessionDescriptor = sessionDescriptor2;
                    }
                }
            }
        }
        if (sessionDescriptor != null) {
            return sessionDescriptor;
        }
        String str = (String) f6003h.get();
        SessionDescriptor sessionDescriptor4 = new SessionDescriptor(str, i2, mediaPeriodId);
        map.put(str, sessionDescriptor4);
        return sessionDescriptor4;
    }

    public final synchronized String c(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return b(timeline.g(mediaPeriodId.f6384a, this.f6006b).f5510c, mediaPeriodId).f6009a;
    }

    public final void d(AnalyticsListener.EventTime eventTime) {
        MediaSource.MediaPeriodId mediaPeriodId;
        boolean zP = eventTime.f5991b.p();
        HashMap map = this.f6007c;
        if (zP) {
            String str = this.f;
            if (str != null) {
                SessionDescriptor sessionDescriptor = (SessionDescriptor) map.get(str);
                sessionDescriptor.getClass();
                a(sessionDescriptor);
                return;
            }
            return;
        }
        SessionDescriptor sessionDescriptor2 = (SessionDescriptor) map.get(this.f);
        int i2 = eventTime.f5992c;
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.d;
        this.f = b(i2, mediaPeriodId2).f6009a;
        e(eventTime);
        if (mediaPeriodId2 == null || !mediaPeriodId2.b()) {
            return;
        }
        long j = mediaPeriodId2.d;
        if (sessionDescriptor2 != null && sessionDescriptor2.f6011c == j && (mediaPeriodId = sessionDescriptor2.d) != null && mediaPeriodId.f6385b == mediaPeriodId2.f6385b && mediaPeriodId.f6386c == mediaPeriodId2.f6386c) {
            return;
        }
        b(i2, new MediaSource.MediaPeriodId(mediaPeriodId2.f6384a, j));
        this.d.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    public final synchronized void e(AnalyticsListener.EventTime eventTime) {
        long j;
        this.d.getClass();
        if (eventTime.f5991b.p()) {
            return;
        }
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if (mediaPeriodId != null) {
            long j2 = mediaPeriodId.d;
            SessionDescriptor sessionDescriptor = (SessionDescriptor) this.f6007c.get(this.f);
            if (sessionDescriptor != null) {
                j = sessionDescriptor.f6011c;
                if (j == -1) {
                    j = this.g + 1;
                }
            } else {
                j = this.g + 1;
            }
            if (j2 < j) {
                return;
            }
            SessionDescriptor sessionDescriptor2 = (SessionDescriptor) this.f6007c.get(this.f);
            if (sessionDescriptor2 != null && sessionDescriptor2.f6011c == -1 && sessionDescriptor2.f6010b != eventTime.f5992c) {
                return;
            }
        }
        SessionDescriptor sessionDescriptorB = b(eventTime.f5992c, eventTime.d);
        if (this.f == null) {
            this.f = sessionDescriptorB.f6009a;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.d;
        if (mediaPeriodId2 != null && mediaPeriodId2.b()) {
            MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.d;
            SessionDescriptor sessionDescriptorB2 = b(eventTime.f5992c, new MediaSource.MediaPeriodId(mediaPeriodId3.f6384a, mediaPeriodId3.d, mediaPeriodId3.f6385b));
            if (!sessionDescriptorB2.f6012e) {
                sessionDescriptorB2.f6012e = true;
                eventTime.f5991b.g(eventTime.d.f6384a, this.f6006b);
                this.f6006b.d(eventTime.d.f6385b);
                Math.max(0L, Util.T(0L) + Util.T(this.f6006b.f5511e));
                this.d.getClass();
            }
        }
        if (!sessionDescriptorB.f6012e) {
            sessionDescriptorB.f6012e = true;
            this.d.getClass();
        }
        if (sessionDescriptorB.f6009a.equals(this.f) && !sessionDescriptorB.f) {
            sessionDescriptorB.f = true;
            MediaMetricsListener mediaMetricsListener = this.d;
            String str = sessionDescriptorB.f6009a;
            mediaMetricsListener.getClass();
            MediaSource.MediaPeriodId mediaPeriodId4 = eventTime.d;
            if (mediaPeriodId4 == null || !mediaPeriodId4.b()) {
                mediaMetricsListener.R();
                mediaMetricsListener.f6019i = str;
                mediaMetricsListener.j = q.h().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.1");
                mediaMetricsListener.S(eventTime.f5991b, mediaPeriodId4);
            }
        }
    }
}
