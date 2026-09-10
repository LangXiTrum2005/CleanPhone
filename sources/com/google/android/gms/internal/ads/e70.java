package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e70 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f13866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1 f13867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx1 f13868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fx1 f13869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f13870f;

    public e70(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, fx1 fx1Var5) {
        this.f13865a = 0;
        this.f13867c = fx1Var;
        this.f13868d = fx1Var2;
        this.f13866b = fx1Var3;
        this.f13869e = fx1Var4;
        this.f13870f = fx1Var5;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f13865a) {
            case 0:
                return new d70((kt) this.f13867c.zzb(), (z60) this.f13868d.zzb(), (Executor) this.f13866b.zzb(), (y60) this.f13869e.zzb(), (p9.a) this.f13870f.zzb());
            case 1:
                return new o01((Context) this.f13866b.zzb(), (p01) this.f13867c.zzb(), (qz0) this.f13868d.zzb(), (pz0) this.f13869e.zzb(), ((h21) this.f13870f.zzb()).f0());
            case 2:
                return new p51((o01) this.f13867c.zzb(), (d61) this.f13868d.zzb(), (l61) this.f13869e.zzb(), (a71) this.f13866b.zzb(), (ExecutorService) this.f13870f.zzb());
            default:
                return new k61((z21) this.f13867c.zzb(), (z21) this.f13868d.zzb(), fx1.b(this.f13869e), (ExecutorService) this.f13866b.zzb(), (a71) this.f13870f.zzb());
        }
    }

    public /* synthetic */ e70(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, Object obj, Object obj2, int i10) {
        this.f13865a = i10;
        this.f13867c = fx1Var;
        this.f13868d = fx1Var2;
        this.f13869e = fx1Var3;
        this.f13866b = (kx1) obj;
        this.f13870f = (kx1) obj2;
    }

    public e70(hx1 hx1Var, fx1 fx1Var, fx1 fx1Var2, hx1 hx1Var2, fx1 fx1Var3) {
        this.f13865a = 1;
        this.f13866b = hx1Var;
        this.f13867c = fx1Var;
        this.f13868d = fx1Var2;
        this.f13869e = fx1Var3;
        this.f13870f = hx1Var2;
    }
}
