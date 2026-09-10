package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedo extends zzbyq {
    final /* synthetic */ zzedq zza;

    public zzedo(zzedq zzedqVar) {
        Objects.requireNonNull(zzedqVar);
        this.zza = zzedqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzedq zzedqVar = this.zza;
        zzedqVar.zza.zzc(new zzeeg(autoCloseInputStream, zzedqVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbza zzbzaVar) {
        this.zza.zza.zzc(new zzeeg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbzaVar));
    }
}
