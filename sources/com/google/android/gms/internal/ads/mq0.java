package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mq0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f00 f17516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppSetIdClient f17517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f17518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fe1 f17519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f17520e;

    public mq0(Context context, f00 f00Var, ScheduledExecutorService scheduledExecutorService, fe1 fe1Var) {
        if (!((Boolean) zzba.zzc().a(am.f12063a4)).booleanValue()) {
            this.f17517b = AppSet.getClient(context);
        }
        this.f17520e = context;
        this.f17516a = f00Var;
        this.f17518c = scheduledExecutorService;
        this.f17519d = fe1Var;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        Task<AppSetIdInfo> appSetIdInfo;
        if (((Boolean) zzba.zzc().a(am.W3)).booleanValue()) {
            if (!((Boolean) zzba.zzc().a(am.f12080b4)).booleanValue()) {
                if (!((Boolean) zzba.zzc().a(am.X3)).booleanValue()) {
                    return zw1.z(v71.b(this.f17517b.getAppSetIdInfo()), i6.f15612m, l00.f16615h);
                }
                if (((Boolean) zzba.zzc().a(am.f12063a4)).booleanValue()) {
                    x10.g(this.f17520e, false);
                    synchronized (x10.f21692s) {
                        appSetIdInfo = x10.f21690q;
                    }
                } else {
                    appSetIdInfo = this.f17517b.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return zw1.d(new nq0(null, -1, 0));
                }
                ListenableFuture listenableFutureX = zw1.x(v71.b(appSetIdInfo), c60.f13065j, l00.f16615h);
                if (((Boolean) zzba.zzc().a(am.Y3)).booleanValue()) {
                    listenableFutureX = zw1.v(listenableFutureX, ((Long) zzba.zzc().a(am.Z3)).longValue(), TimeUnit.MILLISECONDS, this.f17518c);
                }
                return zw1.t(listenableFutureX, Exception.class, new lx(this, 4), this.f17519d);
            }
        }
        return zw1.d(new nq0(null, -1, 0));
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        return 11;
    }
}
