package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzelf implements zzdlh {
    final /* synthetic */ zzejj zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzelg zzc;

    public zzelf(zzelg zzelgVar, zzejj zzejjVar, zzfhr zzfhrVar) {
        this.zza = zzejjVar;
        this.zzb = zzfhrVar;
        Objects.requireNonNull(zzelgVar);
        this.zzc = zzelgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final void zza(boolean z2, Context context, zzdax zzdaxVar) throws zzdlg {
        try {
            zzfji zzfjiVar = (zzfji) this.zza.zzb;
            zzfjiVar.zzs(z2);
            if (this.zzc.zzc().clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbm)).intValue()) {
                zzfjiVar.zzd();
            } else {
                zzfjiVar.zze(context);
            }
        } catch (zzfir e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot show interstitial.");
            throw new zzdlg(e2.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final zzfhr zzb() {
        return this.zzb;
    }
}
