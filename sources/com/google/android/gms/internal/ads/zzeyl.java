package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyl implements zzezv {
    private final String zza;
    private final Integer zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzeyl(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        zzfiz.zze(bundle, "pn", this.zza);
        zzfiz.zzh(bundle, com.smartdigimkt.b0.a.M, this.zzb);
        zzfiz.zze(bundle, "vnm", this.zzc);
        zzfiz.zze(bundle, "dl", this.zzd);
        zzfiz.zze(bundle, "ins_pn", this.zze);
        zzfiz.zze(bundle, "ini_pn", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzczm) obj).zzb;
        zzfiz.zze(bundle, "pn", this.zza);
        zzfiz.zze(bundle, "dl", this.zzd);
    }
}
