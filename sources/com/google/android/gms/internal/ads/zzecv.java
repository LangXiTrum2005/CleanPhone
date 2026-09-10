package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes4.dex */
final class zzecv implements zzgyj {
    final /* synthetic */ zzecy zza;

    public zzecv(zzecy zzecyVar) {
        Objects.requireNonNull(zzecyVar);
        this.zza = zzecyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzha)).booleanValue()) {
            Matcher matcher = zzecy.zzh.matcher(th.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                zzecy zzecyVar = this.zza;
                zzecyVar.zzc().zzc(Integer.parseInt(strGroup));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfic zzficVar = (zzfic) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzha)).booleanValue()) {
            zzecy zzecyVar = this.zza;
            zzfhu zzfhuVar = zzficVar.zzb.zzb;
            zzecyVar.zzc().zzc(zzfhuVar.zzf);
            zzecyVar.zzc().zze(zzfhuVar.zzg);
        }
    }
}
