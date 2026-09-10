package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zza;
import com.google.android.gms.ads.nonagon.signalgeneration.zzj;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rm implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx1 f19616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f19617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1 f19618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx1 f19619d;

    public rm(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4) {
        this.f19616a = fx1Var;
        this.f19617b = fx1Var2;
        this.f19618c = fx1Var3;
        this.f19619d = fx1Var4;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qm zzb() {
        return new qm((ScheduledExecutorService) this.f19616a.zzb(), (zzj) this.f19617b.zzb(), (zza) this.f19618c.zzb(), (ci0) this.f19619d.zzb());
    }
}
