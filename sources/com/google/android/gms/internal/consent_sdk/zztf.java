package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zztf implements zzth {
    private zztk zza;

    public static void zza(zztk zztkVar, zztk zztkVar2) {
        zztf zztfVar = (zztf) zztkVar;
        if (zztfVar.zza != null) {
            throw new IllegalStateException();
        }
        zztfVar.zza = zztkVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final Object zzb() {
        zztk zztkVar = this.zza;
        if (zztkVar != null) {
            return zztkVar.zzb();
        }
        throw new IllegalStateException();
    }
}
