package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vp0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21227a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21230d;

    public vp0(bs0 bs0Var, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.f21229c = bs0Var;
        this.f21228b = j10;
        this.f21230d = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        switch (this.f21227a) {
            case 0:
                p9.a aVar = (p9.a) this.f21229c;
                ou0 ou0Var = (ou0) this.f21230d;
                ((p9.b) aVar).getClass();
                return zw1.d(new wp0(ou0Var, System.currentTimeMillis(), this.f21228b));
            default:
                ListenableFuture listenableFutureZza = ((bs0) this.f21229c).zza();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (((Boolean) zzba.zzc().a(am.f12206j3)).booleanValue()) {
                    timeUnit = TimeUnit.MICROSECONDS;
                }
                long j10 = this.f21228b;
                if (j10 > 0) {
                    listenableFutureZza = zw1.v(listenableFutureZza, j10, timeUnit, (ScheduledExecutorService) this.f21230d);
                }
                return zw1.u(listenableFutureZza, Throwable.class, new rr(this, 8), l00.f16615h);
        }
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        switch (this.f21227a) {
            case 0:
                return 4;
            default:
                return ((bs0) this.f21229c).zzb();
        }
    }

    public vp0(p9.a aVar, ou0 ou0Var, long j10) {
        this.f21229c = aVar;
        this.f21230d = ou0Var;
        this.f21228b = j10;
    }
}
