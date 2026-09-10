package com.smartdigimkt.y3;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.CrashConfig;
import com.smartdigimkt.p4.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
final class j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f40076A = 2;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int f40077B = 3;
    private static final long C = 5000000;
    private static final long D = 5000000;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final long f40078E = 200;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int f40079F = 10;
    private static final int G = 30000;
    private static final int H = 500000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f40080z = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f40081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f40082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f40083c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40084e;
    private i f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f40086i;
    private long j;
    private long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Method f40087l;
    private long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f40088n;
    private boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f40089p;
    private long q;
    private long r;
    private long s;
    private int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f40090u;
    private long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f40091w;
    private long x;
    private long y;

    public interface a {
        void a(int i2, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j, long j2, long j3, long j4);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public j(a aVar) {
        this.f40081a = (a) com.smartdigimkt.p4.a.a(aVar);
        if (f0.f37540a >= 18) {
            try {
                this.f40087l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f40082b = new long[10];
    }

    private void h() {
        this.j = 0L;
        this.f40090u = 0;
        this.t = 0;
        this.k = 0L;
    }

    public void a(AudioTrack audioTrack, int i2, int i3, int i4) {
        this.f40083c = audioTrack;
        this.d = i3;
        this.f40084e = i4;
        this.f = new i(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.f40085h = a(i2);
        boolean zG = f0.g(i2);
        this.o = zG;
        this.f40086i = zG ? a(i4 / i3) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.s = 0L;
        this.f40088n = false;
        this.v = -9223372036854775807L;
        this.f40091w = -9223372036854775807L;
        this.m = 0L;
    }

    public int b(long j) {
        return this.f40084e - ((int) (j - (b() * ((long) this.d))));
    }

    public void c(long j) {
        this.x = b();
        this.v = SystemClock.elapsedRealtime() * 1000;
        this.y = j;
    }

    public boolean d() {
        return this.f40083c.getPlayState() == 3;
    }

    public boolean e(long j) {
        return this.f40091w != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f40091w >= f40078E;
    }

    public boolean f(long j) {
        a aVar;
        int playState = this.f40083c.getPlayState();
        if (this.f40085h) {
            if (playState == 2) {
                this.f40088n = false;
                return false;
            }
            if (playState == 1 && b() == 0) {
                return false;
            }
        }
        boolean z2 = this.f40088n;
        boolean zD = d(j);
        this.f40088n = zD;
        if (z2 && !zD && playState != 1 && (aVar = this.f40081a) != null) {
            aVar.a(this.f40084e, com.smartdigimkt.w3.b.b(this.f40086i));
        }
        return true;
    }

    public void g() {
        h();
        this.f40083c = null;
        this.f = null;
    }

    public void i() {
        this.f.g();
    }

    public boolean d(long j) {
        return j > b() || a();
    }

    private long b() {
        if (this.v != -9223372036854775807L) {
            return Math.min(this.y, this.x + ((((SystemClock.elapsedRealtime() * 1000) - this.v) * ((long) this.g)) / 1000000));
        }
        int playState = this.f40083c.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.f40083c.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f40085h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.s = this.q;
            }
            playbackHeadPosition += this.s;
        }
        if (f0.f37540a <= 28) {
            if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                if (this.f40091w == -9223372036854775807L) {
                    this.f40091w = SystemClock.elapsedRealtime();
                }
                return this.q;
            }
            this.f40091w = -9223372036854775807L;
        }
        if (this.q > playbackHeadPosition) {
            this.r++;
        }
        this.q = playbackHeadPosition;
        return playbackHeadPosition + (this.r << 32);
    }

    private void e() {
        long jC = c();
        if (jC == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.k >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            long[] jArr = this.f40082b;
            int i2 = this.t;
            jArr[i2] = jC - jNanoTime;
            this.t = (i2 + 1) % 10;
            int i3 = this.f40090u;
            if (i3 < 10) {
                this.f40090u = i3 + 1;
            }
            this.k = jNanoTime;
            this.j = 0L;
            int i4 = 0;
            while (true) {
                int i5 = this.f40090u;
                if (i4 >= i5) {
                    break;
                }
                this.j = (this.f40082b[i4] / ((long) i5)) + this.j;
                i4++;
            }
        }
        if (this.f40085h) {
            return;
        }
        a(jNanoTime, jC);
        g(jNanoTime);
    }

    private long c() {
        return a(b());
    }

    private void g(long j) {
        Method method;
        if (!this.o || (method = this.f40087l) == null || j - this.f40089p < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) method.invoke(this.f40083c, null)).intValue()) * 1000) - this.f40086i;
            this.m = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.m = jMax;
            if (jMax > 5000000) {
                this.f40081a.a(jMax);
                this.m = 0L;
            }
        } catch (Exception unused) {
            this.f40087l = null;
        }
        this.f40089p = j;
    }

    public boolean f() {
        h();
        if (this.v != -9223372036854775807L) {
            return false;
        }
        this.f.g();
        return true;
    }

    public long a(boolean z2) {
        long jC;
        if (this.f40083c.getPlayState() == 3) {
            e();
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (this.f.d()) {
            long jA = a(this.f.b());
            return !this.f.e() ? jA : (jNanoTime - this.f.c()) + jA;
        }
        if (this.f40090u == 0) {
            jC = c();
        } else {
            jC = jNanoTime + this.j;
        }
        return !z2 ? jC - this.m : jC;
    }

    private void a(long j, long j2) {
        if (this.f.a(j)) {
            long jC = this.f.c();
            long jB = this.f.b();
            if (Math.abs(jC - j) > 5000000) {
                this.f40081a.b(jB, jC, j, j2);
                this.f.f();
            } else if (Math.abs(a(jB) - j2) > 5000000) {
                this.f40081a.a(jB, jC, j, j2);
                this.f.f();
            } else {
                this.f.a();
            }
        }
    }

    private long a(long j) {
        return (j * 1000000) / ((long) this.g);
    }

    private boolean a() {
        return this.f40085h && this.f40083c.getPlayState() == 2 && b() == 0;
    }

    private static boolean a(int i2) {
        if (f0.f37540a < 23) {
            return i2 == 5 || i2 == 6;
        }
        return false;
    }
}
