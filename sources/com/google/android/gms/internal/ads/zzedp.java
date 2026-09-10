package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedp extends zzbyq {
    private final zzcdt zza;
    private final zzbza zzb;

    public zzedp(zzcdt zzcdtVar, zzbza zzbzaVar) {
        this.zza = zzcdtVar;
        this.zzb = zzbzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzeeg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbza zzbzaVar) {
        this.zza.zzc(new zzeeg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbzaVar));
    }
}
