package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wm0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f21536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f21537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z90 f21538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f21539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hx1 f21540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fx1 f21541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kx1 f21542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fx1 f21543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kx1 f21544j;

    public /* synthetic */ wm0(fx1 fx1Var, kx1 kx1Var, z90 z90Var, kx1 kx1Var2, hx1 hx1Var, fx1 fx1Var2, kx1 kx1Var3, fx1 fx1Var3, kx1 kx1Var4, int i10) {
        this.f21535a = i10;
        this.f21536b = fx1Var;
        this.f21537c = kx1Var;
        this.f21538d = z90Var;
        this.f21539e = kx1Var2;
        this.f21540f = hx1Var;
        this.f21541g = fx1Var2;
        this.f21542h = kx1Var3;
        this.f21543i = fx1Var3;
        this.f21544j = kx1Var4;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f21535a) {
            case 0:
                k70 k70Var = (k70) this.f21540f.f15424a;
                return new vm0(k70Var, (Executor) this.f21537c.zzb(), (eh0) this.f21541g.zzb(), this.f21538d.a(), ((u40) this.f21539e).a(), new rq(), (zl0) this.f21542h.zzb(), (wh0) this.f21543i.zzb(), (yh0) this.f21544j.zzb());
            case 1:
                return new mn0((Context) this.f21536b.zzb(), ((u40) this.f21537c).a(), this.f21538d.a(), (Executor) this.f21539e.zzb(), (ed0) this.f21540f.f15424a, (eh0) this.f21541g.zzb(), new rq(), (zl0) this.f21542h.zzb(), (wh0) this.f21543i.zzb(), (yh0) this.f21544j.zzb());
            default:
                return new mn0((Context) this.f21536b.zzb(), ((u40) this.f21537c).a(), this.f21538d.a(), (Executor) this.f21539e.zzb(), (xg0) this.f21540f.f15424a, (eh0) this.f21541g.zzb(), new rq(), (zl0) this.f21542h.zzb(), (wh0) this.f21543i.zzb(), (yh0) this.f21544j.zzb());
        }
    }

    public wm0(hx1 hx1Var, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, z90 z90Var, u40 u40Var, fx1 fx1Var4, fx1 fx1Var5, fx1 fx1Var6) {
        this.f21535a = 0;
        this.f21540f = hx1Var;
        this.f21536b = fx1Var;
        this.f21537c = fx1Var2;
        this.f21541g = fx1Var3;
        this.f21538d = z90Var;
        this.f21539e = u40Var;
        this.f21542h = fx1Var4;
        this.f21543i = fx1Var5;
        this.f21544j = fx1Var6;
    }
}
