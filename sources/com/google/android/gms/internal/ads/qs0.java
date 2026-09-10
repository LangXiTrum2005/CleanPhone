package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f00 f19187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f19189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fe1 f19190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19191e;

    public qs0(f00 f00Var, boolean z10, fe1 fe1Var, ScheduledExecutorService scheduledExecutorService, int i10) {
        this.f19187a = f00Var;
        this.f19188b = z10;
        this.f19190d = fe1Var;
        this.f19189c = scheduledExecutorService;
        this.f19191e = i10;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        if (((Boolean) zzba.zzc().a(am.f12117d8)).booleanValue() && this.f19188b) {
            return zw1.d(new yp0(null, 6));
        }
        if (!Arrays.asList(((String) zzba.zzc().a(am.f12150f8)).split(",")).contains(String.valueOf(this.f19191e))) {
            return zw1.d(new yp0(null, 6));
        }
        be1 be1Var = be1.f12743b;
        i6 i6Var = i6.f15615p;
        fe1 fe1Var = this.f19190d;
        return zw1.t(zw1.v(zw1.z(be1Var, i6Var, fe1Var), ((Long) tn.f20447b.o()).longValue(), TimeUnit.MILLISECONDS, this.f19189c), Exception.class, new lx(this, 6), fe1Var);
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        return 50;
    }
}
