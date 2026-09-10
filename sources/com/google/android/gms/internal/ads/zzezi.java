package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzezi implements zzezv {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzezi(String str, String str2, String str3, String str4, Long l2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l2;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        zzfiz.zze(bundle, "gmp_app_id", this.zza);
        zzfiz.zze(bundle, "fbs_aiid", this.zzb);
        zzfiz.zze(bundle, "fbs_aeid", this.zzc);
        zzfiz.zze(bundle, "apm_id_origin", this.zzd);
        Long l2 = this.zze;
        if (l2 != null) {
            bundle.putLong("sai_timeout", l2.longValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfiz.zze(((zzczm) obj).zzb, "fbs_aeid", this.zzc);
    }
}
