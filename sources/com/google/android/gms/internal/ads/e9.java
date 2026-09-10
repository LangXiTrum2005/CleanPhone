package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e9 implements m2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final np0 f13885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gp0 f13886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o2 f13887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13888f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13891i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9 f13883a = new f9(null, 0, MimeTypes.AUDIO_AAC, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np0 f13884b = new np0(com.ironsource.mediationsdk.metadata.a.f29616n);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13889g = -1;

    static {
        int i10 = rb0.f19511o;
    }

    public e9() {
        np0 np0Var = new np0(10);
        this.f13885c = np0Var;
        byte[] bArr = np0Var.f17880a;
        this.f13886d = new gp0(bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) throws EOFException, InterruptedIOException {
        np0 np0Var;
        h2 h2Var;
        int i10 = 0;
        while (true) {
            np0Var = this.f13885c;
            h2Var = (h2) n2Var;
            h2Var.m(np0Var.f17880a, 0, 10, false);
            np0Var.E(0);
            if (np0Var.O() != 4801587) {
                break;
            }
            np0Var.G(3);
            int iG = np0Var.g();
            i10 += iG + 10;
            h2Var.a(iG, false);
        }
        h2Var.f15065f = 0;
        h2Var.a(i10, false);
        if (this.f13889g == -1) {
            this.f13889g = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            h2Var.m(np0Var.f17880a, 0, 2, false);
            np0Var.E(0);
            if ((np0Var.L() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                h2Var.m(np0Var.f17880a, 0, 4, false);
                gp0 gp0Var = this.f13886d;
                gp0Var.d(14);
                int iH = gp0Var.h(13);
                if (iH <= 6) {
                    i13++;
                    h2Var.f15065f = 0;
                    h2Var.a(i13, false);
                } else {
                    h2Var.a(iH - 6, false);
                    i12 += iH;
                }
            } else {
                i13++;
                h2Var.f15065f = 0;
                h2Var.a(i13, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        this.f13890h = false;
        this.f13883a.zza();
        this.f13888f = j11;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) throws ab {
        this.f13887e.getClass();
        np0 np0Var = this.f13884b;
        int iT = n2Var.t(np0Var.f17880a, 0, com.ironsource.mediationsdk.metadata.a.f29616n);
        if (!this.f13891i) {
            this.f13887e.o(new r2(C.TIME_UNSET, 0L));
            this.f13891i = true;
        }
        if (iT == -1) {
            return -1;
        }
        np0Var.E(0);
        np0Var.C(iT);
        boolean z10 = this.f13890h;
        f9 f9Var = this.f13883a;
        if (!z10) {
            f9Var.f14339u = this.f13888f;
            this.f13890h = true;
        }
        f9Var.f(np0Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f13887e = o2Var;
        this.f13883a.e(o2Var, new ga(Integer.MIN_VALUE, 0, 1, 0));
        o2Var.zzv();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
