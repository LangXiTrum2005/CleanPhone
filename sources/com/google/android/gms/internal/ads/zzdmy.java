package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdmy implements zzgyj {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdnh zzb;

    public zzdmy(zzdnh zzdnhVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzdnhVar);
        this.zzb = zzdnhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzY(this.zza, (zzejb) obj);
    }
}
