package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzenx implements zzdlh {
    final /* synthetic */ zzejj zza;
    final /* synthetic */ zzfhr zzb;

    public zzenx(zzenz zzenzVar, zzejj zzejjVar, zzfhr zzfhrVar) {
        this.zza = zzejjVar;
        this.zzb = zzfhrVar;
        Objects.requireNonNull(zzenzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final void zza(boolean z2, Context context, zzdax zzdaxVar) throws zzdlg {
        try {
            zzfji zzfjiVar = (zzfji) this.zza.zzb;
            zzfjiVar.zzs(z2);
            zzfjiVar.zzm();
        } catch (zzfir e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot show rewarded video.", e2);
            throw new zzdlg(e2.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final zzfhr zzb() {
        return this.zzb;
    }
}
