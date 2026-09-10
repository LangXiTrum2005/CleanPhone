package sg.bigo.ads.common.utils;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes7.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f47535a = new r() { // from class: sg.bigo.ads.common.utils.r.1
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i2) {
            return ((long) i2) * 1000;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f47536b = new r() { // from class: sg.bigo.ads.common.utils.r.2
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i2) {
            return ((long) i2) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f47537c = new r() { // from class: sg.bigo.ads.common.utils.r.3
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i2) {
            return ((long) i2) * com.thinkup.core.common.om.n.m;
        }
    };
    public static final r d = new r() { // from class: sg.bigo.ads.common.utils.r.4
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i2) {
            return ((long) i2) * 86400000;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f47538e = null;
    private static long f = 1619452800;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f47539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f47540b = SystemClock.elapsedRealtime();

        public a(long j) {
            this.f47539a = j;
        }

        public final long a() {
            return (SystemClock.elapsedRealtime() - this.f47540b) + this.f47539a;
        }
    }

    private r() {
    }

    public static long a() {
        long jCurrentTimeMillis = System.currentTimeMillis() - sg.bigo.ads.common.x.a.e();
        if (jCurrentTimeMillis > 0) {
            return jCurrentTimeMillis;
        }
        sg.bigo.ads.common.x.a.f();
        return System.currentTimeMillis();
    }

    public static long b() {
        a aVar = f47538e;
        return aVar == null ? System.currentTimeMillis() : aVar.a();
    }

    public /* synthetic */ r(byte b2) {
        this();
    }

    public long a(int i2) {
        return i2;
    }

    public static void a(long j) {
        if (j < f) {
            return;
        }
        a aVar = new a(j * 1000);
        if (f47538e == null) {
            f47538e = aVar;
        } else if (aVar.a() > f47538e.a()) {
            f47538e = aVar;
        }
    }
}
