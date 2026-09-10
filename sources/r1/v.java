package r1;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.d12;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import oa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public boolean A;
    public long B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f49368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.u f49369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f49370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioTrack f49371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f49373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f49374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d12 f49375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f49376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f49377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f49378k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Method f49379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f49380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f49381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f49382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f49383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f49384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f49385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f49386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f49387u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f49388v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f49389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f49390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f49391y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f49392z;

    public v(k0 k0Var, l1.u uVar, AudioTrack audioTrack, int i10, int i11, int i12) {
        this.f49368a = k0Var;
        this.f49369b = uVar;
        this.f49371d = audioTrack;
        try {
            this.f49379m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f49370c = new long[10];
        this.f49392z = C.TIME_UNSET;
        this.f49391y = C.TIME_UNSET;
        this.f49375h = new d12(audioTrack, k0Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f49372e = sampleRate;
        boolean zH = l1.y.H(i10);
        this.f49374g = zH;
        this.f49373f = zH ? l1.y.S(sampleRate, i12 / i11) : -9223372036854775807L;
        this.f49383q = 0L;
        this.f49384r = 0L;
        this.A = false;
        this.B = 0L;
        this.f49387u = C.TIME_UNSET;
        this.f49388v = C.TIME_UNSET;
        this.f49381o = 0L;
        this.f49380n = 0L;
        this.f49376i = 1.0f;
        this.f49377j = C.TIME_UNSET;
    }

    public final long a() {
        if (this.f49387u != C.TIME_UNSET) {
            return Math.min(this.f49390x, c());
        }
        this.f49369b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f49382p >= 5) {
            AudioTrack audioTrack = this.f49371d;
            if (audioTrack.getPlayState() != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                long j10 = this.f49383q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f49384r++;
                    }
                }
                this.f49383q = playbackHeadPosition;
            }
            this.f49382p = jElapsedRealtime;
        }
        return this.f49383q + this.B + (this.f49384r << 32);
    }

    public final long b(long j10) {
        long jA;
        int i10 = this.f49386t;
        int i11 = this.f49372e;
        if (i10 == 0) {
            jA = this.f49387u != C.TIME_UNSET ? l1.y.S(i11, c()) : l1.y.S(i11, a());
        } else {
            jA = l1.y.A(j10 + this.f49378k, this.f49376i);
        }
        long jMax = Math.max(0L, jA - this.f49380n);
        return this.f49387u != C.TIME_UNSET ? Math.min(l1.y.S(i11, this.f49390x), jMax) : jMax;
    }

    public final long c() {
        if (this.f49371d.getPlayState() == 2) {
            return this.f49389w;
        }
        this.f49369b.getClass();
        return this.f49389w + l1.y.U(l1.y.A(l1.y.M(SystemClock.elapsedRealtime()) - this.f49387u, this.f49376i), this.f49372e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f49377j;
        if (j11 == C.TIME_UNSET || j10 < j11) {
            return;
        }
        long jD = l1.y.D(j10 - j11, this.f49376i);
        this.f49369b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - l1.y.Z(jD);
        this.f49377j = C.TIME_UNSET;
        ((t) this.f49368a.f47269b).f49352i.e(-1, new ni.h(jCurrentTimeMillis));
    }
}
