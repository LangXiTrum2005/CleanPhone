package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c7 implements i7, i3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13073d;

    public c7(long j10) {
        ps1.c0(((t) this.f13072c) == null);
        this.f13070a = j10;
        this.f13071b = j10 + 65536;
    }

    public static c7 b(bc.i iVar, byte[] bArr, boolean z10) throws fc, ic {
        iVar.h();
        ((ed) iVar.f5553c).f13935c.f21149b = qc.e(bArr);
        List list = (List) iVar.j(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        iVar.k(jLongValue, Optional.empty());
        byte[] bArrM = rb0.m();
        String strG = rb1.f19513d.g(bArrM.length, bArrM);
        int length = strG.length();
        String str = true != z10 ? "" : "-s";
        String strJ = q4.a.j(new StringBuilder(str.length() + length + 12), "3.893135394.", strG, str);
        c7 c7Var = new c7();
        c7Var.f13072c = iVar;
        c7Var.f13070a = jLongValue2;
        c7Var.f13071b = jLongValue3;
        c7Var.f13073d = strJ;
        return c7Var;
    }

    @Override // i3.d
    public long a(n2.l lVar) {
        long j10 = this.f13071b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f13071b = -1L;
        return j11;
    }

    public boolean c(long j10, boolean z10, boolean z11) {
        ea.p3 p3Var = (ea.p3) this.f13073d;
        p3Var.G0();
        p3Var.H0();
        ea.m1 m1Var = (ea.m1) p3Var.f3623a;
        boolean zA = m1Var.a();
        ea.s0 s0Var = m1Var.f39587f;
        if (zA) {
            ea.a1 a1Var = m1Var.f39586e;
            ea.m1.f(a1Var);
            ea.z0 z0Var = a1Var.f39216p;
            m1Var.f39592k.getClass();
            z0Var.f(System.currentTimeMillis());
        }
        long j11 = j10 - this.f13070a;
        if (!z10 && j11 < 1000) {
            ea.m1.h(s0Var);
            s0Var.f39760n.c(Long.valueOf(j11), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f13071b;
            this.f13071b = j10;
        }
        ea.m1.h(s0Var);
        s0Var.f39760n.c(Long.valueOf(j11), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !m1Var.f39585d.V0();
        ea.z2 z2Var = m1Var.l;
        ea.m1.g(z2Var);
        ea.l4.B1(z2Var.K0(z12), bundle, true);
        if (!z11) {
            ea.p2 p2Var = m1Var.f39593m;
            ea.m1.g(p2Var);
            p2Var.N0("auto", bundle, "_e");
        }
        this.f13070a = j10;
        ea.o3 o3Var = (ea.o3) this.f13072c;
        o3Var.c();
        o3Var.b(((Long) ea.d0.f39325p0.a(null)).longValue());
        return true;
    }

    @Override // i3.d
    public n2.t createSeekMap() {
        go.k.t(this.f13070a != -1);
        return new n2.o((s2) this.f13072c, this.f13070a, 0);
    }

    @Override // com.google.android.gms.internal.ads.i7
    public long d(n2 n2Var) {
        long j10 = this.f13071b;
        if (j10 < 0) {
            return -1L;
        }
        this.f13071b = -1L;
        return -(j10 + 2);
    }

    @Override // com.google.android.gms.internal.ads.i7
    public void f(long j10) {
        long[] jArr = (long[]) ((md0) this.f13073d).f17399b;
        this.f13071b = jArr[uu0.r(jArr, j10, true)];
    }

    @Override // i3.d
    public void startSeek(long j10) {
        long[] jArr = (long[]) ((m5.k) this.f13073d).f45902b;
        this.f13071b = jArr[l1.y.f(jArr, j10, true)];
    }

    @Override // com.google.android.gms.internal.ads.i7
    public a3 zzc() {
        ps1.c0(this.f13070a != -1);
        return new r2((s2) this.f13072c, this.f13070a, 0);
    }

    public c7(long j10, int i10) {
        go.k.t(((j2.a) this.f13072c) == null);
        this.f13070a = j10;
        this.f13071b = j10 + ((long) i10);
    }
}
