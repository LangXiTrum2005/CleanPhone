package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class do0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f13608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f13609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f13610d;

    public /* synthetic */ do0(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, int i10) {
        this.f13607a = i10;
        this.f13608b = kx1Var;
        this.f13609c = kx1Var2;
        this.f13610d = kx1Var3;
    }

    public tp0 a() {
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new tp0(k00Var, (nh0) this.f13608b.zzb(), (yi0) this.f13609c.zzb(), (gq0) this.f13610d.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f13607a) {
            case 0:
                return new vu0((tu0) this.f13608b.zzb(), (mh0) this.f13609c.zzb(), (yh0) this.f13610d.zzb(), 25);
            case 1:
                return a();
            case 2:
                Context contextA = ((o40) this.f13608b).a();
                f00 f00Var = (f00) this.f13609c.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f13610d.zzb();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new mq0(contextA, f00Var, scheduledExecutorService, k00Var);
            case 3:
                Object qp0Var = new qp0(((o40) ((sp0) this.f13608b).f20016a).a(), 0);
                xq0 xq0Var = (xq0) this.f13609c.zzb();
                if (true == ((List) this.f13610d.zzb()).contains("2")) {
                    qp0Var = xq0Var;
                }
                ic1.h(qp0Var);
                return qp0Var;
            case 4:
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                yq0 yq0Var = new yq0(k00Var2, 2);
                xq0 xq0Var2 = (xq0) this.f13608b.zzb();
                List list = (List) this.f13609c.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f13610d.zzb();
                if (list.contains("24")) {
                    return new vp0(xq0Var2, ((Integer) zzba.zzc().a(am.Rd)).intValue(), scheduledExecutorService2);
                }
                return new vp0(yq0Var, ((Integer) zzba.zzc().a(am.Rd)).intValue(), scheduledExecutorService2);
            case 5:
                Object objZzb = ((qr0) this.f13608b).zzb();
                xq0 xq0Var3 = (xq0) this.f13609c.zzb();
                if (true == ((List) this.f13610d.zzb()).contains("29")) {
                    objZzb = xq0Var3;
                }
                ic1.h(objZzb);
                return objZzb;
            case 6:
                return new j51((Context) this.f13608b.zzb(), (h21) this.f13609c.zzb(), (o61) this.f13610d.zzb());
            case 7:
                return new i51((Context) this.f13608b.zzb(), (ExecutorService) this.f13609c.zzb(), (d31) this.f13610d.zzb());
            default:
                return new n61((a71) this.f13609c.zzb(), ((h21) this.f13610d.zzb()).W().A());
        }
    }
}
