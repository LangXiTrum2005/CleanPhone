package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeju implements zzdlh {
    final /* synthetic */ zzejj zza;
    final /* synthetic */ zzfhr zzb;

    public zzeju(zzejv zzejvVar, zzejj zzejjVar, zzfhr zzfhrVar) {
        this.zza = zzejjVar;
        this.zzb = zzfhrVar;
        Objects.requireNonNull(zzejvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final void zza(boolean z2, Context context, zzdax zzdaxVar) throws zzdlg {
        try {
            zzfji zzfjiVar = (zzfji) this.zza.zzb;
            zzfjiVar.zzs(z2);
            zzfjiVar.zzz(context);
        } catch (zzfir e2) {
            throw new zzdlg(e2.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final zzfhr zzb() {
        return this.zzb;
    }
}
