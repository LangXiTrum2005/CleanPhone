package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d7 extends k7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s2 f13434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c7 f13435o;

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(boolean z10) {
        super.e(z10);
        if (z10) {
            this.f13434n = null;
            this.f13435o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final long f(np0 np0Var) {
        byte[] bArr = np0Var.f17880a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6) {
            np0Var.G(4);
            np0Var.o();
        } else if (i10 == 7) {
            i10 = 7;
            np0Var.G(4);
            np0Var.o();
        }
        int iX = pi1.x(i10, np0Var);
        np0Var.E(0);
        return iX;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final boolean g(np0 np0Var, long j10, md0 md0Var) {
        byte[] bArr = np0Var.f17880a;
        s2 s2Var = this.f13434n;
        if (s2Var == null) {
            s2 s2Var2 = new s2(bArr, 17, 0);
            this.f13434n = s2Var2;
            i12 i12Var = new i12(s2Var2.f(Arrays.copyOfRange(bArr, 9, np0Var.f17882c), null));
            i12Var.d("audio/ogg");
            md0Var.f17399b = new g22(i12Var);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & 127) != 3) {
            if (b10 != -1) {
                return true;
            }
            c7 c7Var = this.f13435o;
            if (c7Var != null) {
                c7Var.f13070a = j10;
                md0Var.f17400c = c7Var;
            }
            ((g22) md0Var.f17399b).getClass();
            return false;
        }
        md0 md0VarI = ps1.I(np0Var);
        s2 s2Var3 = new s2(s2Var.f19768a, s2Var.f19769b, s2Var.f19770c, s2Var.f19771d, s2Var.f19772e, s2Var.f19774g, s2Var.f19775h, s2Var.f19777j, md0VarI, (s8) s2Var.l);
        this.f13434n = s2Var3;
        c7 c7Var2 = new c7();
        c7Var2.f13072c = s2Var3;
        c7Var2.f13073d = md0VarI;
        c7Var2.f13070a = -1L;
        c7Var2.f13071b = -1L;
        this.f13435o = c7Var2;
        return true;
    }
}
