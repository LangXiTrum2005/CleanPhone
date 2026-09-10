package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d9 implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9 f13464a = new c9(0, 1, null, "audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np0 f13465b = new np0(Http2.INITIAL_MAX_FRAME_SIZE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13466c;

    static {
        int i10 = x10.f21697x;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) throws EOFException, InterruptedIOException {
        h2 h2Var;
        int i10;
        np0 np0Var = new np0(10);
        int i11 = 0;
        while (true) {
            h2Var = (h2) n2Var;
            h2Var.m(np0Var.f17880a, 0, 10, false);
            np0Var.E(0);
            if (np0Var.O() != 4801587) {
                break;
            }
            np0Var.G(3);
            int iG = np0Var.g();
            i11 += iG + 10;
            h2Var.a(iG, false);
        }
        h2Var.f15065f = 0;
        h2Var.a(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            h2Var.m(np0Var.f17880a, 0, 7, false);
            np0Var.E(0);
            int iL = np0Var.L();
            if (iL == 44096 || iL == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = np0Var.f17880a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iL == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    break;
                }
                h2Var.a(i10 - 7, false);
            } else {
                h2Var.f15065f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    break;
                }
                h2Var.a(i13, false);
                i12 = 0;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        this.f13466c = false;
        this.f13464a.zza();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) {
        np0 np0Var = this.f13465b;
        int iT = n2Var.t(np0Var.f17880a, 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (iT == -1) {
            return -1;
        }
        np0Var.E(0);
        np0Var.C(iT);
        boolean z10 = this.f13466c;
        c9 c9Var = this.f13464a;
        if (!z10) {
            c9Var.f13108o = 0L;
            this.f13466c = true;
        }
        c9Var.f(np0Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f13464a.e(o2Var, new ga(Integer.MIN_VALUE, 0, 1, 0));
        o2Var.zzv();
        o2Var.o(new r2(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
