package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22753c = C.TIME_UNSET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22754d = C.TIME_UNSET;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22756f = C.TIME_UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22757g = C.TIME_UNSET;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f22759i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f22760j = C.TIME_UNSET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22755e = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22758h = C.TIME_UNSET;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22761k = C.TIME_UNSET;
    public long l = C.TIME_UNSET;

    public /* synthetic */ zx1(long j10, long j11) {
        this.f22751a = j10;
        this.f22752b = j11;
    }

    public final void a() {
        long j10 = this.f22758h;
        if (j10 == C.TIME_UNSET) {
            return;
        }
        long j11 = j10 + this.f22752b;
        this.f22758h = j11;
        long j12 = this.f22757g;
        if (j12 != C.TIME_UNSET && j11 > j12) {
            this.f22758h = j12;
        }
        this.f22760j = C.TIME_UNSET;
    }

    public final long b() {
        return this.f22758h;
    }

    public final void c() {
        long j10;
        long j11 = this.f22753c;
        if (j11 != C.TIME_UNSET) {
            j10 = this.f22754d;
            if (j10 == C.TIME_UNSET) {
                long j12 = this.f22756f;
                if (j12 != C.TIME_UNSET && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f22757g;
                if (j10 == C.TIME_UNSET || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f22755e == j10) {
            return;
        }
        this.f22755e = j10;
        this.f22758h = j10;
        this.f22761k = C.TIME_UNSET;
        this.l = C.TIME_UNSET;
        this.f22760j = C.TIME_UNSET;
    }
}
