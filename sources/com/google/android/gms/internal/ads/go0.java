package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class go0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f14910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f14911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1 f14912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx1 f14913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fx1 f14914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f14915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fx1 f14916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kx1 f14917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fx1 f14918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fx1 f14919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n60 f14920k;
    public final fx1 l;

    public go0(kx1 kx1Var, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, kx1 kx1Var2, fx1 fx1Var5, kx1 kx1Var3, fx1 fx1Var6, fx1 fx1Var7, n60 n60Var, fx1 fx1Var8) {
        this.f14910a = kx1Var;
        this.f14911b = fx1Var;
        this.f14912c = fx1Var2;
        this.f14913d = fx1Var3;
        this.f14914e = fx1Var4;
        this.f14915f = kx1Var2;
        this.f14916g = fx1Var5;
        this.f14917h = kx1Var3;
        this.f14918i = fx1Var6;
        this.f14919j = fx1Var7;
        this.f14920k = n60Var;
        this.l = fx1Var8;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fo0 zzb() {
        Context contextA = ((o40) this.f14910a).a();
        yv0 yv0Var = (yv0) this.f14911b.zzb();
        bo0 bo0Var = (bo0) this.f14912c.zzb();
        ga0 ga0Var = (ga0) this.f14913d.zzb();
        lx0 lx0Var = (lx0) this.f14914e.zzb();
        mx0 mx0Var = (mx0) this.f14915f.zzb();
        o80 o80Var = (o80) this.f14916g.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new fo0(contextA, yv0Var, bo0Var, ga0Var, lx0Var, mx0Var, o80Var, k00Var, (ScheduledExecutorService) this.f14917h.zzb(), (sm0) this.f14918i.zzb(), (jw0) this.f14919j.zzb(), this.f14920k.a(), (wh0) this.l.zzb());
    }
}
