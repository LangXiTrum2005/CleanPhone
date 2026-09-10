package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j7 extends k7 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f16004o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f16005p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16006n;

    public static boolean i(np0 np0Var, byte[] bArr) {
        if (np0Var.B() < 8) {
            return false;
        }
        int i10 = np0Var.f17881b;
        byte[] bArr2 = new byte[8];
        np0Var.H(bArr2, 0, 8);
        np0Var.E(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(boolean z10) {
        super.e(z10);
        if (z10) {
            this.f16006n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final long f(np0 np0Var) {
        byte[] bArr = np0Var.f17880a;
        return (((long) this.f16351e) * x10.D(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final boolean g(np0 np0Var, long j10, md0 md0Var) {
        if (i(np0Var, f16004o)) {
            byte[] bArrCopyOf = Arrays.copyOf(np0Var.f17880a, np0Var.f17882c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListF = x10.f(bArrCopyOf);
            if (((g22) md0Var.f17399b) == null) {
                i12 i12Var = new i12();
                i12Var.d("audio/ogg");
                i12Var.e(MimeTypes.AUDIO_OPUS);
                i12Var.F = i10;
                i12Var.H = 48000;
                i12Var.f15514q = arrayListF;
                md0Var.f17399b = new g22(i12Var);
                return true;
            }
        } else {
            if (!i(np0Var, f16005p)) {
                ((g22) md0Var.f17399b).getClass();
                return false;
            }
            ((g22) md0Var.f17399b).getClass();
            if (!this.f16006n) {
                this.f16006n = true;
                np0Var.G(8);
                s8 s8VarA = j3.a(ca1.z((String[]) zw1.h(np0Var, false, false).f22523a));
                if (s8VarA != null) {
                    g22 g22Var = (g22) md0Var.f17399b;
                    g22Var.getClass();
                    i12 i12Var2 = new i12(g22Var);
                    i12Var2.f15509k = s8VarA.b(((g22) md0Var.f17399b).l);
                    md0Var.f17399b = new g22(i12Var2);
                    return true;
                }
            }
        }
        return true;
    }
}
