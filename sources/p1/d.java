package p1;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47983c = C.TIME_UNSET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f47984d = C.TIME_UNSET;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f47986f = C.TIME_UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f47987g = C.TIME_UNSET;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f47990j = 0.97f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f47989i = 1.03f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f47991k = 1.0f;
    public long l = C.TIME_UNSET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f47985e = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f47988h = C.TIME_UNSET;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f47992m = C.TIME_UNSET;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f47993n = C.TIME_UNSET;

    public d(long j10, long j11) {
        this.f47981a = j10;
        this.f47982b = j11;
    }

    public final void a() {
        long j10;
        long j11 = this.f47983c;
        if (j11 != C.TIME_UNSET) {
            j10 = this.f47984d;
            if (j10 == C.TIME_UNSET) {
                long j12 = this.f47986f;
                if (j12 != C.TIME_UNSET && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f47987g;
                if (j10 == C.TIME_UNSET || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f47985e == j10) {
            return;
        }
        this.f47985e = j10;
        this.f47988h = j10;
        this.f47992m = C.TIME_UNSET;
        this.f47993n = C.TIME_UNSET;
        this.l = C.TIME_UNSET;
    }
}
