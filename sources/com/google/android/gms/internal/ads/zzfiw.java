package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfiw implements zzgyj {
    final /* synthetic */ zzfix zza;
    final /* synthetic */ int zzb;

    public zzfiw(zzfix zzfixVar, int i2) {
        this.zzb = i2;
        Objects.requireNonNull(zzfixVar);
        this.zza = zzfixVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}
