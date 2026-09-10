package g3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import n2.s;
import n2.t;
import n2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f41424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f41425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f41426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f41427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f41428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f41429k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f41430m;

    public a(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        this.f41419a = j10;
        this.f41420b = j11;
        this.f41421c = i11 == -1 ? 1 : i11;
        this.f41423e = i10;
        this.f41425g = z10;
        this.f41426h = z11;
        if (j10 == -1) {
            this.f41422d = -1L;
            this.f41424f = C.TIME_UNSET;
        } else {
            long j12 = j10 - j11;
            this.f41422d = j12;
            this.f41424f = (Math.max(0L, j12) * 8000000) / ((long) i10);
        }
        this.f41427i = j11;
        this.f41428j = i10;
        this.f41429k = i11;
        this.l = z10;
        this.f41430m = j10 == -1 ? -1L : j10;
    }

    @Override // n2.t
    public final boolean a() {
        return this.f41426h;
    }

    @Override // g3.h
    public final long b() {
        return this.f41430m;
    }

    @Override // g3.h
    public final int c() {
        return this.f41428j;
    }

    @Override // n2.t
    public final long getDurationUs() {
        return this.f41424f;
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        long j11 = this.f41422d;
        long j12 = this.f41420b;
        if (j11 == -1 && !this.f41425g) {
            u uVar = new u(0L, j12);
            return new s(uVar, uVar);
        }
        int i10 = this.f41423e;
        long j13 = this.f41421c;
        long jMin = (((((long) i10) * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L) + j12;
        long jMax2 = (Math.max(0L, jMax - j12) * 8000000) / ((long) i10);
        u uVar2 = new u(jMax2, jMax);
        if (j11 != -1 && jMax2 < j10) {
            long j14 = jMax + j13;
            if (j14 < this.f41419a) {
                return new s(uVar2, new u((Math.max(0L, j14 - j12) * 8000000) / ((long) i10), j14));
            }
        }
        return new s(uVar2, uVar2);
    }

    @Override // g3.h
    public final long getTimeUs(long j10) {
        return (Math.max(0L, j10 - this.f41420b) * 8000000) / ((long) this.f41423e);
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return this.f41422d != -1 || this.f41425g;
    }
}
