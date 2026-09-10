package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f19476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f19477k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f19478m;

    public void a(int i10) {
        long j10 = this.f19477k;
        if (j10 != C.TIME_UNSET) {
            long j11 = this.f19467a;
            long j12 = this.f19476j;
            if (j11 == j12) {
                return;
            }
            int i11 = (int) (j11 - j12);
            ((n2.a0) this.f19478m).a(j10, this.l ? 1 : 0, i11, i10, null);
        }
    }

    public void b(int i10) {
        long j10 = this.f19477k;
        if (j10 != C.TIME_UNSET) {
            long j11 = this.f19467a;
            long j12 = this.f19476j;
            if (j11 == j12) {
                return;
            }
            int i11 = (int) (j11 - j12);
            ((h3) this.f19478m).c(j10, this.l ? 1 : 0, i11, i10, null);
        }
    }
}
