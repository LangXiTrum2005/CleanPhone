package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x80 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f21781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z90 f21782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f21783d;

    public x80(z90 z90Var, fx1 fx1Var, k40 k40Var) {
        this.f21780a = 3;
        this.f21782c = z90Var;
        this.f21781b = fx1Var;
        this.f21783d = k40Var;
    }

    public tp0 a() {
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new tp0(k00Var, (ph0) this.f21781b.zzb(), this.f21782c.a(), (String) this.f21783d.zzb(), 2);
    }

    public tp0 b() {
        Context contextA = ((o40) this.f21781b).a();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new tp0(contextA, k00Var, this.f21782c.a(), ((u40) this.f21783d).a());
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        String string;
        switch (this.f21780a) {
            case 0:
                p9.a aVar = (p9.a) this.f21781b.zzb();
                h00 h00VarZzb = ((v40) this.f21783d).zzb();
                String str = this.f21782c.a().f18366g;
                md0 md0Var = h00VarZzb.f15014c;
                synchronized (md0Var) {
                    string = ((BigInteger) md0Var.f17399b).toString();
                    md0Var.f17399b = ((BigInteger) md0Var.f17399b).add(BigInteger.ONE);
                    md0Var.f17400c = string;
                }
                return new b00(aVar, h00VarZzb, string, str);
            case 1:
                return new vp0((p9.a) this.f21781b.zzb(), this.f21782c.a(), ((Long) this.f21783d.zzb()).longValue());
            case 2:
                return a();
            case 3:
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new tp0(k00Var, this.f21782c.a(), (PackageInfo) this.f21781b.zzb(), ((k40) this.f21783d).zzb());
            default:
                return b();
        }
    }

    public x80(fx1 fx1Var, v40 v40Var, z90 z90Var) {
        this.f21780a = 0;
        this.f21781b = fx1Var;
        this.f21783d = v40Var;
        this.f21782c = z90Var;
    }

    public /* synthetic */ x80(kx1 kx1Var, z90 z90Var, kx1 kx1Var2, int i10) {
        this.f21780a = i10;
        this.f21781b = kx1Var;
        this.f21782c = z90Var;
        this.f21783d = kx1Var2;
    }
}
