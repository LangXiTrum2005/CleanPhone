package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzepc implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdjt zza;

    public zzepc(zzepd zzepdVar, zzdjt zzdjtVar) {
        this.zza = zzdjtVar;
        Objects.requireNonNull(zzepdVar);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdjt zzdjtVar = this.zza;
        zzdjtVar.zzd().zza();
        zzdjtVar.zze().zza();
    }
}
