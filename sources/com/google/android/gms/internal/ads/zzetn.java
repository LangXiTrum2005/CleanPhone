package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzetn implements zzezx {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcxa zze;
    private final zzfjs zzf;
    private final zzfik zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzh().zzo();
    private final zzdwy zzi;
    private final zzcxo zzj;

    public zzetn(Context context, String str, String str2, zzcxa zzcxaVar, zzfjs zzfjsVar, zzfik zzfikVar, zzdwy zzdwyVar, zzcxo zzcxoVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcxaVar;
        this.zzf = zzfjsVar;
        this.zzg = zzfikVar;
        this.zzi = zzdwyVar;
        this.zzj = zzcxoVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        Bundle bundle = new Bundle();
        zzdwy zzdwyVar = this.zzi;
        Map mapZzc = zzdwyVar.zzc();
        String str = this.zzb;
        mapZzc.put("seq_num", str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue()) {
            zzdwyVar.zzd("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd));
            com.google.android.gms.ads.internal.zzt.zzc();
            zzdwyVar.zzd("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzL(this.zza) ? "1" : "0");
        }
        zzcxa zzcxaVar = this.zze;
        zzfik zzfikVar = this.zzg;
        zzcxaVar.zzi(zzfikVar.zzd);
        bundle.putAll(this.zzf.zzc());
        return zzgym.zza(new zzeto(this.zza, bundle, str, this.zzc, this.zzh, zzfikVar.zzg, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 12;
    }
}
