package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ej0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f13995b;

    public /* synthetic */ ej0(fx1 fx1Var, int i10) {
        this.f13994a = i10;
        this.f13995b = fx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f13994a) {
            case 0:
                dj0 dj0Var = (dj0) this.f13995b.zzb();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new nc0(dj0Var, k00Var);
            case 1:
                dj0 dj0Var2 = (dj0) this.f13995b.zzb();
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new nc0(dj0Var2, k00Var2);
            case 2:
                dj0 dj0Var3 = (dj0) this.f13995b.zzb();
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                return new nc0(dj0Var3, k00Var3);
            case 3:
                return new nc0((dk0) this.f13995b.zzb(), l00.f16615h);
            case 4:
                return new nc0((dk0) this.f13995b.zzb(), l00.f16615h);
            case 5:
                return new nc0((dk0) this.f13995b.zzb(), l00.f16615h);
            case 6:
                Context context = (Context) this.f13995b.zzb();
                k00 k00Var4 = l00.f16608a;
                ic1.h(k00Var4);
                return new ok0(context, k00Var4, 0);
            case 7:
                ol0 ol0Var = (ol0) this.f13995b.zzb();
                k00 k00Var5 = l00.f16608a;
                ic1.h(k00Var5);
                return new nc0(ol0Var, k00Var5);
            case 8:
                ol0 ol0Var2 = (ol0) this.f13995b.zzb();
                k00 k00Var6 = l00.f16608a;
                ic1.h(k00Var6);
                return new nc0(ol0Var2, k00Var6);
            case 9:
                return new qp0((String) this.f13995b.zzb(), 6);
            case 10:
                return new pu0((qf) this.f13995b.zzb());
            case 11:
                return new nc0((yu0) this.f13995b.zzb(), l00.f16615h);
            case 12:
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f13995b.zzb()));
                ic1.h(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
                return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
            case 13:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f13995b.zzb();
                k00 k00Var7 = l00.f16608a;
                ic1.h(k00Var7);
                return new sv0(scheduledExecutorService, k00Var7);
            case 14:
                return new kx0((ul0) this.f13995b.zzb());
            case 15:
                return new y31((a71) this.f13995b.zzb());
            default:
                return new v61();
        }
    }
}
