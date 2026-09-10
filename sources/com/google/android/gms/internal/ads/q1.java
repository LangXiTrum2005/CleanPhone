package com.google.android.gms.internal.ads;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.google.android.gms.ads.internal.client.zzdx;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18853a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18856d;

    public /* synthetic */ q1(md0 md0Var, Object obj, long j10) {
        this.f18855c = md0Var;
        this.f18856d = obj;
        this.f18854b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f18853a;
        long j10 = this.f18854b;
        Object obj = this.f18855c;
        Object obj2 = this.f18856d;
        switch (i10) {
            case 0:
                String str = uu0.f20901a;
                ry1 ry1Var = ((jy1) ((md0) obj).f17400c).f16219a;
                d02 d02Var = ry1Var.f19727s;
                zz1 zz1VarO = d02Var.o();
                d02Var.f(zz1VarO, 26, new uo0(zz1VarO, obj2, j10));
                if (ry1Var.O == obj2) {
                    mk0 mk0Var = ry1Var.f19722n;
                    mk0Var.i(26, ey1.f14112c);
                    mk0Var.j();
                }
                break;
            case 1:
                hb hbVar = (hb) obj2;
                hbVar.f15232a.a(j10, (String) obj);
                hbVar.f15232a.b(hbVar.toString());
                break;
            case 2:
                ux0 ux0Var = (ux0) obj2;
                if (ux0Var.f20937q != null) {
                    zzdx zzdxVar = (zzdx) obj;
                    String str2 = zzdxVar instanceof aa0 ? ((aa0) zzdxVar).f11957d : null;
                    ux0Var.f20937q.r("paa", "pano_ts", this.f18854b, ux0Var.s(), ux0Var.t(), str2, ux0Var.f20939s, ux0Var.g());
                }
                break;
            case 3:
                ((com.google.android.gms.internal.measurement.ae) obj).run();
                TimeUnit timeUnit = TimeUnit.MINUTES;
                ta.t0 t0Var = (ta.t0) ((ta.q0) obj2);
                t0Var.getClass();
                ta.x0 x0Var = new ta.x0(Executors.callable(this, null));
                ta.r0 r0Var = new ta.r0(x0Var, t0Var.f50653b.schedule(x0Var, j10, timeUnit));
                r0Var.addListener(new com.google.android.gms.internal.measurement.ae(r0Var, 1), ta.c0.f50592a);
                break;
            case 4:
                ea.z2 z2Var = (ea.z2) obj2;
                z2Var.P0((ea.w2) obj, false, j10);
                z2Var.f39951e = null;
                ea.h3 h3VarK = ((ea.m1) z2Var.f3623a).k();
                h3VarK.G0();
                h3VarK.H0();
                h3VarK.U0(new ta.i0(h3VarK, (ea.w2) null));
                break;
            default:
                try {
                    Thread.sleep(j10);
                } catch (InterruptedException e10) {
                    AdjustFactory.getLogger().warn("Sleep delay exception: %s", e10.getMessage());
                }
                ((SingleThreadCachedScheduler) obj2).submit((Runnable) obj);
                break;
        }
    }

    public q1(SingleThreadCachedScheduler singleThreadCachedScheduler, long j10, Runnable runnable) {
        this.f18856d = singleThreadCachedScheduler;
        this.f18854b = j10;
        this.f18855c = runnable;
    }

    public q1(hb hbVar, String str, long j10) {
        this.f18855c = str;
        this.f18854b = j10;
        this.f18856d = hbVar;
    }

    public q1(ux0 ux0Var, long j10, zzdx zzdxVar) {
        this.f18854b = j10;
        this.f18855c = zzdxVar;
        Objects.requireNonNull(ux0Var);
        this.f18856d = ux0Var;
    }

    public q1(com.google.android.gms.internal.measurement.fe feVar, com.google.android.gms.internal.measurement.ae aeVar, ta.q0 q0Var, long j10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f18855c = aeVar;
        this.f18856d = q0Var;
        this.f18854b = j10;
    }

    public q1(ea.z2 z2Var, ea.w2 w2Var, long j10) {
        this.f18855c = w2Var;
        this.f18854b = j10;
        Objects.requireNonNull(z2Var);
        this.f18856d = z2Var;
    }
}
