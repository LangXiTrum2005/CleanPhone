package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbpg extends zzbpd {
    final /* synthetic */ zzcdt zza;

    public zzbpg(zzbph zzbphVar, zzcdt zzcdtVar) {
        this.zza = zzcdtVar;
        Objects.requireNonNull(zzbphVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}
