package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q90 implements zzr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ju0 f18996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final du0 f18997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p9.a f18998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yh0 f18999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f19000f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18995a = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zw0 f19001g = ax0.z();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19002h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19003i = false;

    public q90(ju0 ju0Var, du0 du0Var, p9.a aVar, yh0 yh0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f18996b = ju0Var;
        this.f18997c = du0Var;
        this.f18998d = aVar;
        this.f18999e = yh0Var;
        this.f19000f = scheduledExecutorService;
    }

    public final void a() {
        synchronized (this.f18995a) {
            try {
                yh0 yh0Var = this.f18999e;
                String str = ((fu0) this.f18996b.f16196b.f20920d).f14546b;
                String strEncodeToString = Base64.encodeToString(((ax0) this.f19001g.e()).b(), 1);
                if (((Boolean) zzba.zzc().a(am.Be)).booleanValue()) {
                    lj1 lj1VarA = yh0Var.a();
                    lj1VarA.l("action", "pclma");
                    lj1VarA.l("pclmd", strEncodeToString);
                    lj1VarA.l("gqi", str);
                    lj1VarA.r();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(int i10) {
        synchronized (this.f18995a) {
            try {
                if (!this.f19003i && this.f19002h) {
                    zw0 zw0Var = this.f19001g;
                    cw0 cw0VarZ = dw0.z();
                    cw0VarZ.b();
                    ((dw0) cw0VarZ.f19193b).B(i10);
                    ((p9.b) this.f18998d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    cw0VarZ.b();
                    ((dw0) cw0VarZ.f19193b).A(jCurrentTimeMillis);
                    dw0 dw0Var = (dw0) cw0VarZ.e();
                    zw0Var.b();
                    ((ax0) zw0Var.f19193b).A(dw0Var);
                    if (i10 == 10) {
                        a();
                        this.f19003i = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        b(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        b(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        b(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        b(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        b(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        b(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        b(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        b(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i10) {
    }
}
