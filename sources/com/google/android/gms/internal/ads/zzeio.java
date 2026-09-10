package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeio implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcvr zzb;
    private final zzcwl zzc;
    private final zzddu zzd;
    private final zzddm zze;
    private final zzcnh zzf;

    public zzeio(zzcvr zzcvrVar, zzcwl zzcwlVar, zzddu zzdduVar, zzddm zzddmVar, zzcnh zzcnhVar) {
        this.zzb = zzcvrVar;
        this.zzc = zzcwlVar;
        this.zzd = zzdduVar;
        this.zze = zzddmVar;
        this.zzf = zzcnhVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzr();
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
