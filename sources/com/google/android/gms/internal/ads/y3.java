package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y3 implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s2 f22090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2 f22092c = new q2();

    public y3(s2 s2Var, int i10) {
        this.f22090a = s2Var;
        this.f22091b = i10;
    }

    @Override // com.google.android.gms.internal.ads.e2
    public final d2 a(n2 n2Var, long j10) {
        long jZzn = n2Var.zzn();
        long jB = b(n2Var);
        long jZzm = n2Var.zzm();
        n2Var.b(Math.max(6, this.f22090a.f19770c));
        long jB2 = b(n2Var);
        long jZzm2 = n2Var.zzm();
        if (jB > j10 || jB2 <= j10) {
            return jB2 <= j10 ? new d2(-2, jB2, jZzm2) : new d2(-1, jB, jZzn);
        }
        return new d2(0, C.TIME_UNSET, jZzm);
    }

    public final long b(n2 n2Var) {
        q2 q2Var;
        s2 s2Var;
        int iY;
        while (true) {
            long jZzm = n2Var.zzm();
            long jZzo = n2Var.zzo() - 6;
            q2Var = this.f22092c;
            s2Var = this.f22090a;
            if (jZzm >= jZzo) {
                break;
            }
            long jZzm2 = n2Var.zzm();
            np0 np0Var = new np0(17);
            int i10 = 0;
            n2Var.v(np0Var.f17880a, 0, 2);
            char cR = np0Var.r(0, ByteOrder.BIG_ENDIAN);
            int i11 = this.f22091b;
            if (cR != i11) {
                n2Var.zzl();
                n2Var.b((int) (jZzm2 - n2Var.zzn()));
            } else {
                byte[] bArr = np0Var.f17880a;
                while (i10 < 15 && (iY = n2Var.y(bArr, 2 + i10, 15 - i10)) != -1) {
                    i10 += iY;
                }
                np0Var.C(i10 + 2);
                n2Var.zzl();
                n2Var.b((int) (jZzm2 - n2Var.zzn()));
                if (pi1.k(np0Var, s2Var, i11, q2Var)) {
                    break;
                }
            }
            n2Var.b(1);
        }
        if (n2Var.zzm() < n2Var.zzo() - 6) {
            return q2Var.f18888a;
        }
        n2Var.b((int) (n2Var.zzo() - n2Var.zzm()));
        return s2Var.f19777j;
    }
}
