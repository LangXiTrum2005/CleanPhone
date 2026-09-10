package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdhq extends zzdgi implements zzdhs {
    public zzdhq(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdhs
    public final void zza(final String str) {
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdhp
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((zzdhs) obj).zza(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhs
    public final void zzb(final String str) {
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdhk
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((zzdhs) obj).zzb(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhs
    public final void zzc(final String str, final String str2) {
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdhl
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((zzdhs) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhs
    public final void zzd(String str) {
        final String str2 = "MalformedJson";
        zzs(new zzdgh(str2) { // from class: com.google.android.gms.internal.ads.zzdhm
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((zzdhs) obj).zzd("MalformedJson");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhs
    public final void zze() {
        zzs(zzdhn.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdhs
    public final void zzf() {
        zzs(zzdho.zza);
    }
}
