package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbl;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w70 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f21437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f21438c;

    public /* synthetic */ w70(kx1 kx1Var, kx1 kx1Var2, int i10) {
        this.f21436a = i10;
        this.f21437b = kx1Var;
        this.f21438c = kx1Var2;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f21436a) {
            case 0:
                return new iz(((o40) this.f21437b).a(), ((z90) this.f21438c).a().f18366g);
            case 1:
                return new b90((d90) this.f21437b.zzb(), ((z90) this.f21438c).a());
            case 2:
                return new iz(((o40) this.f21437b).a(), ((z90) this.f21438c).a().f18366g);
            case 3:
                zzbl zzblVar = (zzbl) this.f21437b.zzb();
                p9.a aVar = (p9.a) this.f21438c.zzb();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new mf0(zzblVar, aVar, k00Var);
            case 4:
                return new hi0((gi0) this.f21437b.zzb(), (a50) this.f21438c.zzb());
            case 5:
                return new dk0(((o40) this.f21437b).a(), (yh0) this.f21438c.zzb());
            case 6:
                return new vk0(((o40) this.f21437b).a(), (kz) this.f21438c.zzb());
            case 7:
                return new vp0((xq0) this.f21437b.zzb(), ((Integer) zzba.zzc().a(am.Xd)).intValue(), (ScheduledExecutorService) this.f21438c.zzb());
            case 8:
                return new vp0((xq0) this.f21437b.zzb(), ((Integer) zzba.zzc().a(am.Kd)).intValue(), (ScheduledExecutorService) this.f21438c.zzb());
            case 9:
                kz kzVar = (kz) this.f21437b.zzb();
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new zp0(kzVar, k00Var2, ((o40) this.f21438c).a(), 3);
            case 10:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f21437b.zzb();
                ((o40) this.f21438c).a();
                return new qp0(scheduledExecutorService, 7);
            case 11:
                return new yu0(((o40) this.f21437b).a(), ((v40) this.f21438c).zzb());
            default:
                return new aw0(((o40) this.f21437b).a(), (jw0) this.f21438c.zzb());
        }
    }
}
