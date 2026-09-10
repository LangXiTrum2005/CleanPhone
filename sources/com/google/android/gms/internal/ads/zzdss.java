package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdss extends zzdsd implements zzdir {
    private zzdir zza;

    @Override // com.google.android.gms.internal.ads.zzdir
    public final synchronized void zzdQ() {
        zzdir zzdirVar = this.zza;
        if (zzdirVar != null) {
            zzdirVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final synchronized void zzdu() {
        zzdir zzdirVar = this.zza;
        if (zzdirVar != null) {
            zzdirVar.zzdu();
        }
    }

    public final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbmd zzbmdVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbmf zzbmfVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzdir zzdirVar) throws Throwable {
        try {
            try {
                zzm(zzaVar, zzbmdVar, zzrVar, zzbmfVar, zzadVar);
                this.zza = zzdirVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
