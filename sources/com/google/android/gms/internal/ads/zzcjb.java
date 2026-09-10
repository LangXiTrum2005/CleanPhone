package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcjb implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzcir zza;
    private final com.google.android.gms.ads.internal.overlay.zzr zzb;

    public zzcjb(zzcir zzcirVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zza = zzcirVar;
        this.zzb = zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzb;
        if (zzrVar != null) {
            zzrVar.zzdS();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i2) {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzb;
        if (zzrVar != null) {
            zzrVar.zzdT(i2);
        }
        this.zza.zzG();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzb;
        if (zzrVar != null) {
            zzrVar.zzdv();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzb;
        if (zzrVar != null) {
            zzrVar.zzh();
        }
        this.zza.zzI();
    }
}
