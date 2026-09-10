package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdjg extends zzdgi {
    public zzdjg(Set set) {
        super(set);
    }

    public final synchronized void zza(final com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdjf
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjd) obj).zzd(zzbjVar);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdje
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjd) obj).zze(str);
            }
        });
    }
}
