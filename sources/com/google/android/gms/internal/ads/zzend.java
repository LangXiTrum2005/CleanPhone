package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzend implements zzdlh {
    final /* synthetic */ zzejj zza;
    final /* synthetic */ zzfhr zzb;

    public zzend(zzene zzeneVar, zzejj zzejjVar, zzfhr zzfhrVar) {
        this.zza = zzejjVar;
        this.zzb = zzfhrVar;
        Objects.requireNonNull(zzeneVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final void zza(boolean z2, Context context, zzdax zzdaxVar) throws zzdlg {
        try {
            zzfji zzfjiVar = (zzfji) this.zza.zzb;
            zzfjiVar.zzs(z2);
            zzfjiVar.zzw(context);
        } catch (zzfir e2) {
            throw new zzdlg(e2.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final zzfhr zzb() {
        return this.zzb;
    }
}
