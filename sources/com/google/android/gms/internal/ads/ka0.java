package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ka0 extends mu1 implements ia0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f16396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f16397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16398e;

    public ka0(ja0 ja0Var, Set set, k00 k00Var, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f16398e = false;
        this.f16396c = scheduledExecutorService;
        P0(ja0Var, k00Var);
    }

    public final void X0() {
        this.f16397d = this.f16396c.schedule(new x60(this, 6), ((Integer) zzba.zzc().a(am.f12305pc)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final void Z(fd0 fd0Var) {
        if (this.f16398e) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f16397d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        S0(new vf(fd0Var, 17));
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final void zzc(zze zzeVar) {
        S0(new fa0(1, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final void zze() {
        S0(jq.f16138h);
    }
}
