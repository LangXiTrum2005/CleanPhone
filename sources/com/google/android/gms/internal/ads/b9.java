package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b9 implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9 f12687a = new c9(0, 0, null, MimeTypes.AUDIO_AC3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np0 f12688b = new np0(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12689c;

    static {
        int i10 = dv.f13747t;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) throws EOFException, InterruptedIOException {
        h2 h2Var;
        int iA;
        np0 np0Var = new np0(10);
        int i10 = 0;
        while (true) {
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
        int i11 = 0;
        int i12 = i10;
        while (true) {
            h2Var.m(np0Var.f17880a, 0, 6, false);
            np0Var.E(0);
            if (np0Var.L() != 2935) {
                h2Var.f15065f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                h2Var.a(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = np0Var.f17880a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i13 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    iA = i13 + i13;
                } else {
                    byte b10 = bArr[4];
                    iA = x10.A((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
                }
                if (iA == -1) {
                    break;
                }
                h2Var.a(iA - 6, false);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        this.f12689c = false;
        this.f12687a.zza();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) {
        np0 np0Var = this.f12688b;
        int iT = n2Var.t(np0Var.f17880a, 0, 2786);
        if (iT == -1) {
            return -1;
        }
        np0Var.E(0);
        np0Var.C(iT);
        boolean z10 = this.f12689c;
        c9 c9Var = this.f12687a;
        if (!z10) {
            c9Var.f13108o = 0L;
            this.f12689c = true;
        }
        c9Var.f(np0Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f12687a.e(o2Var, new ga(Integer.MIN_VALUE, 0, 1, 0));
        o2Var.zzv();
        o2Var.o(new r2(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
