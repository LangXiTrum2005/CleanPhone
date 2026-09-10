package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbrp implements zzcdx {
    final /* synthetic */ zzbrq zza;

    public zzbrp(zzbrq zzbrqVar) {
        Objects.requireNonNull(zzbrqVar);
        this.zza = zzbrqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdx
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbqm zzbqmVar = (zzbqm) obj;
        zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbro
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy > Destroying engine.");
                zzbqm zzbqmVar2 = zzbqmVar;
                zzbqmVar2.zzn("/result", zzbnm.zzo);
                zzbqmVar2.zzj();
            }
        });
    }
}
