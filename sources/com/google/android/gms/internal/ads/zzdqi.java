package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdqi implements zzgyj {
    final /* synthetic */ zzcdt zza;

    public zzdqi(zzdqu zzdquVar, zzcdt zzcdtVar) {
        this.zza = zzcdtVar;
        Objects.requireNonNull(zzdquVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcir zzcirVar = (zzcir) obj;
        if (zzcirVar == null) {
            this.zza.zzd(new zzemv(1, "Missing webview from video view future."));
            return;
        }
        final zzcdt zzcdtVar = this.zza;
        zzcirVar.zzab("/video", new zzcgj(new zzcgi() { // from class: com.google.android.gms.internal.ads.zzdqh
            @Override // com.google.android.gms.internal.ads.zzcgi
            public final /* synthetic */ void zza(String str) {
                zzcdtVar.zzc(androidx.media3.extractor.text.ttml.a.d("mediaUrl", str));
            }
        }));
        zzcirVar.zzI();
    }
}
