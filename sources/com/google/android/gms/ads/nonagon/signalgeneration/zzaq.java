package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.ci0;
import com.google.android.gms.internal.ads.gx1;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.kx1;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.mx0;
import com.google.android.gms.internal.ads.o40;
import com.google.android.gms.internal.ads.pu0;
import com.google.android.gms.internal.ads.qf;
import com.google.android.gms.internal.ads.rm;
import com.google.android.gms.internal.ads.u40;
import com.google.android.gms.internal.ads.xu0;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaq implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f11421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f11422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f11423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f11424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f11425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f11426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kx1 f11427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kx1 f11428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kx1 f11429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kx1 f11430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kx1 f11431k;
    public final kx1 l;

    public zzaq(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, kx1 kx1Var4, kx1 kx1Var5, kx1 kx1Var6, kx1 kx1Var7, kx1 kx1Var8, kx1 kx1Var9, kx1 kx1Var10, kx1 kx1Var11, kx1 kx1Var12) {
        this.f11421a = kx1Var;
        this.f11422b = kx1Var2;
        this.f11423c = kx1Var3;
        this.f11424d = kx1Var4;
        this.f11425e = kx1Var5;
        this.f11426f = kx1Var6;
        this.f11427g = kx1Var7;
        this.f11428h = kx1Var8;
        this.f11429i = kx1Var9;
        this.f11430j = kx1Var10;
        this.f11431k = kx1Var11;
        this.l = kx1Var12;
    }

    public static zzaq zza(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, kx1 kx1Var4, kx1 kx1Var5, kx1 kx1Var6, kx1 kx1Var7, kx1 kx1Var8, kx1 kx1Var9, kx1 kx1Var10, kx1 kx1Var11, kx1 kx1Var12, kx1 kx1Var13) {
        return new zzaq(kx1Var, kx1Var2, kx1Var3, kx1Var4, kx1Var6, kx1Var7, kx1Var8, kx1Var9, kx1Var10, kx1Var11, kx1Var12, kx1Var13);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        a50 a50Var = (a50) this.f11421a.zzb();
        Context contextA = ((o40) this.f11422b).a();
        qf qfVar = (qf) this.f11423c.zzb();
        xu0 xu0Var = (xu0) this.f11424d.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new zzap(a50Var, contextA, qfVar, xu0Var, k00Var, (ScheduledExecutorService) this.f11425e.zzb(), (ci0) this.f11426f.zzb(), (mx0) this.f11427g.zzb(), ((u40) this.f11428h).a(), ((rm) this.f11429i).zzb(), (pu0) this.f11430j.zzb(), (zzj) this.f11431k.zzb(), (zza) this.l.zzb());
    }
}
