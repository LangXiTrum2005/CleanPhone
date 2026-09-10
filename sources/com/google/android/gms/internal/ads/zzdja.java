package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdja extends zzdgi implements zzbof {
    public zzdja(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    public final synchronized void zza() {
        zzs(zzdiz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    public final void zzb(final zzbzy zzbzyVar) {
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdix
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((zzbof) obj).zzb(zzbzyVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    public final void zzc() {
        zzs(zzdiy.zza);
    }
}
