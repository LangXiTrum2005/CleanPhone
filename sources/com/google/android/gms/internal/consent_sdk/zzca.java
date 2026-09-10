package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzca implements zzth {
    private final zztk zza;

    private zzca(zztk zztkVar) {
        this.zza = zztkVar;
    }

    public static zzca zza(zztk zztkVar) {
        return new zzca(zztkVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbz((Application) this.zza.zzb());
    }
}
