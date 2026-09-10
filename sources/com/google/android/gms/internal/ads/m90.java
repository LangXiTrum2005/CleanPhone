package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m90 implements da0, hc0, sb0, la0, ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma0 f17351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eb0 f17352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final du0 f17353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f17354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f17355e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledFuture f17357g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17359i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final le1 f17356f = new le1();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f17358h = new AtomicBoolean();

    public m90(ma0 ma0Var, du0 du0Var, ScheduledExecutorService scheduledExecutorService, k00 k00Var, String str, eb0 eb0Var) {
        this.f17351a = ma0Var;
        this.f17353c = du0Var;
        this.f17354d = scheduledExecutorService;
        this.f17355e = k00Var;
        this.f17359i = str;
        this.f17352b = eb0Var;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Q() {
        du0 du0Var = this.f17353c;
        if (du0Var.f13683e == 3) {
            return;
        }
        int i10 = du0Var.Y;
        if (i10 == 0 || i10 == 1) {
            if (((Boolean) zzba.zzc().a(am.f12171gd)).booleanValue() && this.f17359i.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f17351a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.la0
    public final synchronized void e(zze zzeVar) {
        try {
            le1 le1Var = this.f17356f;
            if (le1Var.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f17357g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            le1Var.d(new Exception());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void v(zh zhVar) {
        if (((Boolean) zzba.zzc().a(am.f12171gd)).booleanValue() && this.f17359i.equals("com.google.ads.mediation.admob.AdMobAdapter") && zhVar.f22617j && this.f17358h.compareAndSet(false, true) && this.f17353c.f13683e != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.f17351a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final synchronized void z() {
        if (this.f17353c.f13683e == 4) {
            this.f17351a.zza();
            return;
        }
        le1 le1Var = this.f17356f;
        if (le1Var.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f17357g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        le1Var.c(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.hc0
    public final void zzg() {
        du0 du0Var = this.f17353c;
        int i10 = du0Var.f13683e;
        if (i10 == 3) {
            return;
        }
        if (i10 == 4) {
            this.f17352b.zza();
            return;
        }
        if (((Boolean) zzba.zzc().a(am.f12250m2)).booleanValue() && du0Var.Y == 2) {
            int i11 = du0Var.f13705q;
            if (i11 == 0) {
                this.f17351a.zza();
                return;
            }
            vf vfVar = new vf(this, 16);
            le1 le1Var = this.f17356f;
            le1Var.addListener(new zd1(0, le1Var, vfVar), this.f17355e);
            this.f17357g = this.f17354d.schedule(new x60(this, 4), i11, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void C() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void J() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Z() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.hc0
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void f(sx sxVar, String str, String str2) {
    }
}
