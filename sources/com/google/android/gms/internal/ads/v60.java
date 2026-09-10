package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v60 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f21049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f21050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f21051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t80 f21052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t80 f21053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f21054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fx1 f21055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gx1 f21056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gx1 f21057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kx1 f21058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kx1 f21059k;
    public final kx1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kx1 f21060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fx1 f21061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fx1 f21062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kx1 f21063p;

    public v60(o40 o40Var, fx1 fx1Var, fx1 fx1Var2, t80 t80Var, t80 t80Var2, fx1 fx1Var3, fx1 fx1Var4, gx1 gx1Var, gx1 gx1Var2, fx1 fx1Var5, fx1 fx1Var6, fx1 fx1Var7, y90 y90Var, fx1 fx1Var8, fx1 fx1Var9, lx1 lx1Var) {
        this.f21049a = o40Var;
        this.f21050b = fx1Var;
        this.f21051c = fx1Var2;
        this.f21052d = t80Var;
        this.f21053e = t80Var2;
        this.f21054f = fx1Var3;
        this.f21055g = fx1Var4;
        this.f21056h = gx1Var;
        this.f21057i = gx1Var2;
        this.f21058j = fx1Var5;
        this.f21059k = fx1Var6;
        this.l = fx1Var7;
        this.f21060m = y90Var;
        this.f21061n = fx1Var8;
        this.f21062o = fx1Var9;
        this.f21063p = lx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        Context contextA = ((o40) this.f21049a).a();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        Executor executor = (Executor) this.f21050b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f21051c.zzb();
        ju0 ju0VarB = this.f21052d.b();
        du0 du0VarA = this.f21053e.a();
        lx0 lx0Var = (lx0) this.f21054f.zzb();
        ru0 ru0Var = (ru0) this.f21055g.zzb();
        View view = (View) this.f21056h.zzb();
        b30 b30Var = (b30) this.f21057i.zzb();
        qf qfVar = (qf) this.f21058j.zzb();
        sm smVar = (sm) this.f21059k.zzb();
        return new u60(contextA, k00Var, executor, scheduledExecutorService, ju0VarB, du0VarA, lx0Var, ru0Var, view, b30Var, qfVar, smVar, ((y90) this.f21060m).f22206a.f21466e, (cb0) this.f21061n.zzb(), (n90) this.f21062o.zzb(), ((lx1) this.f21063p).zzb());
    }
}
