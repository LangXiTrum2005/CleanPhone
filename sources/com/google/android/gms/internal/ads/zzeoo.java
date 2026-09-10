package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeoo implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdai zzb;
    private final zzdbc zzc;
    private final zzdit zzd;
    private final zzdil zze;
    private final zzcrx zzf;

    public zzeoo(zzdai zzdaiVar, zzdbc zzdbcVar, zzdit zzditVar, zzdil zzdilVar, zzcrx zzcrxVar) {
        this.zzb = zzdaiVar;
        this.zzc = zzdbcVar;
        this.zzd = zzditVar;
        this.zze = zzdilVar;
        this.zzf = zzcrxVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzdr();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
